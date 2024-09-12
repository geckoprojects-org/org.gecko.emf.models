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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getAdditionalObjects <em>Additional Objects</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getTruncatedResponse <em>Truncated Response</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getLockId <em>Lock Id</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getNext <em>Next</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getNumberMatched <em>Number Matched</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getNumberReturned <em>Number Returned</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getPrevious <em>Previous</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType()
 * @model extendedMetaData="name='FeatureCollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureCollectionType extends SimpleFeatureCollectionType {
	/**
	 * Returns the value of the '<em><b>Additional Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Objects</em>' containment reference.
	 * @see #setAdditionalObjects(AdditionalObjectsType)
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_AdditionalObjects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalObjects' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalObjectsType getAdditionalObjects();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getAdditionalObjects <em>Additional Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Objects</em>' containment reference.
	 * @see #getAdditionalObjects()
	 * @generated
	 */
	void setAdditionalObjects(AdditionalObjectsType value);

	/**
	 * Returns the value of the '<em><b>Truncated Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truncated Response</em>' containment reference.
	 * @see #setTruncatedResponse(TruncatedResponseType)
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_TruncatedResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='truncatedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	TruncatedResponseType getTruncatedResponse();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getTruncatedResponse <em>Truncated Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truncated Response</em>' containment reference.
	 * @see #getTruncatedResponse()
	 * @generated
	 */
	void setTruncatedResponse(TruncatedResponseType value);

	/**
	 * Returns the value of the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Id</em>' attribute.
	 * @see #setLockId(String)
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_LockId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lockId'"
	 * @generated
	 */
	String getLockId();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getLockId <em>Lock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Id</em>' attribute.
	 * @see #getLockId()
	 * @generated
	 */
	void setLockId(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' attribute.
	 * @see #setNext(String)
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_Next()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='next'"
	 * @generated
	 */
	String getNext();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getNext <em>Next</em>}' attribute.
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
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_NumberMatched()
	 * @model dataType="net.opengis.wfs.NonNegativeIntegerOrUnknown" required="true"
	 *        extendedMetaData="kind='attribute' name='numberMatched'"
	 * @generated
	 */
	Object getNumberMatched();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getNumberMatched <em>Number Matched</em>}' attribute.
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
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_NumberReturned()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='numberReturned'"
	 * @generated
	 */
	BigInteger getNumberReturned();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getNumberReturned <em>Number Returned</em>}' attribute.
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
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_Previous()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='previous'"
	 * @generated
	 */
	String getPrevious();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getPrevious <em>Previous</em>}' attribute.
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
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_TimeStamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='timeStamp'"
	 * @generated
	 */
	XMLGregorianCalendar getTimeStamp();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(XMLGregorianCalendar value);

} // FeatureCollectionType
