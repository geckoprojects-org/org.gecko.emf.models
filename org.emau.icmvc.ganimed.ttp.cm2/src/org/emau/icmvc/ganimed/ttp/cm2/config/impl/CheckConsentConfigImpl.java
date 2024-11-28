/*
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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig;
import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;
import org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Consent Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl#getIdMatchingType <em>Id Matching Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl#isIgnoreVersionNumber <em>Ignore Version Number</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl#getRequestDate <em>Request Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl#isUnknownStateIsConsideredAsDecline <em>Unknown State Is Considered As Decline</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl#isUseAliases <em>Use Aliases</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.CheckConsentConfigImpl#isUseHistoricalData <em>Use Historical Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckConsentConfigImpl extends MinimalEObjectImpl.Container implements CheckConsentConfig {
	/**
	 * The default value of the '{@link #getIdMatchingType() <em>Id Matching Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdMatchingType()
	 * @generated
	 * @ordered
	 */
	protected static final IdMatchingType ID_MATCHING_TYPE_EDEFAULT = IdMatchingType.ATLEASTONE;

	/**
	 * The cached value of the '{@link #getIdMatchingType() <em>Id Matching Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdMatchingType()
	 * @generated
	 * @ordered
	 */
	protected IdMatchingType idMatchingType = ID_MATCHING_TYPE_EDEFAULT;

	/**
	 * This is true if the Id Matching Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idMatchingTypeESet;

	/**
	 * The default value of the '{@link #isIgnoreVersionNumber() <em>Ignore Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_VERSION_NUMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreVersionNumber() <em>Ignore Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreVersionNumber = IGNORE_VERSION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Ignore Version Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreVersionNumberESet;

	/**
	 * The default value of the '{@link #getRequestDate() <em>Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REQUEST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestDate() <em>Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar requestDate = REQUEST_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnknownStateIsConsideredAsDecline() <em>Unknown State Is Considered As Decline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnknownStateIsConsideredAsDecline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnknownStateIsConsideredAsDecline() <em>Unknown State Is Considered As Decline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnknownStateIsConsideredAsDecline()
	 * @generated
	 * @ordered
	 */
	protected boolean unknownStateIsConsideredAsDecline = UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE_EDEFAULT;

	/**
	 * This is true if the Unknown State Is Considered As Decline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unknownStateIsConsideredAsDeclineESet;

	/**
	 * The default value of the '{@link #isUseAliases() <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAliases()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ALIASES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAliases() <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAliases()
	 * @generated
	 * @ordered
	 */
	protected boolean useAliases = USE_ALIASES_EDEFAULT;

	/**
	 * This is true if the Use Aliases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useAliasesESet;

	/**
	 * The default value of the '{@link #isUseHistoricalData() <em>Use Historical Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseHistoricalData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_HISTORICAL_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseHistoricalData() <em>Use Historical Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseHistoricalData()
	 * @generated
	 * @ordered
	 */
	protected boolean useHistoricalData = USE_HISTORICAL_DATA_EDEFAULT;

	/**
	 * This is true if the Use Historical Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useHistoricalDataESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckConsentConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CHECK_CONSENT_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdMatchingType getIdMatchingType() {
		return idMatchingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdMatchingType(IdMatchingType newIdMatchingType) {
		IdMatchingType oldIdMatchingType = idMatchingType;
		idMatchingType = newIdMatchingType == null ? ID_MATCHING_TYPE_EDEFAULT : newIdMatchingType;
		boolean oldIdMatchingTypeESet = idMatchingTypeESet;
		idMatchingTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE, oldIdMatchingType, idMatchingType, !oldIdMatchingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIdMatchingType() {
		IdMatchingType oldIdMatchingType = idMatchingType;
		boolean oldIdMatchingTypeESet = idMatchingTypeESet;
		idMatchingType = ID_MATCHING_TYPE_EDEFAULT;
		idMatchingTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE, oldIdMatchingType, ID_MATCHING_TYPE_EDEFAULT, oldIdMatchingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIdMatchingType() {
		return idMatchingTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreVersionNumber() {
		return ignoreVersionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreVersionNumber(boolean newIgnoreVersionNumber) {
		boolean oldIgnoreVersionNumber = ignoreVersionNumber;
		ignoreVersionNumber = newIgnoreVersionNumber;
		boolean oldIgnoreVersionNumberESet = ignoreVersionNumberESet;
		ignoreVersionNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER, oldIgnoreVersionNumber, ignoreVersionNumber, !oldIgnoreVersionNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIgnoreVersionNumber() {
		boolean oldIgnoreVersionNumber = ignoreVersionNumber;
		boolean oldIgnoreVersionNumberESet = ignoreVersionNumberESet;
		ignoreVersionNumber = IGNORE_VERSION_NUMBER_EDEFAULT;
		ignoreVersionNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER, oldIgnoreVersionNumber, IGNORE_VERSION_NUMBER_EDEFAULT, oldIgnoreVersionNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIgnoreVersionNumber() {
		return ignoreVersionNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRequestDate() {
		return requestDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestDate(XMLGregorianCalendar newRequestDate) {
		XMLGregorianCalendar oldRequestDate = requestDate;
		requestDate = newRequestDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CHECK_CONSENT_CONFIG__REQUEST_DATE, oldRequestDate, requestDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnknownStateIsConsideredAsDecline() {
		return unknownStateIsConsideredAsDecline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownStateIsConsideredAsDecline(boolean newUnknownStateIsConsideredAsDecline) {
		boolean oldUnknownStateIsConsideredAsDecline = unknownStateIsConsideredAsDecline;
		unknownStateIsConsideredAsDecline = newUnknownStateIsConsideredAsDecline;
		boolean oldUnknownStateIsConsideredAsDeclineESet = unknownStateIsConsideredAsDeclineESet;
		unknownStateIsConsideredAsDeclineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE, oldUnknownStateIsConsideredAsDecline, unknownStateIsConsideredAsDecline, !oldUnknownStateIsConsideredAsDeclineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnknownStateIsConsideredAsDecline() {
		boolean oldUnknownStateIsConsideredAsDecline = unknownStateIsConsideredAsDecline;
		boolean oldUnknownStateIsConsideredAsDeclineESet = unknownStateIsConsideredAsDeclineESet;
		unknownStateIsConsideredAsDecline = UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE_EDEFAULT;
		unknownStateIsConsideredAsDeclineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE, oldUnknownStateIsConsideredAsDecline, UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE_EDEFAULT, oldUnknownStateIsConsideredAsDeclineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnknownStateIsConsideredAsDecline() {
		return unknownStateIsConsideredAsDeclineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseAliases() {
		return useAliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseAliases(boolean newUseAliases) {
		boolean oldUseAliases = useAliases;
		useAliases = newUseAliases;
		boolean oldUseAliasesESet = useAliasesESet;
		useAliasesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CHECK_CONSENT_CONFIG__USE_ALIASES, oldUseAliases, useAliases, !oldUseAliasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseAliases() {
		boolean oldUseAliases = useAliases;
		boolean oldUseAliasesESet = useAliasesESet;
		useAliases = USE_ALIASES_EDEFAULT;
		useAliasesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.CHECK_CONSENT_CONFIG__USE_ALIASES, oldUseAliases, USE_ALIASES_EDEFAULT, oldUseAliasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseAliases() {
		return useAliasesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseHistoricalData() {
		return useHistoricalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseHistoricalData(boolean newUseHistoricalData) {
		boolean oldUseHistoricalData = useHistoricalData;
		useHistoricalData = newUseHistoricalData;
		boolean oldUseHistoricalDataESet = useHistoricalDataESet;
		useHistoricalDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA, oldUseHistoricalData, useHistoricalData, !oldUseHistoricalDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseHistoricalData() {
		boolean oldUseHistoricalData = useHistoricalData;
		boolean oldUseHistoricalDataESet = useHistoricalDataESet;
		useHistoricalData = USE_HISTORICAL_DATA_EDEFAULT;
		useHistoricalDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA, oldUseHistoricalData, USE_HISTORICAL_DATA_EDEFAULT, oldUseHistoricalDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseHistoricalData() {
		return useHistoricalDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE:
				return getIdMatchingType();
			case ConfigPackage.CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER:
				return isIgnoreVersionNumber();
			case ConfigPackage.CHECK_CONSENT_CONFIG__REQUEST_DATE:
				return getRequestDate();
			case ConfigPackage.CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE:
				return isUnknownStateIsConsideredAsDecline();
			case ConfigPackage.CHECK_CONSENT_CONFIG__USE_ALIASES:
				return isUseAliases();
			case ConfigPackage.CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA:
				return isUseHistoricalData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE:
				setIdMatchingType((IdMatchingType)newValue);
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER:
				setIgnoreVersionNumber((Boolean)newValue);
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__REQUEST_DATE:
				setRequestDate((XMLGregorianCalendar)newValue);
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE:
				setUnknownStateIsConsideredAsDecline((Boolean)newValue);
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__USE_ALIASES:
				setUseAliases((Boolean)newValue);
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA:
				setUseHistoricalData((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE:
				unsetIdMatchingType();
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER:
				unsetIgnoreVersionNumber();
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__REQUEST_DATE:
				setRequestDate(REQUEST_DATE_EDEFAULT);
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE:
				unsetUnknownStateIsConsideredAsDecline();
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__USE_ALIASES:
				unsetUseAliases();
				return;
			case ConfigPackage.CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA:
				unsetUseHistoricalData();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.CHECK_CONSENT_CONFIG__ID_MATCHING_TYPE:
				return isSetIdMatchingType();
			case ConfigPackage.CHECK_CONSENT_CONFIG__IGNORE_VERSION_NUMBER:
				return isSetIgnoreVersionNumber();
			case ConfigPackage.CHECK_CONSENT_CONFIG__REQUEST_DATE:
				return REQUEST_DATE_EDEFAULT == null ? requestDate != null : !REQUEST_DATE_EDEFAULT.equals(requestDate);
			case ConfigPackage.CHECK_CONSENT_CONFIG__UNKNOWN_STATE_IS_CONSIDERED_AS_DECLINE:
				return isSetUnknownStateIsConsideredAsDecline();
			case ConfigPackage.CHECK_CONSENT_CONFIG__USE_ALIASES:
				return isSetUseAliases();
			case ConfigPackage.CHECK_CONSENT_CONFIG__USE_HISTORICAL_DATA:
				return isSetUseHistoricalData();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idMatchingType: ");
		if (idMatchingTypeESet) result.append(idMatchingType); else result.append("<unset>");
		result.append(", ignoreVersionNumber: ");
		if (ignoreVersionNumberESet) result.append(ignoreVersionNumber); else result.append("<unset>");
		result.append(", requestDate: ");
		result.append(requestDate);
		result.append(", unknownStateIsConsideredAsDecline: ");
		if (unknownStateIsConsideredAsDeclineESet) result.append(unknownStateIsConsideredAsDecline); else result.append("<unset>");
		result.append(", useAliases: ");
		if (useAliasesESet) result.append(useAliases); else result.append("<unset>");
		result.append(", useHistoricalData: ");
		if (useHistoricalDataESet) result.append(useHistoricalData); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CheckConsentConfigImpl
