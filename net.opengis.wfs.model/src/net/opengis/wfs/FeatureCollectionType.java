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

import net.opengis.gml.AbstractFeatureCollectionType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             This type defines a container for the response to a 
 *             GetFeature or GetFeatureWithLock request.  If the
 *             request is GetFeatureWithLock, the lockId attribute
 *             must be populated.  The lockId attribute can otherwise
 *             be safely ignored.
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getLockId <em>Lock Id</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getNumberOfFeatures <em>Number Of Features</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureCollectionType#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType()
 * @model extendedMetaData="name='FeatureCollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureCollectionType extends AbstractFeatureCollectionType {
	/**
	 * Returns the value of the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The value of the lockId attribute is an identifier
	 *                   that a Web Feature Service generates when responding
	 *                   to a GetFeatureWithLock request.  A client application
	 *                   can use this value in subsequent operations (such as a
	 *                   Transaction request) to reference the set of locked
	 *                   features.
	 *                
	 * <!-- end-model-doc -->
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
	 * Returns the value of the '<em><b>Number Of Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The numberOfFeatures attribute should contain a
	 *                   count of the number of features in the response.
	 *                   That is a count of all features elements dervied
	 *                   from gml:AbstractFeatureType.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Features</em>' attribute.
	 * @see #setNumberOfFeatures(BigInteger)
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_NumberOfFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='numberOfFeatures'"
	 * @generated
	 */
	BigInteger getNumberOfFeatures();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureCollectionType#getNumberOfFeatures <em>Number Of Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Features</em>' attribute.
	 * @see #getNumberOfFeatures()
	 * @generated
	 */
	void setNumberOfFeatures(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The timeStamp attribute should contain the date and time
	 *                   that the response was generated.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(XMLGregorianCalendar)
	 * @see net.opengis.wfs.WFSPackage#getFeatureCollectionType_TimeStamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
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
