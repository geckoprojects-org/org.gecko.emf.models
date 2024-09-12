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
package net.opengis.wfs;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.ValueCollectionType#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.wfs.ValueCollectionType#getAdditionalValues <em>Additional Values</em>}</li>
 *   <li>{@link net.opengis.wfs.ValueCollectionType#getTruncatedResponse <em>Truncated Response</em>}</li>
 *   <li>{@link net.opengis.wfs.ValueCollectionType#getNext <em>Next</em>}</li>
 *   <li>{@link net.opengis.wfs.ValueCollectionType#getNumberMatched <em>Number Matched</em>}</li>
 *   <li>{@link net.opengis.wfs.ValueCollectionType#getNumberReturned <em>Number Returned</em>}</li>
 *   <li>{@link net.opengis.wfs.ValueCollectionType#getPrevious <em>Previous</em>}</li>
 *   <li>{@link net.opengis.wfs.ValueCollectionType#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getValueCollectionType()
 * @model extendedMetaData="name='ValueCollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ValueCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.MemberPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getValueCollectionType_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MemberPropertyType> getMember();

	/**
	 * Returns the value of the '<em><b>Additional Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Values</em>' containment reference.
	 * @see #setAdditionalValues(AdditionalValuesType)
	 * @see net.opengis.wfs.WFSPackage#getValueCollectionType_AdditionalValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalValues' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalValuesType getAdditionalValues();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueCollectionType#getAdditionalValues <em>Additional Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Values</em>' containment reference.
	 * @see #getAdditionalValues()
	 * @generated
	 */
	void setAdditionalValues(AdditionalValuesType value);

	/**
	 * Returns the value of the '<em><b>Truncated Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truncated Response</em>' containment reference.
	 * @see #setTruncatedResponse(TruncatedResponseType)
	 * @see net.opengis.wfs.WFSPackage#getValueCollectionType_TruncatedResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='truncatedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	TruncatedResponseType getTruncatedResponse();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueCollectionType#getTruncatedResponse <em>Truncated Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truncated Response</em>' containment reference.
	 * @see #getTruncatedResponse()
	 * @generated
	 */
	void setTruncatedResponse(TruncatedResponseType value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' attribute.
	 * @see #setNext(String)
	 * @see net.opengis.wfs.WFSPackage#getValueCollectionType_Next()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='next'"
	 * @generated
	 */
	String getNext();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueCollectionType#getNext <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' attribute.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(String value);

	/**
	 * Returns the value of the '<em><b>Number Matched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Matched</em>' attribute.
	 * @see #setNumberMatched(Object)
	 * @see net.opengis.wfs.WFSPackage#getValueCollectionType_NumberMatched()
	 * @model dataType="net.opengis.wfs.NonNegativeIntegerOrUnknown" required="true"
	 *        extendedMetaData="kind='attribute' name='numberMatched'"
	 * @generated
	 */
	Object getNumberMatched();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueCollectionType#getNumberMatched <em>Number Matched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Matched</em>' attribute.
	 * @see #getNumberMatched()
	 * @generated
	 */
	void setNumberMatched(Object value);

	/**
	 * Returns the value of the '<em><b>Number Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Returned</em>' attribute.
	 * @see #setNumberReturned(BigInteger)
	 * @see net.opengis.wfs.WFSPackage#getValueCollectionType_NumberReturned()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='numberReturned'"
	 * @generated
	 */
	BigInteger getNumberReturned();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueCollectionType#getNumberReturned <em>Number Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Returned</em>' attribute.
	 * @see #getNumberReturned()
	 * @generated
	 */
	void setNumberReturned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' attribute.
	 * @see #setPrevious(String)
	 * @see net.opengis.wfs.WFSPackage#getValueCollectionType_Previous()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='previous'"
	 * @generated
	 */
	String getPrevious();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueCollectionType#getPrevious <em>Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' attribute.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(String value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(XMLGregorianCalendar)
	 * @see net.opengis.wfs.WFSPackage#getValueCollectionType_TimeStamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='timeStamp'"
	 * @generated
	 */
	XMLGregorianCalendar getTimeStamp();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.ValueCollectionType#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(XMLGregorianCalendar value);

} // ValueCollectionType
