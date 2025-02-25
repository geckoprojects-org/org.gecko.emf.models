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

import org.openmicroscopy.ome.BinDataType;
import org.openmicroscopy.ome.CompressionType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bin Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.BinDataTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.BinDataTypeImpl#isBigEndian <em>Big Endian</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.BinDataTypeImpl#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.BinDataTypeImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinDataTypeImpl extends MinimalEObjectImpl.Container implements BinDataType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected byte[] value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBigEndian() <em>Big Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBigEndian()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIG_ENDIAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBigEndian() <em>Big Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBigEndian()
	 * @generated
	 * @ordered
	 */
	protected boolean bigEndian = BIG_ENDIAN_EDEFAULT;

	/**
	 * This is true if the Big Endian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bigEndianESet;

	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final CompressionType COMPRESSION_EDEFAULT = CompressionType.NONE;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected CompressionType compression = COMPRESSION_EDEFAULT;

	/**
	 * This is true if the Compression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionESet;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final long LENGTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected long length = LENGTH_EDEFAULT;

	/**
	 * This is true if the Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lengthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getBinDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(byte[] newValue) {
		byte[] oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BIN_DATA_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBigEndian() {
		return bigEndian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBigEndian(boolean newBigEndian) {
		boolean oldBigEndian = bigEndian;
		bigEndian = newBigEndian;
		boolean oldBigEndianESet = bigEndianESet;
		bigEndianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BIN_DATA_TYPE__BIG_ENDIAN, oldBigEndian, bigEndian, !oldBigEndianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBigEndian() {
		boolean oldBigEndian = bigEndian;
		boolean oldBigEndianESet = bigEndianESet;
		bigEndian = BIG_ENDIAN_EDEFAULT;
		bigEndianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.BIN_DATA_TYPE__BIG_ENDIAN, oldBigEndian, BIG_ENDIAN_EDEFAULT, oldBigEndianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBigEndian() {
		return bigEndianESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompressionType getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompression(CompressionType newCompression) {
		CompressionType oldCompression = compression;
		compression = newCompression == null ? COMPRESSION_EDEFAULT : newCompression;
		boolean oldCompressionESet = compressionESet;
		compressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BIN_DATA_TYPE__COMPRESSION, oldCompression, compression, !oldCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCompression() {
		CompressionType oldCompression = compression;
		boolean oldCompressionESet = compressionESet;
		compression = COMPRESSION_EDEFAULT;
		compressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.BIN_DATA_TYPE__COMPRESSION, oldCompression, COMPRESSION_EDEFAULT, oldCompressionESet));
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
	public long getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(long newLength) {
		long oldLength = length;
		length = newLength;
		boolean oldLengthESet = lengthESet;
		lengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.BIN_DATA_TYPE__LENGTH, oldLength, length, !oldLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLength() {
		long oldLength = length;
		boolean oldLengthESet = lengthESet;
		length = LENGTH_EDEFAULT;
		lengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.BIN_DATA_TYPE__LENGTH, oldLength, LENGTH_EDEFAULT, oldLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLength() {
		return lengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.BIN_DATA_TYPE__VALUE:
				return getValue();
			case OMEPackage.BIN_DATA_TYPE__BIG_ENDIAN:
				return isBigEndian();
			case OMEPackage.BIN_DATA_TYPE__COMPRESSION:
				return getCompression();
			case OMEPackage.BIN_DATA_TYPE__LENGTH:
				return getLength();
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
			case OMEPackage.BIN_DATA_TYPE__VALUE:
				setValue((byte[])newValue);
				return;
			case OMEPackage.BIN_DATA_TYPE__BIG_ENDIAN:
				setBigEndian((Boolean)newValue);
				return;
			case OMEPackage.BIN_DATA_TYPE__COMPRESSION:
				setCompression((CompressionType)newValue);
				return;
			case OMEPackage.BIN_DATA_TYPE__LENGTH:
				setLength((Long)newValue);
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
			case OMEPackage.BIN_DATA_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case OMEPackage.BIN_DATA_TYPE__BIG_ENDIAN:
				unsetBigEndian();
				return;
			case OMEPackage.BIN_DATA_TYPE__COMPRESSION:
				unsetCompression();
				return;
			case OMEPackage.BIN_DATA_TYPE__LENGTH:
				unsetLength();
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
			case OMEPackage.BIN_DATA_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case OMEPackage.BIN_DATA_TYPE__BIG_ENDIAN:
				return isSetBigEndian();
			case OMEPackage.BIN_DATA_TYPE__COMPRESSION:
				return isSetCompression();
			case OMEPackage.BIN_DATA_TYPE__LENGTH:
				return isSetLength();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", bigEndian: ");
		if (bigEndianESet) result.append(bigEndian); else result.append("<unset>");
		result.append(", compression: ");
		if (compressionESet) result.append(compression); else result.append("<unset>");
		result.append(", length: ");
		if (lengthESet) result.append(length); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BinDataTypeImpl
