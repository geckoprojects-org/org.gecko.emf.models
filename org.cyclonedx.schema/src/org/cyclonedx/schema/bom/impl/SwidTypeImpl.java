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

import java.math.BigInteger;

import org.cyclonedx.schema.bom.AttachedTextType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.SwidType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl#isPatch <em>Patch</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl#getTagId <em>Tag Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl#getTagVersion <em>Tag Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SwidTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwidTypeImpl extends MinimalEObjectImpl.Container implements SwidType {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected AttachedTextType text;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	 * The default value of the '{@link #isPatch() <em>Patch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PATCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPatch() <em>Patch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPatch()
	 * @generated
	 * @ordered
	 */
	protected boolean patch = PATCH_EDEFAULT;

	/**
	 * This is true if the Patch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean patchESet;

	/**
	 * The default value of the '{@link #getTagId() <em>Tag Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagId() <em>Tag Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagId()
	 * @generated
	 * @ordered
	 */
	protected String tagId = TAG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTagVersion() <em>Tag Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TAG_VERSION_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getTagVersion() <em>Tag Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger tagVersion = TAG_VERSION_EDEFAULT;

	/**
	 * This is true if the Tag Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tagVersionESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "0.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getSwidType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachedTextType getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(AttachedTextType newText, NotificationChain msgs) {
		AttachedTextType oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SWID_TYPE__TEXT, oldText, newText);
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
	public void setText(AttachedTextType newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SWID_TYPE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SWID_TYPE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SWID_TYPE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SWID_TYPE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.SWID_TYPE__ANY);
		}
		return any;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SWID_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPatch() {
		return patch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatch(boolean newPatch) {
		boolean oldPatch = patch;
		patch = newPatch;
		boolean oldPatchESet = patchESet;
		patchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SWID_TYPE__PATCH, oldPatch, patch, !oldPatchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPatch() {
		boolean oldPatch = patch;
		boolean oldPatchESet = patchESet;
		patch = PATCH_EDEFAULT;
		patchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.SWID_TYPE__PATCH, oldPatch, PATCH_EDEFAULT, oldPatchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPatch() {
		return patchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTagId() {
		return tagId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagId(String newTagId) {
		String oldTagId = tagId;
		tagId = newTagId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SWID_TYPE__TAG_ID, oldTagId, tagId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTagVersion() {
		return tagVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagVersion(BigInteger newTagVersion) {
		BigInteger oldTagVersion = tagVersion;
		tagVersion = newTagVersion;
		boolean oldTagVersionESet = tagVersionESet;
		tagVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SWID_TYPE__TAG_VERSION, oldTagVersion, tagVersion, !oldTagVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTagVersion() {
		BigInteger oldTagVersion = tagVersion;
		boolean oldTagVersionESet = tagVersionESet;
		tagVersion = TAG_VERSION_EDEFAULT;
		tagVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.SWID_TYPE__TAG_VERSION, oldTagVersion, TAG_VERSION_EDEFAULT, oldTagVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTagVersion() {
		return tagVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SWID_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.SWID_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.SWID_TYPE__TEXT:
				return basicSetText(null, msgs);
			case BOMPackage.SWID_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.SWID_TYPE__TEXT:
				return getText();
			case BOMPackage.SWID_TYPE__URL:
				return getUrl();
			case BOMPackage.SWID_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.SWID_TYPE__NAME:
				return getName();
			case BOMPackage.SWID_TYPE__PATCH:
				return isPatch();
			case BOMPackage.SWID_TYPE__TAG_ID:
				return getTagId();
			case BOMPackage.SWID_TYPE__TAG_VERSION:
				return getTagVersion();
			case BOMPackage.SWID_TYPE__VERSION:
				return getVersion();
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
			case BOMPackage.SWID_TYPE__TEXT:
				setText((AttachedTextType)newValue);
				return;
			case BOMPackage.SWID_TYPE__URL:
				setUrl((String)newValue);
				return;
			case BOMPackage.SWID_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.SWID_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.SWID_TYPE__PATCH:
				setPatch((Boolean)newValue);
				return;
			case BOMPackage.SWID_TYPE__TAG_ID:
				setTagId((String)newValue);
				return;
			case BOMPackage.SWID_TYPE__TAG_VERSION:
				setTagVersion((BigInteger)newValue);
				return;
			case BOMPackage.SWID_TYPE__VERSION:
				setVersion((String)newValue);
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
			case BOMPackage.SWID_TYPE__TEXT:
				setText((AttachedTextType)null);
				return;
			case BOMPackage.SWID_TYPE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case BOMPackage.SWID_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.SWID_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.SWID_TYPE__PATCH:
				unsetPatch();
				return;
			case BOMPackage.SWID_TYPE__TAG_ID:
				setTagId(TAG_ID_EDEFAULT);
				return;
			case BOMPackage.SWID_TYPE__TAG_VERSION:
				unsetTagVersion();
				return;
			case BOMPackage.SWID_TYPE__VERSION:
				unsetVersion();
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
			case BOMPackage.SWID_TYPE__TEXT:
				return text != null;
			case BOMPackage.SWID_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case BOMPackage.SWID_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.SWID_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.SWID_TYPE__PATCH:
				return isSetPatch();
			case BOMPackage.SWID_TYPE__TAG_ID:
				return TAG_ID_EDEFAULT == null ? tagId != null : !TAG_ID_EDEFAULT.equals(tagId);
			case BOMPackage.SWID_TYPE__TAG_VERSION:
				return isSetTagVersion();
			case BOMPackage.SWID_TYPE__VERSION:
				return isSetVersion();
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
		result.append(" (url: ");
		result.append(url);
		result.append(", any: ");
		result.append(any);
		result.append(", name: ");
		result.append(name);
		result.append(", patch: ");
		if (patchESet) result.append(patch); else result.append("<unset>");
		result.append(", tagId: ");
		result.append(tagId);
		result.append(", tagVersion: ");
		if (tagVersionESet) result.append(tagVersion); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SwidTypeImpl
