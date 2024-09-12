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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.NativeType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.wfs.NativeType#getAny <em>Any</em>}</li>
 *   <li>{@link net.opengis.wfs.NativeType#isSafeToIgnore <em>Safe To Ignore</em>}</li>
 *   <li>{@link net.opengis.wfs.NativeType#getVendorId <em>Vendor Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getNativeType()
 * @model extendedMetaData="name='NativeType' kind='mixed'"
 * @generated
 */
@ProviderType
public interface NativeType extends AbstractTransactionActionType {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getNativeType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getNativeType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Safe To Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe To Ignore</em>' attribute.
	 * @see #isSetSafeToIgnore()
	 * @see #unsetSafeToIgnore()
	 * @see #setSafeToIgnore(boolean)
	 * @see net.opengis.wfs.WFSPackage#getNativeType_SafeToIgnore()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='safeToIgnore'"
	 * @generated
	 */
	boolean isSafeToIgnore();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.NativeType#isSafeToIgnore <em>Safe To Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe To Ignore</em>' attribute.
	 * @see #isSetSafeToIgnore()
	 * @see #unsetSafeToIgnore()
	 * @see #isSafeToIgnore()
	 * @generated
	 */
	void setSafeToIgnore(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.NativeType#isSafeToIgnore <em>Safe To Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSafeToIgnore()
	 * @see #isSafeToIgnore()
	 * @see #setSafeToIgnore(boolean)
	 * @generated
	 */
	void unsetSafeToIgnore();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.NativeType#isSafeToIgnore <em>Safe To Ignore</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Safe To Ignore</em>' attribute is set.
	 * @see #unsetSafeToIgnore()
	 * @see #isSafeToIgnore()
	 * @see #setSafeToIgnore(boolean)
	 * @generated
	 */
	boolean isSetSafeToIgnore();

	/**
	 * Returns the value of the '<em><b>Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Id</em>' attribute.
	 * @see #setVendorId(String)
	 * @see net.opengis.wfs.WFSPackage#getNativeType_VendorId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='vendorId'"
	 * @generated
	 */
	String getVendorId();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.NativeType#getVendorId <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Id</em>' attribute.
	 * @see #getVendorId()
	 * @generated
	 */
	void setVendorId(String value);

} // NativeType
