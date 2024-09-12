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
package de.dwd.cdc;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.GeometryPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OBSDEUPT1HT2M Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGEOM <em>SDOGEOM</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOTYPE <em>SDOTYPE</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGUID <em>SDOGUID</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOCODE <em>SDOCODE</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDONAME <em>SDONAME</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getZEITSTEMPEL <em>ZEITSTEMPEL</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getZEITINTERVALL <em>ZEITINTERVALL</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getWERT <em>WERT</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getEINHEIT <em>EINHEIT</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETBYTE <em>QUALITAETBYTE</em>}</li>
 *   <li>{@link de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETNIVEAU <em>QUALITAETNIVEAU</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType()
 * @model extendedMetaData="name='OBS_DEU_PT1H_T2MType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OBSDEUPT1HT2MType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>SDOGEOM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDOGEOM</em>' containment reference.
	 * @see #isSetSDOGEOM()
	 * @see #unsetSDOGEOM()
	 * @see #setSDOGEOM(GeometryPropertyType)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_SDOGEOM()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SDO_GEOM' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getSDOGEOM();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGEOM <em>SDOGEOM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDOGEOM</em>' containment reference.
	 * @see #isSetSDOGEOM()
	 * @see #unsetSDOGEOM()
	 * @see #getSDOGEOM()
	 * @generated
	 */
	void setSDOGEOM(GeometryPropertyType value);

	/**
	 * Unsets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGEOM <em>SDOGEOM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSDOGEOM()
	 * @see #getSDOGEOM()
	 * @see #setSDOGEOM(GeometryPropertyType)
	 * @generated
	 */
	void unsetSDOGEOM();

	/**
	 * Returns whether the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGEOM <em>SDOGEOM</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SDOGEOM</em>' containment reference is set.
	 * @see #unsetSDOGEOM()
	 * @see #getSDOGEOM()
	 * @see #setSDOGEOM(GeometryPropertyType)
	 * @generated
	 */
	boolean isSetSDOGEOM();

	/**
	 * Returns the value of the '<em><b>SDOTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDOTYPE</em>' attribute.
	 * @see #isSetSDOTYPE()
	 * @see #unsetSDOTYPE()
	 * @see #setSDOTYPE(String)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_SDOTYPE()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SDO_TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSDOTYPE();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOTYPE <em>SDOTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDOTYPE</em>' attribute.
	 * @see #isSetSDOTYPE()
	 * @see #unsetSDOTYPE()
	 * @see #getSDOTYPE()
	 * @generated
	 */
	void setSDOTYPE(String value);

	/**
	 * Unsets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOTYPE <em>SDOTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSDOTYPE()
	 * @see #getSDOTYPE()
	 * @see #setSDOTYPE(String)
	 * @generated
	 */
	void unsetSDOTYPE();

	/**
	 * Returns whether the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOTYPE <em>SDOTYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SDOTYPE</em>' attribute is set.
	 * @see #unsetSDOTYPE()
	 * @see #getSDOTYPE()
	 * @see #setSDOTYPE(String)
	 * @generated
	 */
	boolean isSetSDOTYPE();

	/**
	 * Returns the value of the '<em><b>SDOGUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDOGUID</em>' attribute.
	 * @see #setSDOGUID(BigDecimal)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_SDOGUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='SDO_GUID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSDOGUID();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGUID <em>SDOGUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDOGUID</em>' attribute.
	 * @see #getSDOGUID()
	 * @generated
	 */
	void setSDOGUID(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>SDOCODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDOCODE</em>' attribute.
	 * @see #setSDOCODE(String)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_SDOCODE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SDO_CODE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSDOCODE();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOCODE <em>SDOCODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDOCODE</em>' attribute.
	 * @see #getSDOCODE()
	 * @generated
	 */
	void setSDOCODE(String value);

	/**
	 * Returns the value of the '<em><b>SDONAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDONAME</em>' attribute.
	 * @see #setSDONAME(String)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_SDONAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SDO_NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSDONAME();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDONAME <em>SDONAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDONAME</em>' attribute.
	 * @see #getSDONAME()
	 * @generated
	 */
	void setSDONAME(String value);

	/**
	 * Returns the value of the '<em><b>ZEITSTEMPEL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZEITSTEMPEL</em>' attribute.
	 * @see #setZEITSTEMPEL(XMLGregorianCalendar)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_ZEITSTEMPEL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='ZEITSTEMPEL' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZEITSTEMPEL();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getZEITSTEMPEL <em>ZEITSTEMPEL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZEITSTEMPEL</em>' attribute.
	 * @see #getZEITSTEMPEL()
	 * @generated
	 */
	void setZEITSTEMPEL(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>ZEITINTERVALL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZEITINTERVALL</em>' attribute.
	 * @see #setZEITINTERVALL(String)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_ZEITINTERVALL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ZEITINTERVALL' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZEITINTERVALL();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getZEITINTERVALL <em>ZEITINTERVALL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZEITINTERVALL</em>' attribute.
	 * @see #getZEITINTERVALL()
	 * @generated
	 */
	void setZEITINTERVALL(String value);

	/**
	 * Returns the value of the '<em><b>WERT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WERT</em>' attribute.
	 * @see #setWERT(BigDecimal)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_WERT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='WERT' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getWERT();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getWERT <em>WERT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WERT</em>' attribute.
	 * @see #getWERT()
	 * @generated
	 */
	void setWERT(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>EINHEIT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EINHEIT</em>' attribute.
	 * @see #setEINHEIT(String)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_EINHEIT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='EINHEIT' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEINHEIT();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getEINHEIT <em>EINHEIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EINHEIT</em>' attribute.
	 * @see #getEINHEIT()
	 * @generated
	 */
	void setEINHEIT(String value);

	/**
	 * Returns the value of the '<em><b>QUALITAETBYTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QUALITAETBYTE</em>' attribute.
	 * @see #isSetQUALITAETBYTE()
	 * @see #unsetQUALITAETBYTE()
	 * @see #setQUALITAETBYTE(BigDecimal)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_QUALITAETBYTE()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='QUALITAET_BYTE' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getQUALITAETBYTE();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETBYTE <em>QUALITAETBYTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QUALITAETBYTE</em>' attribute.
	 * @see #isSetQUALITAETBYTE()
	 * @see #unsetQUALITAETBYTE()
	 * @see #getQUALITAETBYTE()
	 * @generated
	 */
	void setQUALITAETBYTE(BigDecimal value);

	/**
	 * Unsets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETBYTE <em>QUALITAETBYTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQUALITAETBYTE()
	 * @see #getQUALITAETBYTE()
	 * @see #setQUALITAETBYTE(BigDecimal)
	 * @generated
	 */
	void unsetQUALITAETBYTE();

	/**
	 * Returns whether the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETBYTE <em>QUALITAETBYTE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>QUALITAETBYTE</em>' attribute is set.
	 * @see #unsetQUALITAETBYTE()
	 * @see #getQUALITAETBYTE()
	 * @see #setQUALITAETBYTE(BigDecimal)
	 * @generated
	 */
	boolean isSetQUALITAETBYTE();

	/**
	 * Returns the value of the '<em><b>QUALITAETNIVEAU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QUALITAETNIVEAU</em>' attribute.
	 * @see #setQUALITAETNIVEAU(BigDecimal)
	 * @see de.dwd.cdc.CDCPackage#getOBSDEUPT1HT2MType_QUALITAETNIVEAU()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='QUALITAET_NIVEAU' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getQUALITAETNIVEAU();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETNIVEAU <em>QUALITAETNIVEAU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QUALITAETNIVEAU</em>' attribute.
	 * @see #getQUALITAETNIVEAU()
	 * @generated
	 */
	void setQUALITAETNIVEAU(BigDecimal value);

} // OBSDEUPT1HT2MType
