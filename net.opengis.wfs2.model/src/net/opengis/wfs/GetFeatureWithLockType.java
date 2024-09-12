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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Feature With Lock Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.GetFeatureWithLockType#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link net.opengis.wfs.GetFeatureWithLockType#getLockAction <em>Lock Action</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getGetFeatureWithLockType()
 * @model extendedMetaData="name='GetFeatureWithLockType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetFeatureWithLockType extends GetFeatureType {
	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry</em>' attribute.
	 * @see #isSetExpiry()
	 * @see #unsetExpiry()
	 * @see #setExpiry(BigInteger)
	 * @see net.opengis.wfs.WFSPackage#getGetFeatureWithLockType_Expiry()
	 * @model default="300" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='expiry'"
	 * @generated
	 */
	BigInteger getExpiry();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.GetFeatureWithLockType#getExpiry <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' attribute.
	 * @see #isSetExpiry()
	 * @see #unsetExpiry()
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(BigInteger value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.GetFeatureWithLockType#getExpiry <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpiry()
	 * @see #getExpiry()
	 * @see #setExpiry(BigInteger)
	 * @generated
	 */
	void unsetExpiry();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.GetFeatureWithLockType#getExpiry <em>Expiry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expiry</em>' attribute is set.
	 * @see #unsetExpiry()
	 * @see #getExpiry()
	 * @see #setExpiry(BigInteger)
	 * @generated
	 */
	boolean isSetExpiry();

	/**
	 * Returns the value of the '<em><b>Lock Action</b></em>' attribute.
	 * The default value is <code>"ALL"</code>.
	 * The literals are from the enumeration {@link net.opengis.wfs.AllSomeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Action</em>' attribute.
	 * @see net.opengis.wfs.AllSomeType
	 * @see #isSetLockAction()
	 * @see #unsetLockAction()
	 * @see #setLockAction(AllSomeType)
	 * @see net.opengis.wfs.WFSPackage#getGetFeatureWithLockType_LockAction()
	 * @model default="ALL" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lockAction'"
	 * @generated
	 */
	AllSomeType getLockAction();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.GetFeatureWithLockType#getLockAction <em>Lock Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Action</em>' attribute.
	 * @see net.opengis.wfs.AllSomeType
	 * @see #isSetLockAction()
	 * @see #unsetLockAction()
	 * @see #getLockAction()
	 * @generated
	 */
	void setLockAction(AllSomeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.GetFeatureWithLockType#getLockAction <em>Lock Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLockAction()
	 * @see #getLockAction()
	 * @see #setLockAction(AllSomeType)
	 * @generated
	 */
	void unsetLockAction();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.GetFeatureWithLockType#getLockAction <em>Lock Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lock Action</em>' attribute is set.
	 * @see #unsetLockAction()
	 * @see #getLockAction()
	 * @see #setLockAction(AllSomeType)
	 * @generated
	 */
	boolean isSetLockAction();

} // GetFeatureWithLockType
