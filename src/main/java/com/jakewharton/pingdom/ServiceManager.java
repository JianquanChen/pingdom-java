package com.jakewharton.pingdom;

import com.jakewharton.pingdom.services.ActionsService;
import com.jakewharton.pingdom.services.AnalysisService;
import com.jakewharton.pingdom.services.CheckService;
import com.jakewharton.pingdom.services.ContactService;
import com.jakewharton.pingdom.services.ProbeService;
import com.jakewharton.pingdom.services.ReferenceService;
import com.jakewharton.pingdom.services.ReportsEmailService;
import com.jakewharton.pingdom.services.ReportsPublicService;
import com.jakewharton.pingdom.services.ReportsSharedService;
import com.jakewharton.pingdom.services.ResultsService;
import com.jakewharton.pingdom.services.ServerTimeService;
import com.jakewharton.pingdom.services.SettingsService;
import com.jakewharton.pingdom.services.SummaryAverageService;
import com.jakewharton.pingdom.services.SummaryOutageService;
import com.jakewharton.pingdom.services.SummaryPerformanceService;
import com.jakewharton.pingdom.services.SummaryProbeService;
import com.jakewharton.pingdom.services.TraceRouteService;

/**
 * Class to manage service creation with default settings.
 * 
 * @author Jake Wharton <jakewharton@gmail.com>
 */
public class ServiceManager {
	/** API key. */
	private String appKeyValue;
	/** User email. */
	private String email;
	/** User password. */
	private String password;
	/** Connection timeout (in milliseconds). */
	private Integer connectionTimeout;
	/** Read timeout (in milliseconds). */
	private Integer readTimeout;
	
	
	/** Create a new manager instance. */
	public ServiceManager() {}
	
	
	/**
	 * Set default authentication credentials.
	 * 
	 * @param email User email.
	 * @param password User password.
	 * @return Current instance for builder pattern.
	 */
	public ServiceManager setAuthentication(String email, String password) {
		this.email = email;
		this.password = password;
		return this;
	}
	
	/**
	 * Set default API key.
	 * 
	 * @param value API key value.
	 * @return Current instance for builder pattern.
	 */
	public ServiceManager setAppKey(String value) {
		this.appKeyValue = value;
		return this;
	}
	
	/**
	 * Set default connection timeout.
	 * 
	 * @param connectionTimeout Timeout (in milliseconds).
	 * @return Current instance for builder pattern.
	 */
	public ServiceManager setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
		return this;
	}
	
	/**
	 * Set default read timeout.
	 * 
	 * @param readTimeout Timeout (in milliseconds).
	 * @return Current instance for builder pattern.
	 */
	public ServiceManager setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
		return this;
	}
	
	/**
	 * Set up a new service with the defaults.
	 * 
	 * @param service Service to set up.
	 */
	private void setupService(PingdomApiService service) {
		if (this.appKeyValue != null) {
			service.setAppKey(this.appKeyValue);
		}
		if ((this.email != null) && (this.password != null)) {
			service.setAuthentication(this.email, this.password);
		}
		if (this.connectionTimeout != null) {
			service.setConnectTimeout(this.connectionTimeout);
		}
		if (this.readTimeout != null) {
			service.setReadTimeout(this.readTimeout);
		}
	}
	
	/**
	 * Get actions service instance.
	 * 
	 * @return Instance.
	 */
	public ActionsService actionsService() {
		ActionsService service = ServiceManager.newActionsService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get analysis service instance.
	 * 
	 * @return Instance.
	 */
	public AnalysisService analysisService() {
		AnalysisService service = ServiceManager.newAnalysisService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get check service instance.
	 * 
	 * @return Instance.
	 */
	public CheckService checkService() {
		CheckService service = ServiceManager.newCheckService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get contact service instance.
	 * 
	 * @return Instance.
	 */
	public ContactService contactService() {
		ContactService service = ServiceManager.newContactService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get probe service instance.
	 * 
	 * @return Instance.
	 */
	public ProbeService probeService() {
		ProbeService service = ServiceManager.newProbeService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get reference service instance.
	 * 
	 * @return Instance.
	 */
	public ReferenceService referenceService() {
		ReferenceService service = ServiceManager.newReferenceService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get report email service.
	 * 
	 * @return Instance.
	 */
	public ReportsEmailService reportsEmailService() {
		ReportsEmailService service = ServiceManager.newReportsEmailService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get reports public service.
	 * 
	 * @return Instance.
	 */
	public ReportsPublicService reportsPublicService() {
		ReportsPublicService service = ServiceManager.newReportsPublicService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get reports shared service.
	 * 
	 * @return Instance.
	 */
	public ReportsSharedService reportsSharedService() {
		ReportsSharedService service = ServiceManager.newReportsSharedService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get results service instance.
	 * 
	 * @return Instance.
	 */
	public ResultsService resultsService() {
		ResultsService service = ServiceManager.newResultsService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get server time service instance.
	 * 
	 * @return Instance.
	 */
	public ServerTimeService serverTimeService() {
		ServerTimeService service = ServiceManager.newServerTimeService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get settings service instance.
	 * 
	 * @return Instance.
	 */
	public SettingsService settingsService() {
		SettingsService service = ServiceManager.newSettingsService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get summary average service instance.
	 * 
	 * @return Instance.
	 */
	public SummaryAverageService summaryAverageService() {
		SummaryAverageService service = ServiceManager.newSummaryAverageService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get summary outage service.
	 * 
	 * @return Instance.
	 */
	public SummaryOutageService summaryOutageService() {
		SummaryOutageService service = ServiceManager.newSummaryOutageService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get summary performance service.
	 * 
	 * @return Instance.
	 */
	public SummaryPerformanceService summaryPerformanceService() {
		SummaryPerformanceService service = ServiceManager.newSummaryPerformanceService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get summary probe service.
	 * 
	 * @return Instance.
	 */
	public SummaryProbeService summaryProbeService() {
		SummaryProbeService service = ServiceManager.newSummaryProbeService();
		this.setupService(service);
		return service;
	}
	
	/**
	 * Get trace route service instance.
	 * 
	 * @return Instance.
	 */
	public TraceRouteService traceRouteService() {
		TraceRouteService service = ServiceManager.newTraceRouteService();
		this.setupService(service);
		return service;
	}
	
	
	/**
	 * Create new actions service instance.
	 * 
	 * @return Instance.
	 */
	public static final ActionsService newActionsService() {
		return new ActionsService();
	}
	
	/**
	 * Create new analysis service instance.
	 * 
	 * @return Instance.
	 */
	public static final AnalysisService newAnalysisService() {
		return new AnalysisService();
	}
	
	/**
	 * Create new check service instance.
	 * 
	 * @return Instance.
	 */
	public static final CheckService newCheckService() {
		return new CheckService();
	}
	
	/**
	 * Create new contact service instance.
	 * 
	 * @return Instance.
	 */
	public static final ContactService newContactService() {
		return new ContactService();
	}
	
	/**
	 * Create new probe service instance.
	 * 
	 * @return Instance.
	 */
	public static final ProbeService newProbeService() {
		return new ProbeService();
	}
	
	/**
	 * Create new reference service instance.
	 * 
	 * @return Instance.
	 */
	public static final ReferenceService newReferenceService() {
		return new ReferenceService();
	}
	
	/**
	 * Create new report email service instance.
	 * 
	 * @return Instance.
	 */
	public static final ReportsEmailService newReportsEmailService() {
		return new ReportsEmailService();
	}
	
	/**
	 * Create new reports public service instance.
	 * 
	 * @return Instance.
	 */
	public static final ReportsPublicService newReportsPublicService() {
		return new ReportsPublicService();
	}
	
	/**
	 * Create new reports shared service instance.
	 * 
	 * @return Instance.
	 */
	public static final ReportsSharedService newReportsSharedService() {
		return new ReportsSharedService();
	}
	
	/**
	 * Create new results service instance.
	 * 
	 * @return Instance.
	 */
	public static final ResultsService newResultsService() {
		return new ResultsService();
	}
	
	/**
	 * Create new server time service instance.
	 * 
	 * @return Instance.
	 */
	public static final ServerTimeService newServerTimeService() {
		return new ServerTimeService();
	}
	
	/**
	 * Create new settings service instance.
	 * 
	 * @return Instance.
	 */
	public static final SettingsService newSettingsService() {
		return new SettingsService();
	}
	
	/**
	 * Create new summary average service instance.
	 * 
	 * @return Instance.
	 */
	public static final SummaryAverageService newSummaryAverageService() {
		return new SummaryAverageService();
	}
	
	/**
	 * Create new summary outage service instance.
	 * 
	 * @return Instance.
	 */
	public static final SummaryOutageService newSummaryOutageService() {
		return new SummaryOutageService();
	}
	
	/**
	 * Create new summary performance service instance.
	 * 
	 * @return Instance.
	 */
	public static final SummaryPerformanceService newSummaryPerformanceService() {
		return new SummaryPerformanceService();
	}
	
	/**
	 * Create new summary probe service instance.
	 * 
	 * @return Instance.
	 */
	public static final SummaryProbeService newSummaryProbeService() {
		return new SummaryProbeService();
	}
	
	/**
	 * Create new trace route service instance.
	 * 
	 * @return Instance.
	 */
	public static final TraceRouteService newTraceRouteService() {
		return new TraceRouteService();
	}
}
