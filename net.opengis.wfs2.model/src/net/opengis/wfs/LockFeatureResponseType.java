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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lock Feature Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.LockFeatureResponseType#getFeaturesLocked <em>Features Locked</em>}</li>
 *   <li>{@link net.opengis.wfs.LockFeatureResponseType#getFeaturesNotLocked <em>Features Not Locked</em>}</li>
 *   <li>{@link net.opengis.wfs.LockFeatureResponseType#getLockId <em>Lock Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getLockFeatureResponseType()
 * @model extendedMetaData="name='LockFeatureResponseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LockFeatureResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Features Locked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Locked</em>' containment reference.
	 * @see #setFeaturesLocked(FeaturesLockedType)
	 * @see net.opengis.wfs.WFSPackage#getLockFeatureResponseType_FeaturesLocked()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FeaturesLocked' namespace='##targetNamespace'"
	 * @generated
	 */
	FeaturesLockedType getFeaturesLocked();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.LockFeatureResponseType#getFeaturesLocked <em>Features Locked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features Locked</em>' containment reference.
	 * @see #getFeaturesLocked()
	 * @generated
	 */
	void setFeaturesLocked(FeaturesLockedType value);

	/**
	 * Returns the value of the '<em><b>Features Not Locked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Not Locked</em>' containment reference.
	 * @see #setFeaturesNotLocked(FeaturesNotLockedType)
	 * @see net.opengis.wfs.WFSPackage#getLockFeatureResponseType_FeaturesNotLocked()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FeaturesNotLocked' namespace='##targetNamespace'"
	 * @generated
	 */
	FeaturesNotLockedType getFeaturesNotLocked();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.LockFeatureResponseType#getFeaturesNotLocked <em>Features Not Locked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features Not Locked</em>' containment reference.
	 * @see #getFeaturesNotLocked()
	 * @generated
	 */
	void setFeaturesNotLocked(FeaturesNotLockedType value);

	/**
	 * Returns the value of the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Id</em>' attribute.
	 * @see #setLockId(String)
	 * @see net.opengis.wfs.WFSPackage#getLockFeatureResponseType_LockId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lockId'"
	 * @generated
	 */
	String getLockId();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.LockFeatureResponseType#getLockId <em>Lock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Id</em>' attribute.
	 * @see #getLockId()
	 * @generated
	 */
	void setLockId(String value);

} // LockFeatureResponseType
