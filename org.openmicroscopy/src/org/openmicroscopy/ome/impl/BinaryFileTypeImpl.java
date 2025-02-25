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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openmicroscopy.ome.BinDataType;
import org.openmicroscopy.ome.BinaryFileType;
import org.openmicroscopy.ome.ExternalType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.BinaryFileTypeImpl#getExternal <em>External</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.BinaryFileTypeImpl#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.BinaryFileTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.BinaryFileTypeImpl#getMIMEType <em>MIME Type</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.BinaryFileTypeImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryFileTypeImpl extends MinimalEObjectImpl.Container implements BinaryFileType {
	/**
	 * The cached value of the '{@link #getExternal() <em>External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal()
	 * @generated
	 * @ordered
	 */
	protected ExternalType external;

	/**
	 * The cached value of the '{@link #getBinData() <em>Bin Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinData()
	 * @generated
	 * @ordered
	 */
	protected BinDataType binData;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMIMEType() <em>MIME Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIMEType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMIMEType() <em>MIME Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIMEType()
	 * @generated
	 * @ordered
	 */
	protected String mIMEType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryFileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getBinaryFileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalType getExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternal(ExternalType newExternal, NotificationChain msgs) {
		ExternalType oldExternal = external;
		external = newExternal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_FILE_TYPE__EXTERNAL, oldExternal, newExternal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal(ExternalType newExternal) {
		if (newExternal != external) {
			NotificationChain msgs = null;
			if (external != null)
				msgs = ((InternalEObject)external).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.BINARY_FILE_TYPE__EXTERNAL, null, msgs);
			if (newExternal != null)
				msgs = ((InternalEObject)newExternal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.BINARY_FILE_TYPE__EXTERNAL, null, msgs);
			msgs = basicSetExternal(newExternal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_FILE_TYPE__EXTERNAL, newExternal, newExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinDataType getBinData() {
		return binData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinData(BinDataType newBinData, NotificationChain msgs) {
		BinDataType oldBinData = binData;
		binData = newBinData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_FILE_TYPE__BIN_DATA, oldBinData, newBinData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinData(BinDataType newBinData) {
		if (newBinData != binData) {
			NotificationChain msgs = null;
			if (binData != null)
				msgs = ((InternalEObject)binData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.BINARY_FILE_TYPE__BIN_DATA, null, msgs);
			if (newBinData != null)
				msgs = ((InternalEObject)newBinData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.BINARY_FILE_TYPE__BIN_DATA, null, msgs);
			msgs = basicSetBinData(newBinData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_FILE_TYPE__BIN_DATA, newBinData, newBinData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_FILE_TYPE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMIMEType() {
		return mIMEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMIMEType(String newMIMEType) {
		String oldMIMEType = mIMEType;
		mIMEType = newMIMEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_FILE_TYPE__MIME_TYPE, oldMIMEType, mIMEType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		boolean oldSizeESet = sizeESet;
		sizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BINARY_FILE_TYPE__SIZE, oldSize, size, !oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSize() {
		long oldSize = size;
		boolean oldSizeESet = sizeESet;
		size = SIZE_EDEFAULT;
		sizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.BINARY_FILE_TYPE__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.BINARY_FILE_TYPE__EXTERNAL:
				return basicSetExternal(null, msgs);
			case OMEPackage.BINARY_FILE_TYPE__BIN_DATA:
				return basicSetBinData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.BINARY_FILE_TYPE__EXTERNAL:
				return getExternal();
			case OMEPackage.BINARY_FILE_TYPE__BIN_DATA:
				return getBinData();
			case OMEPackage.BINARY_FILE_TYPE__FILE_NAME:
				return getFileName();
			case OMEPackage.BINARY_FILE_TYPE__MIME_TYPE:
				return getMIMEType();
			case OMEPackage.BINARY_FILE_TYPE__SIZE:
				return getSize();
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
			case OMEPackage.BINARY_FILE_TYPE__EXTERNAL:
				setExternal((ExternalType)newValue);
				return;
			case OMEPackage.BINARY_FILE_TYPE__BIN_DATA:
				setBinData((BinDataType)newValue);
				return;
			case OMEPackage.BINARY_FILE_TYPE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case OMEPackage.BINARY_FILE_TYPE__MIME_TYPE:
				setMIMEType((String)newValue);
				return;
			case OMEPackage.BINARY_FILE_TYPE__SIZE:
				setSize((Long)newValue);
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
			case OMEPackage.BINARY_FILE_TYPE__EXTERNAL:
				setExternal((ExternalType)null);
				return;
			case OMEPackage.BINARY_FILE_TYPE__BIN_DATA:
				setBinData((BinDataType)null);
				return;
			case OMEPackage.BINARY_FILE_TYPE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case OMEPackage.BINARY_FILE_TYPE__MIME_TYPE:
				setMIMEType(MIME_TYPE_EDEFAULT);
				return;
			case OMEPackage.BINARY_FILE_TYPE__SIZE:
				unsetSize();
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
			case OMEPackage.BINARY_FILE_TYPE__EXTERNAL:
				return external != null;
			case OMEPackage.BINARY_FILE_TYPE__BIN_DATA:
				return binData != null;
			case OMEPackage.BINARY_FILE_TYPE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case OMEPackage.BINARY_FILE_TYPE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mIMEType != null : !MIME_TYPE_EDEFAULT.equals(mIMEType);
			case OMEPackage.BINARY_FILE_TYPE__SIZE:
				return isSetSize();
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", mIMEType: ");
		result.append(mIMEType);
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BinaryFileTypeImpl
