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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openmicroscopy.ome.CompressionType1;
import org.openmicroscopy.ome.ExternalType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ExternalTypeImpl#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExternalTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExternalTypeImpl#getSHA1 <em>SHA1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalTypeImpl extends MinimalEObjectImpl.Container implements ExternalType {
	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final CompressionType1 COMPRESSION_EDEFAULT = CompressionType1.NONE;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected CompressionType1 compression = COMPRESSION_EDEFAULT;

	/**
	 * This is true if the Compression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionESet;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSHA1() <em>SHA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHA1()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SHA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSHA1() <em>SHA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHA1()
	 * @generated
	 * @ordered
	 */
	protected byte[] sHA1 = SHA1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getExternalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompressionType1 getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompression(CompressionType1 newCompression) {
		CompressionType1 oldCompression = compression;
		compression = newCompression == null ? COMPRESSION_EDEFAULT : newCompression;
		boolean oldCompressionESet = compressionESet;
		compressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXTERNAL_TYPE__COMPRESSION, oldCompression, compression, !oldCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCompression() {
		CompressionType1 oldCompression = compression;
		boolean oldCompressionESet = compressionESet;
		compression = COMPRESSION_EDEFAULT;
		compressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.EXTERNAL_TYPE__COMPRESSION, oldCompression, COMPRESSION_EDEFAULT, oldCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCompression() {
		return compressionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXTERNAL_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getSHA1() {
		return sHA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSHA1(byte[] newSHA1) {
		byte[] oldSHA1 = sHA1;
		sHA1 = newSHA1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXTERNAL_TYPE__SHA1, oldSHA1, sHA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.EXTERNAL_TYPE__COMPRESSION:
				return getCompression();
			case OMEPackage.EXTERNAL_TYPE__HREF:
				return getHref();
			case OMEPackage.EXTERNAL_TYPE__SHA1:
				return getSHA1();
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
			case OMEPackage.EXTERNAL_TYPE__COMPRESSION:
				setCompression((CompressionType1)newValue);
				return;
			case OMEPackage.EXTERNAL_TYPE__HREF:
				setHref((String)newValue);
				return;
			case OMEPackage.EXTERNAL_TYPE__SHA1:
				setSHA1((byte[])newValue);
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
			case OMEPackage.EXTERNAL_TYPE__COMPRESSION:
				unsetCompression();
				return;
			case OMEPackage.EXTERNAL_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case OMEPackage.EXTERNAL_TYPE__SHA1:
				setSHA1(SHA1_EDEFAULT);
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
			case OMEPackage.EXTERNAL_TYPE__COMPRESSION:
				return isSetCompression();
			case OMEPackage.EXTERNAL_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case OMEPackage.EXTERNAL_TYPE__SHA1:
				return SHA1_EDEFAULT == null ? sHA1 != null : !SHA1_EDEFAULT.equals(sHA1);
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
		result.append(" (compression: ");
		if (compressionESet) result.append(compression); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", sHA1: ");
		result.append(sHA1);
		result.append(')');
		return result.toString();
	}

} //ExternalTypeImpl
