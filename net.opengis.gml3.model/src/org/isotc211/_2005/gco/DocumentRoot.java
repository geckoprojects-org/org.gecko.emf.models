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
package org.isotc211._2005.gco;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.gml.AngleType;
import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.LengthType;
import net.opengis.gml.gml.MeasureType;
import net.opengis.gml.gml.ScaleType;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getAbstractGenericName <em>Abstract Generic Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getAbstractObject <em>Abstract Object</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getCharacterString <em>Character String</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getLength <em>Length</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getMultiplicityRange <em>Multiplicity Range</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getReal <em>Real</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getRecord <em>Record</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getScale <em>Scale</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getScopedName <em>Scoped Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getUnlimitedInteger <em>Unlimited Integer</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getIsoType <em>Iso Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.DocumentRoot#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Generic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Generic Name</em>' containment reference.
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_AbstractGenericName()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGenericName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getAbstractGenericName();

	/**
	 * Returns the value of the '<em><b>Abstract Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object</em>' containment reference.
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_AbstractObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractObject' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractObjectType getAbstractObject();

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(AngleType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Angle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Angle' namespace='##targetNamespace' affiliation='Measure'"
	 * @generated
	 */
	AngleType getAngle();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(AngleType value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(MeasureType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Measure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Measure' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getMeasure();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference.
	 * @see #setBinary(BinaryType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Binary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryType getBinary();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getBinary <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary</em>' containment reference.
	 * @see #getBinary()
	 * @generated
	 */
	void setBinary(BinaryType value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #setBoolean(boolean)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Boolean()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBoolean();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#isBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #isBoolean()
	 * @generated
	 */
	void setBoolean(boolean value);

	/**
	 * Returns the value of the '<em><b>Character String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character String</em>' attribute.
	 * @see #setCharacterString(String)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_CharacterString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CharacterString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCharacterString();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getCharacterString <em>Character String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character String</em>' attribute.
	 * @see #getCharacterString()
	 * @generated
	 */
	void setCharacterString(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Date()
	 * @model unique="false" dataType="org.isotc211._2005.gco.DateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Date' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(XMLGregorianCalendar)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_DateTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateTime();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' attribute.
	 * @see #setDecimal(BigDecimal)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Decimal()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Decimal" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Decimal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDecimal();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' attribute.
	 * @see #getDecimal()
	 * @generated
	 */
	void setDecimal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(LengthType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Distance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Distance' namespace='##targetNamespace' affiliation='Length'"
	 * @generated
	 */
	LengthType getDistance();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(LengthType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(LengthType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Length()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Length' namespace='##targetNamespace' affiliation='Measure'"
	 * @generated
	 */
	LengthType getLength();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(LengthType value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' attribute.
	 * @see #setInteger(BigInteger)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Integer()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Integer' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getInteger();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getInteger <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' attribute.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Local Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Name</em>' containment reference.
	 * @see #setLocalName(CodeType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_LocalName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocalName' namespace='##targetNamespace' affiliation='AbstractGenericName'"
	 * @generated
	 */
	CodeType getLocalName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getLocalName <em>Local Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Name</em>' containment reference.
	 * @see #getLocalName()
	 * @generated
	 */
	void setLocalName(CodeType value);

	/**
	 * Returns the value of the '<em><b>Member Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Name</em>' containment reference.
	 * @see #setMemberName(MemberNameType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_MemberName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MemberName' namespace='##targetNamespace'"
	 * @generated
	 */
	MemberNameType getMemberName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getMemberName <em>Member Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Name</em>' containment reference.
	 * @see #getMemberName()
	 * @generated
	 */
	void setMemberName(MemberNameType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(MultiplicityType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Multiplicity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Multiplicity' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiplicityType getMultiplicity();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(MultiplicityType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Range</em>' containment reference.
	 * @see #setMultiplicityRange(MultiplicityRangeType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_MultiplicityRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiplicityRange' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiplicityRangeType getMultiplicityRange();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getMultiplicityRange <em>Multiplicity Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Range</em>' containment reference.
	 * @see #getMultiplicityRange()
	 * @generated
	 */
	void setMultiplicityRange(MultiplicityRangeType value);

	/**
	 * Returns the value of the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' attribute.
	 * @see #setReal(double)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Real()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Real' namespace='##targetNamespace'"
	 * @generated
	 */
	double getReal();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' attribute.
	 * @see #getReal()
	 * @generated
	 */
	void setReal(double value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference.
	 * @see #setRecord(EObject)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Record()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getRecord();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getRecord <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' containment reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(EObject value);

	/**
	 * Returns the value of the '<em><b>Record Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Type</em>' containment reference.
	 * @see #setRecordType(RecordTypeType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_RecordType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecordType' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordTypeType getRecordType();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getRecordType <em>Record Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Type</em>' containment reference.
	 * @see #getRecordType()
	 * @generated
	 */
	void setRecordType(RecordTypeType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(ScaleType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_Scale()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Scale' namespace='##targetNamespace' affiliation='Measure'"
	 * @generated
	 */
	ScaleType getScale();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(ScaleType value);

	/**
	 * Returns the value of the '<em><b>Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped Name</em>' containment reference.
	 * @see #setScopedName(CodeType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_ScopedName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScopedName' namespace='##targetNamespace' affiliation='AbstractGenericName'"
	 * @generated
	 */
	CodeType getScopedName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getScopedName <em>Scoped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped Name</em>' containment reference.
	 * @see #getScopedName()
	 * @generated
	 */
	void setScopedName(CodeType value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(TypeNameType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_TypeName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeName' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeNameType getTypeName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(TypeNameType value);

	/**
	 * Returns the value of the '<em><b>Unlimited Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlimited Integer</em>' containment reference.
	 * @see #setUnlimitedInteger(UnlimitedIntegerType)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_UnlimitedInteger()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnlimitedInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	UnlimitedIntegerType getUnlimitedInteger();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getUnlimitedInteger <em>Unlimited Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlimited Integer</em>' containment reference.
	 * @see #getUnlimitedInteger()
	 * @generated
	 */
	void setUnlimitedInteger(UnlimitedIntegerType value);

	/**
	 * Returns the value of the '<em><b>Iso Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso Type</em>' attribute.
	 * @see #setIsoType(String)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_IsoType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isoType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIsoType();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getIsoType <em>Iso Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso Type</em>' attribute.
	 * @see #getIsoType()
	 * @generated
	 */
	void setIsoType(String value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211._2005.gco.GCOPackage#getDocumentRoot_NilReason()
	 * @model dataType="net.opengis.gml.gml.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.DocumentRoot#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // DocumentRoot
