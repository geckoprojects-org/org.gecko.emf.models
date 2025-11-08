/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.VolumeModeEnum;
import org.cyclonedx.schema.bom.VolumeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl#getSizeAllocated <em>Size Allocated</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl#isRemote <em>Remote</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.VolumeTypeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeTypeImpl extends MinimalEObjectImpl.Container implements VolumeType {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final VolumeModeEnum MODE_EDEFAULT = VolumeModeEnum.FILESYSTEM;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected VolumeModeEnum mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeAllocated() <em>Size Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeAllocated()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_ALLOCATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeAllocated() <em>Size Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeAllocated()
	 * @generated
	 * @ordered
	 */
	protected String sizeAllocated = SIZE_ALLOCATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * This is true if the Persistent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean persistentESet;

	/**
	 * The default value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected boolean remote = REMOTE_EDEFAULT;

	/**
	 * This is true if the Remote attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remoteESet;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getVolumeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeModeEnum getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(VolumeModeEnum newMode) {
		VolumeModeEnum oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMode() {
		VolumeModeEnum oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.VOLUME_TYPE__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSizeAllocated() {
		return sizeAllocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeAllocated(String newSizeAllocated) {
		String oldSizeAllocated = sizeAllocated;
		sizeAllocated = newSizeAllocated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__SIZE_ALLOCATED, oldSizeAllocated, sizeAllocated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		boolean oldPersistentESet = persistentESet;
		persistentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__PERSISTENT, oldPersistent, persistent, !oldPersistentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPersistent() {
		boolean oldPersistent = persistent;
		boolean oldPersistentESet = persistentESet;
		persistent = PERSISTENT_EDEFAULT;
		persistentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.VOLUME_TYPE__PERSISTENT, oldPersistent, PERSISTENT_EDEFAULT, oldPersistentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPersistent() {
		return persistentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemote(boolean newRemote) {
		boolean oldRemote = remote;
		remote = newRemote;
		boolean oldRemoteESet = remoteESet;
		remoteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__REMOTE, oldRemote, remote, !oldRemoteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRemote() {
		boolean oldRemote = remote;
		boolean oldRemoteESet = remoteESet;
		remote = REMOTE_EDEFAULT;
		remoteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.VOLUME_TYPE__REMOTE, oldRemote, REMOTE_EDEFAULT, oldRemoteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRemote() {
		return remoteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__PROPERTIES, oldProperties, newProperties);
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
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.VOLUME_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.VOLUME_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.VOLUME_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.VOLUME_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case BOMPackage.VOLUME_TYPE__UID:
				return getUid();
			case BOMPackage.VOLUME_TYPE__NAME:
				return getName();
			case BOMPackage.VOLUME_TYPE__MODE:
				return getMode();
			case BOMPackage.VOLUME_TYPE__PATH:
				return getPath();
			case BOMPackage.VOLUME_TYPE__SIZE_ALLOCATED:
				return getSizeAllocated();
			case BOMPackage.VOLUME_TYPE__PERSISTENT:
				return isPersistent();
			case BOMPackage.VOLUME_TYPE__REMOTE:
				return isRemote();
			case BOMPackage.VOLUME_TYPE__PROPERTIES:
				return getProperties();
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
			case BOMPackage.VOLUME_TYPE__UID:
				setUid((String)newValue);
				return;
			case BOMPackage.VOLUME_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.VOLUME_TYPE__MODE:
				setMode((VolumeModeEnum)newValue);
				return;
			case BOMPackage.VOLUME_TYPE__PATH:
				setPath((String)newValue);
				return;
			case BOMPackage.VOLUME_TYPE__SIZE_ALLOCATED:
				setSizeAllocated((String)newValue);
				return;
			case BOMPackage.VOLUME_TYPE__PERSISTENT:
				setPersistent((Boolean)newValue);
				return;
			case BOMPackage.VOLUME_TYPE__REMOTE:
				setRemote((Boolean)newValue);
				return;
			case BOMPackage.VOLUME_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
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
			case BOMPackage.VOLUME_TYPE__UID:
				setUid(UID_EDEFAULT);
				return;
			case BOMPackage.VOLUME_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.VOLUME_TYPE__MODE:
				unsetMode();
				return;
			case BOMPackage.VOLUME_TYPE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case BOMPackage.VOLUME_TYPE__SIZE_ALLOCATED:
				setSizeAllocated(SIZE_ALLOCATED_EDEFAULT);
				return;
			case BOMPackage.VOLUME_TYPE__PERSISTENT:
				unsetPersistent();
				return;
			case BOMPackage.VOLUME_TYPE__REMOTE:
				unsetRemote();
				return;
			case BOMPackage.VOLUME_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
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
			case BOMPackage.VOLUME_TYPE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case BOMPackage.VOLUME_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.VOLUME_TYPE__MODE:
				return isSetMode();
			case BOMPackage.VOLUME_TYPE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case BOMPackage.VOLUME_TYPE__SIZE_ALLOCATED:
				return SIZE_ALLOCATED_EDEFAULT == null ? sizeAllocated != null : !SIZE_ALLOCATED_EDEFAULT.equals(sizeAllocated);
			case BOMPackage.VOLUME_TYPE__PERSISTENT:
				return isSetPersistent();
			case BOMPackage.VOLUME_TYPE__REMOTE:
				return isSetRemote();
			case BOMPackage.VOLUME_TYPE__PROPERTIES:
				return properties != null;
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", path: ");
		result.append(path);
		result.append(", sizeAllocated: ");
		result.append(sizeAllocated);
		result.append(", persistent: ");
		if (persistentESet) result.append(persistent); else result.append("<unset>");
		result.append(", remote: ");
		if (remoteESet) result.append(remote); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VolumeTypeImpl
