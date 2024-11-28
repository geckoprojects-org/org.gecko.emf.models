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
package org.emau.icmvc.ganimed.ttp.cm2.config;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Consent Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getIdMatchingType <em>Id Matching Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isIgnoreVersionNumber <em>Ignore Version Number</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getRequestDate <em>Request Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUnknownStateIsConsideredAsDecline <em>Unknown State Is Considered As Decline</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseAliases <em>Use Aliases</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseHistoricalData <em>Use Historical Data</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getCheckConsentConfig()
 * @model extendedMetaData="name='checkConsentConfig' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CheckConsentConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Matching Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Matching Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType
	 * @see #isSetIdMatchingType()
	 * @see #unsetIdMatchingType()
	 * @see #setIdMatchingType(IdMatchingType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getCheckConsentConfig_IdMatchingType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='idMatchingType'"
	 * @generated
	 */
	IdMatchingType getIdMatchingType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getIdMatchingType <em>Id Matching Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Matching Type</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.IdMatchingType
	 * @see #isSetIdMatchingType()
	 * @see #unsetIdMatchingType()
	 * @see #getIdMatchingType()
	 * @generated
	 */
	void setIdMatchingType(IdMatchingType value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getIdMatchingType <em>Id Matching Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdMatchingType()
	 * @see #getIdMatchingType()
	 * @see #setIdMatchingType(IdMatchingType)
	 * @generated
	 */
	void unsetIdMatchingType();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getIdMatchingType <em>Id Matching Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id Matching Type</em>' attribute is set.
	 * @see #unsetIdMatchingType()
	 * @see #getIdMatchingType()
	 * @see #setIdMatchingType(IdMatchingType)
	 * @generated
	 */
	boolean isSetIdMatchingType();

	/**
	 * Returns the value of the '<em><b>Ignore Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Version Number</em>' attribute.
	 * @see #isSetIgnoreVersionNumber()
	 * @see #unsetIgnoreVersionNumber()
	 * @see #setIgnoreVersionNumber(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getCheckConsentConfig_IgnoreVersionNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='ignoreVersionNumber'"
	 * @generated
	 */
	boolean isIgnoreVersionNumber();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isIgnoreVersionNumber <em>Ignore Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Version Number</em>' attribute.
	 * @see #isSetIgnoreVersionNumber()
	 * @see #unsetIgnoreVersionNumber()
	 * @see #isIgnoreVersionNumber()
	 * @generated
	 */
	void setIgnoreVersionNumber(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isIgnoreVersionNumber <em>Ignore Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreVersionNumber()
	 * @see #isIgnoreVersionNumber()
	 * @see #setIgnoreVersionNumber(boolean)
	 * @generated
	 */
	void unsetIgnoreVersionNumber();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isIgnoreVersionNumber <em>Ignore Version Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Version Number</em>' attribute is set.
	 * @see #unsetIgnoreVersionNumber()
	 * @see #isIgnoreVersionNumber()
	 * @see #setIgnoreVersionNumber(boolean)
	 * @generated
	 */
	boolean isSetIgnoreVersionNumber();

	/**
	 * Returns the value of the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Date</em>' attribute.
	 * @see #setRequestDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getCheckConsentConfig_RequestDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='requestDate'"
	 * @generated
	 */
	XMLGregorianCalendar getRequestDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#getRequestDate <em>Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Date</em>' attribute.
	 * @see #getRequestDate()
	 * @generated
	 */
	void setRequestDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Unknown State Is Considered As Decline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown State Is Considered As Decline</em>' attribute.
	 * @see #isSetUnknownStateIsConsideredAsDecline()
	 * @see #unsetUnknownStateIsConsideredAsDecline()
	 * @see #setUnknownStateIsConsideredAsDecline(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getCheckConsentConfig_UnknownStateIsConsideredAsDecline()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='unknownStateIsConsideredAsDecline'"
	 * @generated
	 */
	boolean isUnknownStateIsConsideredAsDecline();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUnknownStateIsConsideredAsDecline <em>Unknown State Is Considered As Decline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown State Is Considered As Decline</em>' attribute.
	 * @see #isSetUnknownStateIsConsideredAsDecline()
	 * @see #unsetUnknownStateIsConsideredAsDecline()
	 * @see #isUnknownStateIsConsideredAsDecline()
	 * @generated
	 */
	void setUnknownStateIsConsideredAsDecline(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUnknownStateIsConsideredAsDecline <em>Unknown State Is Considered As Decline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnknownStateIsConsideredAsDecline()
	 * @see #isUnknownStateIsConsideredAsDecline()
	 * @see #setUnknownStateIsConsideredAsDecline(boolean)
	 * @generated
	 */
	void unsetUnknownStateIsConsideredAsDecline();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUnknownStateIsConsideredAsDecline <em>Unknown State Is Considered As Decline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unknown State Is Considered As Decline</em>' attribute is set.
	 * @see #unsetUnknownStateIsConsideredAsDecline()
	 * @see #isUnknownStateIsConsideredAsDecline()
	 * @see #setUnknownStateIsConsideredAsDecline(boolean)
	 * @generated
	 */
	boolean isSetUnknownStateIsConsideredAsDecline();

	/**
	 * Returns the value of the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Aliases</em>' attribute.
	 * @see #isSetUseAliases()
	 * @see #unsetUseAliases()
	 * @see #setUseAliases(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getCheckConsentConfig_UseAliases()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='useAliases'"
	 * @generated
	 */
	boolean isUseAliases();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseAliases <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Aliases</em>' attribute.
	 * @see #isSetUseAliases()
	 * @see #unsetUseAliases()
	 * @see #isUseAliases()
	 * @generated
	 */
	void setUseAliases(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseAliases <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseAliases()
	 * @see #isUseAliases()
	 * @see #setUseAliases(boolean)
	 * @generated
	 */
	void unsetUseAliases();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseAliases <em>Use Aliases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Aliases</em>' attribute is set.
	 * @see #unsetUseAliases()
	 * @see #isUseAliases()
	 * @see #setUseAliases(boolean)
	 * @generated
	 */
	boolean isSetUseAliases();

	/**
	 * Returns the value of the '<em><b>Use Historical Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Historical Data</em>' attribute.
	 * @see #isSetUseHistoricalData()
	 * @see #unsetUseHistoricalData()
	 * @see #setUseHistoricalData(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getCheckConsentConfig_UseHistoricalData()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='useHistoricalData'"
	 * @generated
	 */
	boolean isUseHistoricalData();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseHistoricalData <em>Use Historical Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Historical Data</em>' attribute.
	 * @see #isSetUseHistoricalData()
	 * @see #unsetUseHistoricalData()
	 * @see #isUseHistoricalData()
	 * @generated
	 */
	void setUseHistoricalData(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseHistoricalData <em>Use Historical Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseHistoricalData()
	 * @see #isUseHistoricalData()
	 * @see #setUseHistoricalData(boolean)
	 * @generated
	 */
	void unsetUseHistoricalData();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig#isUseHistoricalData <em>Use Historical Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Historical Data</em>' attribute is set.
	 * @see #unsetUseHistoricalData()
	 * @see #isUseHistoricalData()
	 * @see #setUseHistoricalData(boolean)
	 * @generated
	 */
	boolean isSetUseHistoricalData();

} // CheckConsentConfig
