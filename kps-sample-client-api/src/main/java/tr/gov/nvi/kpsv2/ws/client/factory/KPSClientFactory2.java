
package tr.gov.nvi.kpsv2.ws.client.factory;

import javax.xml.ws.soap.AddressingFeature;

import tr.gov.nvi.kps.sts.NviDefaultHandlerResolver;
import tr.gov.nvi.kpsv2.ws.aksokutumil.AksOkuTumIlServis;
import tr.gov.nvi.kpsv2.ws.aksokutumil.AksOkuTumIlServis_Service;
import tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce.AksOkuTumIleBagliIlceServis;
import tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce.AksOkuTumIleBagliIlceServis_Service;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.kisilistele.KisiListeleServis;
import tr.gov.nvi.kpsv2.ws.kisilistele.KisiListeleServis_Service;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.KisiSorgulaTCKimlikNoServis;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.KisiSorgulaTCKimlikNoServis_Service;




public class KPSClientFactory2 {
    public static KPSClientFactory2 Instance = new KPSClientFactory2();
    
    private final Object syncObject = new Object();
    
    private volatile KisiSorgulaTCKimlikNoServis_Service kisiSorgulaService = null;
    private volatile KisiListeleServis_Service kisiListeleService = null;
    private volatile AksOkuTumIlServis_Service okuTumIlService = null;
    private volatile AksOkuTumIleBagliIlceServis_Service okuTumIleBagliIlceService = null;

    private KPSClientFactory2() {
        super();
    }

    public KisiSorgulaTCKimlikNoServis newKisiSorgulaTCKimlikNo() throws NviServiceException {
    	if (kisiSorgulaService == null) {
    		synchronized (syncObject) {
				if (kisiSorgulaService == null) {
					KisiSorgulaTCKimlikNoServis_Service localService = new KisiSorgulaTCKimlikNoServis_Service();
					
					localService.setHandlerResolver(NviDefaultHandlerResolver.Instance);
					
					kisiSorgulaService = localService;
				}
			}
    	}
    	
    	return kisiSorgulaService.getCustomBindingKisiSorgulaTCKimlikNoServis(new AddressingFeature());
    }
    
    public KisiListeleServis newKisiListele() throws NviServiceException {
    	if (kisiListeleService == null) {
    		synchronized (syncObject) {
				if (kisiListeleService == null) {
					KisiListeleServis_Service localService = new KisiListeleServis_Service();
					
					localService.setHandlerResolver(NviDefaultHandlerResolver.Instance);
					
					kisiListeleService = localService;
				}
			}
    	}
    	
    	return kisiListeleService.getCustomBindingKisiListeleServis(new AddressingFeature());
    }
    
    public AksOkuTumIlServis newOkuTumIl() throws NviServiceException {
    	if (okuTumIlService == null) {
    		synchronized (syncObject) {
				if (okuTumIlService == null) {
					AksOkuTumIlServis_Service localService = new AksOkuTumIlServis_Service();
					
					localService.setHandlerResolver(NviDefaultHandlerResolver.Instance);
					
					okuTumIlService = localService;
				}
			}
    	}
    	
    	return okuTumIlService.getCustomBindingAksOkuTumIlServis(new AddressingFeature());
    }
    
    public AksOkuTumIleBagliIlceServis newOkuTumIleBagliIlce() throws NviServiceException {
    	if (okuTumIleBagliIlceService == null) {
    		synchronized (syncObject) {
				if (okuTumIleBagliIlceService == null) {
					AksOkuTumIleBagliIlceServis_Service localService = new AksOkuTumIleBagliIlceServis_Service();
					
					localService.setHandlerResolver(NviDefaultHandlerResolver.Instance);
					
					okuTumIleBagliIlceService = localService;
				}
			}
    	}
    	
    	return okuTumIleBagliIlceService.getCustomBindingAksOkuTumIleBagliIlceServis(new AddressingFeature());
    }
    
}
