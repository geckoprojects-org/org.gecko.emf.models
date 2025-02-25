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

import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.TiffDataType;
import org.openmicroscopy.ome.UUIDType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tiff Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.TiffDataTypeImpl#getUUID <em>UUID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TiffDataTypeImpl#getFirstC <em>First C</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TiffDataTypeImpl#getFirstT <em>First T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TiffDataTypeImpl#getFirstZ <em>First Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TiffDataTypeImpl#getIFD <em>IFD</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.TiffDataTypeImpl#getPlaneCount <em>Plane Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TiffDataTypeImpl extends MinimalEObjectImpl.Container implements TiffDataType {
	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected UUIDType uUID;

	/**
	 * The default value of the '{@link #getFirstC() <em>First C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstC()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_C_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstC() <em>First C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstC()
	 * @generated
	 * @ordered
	 */
	protected int firstC = FIRST_C_EDEFAULT;

	/**
	 * This is true if the First C attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstCESet;

	/**
	 * The default value of the '{@link #getFirstT() <em>First T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstT()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_T_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstT() <em>First T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstT()
	 * @generated
	 * @ordered
	 */
	protected int firstT = FIRST_T_EDEFAULT;

	/**
	 * This is true if the First T attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstTESet;

	/**
	 * The default value of the '{@link #getFirstZ() <em>First Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstZ()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstZ() <em>First Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstZ()
	 * @generated
	 * @ordered
	 */
	protected int firstZ = FIRST_Z_EDEFAULT;

	/**
	 * This is true if the First Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstZESet;

	/**
	 * The default value of the '{@link #getIFD() <em>IFD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIFD()
	 * @generated
	 * @ordered
	 */
	protected static final int IFD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIFD() <em>IFD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIFD()
	 * @generated
	 * @ordered
	 */
	protected int iFD = IFD_EDEFAULT;

	/**
	 * This is true if the IFD attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iFDESet;

	/**
	 * The default value of the '{@link #getPlaneCount() <em>Plane Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaneCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PLANE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlaneCount() <em>Plane Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaneCount()
	 * @generated
	 * @ordered
	 */
	protected int planeCount = PLANE_COUNT_EDEFAULT;

	/**
	 * This is true if the Plane Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean planeCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TiffDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getTiffDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UUIDType getUUID() {
		return uUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUUID(UUIDType newUUID, NotificationChain msgs) {
		UUIDType oldUUID = uUID;
		uUID = newUUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.TIFF_DATA_TYPE__UUID, oldUUID, newUUID);
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
	public void setUUID(UUIDType newUUID) {
		if (newUUID != uUID) {
			NotificationChain msgs = null;
			if (uUID != null)
				msgs = ((InternalEObject)uUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.TIFF_DATA_TYPE__UUID, null, msgs);
			if (newUUID != null)
				msgs = ((InternalEObject)newUUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.TIFF_DATA_TYPE__UUID, null, msgs);
			msgs = basicSetUUID(newUUID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TIFF_DATA_TYPE__UUID, newUUID, newUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFirstC() {
		return firstC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstC(int newFirstC) {
		int oldFirstC = firstC;
		firstC = newFirstC;
		boolean oldFirstCESet = firstCESet;
		firstCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TIFF_DATA_TYPE__FIRST_C, oldFirstC, firstC, !oldFirstCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFirstC() {
		int oldFirstC = firstC;
		boolean oldFirstCESet = firstCESet;
		firstC = FIRST_C_EDEFAULT;
		firstCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TIFF_DATA_TYPE__FIRST_C, oldFirstC, FIRST_C_EDEFAULT, oldFirstCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFirstC() {
		return firstCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFirstT() {
		return firstT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstT(int newFirstT) {
		int oldFirstT = firstT;
		firstT = newFirstT;
		boolean oldFirstTESet = firstTESet;
		firstTESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TIFF_DATA_TYPE__FIRST_T, oldFirstT, firstT, !oldFirstTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFirstT() {
		int oldFirstT = firstT;
		boolean oldFirstTESet = firstTESet;
		firstT = FIRST_T_EDEFAULT;
		firstTESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TIFF_DATA_TYPE__FIRST_T, oldFirstT, FIRST_T_EDEFAULT, oldFirstTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFirstT() {
		return firstTESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFirstZ() {
		return firstZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstZ(int newFirstZ) {
		int oldFirstZ = firstZ;
		firstZ = newFirstZ;
		boolean oldFirstZESet = firstZESet;
		firstZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TIFF_DATA_TYPE__FIRST_Z, oldFirstZ, firstZ, !oldFirstZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFirstZ() {
		int oldFirstZ = firstZ;
		boolean oldFirstZESet = firstZESet;
		firstZ = FIRST_Z_EDEFAULT;
		firstZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TIFF_DATA_TYPE__FIRST_Z, oldFirstZ, FIRST_Z_EDEFAULT, oldFirstZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFirstZ() {
		return firstZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIFD() {
		return iFD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIFD(int newIFD) {
		int oldIFD = iFD;
		iFD = newIFD;
		boolean oldIFDESet = iFDESet;
		iFDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TIFF_DATA_TYPE__IFD, oldIFD, iFD, !oldIFDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIFD() {
		int oldIFD = iFD;
		boolean oldIFDESet = iFDESet;
		iFD = IFD_EDEFAULT;
		iFDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TIFF_DATA_TYPE__IFD, oldIFD, IFD_EDEFAULT, oldIFDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIFD() {
		return iFDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlaneCount() {
		return planeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaneCount(int newPlaneCount) {
		int oldPlaneCount = planeCount;
		planeCount = newPlaneCount;
		boolean oldPlaneCountESet = planeCountESet;
		planeCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.TIFF_DATA_TYPE__PLANE_COUNT, oldPlaneCount, planeCount, !oldPlaneCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPlaneCount() {
		int oldPlaneCount = planeCount;
		boolean oldPlaneCountESet = planeCountESet;
		planeCount = PLANE_COUNT_EDEFAULT;
		planeCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.TIFF_DATA_TYPE__PLANE_COUNT, oldPlaneCount, PLANE_COUNT_EDEFAULT, oldPlaneCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPlaneCount() {
		return planeCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.TIFF_DATA_TYPE__UUID:
				return basicSetUUID(null, msgs);
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
			case OMEPackage.TIFF_DATA_TYPE__UUID:
				return getUUID();
			case OMEPackage.TIFF_DATA_TYPE__FIRST_C:
				return getFirstC();
			case OMEPackage.TIFF_DATA_TYPE__FIRST_T:
				return getFirstT();
			case OMEPackage.TIFF_DATA_TYPE__FIRST_Z:
				return getFirstZ();
			case OMEPackage.TIFF_DATA_TYPE__IFD:
				return getIFD();
			case OMEPackage.TIFF_DATA_TYPE__PLANE_COUNT:
				return getPlaneCount();
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
			case OMEPackage.TIFF_DATA_TYPE__UUID:
				setUUID((UUIDType)newValue);
				return;
			case OMEPackage.TIFF_DATA_TYPE__FIRST_C:
				setFirstC((Integer)newValue);
				return;
			case OMEPackage.TIFF_DATA_TYPE__FIRST_T:
				setFirstT((Integer)newValue);
				return;
			case OMEPackage.TIFF_DATA_TYPE__FIRST_Z:
				setFirstZ((Integer)newValue);
				return;
			case OMEPackage.TIFF_DATA_TYPE__IFD:
				setIFD((Integer)newValue);
				return;
			case OMEPackage.TIFF_DATA_TYPE__PLANE_COUNT:
				setPlaneCount((Integer)newValue);
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
			case OMEPackage.TIFF_DATA_TYPE__UUID:
				setUUID((UUIDType)null);
				return;
			case OMEPackage.TIFF_DATA_TYPE__FIRST_C:
				unsetFirstC();
				return;
			case OMEPackage.TIFF_DATA_TYPE__FIRST_T:
				unsetFirstT();
				return;
			case OMEPackage.TIFF_DATA_TYPE__FIRST_Z:
				unsetFirstZ();
				return;
			case OMEPackage.TIFF_DATA_TYPE__IFD:
				unsetIFD();
				return;
			case OMEPackage.TIFF_DATA_TYPE__PLANE_COUNT:
				unsetPlaneCount();
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
			case OMEPackage.TIFF_DATA_TYPE__UUID:
				return uUID != null;
			case OMEPackage.TIFF_DATA_TYPE__FIRST_C:
				return isSetFirstC();
			case OMEPackage.TIFF_DATA_TYPE__FIRST_T:
				return isSetFirstT();
			case OMEPackage.TIFF_DATA_TYPE__FIRST_Z:
				return isSetFirstZ();
			case OMEPackage.TIFF_DATA_TYPE__IFD:
				return isSetIFD();
			case OMEPackage.TIFF_DATA_TYPE__PLANE_COUNT:
				return isSetPlaneCount();
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
		result.append(" (firstC: ");
		if (firstCESet) result.append(firstC); else result.append("<unset>");
		result.append(", firstT: ");
		if (firstTESet) result.append(firstT); else result.append("<unset>");
		result.append(", firstZ: ");
		if (firstZESet) result.append(firstZ); else result.append("<unset>");
		result.append(", iFD: ");
		if (iFDESet) result.append(iFD); else result.append("<unset>");
		result.append(", planeCount: ");
		if (planeCountESet) result.append(planeCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TiffDataTypeImpl
