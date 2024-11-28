/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.emau.icmvc.ganimed.ttp.cm2.config.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;

import org.emau.icmvc.ganimed.ttp.cm2.config.ApplicationConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigFactory;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField;
import org.emau.icmvc.ganimed.ttp.cm2.config.DocumentRoot;
import org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.EntryType;
import org.emau.icmvc.ganimed.ttp.cm2.config.FilterType;
import org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType;
import org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.PaginationConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig;

import org.emau.icmvc.ganimed.ttp.cm2.impl.Cm2PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigPackageImpl extends EPackageImpl implements ConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkConsentConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationsConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policiesConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityControlConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scansConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentFieldEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idMatchingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType consentFieldObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idMatchingTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigPackageImpl() {
		super(eNS_URI, ConfigFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigPackage init() {
		if (isInited) return (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigPackageImpl theConfigPackage = registeredConfigPackage instanceof ConfigPackageImpl ? (ConfigPackageImpl)registeredConfigPackage : new ConfigPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Cm2Package.eNS_URI);
		Cm2PackageImpl theCm2Package = (Cm2PackageImpl)(registeredPackage instanceof Cm2PackageImpl ? registeredPackage : Cm2Package.eINSTANCE);

		// Create package meta-data objects
		theConfigPackage.createPackageContents();
		theCm2Package.createPackageContents();

		// Initialize created meta-data
		theConfigPackage.initializePackageContents();
		theCm2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigPackage.eNS_URI, theConfigPackage);
		return theConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationConfig() {
		return applicationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationConfig_TemplateTypes() {
		return (EAttribute)applicationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationConfig_ChromedriverPath() {
		return (EAttribute)applicationConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationConfig_EnableChromePdfExport() {
		return (EAttribute)applicationConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckConsentConfig() {
		return checkConsentConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckConsentConfig_IdMatchingType() {
		return (EAttribute)checkConsentConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckConsentConfig_IgnoreVersionNumber() {
		return (EAttribute)checkConsentConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckConsentConfig_RequestDate() {
		return (EAttribute)checkConsentConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckConsentConfig_UnknownStateIsConsideredAsDecline() {
		return (EAttribute)checkConsentConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckConsentConfig_UseAliases() {
		return (EAttribute)checkConsentConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckConsentConfig_UseHistoricalData() {
		return (EAttribute)checkConsentConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainConfig() {
		return domainConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainConfig_QualityControl() {
		return (EReference)domainConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainConfig_Statistic() {
		return (EReference)domainConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainConfig_Policies() {
		return (EReference)domainConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainConfig_Scans() {
		return (EReference)domainConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainConfig_Notifications() {
		return (EReference)domainConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainConfig_Application() {
		return (EReference)domainConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryType() {
		return entryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntryType_Key() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntryType_Value() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterType() {
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType_Entry() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotificationsConfig() {
		return notificationsConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationsConfig_SendFromWeb() {
		return (EAttribute)notificationsConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaginationConfig() {
		return paginationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_EndDate() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaginationConfig_Filter() {
		return (EReference)paginationConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_FilterFieldsAreTreatedAsConjunction() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_FilterIsCaseSensitive() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_FirstEntry() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_PageSize() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_SortField() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_SortIsAscending() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_StartDate() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_TemplateType() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginationConfig_UseAliases() {
		return (EAttribute)paginationConfigEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DomainConfig() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DomainConfig1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoliciesConfig() {
		return policiesConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoliciesConfig_PermanentRevoke() {
		return (EAttribute)policiesConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoliciesConfig_TakeHighestVersionInsteadOfNewest() {
		return (EAttribute)policiesConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoliciesConfig_TakeMostSpecificValidityInsteadOfShortest() {
		return (EAttribute)policiesConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityControlConfig() {
		return qualityControlConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityControlConfig_Type() {
		return (EReference)qualityControlConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityControlConfig_ProblemType() {
		return (EReference)qualityControlConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityControlConfig_ProblemTypeAction() {
		return (EReference)qualityControlConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualityControlConfig_DefaultType() {
		return (EAttribute)qualityControlConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScansConfig() {
		return scansConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScansConfig_Mandatory() {
		return (EAttribute)scansConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScansConfig_SizeLimit() {
		return (EAttribute)scansConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticConfig() {
		return statisticConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatisticConfig_CalculateDocumentDetails() {
		return (EAttribute)statisticConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatisticConfig_CalculatePolicyDetails() {
		return (EAttribute)statisticConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentField() {
		return consentFieldEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdMatchingType() {
		return idMatchingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConsentFieldObject() {
		return consentFieldObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdMatchingTypeObject() {
		return idMatchingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigFactory getConfigFactory() {
		return (ConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		applicationConfigEClass = createEClass(APPLICATION_CONFIG);
		createEAttribute(applicationConfigEClass, APPLICATION_CONFIG__TEMPLATE_TYPES);
		createEAttribute(applicationConfigEClass, APPLICATION_CONFIG__CHROMEDRIVER_PATH);
		createEAttribute(applicationConfigEClass, APPLICATION_CONFIG__ENABLE_CHROME_PDF_EXPORT);

		checkConsentConfigEClass = createEClass(CHECK_CONSENT_CONFIG);
		createEAttribute(checkConsentConfigEClass, CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE);
		createEAttribute(checkConsentConfigEClass, CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER);
		createEAttribute(checkConsentConfigEClass, CHECK_CONSENT_CONFIG__REQUEST_DATE);
		createEAttribute(checkConsentConfigEClass, CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE);
		createEAttribute(checkConsentConfigEClass, CHECK_CONSENT_CONFIG__USE_ALIASES);
		createEAttribute(checkConsentConfigEClass, CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA);

		domainConfigEClass = createEClass(DOMAIN_CONFIG);
		createEReference(domainConfigEClass, DOMAIN_CONFIG__QUALITY_CONTROL);
		createEReference(domainConfigEClass, DOMAIN_CONFIG__STATISTIC);
		createEReference(domainConfigEClass, DOMAIN_CONFIG__POLICIES);
		createEReference(domainConfigEClass, DOMAIN_CONFIG__SCANS);
		createEReference(domainConfigEClass, DOMAIN_CONFIG__NOTIFICATIONS);
		createEReference(domainConfigEClass, DOMAIN_CONFIG__APPLICATION);

		entryTypeEClass = createEClass(ENTRY_TYPE);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__KEY);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__VALUE);

		filterTypeEClass = createEClass(FILTER_TYPE);
		createEReference(filterTypeEClass, FILTER_TYPE__ENTRY);

		notificationsConfigEClass = createEClass(NOTIFICATIONS_CONFIG);
		createEAttribute(notificationsConfigEClass, NOTIFICATIONS_CONFIG__SEND_FROM_WEB);

		paginationConfigEClass = createEClass(PAGINATION_CONFIG);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__END_DATE);
		createEReference(paginationConfigEClass, PAGINATION_CONFIG__FILTER);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__FILTER_FIELDS_ARE_TREATED_AS_CONJUNCTION);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__FILTER_IS_CASE_SENSITIVE);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__FIRST_ENTRY);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__PAGE_SIZE);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__SORT_FIELD);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__SORT_IS_ASCENDING);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__START_DATE);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__TEMPLATE_TYPE);
		createEAttribute(paginationConfigEClass, PAGINATION_CONFIG__USE_ALIASES);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOMAIN_CONFIG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOMAIN_CONFIG1);

		policiesConfigEClass = createEClass(POLICIES_CONFIG);
		createEAttribute(policiesConfigEClass, POLICIES_CONFIG__PERMANENT_REVOKE);
		createEAttribute(policiesConfigEClass, POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST);
		createEAttribute(policiesConfigEClass, POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST);

		qualityControlConfigEClass = createEClass(QUALITY_CONTROL_CONFIG);
		createEReference(qualityControlConfigEClass, QUALITY_CONTROL_CONFIG__TYPE);
		createEReference(qualityControlConfigEClass, QUALITY_CONTROL_CONFIG__PROBLEM_TYPE);
		createEReference(qualityControlConfigEClass, QUALITY_CONTROL_CONFIG__PROBLEM_TYPE_ACTION);
		createEAttribute(qualityControlConfigEClass, QUALITY_CONTROL_CONFIG__DEFAULT_TYPE);

		scansConfigEClass = createEClass(SCANS_CONFIG);
		createEAttribute(scansConfigEClass, SCANS_CONFIG__MANDATORY);
		createEAttribute(scansConfigEClass, SCANS_CONFIG__SIZE_LIMIT);

		statisticConfigEClass = createEClass(STATISTIC_CONFIG);
		createEAttribute(statisticConfigEClass, STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS);
		createEAttribute(statisticConfigEClass, STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS);

		// Create enums
		consentFieldEEnum = createEEnum(CONSENT_FIELD);
		idMatchingTypeEEnum = createEEnum(ID_MATCHING_TYPE);

		// Create data types
		consentFieldObjectEDataType = createEDataType(CONSENT_FIELD_OBJECT);
		idMatchingTypeObjectEDataType = createEDataType(ID_MATCHING_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Cm2Package theCm2Package = (Cm2Package)EPackage.Registry.INSTANCE.getEPackage(Cm2Package.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationConfigEClass, ApplicationConfig.class, "ApplicationConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationConfig_TemplateTypes(), theCm2Package.getConsentTemplateType(), "templateTypes", null, 0, -1, ApplicationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationConfig_ChromedriverPath(), theXMLTypePackage.getString(), "chromedriverPath", null, 0, 1, ApplicationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationConfig_EnableChromePdfExport(), theXMLTypePackage.getBoolean(), "enableChromePdfExport", null, 1, 1, ApplicationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkConsentConfigEClass, CheckConsentConfig.class, "CheckConsentConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckConsentConfig_IdMatchingType(), this.getIdMatchingType(), "idMatchingType", null, 0, 1, CheckConsentConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckConsentConfig_IgnoreVersionNumber(), theXMLTypePackage.getBoolean(), "ignoreVersionNumber", null, 1, 1, CheckConsentConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckConsentConfig_RequestDate(), theXMLTypePackage.getDateTime(), "requestDate", null, 0, 1, CheckConsentConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckConsentConfig_UnknownStateIsConsideredAsDecline(), theXMLTypePackage.getBoolean(), "unknownStateIsConsideredAsDecline", null, 1, 1, CheckConsentConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckConsentConfig_UseAliases(), theXMLTypePackage.getBoolean(), "useAliases", null, 1, 1, CheckConsentConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckConsentConfig_UseHistoricalData(), theXMLTypePackage.getBoolean(), "useHistoricalData", null, 1, 1, CheckConsentConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainConfigEClass, DomainConfig.class, "DomainConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainConfig_QualityControl(), this.getQualityControlConfig(), null, "qualityControl", null, 0, 1, DomainConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainConfig_Statistic(), this.getStatisticConfig(), null, "statistic", null, 0, 1, DomainConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainConfig_Policies(), this.getPoliciesConfig(), null, "policies", null, 0, 1, DomainConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainConfig_Scans(), this.getScansConfig(), null, "scans", null, 0, 1, DomainConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainConfig_Notifications(), this.getNotificationsConfig(), null, "notifications", null, 0, 1, DomainConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainConfig_Application(), this.getApplicationConfig(), null, "application", null, 0, 1, DomainConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryType_Key(), this.getConsentField(), "key", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterTypeEClass, FilterType.class, "FilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterType_Entry(), this.getEntryType(), null, "entry", null, 0, -1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationsConfigEClass, NotificationsConfig.class, "NotificationsConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificationsConfig_SendFromWeb(), theXMLTypePackage.getBoolean(), "sendFromWeb", null, 1, 1, NotificationsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginationConfigEClass, PaginationConfig.class, "PaginationConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaginationConfig_EndDate(), theXMLTypePackage.getDateTime(), "endDate", null, 0, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginationConfig_Filter(), this.getFilterType(), null, "filter", null, 1, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_FilterFieldsAreTreatedAsConjunction(), theXMLTypePackage.getBoolean(), "filterFieldsAreTreatedAsConjunction", null, 1, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_FilterIsCaseSensitive(), theXMLTypePackage.getBoolean(), "filterIsCaseSensitive", null, 1, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_FirstEntry(), theXMLTypePackage.getInt(), "firstEntry", null, 1, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_PageSize(), theXMLTypePackage.getInt(), "pageSize", null, 1, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_SortField(), this.getConsentField(), "sortField", null, 0, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_SortIsAscending(), theXMLTypePackage.getBoolean(), "sortIsAscending", null, 1, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_StartDate(), theXMLTypePackage.getDateTime(), "startDate", null, 0, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_TemplateType(), theCm2Package.getConsentTemplateType(), "templateType", null, 0, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginationConfig_UseAliases(), theXMLTypePackage.getBoolean(), "useAliases", null, 1, 1, PaginationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DomainConfig(), this.getDomainConfig(), null, "domainConfig", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DomainConfig1(), this.getDomainConfig(), null, "domainConfig1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(policiesConfigEClass, PoliciesConfig.class, "PoliciesConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoliciesConfig_PermanentRevoke(), theXMLTypePackage.getBoolean(), "permanentRevoke", null, 1, 1, PoliciesConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoliciesConfig_TakeHighestVersionInsteadOfNewest(), theXMLTypePackage.getBoolean(), "takeHighestVersionInsteadOfNewest", null, 1, 1, PoliciesConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoliciesConfig_TakeMostSpecificValidityInsteadOfShortest(), theXMLTypePackage.getBoolean(), "takeMostSpecificValidityInsteadOfShortest", null, 1, 1, PoliciesConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityControlConfigEClass, QualityControlConfig.class, "QualityControlConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityControlConfig_Type(), theCm2Package.getQCType(), null, "type", null, 0, -1, QualityControlConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityControlConfig_ProblemType(), theCm2Package.getQCProblemType(), null, "problemType", null, 0, -1, QualityControlConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityControlConfig_ProblemTypeAction(), theCm2Package.getQCProblemTypeAction(), null, "problemTypeAction", null, 0, -1, QualityControlConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityControlConfig_DefaultType(), theXMLTypePackage.getString(), "defaultType", null, 0, 1, QualityControlConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scansConfigEClass, ScansConfig.class, "ScansConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScansConfig_Mandatory(), theXMLTypePackage.getBoolean(), "mandatory", null, 1, 1, ScansConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScansConfig_SizeLimit(), theXMLTypePackage.getInt(), "sizeLimit", null, 1, 1, ScansConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticConfigEClass, StatisticConfig.class, "StatisticConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatisticConfig_CalculateDocumentDetails(), theXMLTypePackage.getBoolean(), "calculateDocumentDetails", null, 1, 1, StatisticConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatisticConfig_CalculatePolicyDetails(), theXMLTypePackage.getBoolean(), "calculatePolicyDetails", null, 1, 1, StatisticConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(consentFieldEEnum, ConsentField.class, "ConsentField");
		addEEnumLiteral(consentFieldEEnum, ConsentField.NONE);
		addEEnumLiteral(consentFieldEEnum, ConsentField.DATE);
		addEEnumLiteral(consentFieldEEnum, ConsentField.CTVERSION);
		addEEnumLiteral(consentFieldEEnum, ConsentField.CTNAME);
		addEEnumLiteral(consentFieldEEnum, ConsentField.CTLABEL);
		addEEnumLiteral(consentFieldEEnum, ConsentField.SIGNERID);
		addEEnumLiteral(consentFieldEEnum, ConsentField.QCTYPE);

		initEEnum(idMatchingTypeEEnum, IdMatchingType.class, "IdMatchingType");
		addEEnumLiteral(idMatchingTypeEEnum, IdMatchingType.ATLEASTONE);
		addEEnumLiteral(idMatchingTypeEEnum, IdMatchingType.ATLEASTALL);
		addEEnumLiteral(idMatchingTypeEEnum, IdMatchingType.EXACT);

		// Initialize data types
		initEDataType(consentFieldObjectEDataType, ConsentField.class, "ConsentFieldObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idMatchingTypeObjectEDataType, IdMatchingType.class, "IdMatchingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (applicationConfigEClass,
		   source,
		   new String[] {
			   "name", "ApplicationConfig",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getApplicationConfig_TemplateTypes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "template-types"
		   });
		addAnnotation
		  (getApplicationConfig_ChromedriverPath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "chromedriver-path"
		   });
		addAnnotation
		  (getApplicationConfig_EnableChromePdfExport(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "enable-chrome-pdf-export"
		   });
		addAnnotation
		  (checkConsentConfigEClass,
		   source,
		   new String[] {
			   "name", "checkConsentConfig",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCheckConsentConfig_IdMatchingType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idMatchingType"
		   });
		addAnnotation
		  (getCheckConsentConfig_IgnoreVersionNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ignoreVersionNumber"
		   });
		addAnnotation
		  (getCheckConsentConfig_RequestDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requestDate"
		   });
		addAnnotation
		  (getCheckConsentConfig_UnknownStateIsConsideredAsDecline(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unknownStateIsConsideredAsDecline"
		   });
		addAnnotation
		  (getCheckConsentConfig_UseAliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useAliases"
		   });
		addAnnotation
		  (getCheckConsentConfig_UseHistoricalData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useHistoricalData"
		   });
		addAnnotation
		  (consentFieldEEnum,
		   source,
		   new String[] {
			   "name", "consentField"
		   });
		addAnnotation
		  (consentFieldObjectEDataType,
		   source,
		   new String[] {
			   "name", "consentField:Object",
			   "baseType", "consentField"
		   });
		addAnnotation
		  (domainConfigEClass,
		   source,
		   new String[] {
			   "name", "DomainConfig",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDomainConfig_QualityControl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quality-control"
		   });
		addAnnotation
		  (getDomainConfig_Statistic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "statistic"
		   });
		addAnnotation
		  (getDomainConfig_Policies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "policies"
		   });
		addAnnotation
		  (getDomainConfig_Scans(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scans"
		   });
		addAnnotation
		  (getDomainConfig_Notifications(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "notifications"
		   });
		addAnnotation
		  (getDomainConfig_Application(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "application"
		   });
		addAnnotation
		  (entryTypeEClass,
		   source,
		   new String[] {
			   "name", "entry_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntryType_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key"
		   });
		addAnnotation
		  (getEntryType_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value"
		   });
		addAnnotation
		  (filterTypeEClass,
		   source,
		   new String[] {
			   "name", "filter_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFilterType_Entry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entry"
		   });
		addAnnotation
		  (idMatchingTypeEEnum,
		   source,
		   new String[] {
			   "name", "idMatchingType"
		   });
		addAnnotation
		  (idMatchingTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "idMatchingType:Object",
			   "baseType", "idMatchingType"
		   });
		addAnnotation
		  (notificationsConfigEClass,
		   source,
		   new String[] {
			   "name", "NotificationsConfig",
			   "kind", "empty"
		   });
		addAnnotation
		  (getNotificationsConfig_SendFromWeb(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "send-from-web"
		   });
		addAnnotation
		  (paginationConfigEClass,
		   source,
		   new String[] {
			   "name", "paginationConfig",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPaginationConfig_EndDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endDate"
		   });
		addAnnotation
		  (getPaginationConfig_Filter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "filter"
		   });
		addAnnotation
		  (getPaginationConfig_FilterFieldsAreTreatedAsConjunction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "filterFieldsAreTreatedAsConjunction"
		   });
		addAnnotation
		  (getPaginationConfig_FilterIsCaseSensitive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "filterIsCaseSensitive"
		   });
		addAnnotation
		  (getPaginationConfig_FirstEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "firstEntry"
		   });
		addAnnotation
		  (getPaginationConfig_PageSize(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pageSize"
		   });
		addAnnotation
		  (getPaginationConfig_SortField(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sortField"
		   });
		addAnnotation
		  (getPaginationConfig_SortIsAscending(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sortIsAscending"
		   });
		addAnnotation
		  (getPaginationConfig_StartDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startDate"
		   });
		addAnnotation
		  (getPaginationConfig_TemplateType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "templateType"
		   });
		addAnnotation
		  (getPaginationConfig_UseAliases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "useAliases"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_DomainConfig(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domain-config",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DomainConfig1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DomainConfig",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (policiesConfigEClass,
		   source,
		   new String[] {
			   "name", "PoliciesConfig",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPoliciesConfig_PermanentRevoke(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "permanent-revoke"
		   });
		addAnnotation
		  (getPoliciesConfig_TakeHighestVersionInsteadOfNewest(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "take-highest-version-instead-of-newest"
		   });
		addAnnotation
		  (getPoliciesConfig_TakeMostSpecificValidityInsteadOfShortest(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "take-most-specific-validity-instead-of-shortest"
		   });
		addAnnotation
		  (qualityControlConfigEClass,
		   source,
		   new String[] {
			   "name", "QualityControlConfig",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQualityControlConfig_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type"
		   });
		addAnnotation
		  (getQualityControlConfig_ProblemType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "problem-type"
		   });
		addAnnotation
		  (getQualityControlConfig_ProblemTypeAction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "problem-type-action"
		   });
		addAnnotation
		  (getQualityControlConfig_DefaultType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "default-type"
		   });
		addAnnotation
		  (scansConfigEClass,
		   source,
		   new String[] {
			   "name", "ScansConfig",
			   "kind", "empty"
		   });
		addAnnotation
		  (getScansConfig_Mandatory(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "mandatory"
		   });
		addAnnotation
		  (getScansConfig_SizeLimit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "size-limit"
		   });
		addAnnotation
		  (statisticConfigEClass,
		   source,
		   new String[] {
			   "name", "StatisticConfig",
			   "kind", "empty"
		   });
		addAnnotation
		  (getStatisticConfig_CalculateDocumentDetails(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "calculate-document-details"
		   });
		addAnnotation
		  (getStatisticConfig_CalculatePolicyDetails(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "calculate-policy-details"
		   });
	}

} //ConfigPackageImpl
