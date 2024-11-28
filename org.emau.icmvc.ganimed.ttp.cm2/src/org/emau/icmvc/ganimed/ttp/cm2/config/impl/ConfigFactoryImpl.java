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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emau.icmvc.ganimed.ttp.cm2.config.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigFactoryImpl extends EFactoryImpl implements ConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigFactory init() {
		try {
			ConfigFactory theConfigFactory = (ConfigFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigPackage.eNS_URI);
			if (theConfigFactory != null) {
				return theConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigPackage.APPLICATION_CONFIG: return createApplicationConfig();
			case ConfigPackage.CHECK_CONSENT_CONFIG: return createCheckConsentConfig();
			case ConfigPackage.DOMAIN_CONFIG: return createDomainConfig();
			case ConfigPackage.ENTRY_TYPE: return createEntryType();
			case ConfigPackage.FILTER_TYPE: return createFilterType();
			case ConfigPackage.NOTIFICATIONS_CONFIG: return createNotificationsConfig();
			case ConfigPackage.PAGINATION_CONFIG: return createPaginationConfig();
			case ConfigPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ConfigPackage.POLICIES_CONFIG: return createPoliciesConfig();
			case ConfigPackage.QUALITY_CONTROL_CONFIG: return createQualityControlConfig();
			case ConfigPackage.SCANS_CONFIG: return createScansConfig();
			case ConfigPackage.STATISTIC_CONFIG: return createStatisticConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigPackage.CONSENT_FIELD:
				return createConsentFieldFromString(eDataType, initialValue);
			case ConfigPackage.ID_MATCHING_TYPE:
				return createIdMatchingTypeFromString(eDataType, initialValue);
			case ConfigPackage.CONSENT_FIELD_OBJECT:
				return createConsentFieldObjectFromString(eDataType, initialValue);
			case ConfigPackage.ID_MATCHING_TYPE_OBJECT:
				return createIdMatchingTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigPackage.CONSENT_FIELD:
				return convertConsentFieldToString(eDataType, instanceValue);
			case ConfigPackage.ID_MATCHING_TYPE:
				return convertIdMatchingTypeToString(eDataType, instanceValue);
			case ConfigPackage.CONSENT_FIELD_OBJECT:
				return convertConsentFieldObjectToString(eDataType, instanceValue);
			case ConfigPackage.ID_MATCHING_TYPE_OBJECT:
				return convertIdMatchingTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationConfig createApplicationConfig() {
		ApplicationConfigImpl applicationConfig = new ApplicationConfigImpl();
		return applicationConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckConsentConfig createCheckConsentConfig() {
		CheckConsentConfigImpl checkConsentConfig = new CheckConsentConfigImpl();
		return checkConsentConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainConfig createDomainConfig() {
		DomainConfigImpl domainConfig = new DomainConfigImpl();
		return domainConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType createFilterType() {
		FilterTypeImpl filterType = new FilterTypeImpl();
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationsConfig createNotificationsConfig() {
		NotificationsConfigImpl notificationsConfig = new NotificationsConfigImpl();
		return notificationsConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaginationConfig createPaginationConfig() {
		PaginationConfigImpl paginationConfig = new PaginationConfigImpl();
		return paginationConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoliciesConfig createPoliciesConfig() {
		PoliciesConfigImpl policiesConfig = new PoliciesConfigImpl();
		return policiesConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityControlConfig createQualityControlConfig() {
		QualityControlConfigImpl qualityControlConfig = new QualityControlConfigImpl();
		return qualityControlConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScansConfig createScansConfig() {
		ScansConfigImpl scansConfig = new ScansConfigImpl();
		return scansConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatisticConfig createStatisticConfig() {
		StatisticConfigImpl statisticConfig = new StatisticConfigImpl();
		return statisticConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentField createConsentFieldFromString(EDataType eDataType, String initialValue) {
		ConsentField result = ConsentField.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentFieldToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdMatchingType createIdMatchingTypeFromString(EDataType eDataType, String initialValue) {
		IdMatchingType result = IdMatchingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdMatchingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentField createConsentFieldObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentFieldFromString(ConfigPackage.Literals.CONSENT_FIELD, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentFieldObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentFieldToString(ConfigPackage.Literals.CONSENT_FIELD, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdMatchingType createIdMatchingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIdMatchingTypeFromString(ConfigPackage.Literals.ID_MATCHING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdMatchingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdMatchingTypeToString(ConfigPackage.Literals.ID_MATCHING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigPackage getConfigPackage() {
		return (ConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigPackage getPackage() {
		return ConfigPackage.eINSTANCE;
	}

} //ConfigFactoryImpl
