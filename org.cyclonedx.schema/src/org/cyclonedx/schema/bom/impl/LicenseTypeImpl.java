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

import org.cyclonedx.schema.bom.AttachedTextType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType;
import org.cyclonedx.schema.bom.LicenseType;
import org.cyclonedx.schema.bom.LicensingType;
import org.cyclonedx.schema.bom.PropertiesType;

import org.cyclonedx.schema.spdx.LicenseId;

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
 * An implementation of the model object '<em><b>License Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getLicensing <em>Licensing</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getAcknowledgement <em>Acknowledgement</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseTypeImpl extends MinimalEObjectImpl.Container implements LicenseType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final LicenseId ID_EDEFAULT = LicenseId._0BSD;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected LicenseId id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

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
	 * The cached value of the '{@link #getLicensing() <em>Licensing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensing()
	 * @generated
	 * @ordered
	 */
	protected LicensingType licensing;

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
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getAcknowledgement() <em>Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledgement()
	 * @generated
	 * @ordered
	 */
	protected static final LicenseAcknowledgementEnumerationType ACKNOWLEDGEMENT_EDEFAULT = LicenseAcknowledgementEnumerationType.DECLARED;

	/**
	 * The cached value of the '{@link #getAcknowledgement() <em>Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledgement()
	 * @generated
	 * @ordered
	 */
	protected LicenseAcknowledgementEnumerationType acknowledgement = ACKNOWLEDGEMENT_EDEFAULT;

	/**
	 * This is true if the Acknowledgement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acknowledgementESet;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getLicenseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseId getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(LicenseId newId) {
		LicenseId oldId = id;
		id = newId == null ? ID_EDEFAULT : newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetId() {
		LicenseId oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.LICENSE_TYPE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetId() {
		return idESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSE_TYPE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSE_TYPE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__TEXT, newText, newText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicensingType getLicensing() {
		return licensing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicensing(LicensingType newLicensing, NotificationChain msgs) {
		LicensingType oldLicensing = licensing;
		licensing = newLicensing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__LICENSING, oldLicensing, newLicensing);
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
	public void setLicensing(LicensingType newLicensing) {
		if (newLicensing != licensing) {
			NotificationChain msgs = null;
			if (licensing != null)
				msgs = ((InternalEObject)licensing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSE_TYPE__LICENSING, null, msgs);
			if (newLicensing != null)
				msgs = ((InternalEObject)newLicensing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSE_TYPE__LICENSING, null, msgs);
			msgs = basicSetLicensing(newLicensing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__LICENSING, newLicensing, newLicensing));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSE_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSE_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.LICENSE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseAcknowledgementEnumerationType getAcknowledgement() {
		return acknowledgement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcknowledgement(LicenseAcknowledgementEnumerationType newAcknowledgement) {
		LicenseAcknowledgementEnumerationType oldAcknowledgement = acknowledgement;
		acknowledgement = newAcknowledgement == null ? ACKNOWLEDGEMENT_EDEFAULT : newAcknowledgement;
		boolean oldAcknowledgementESet = acknowledgementESet;
		acknowledgementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__ACKNOWLEDGEMENT, oldAcknowledgement, acknowledgement, !oldAcknowledgementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAcknowledgement() {
		LicenseAcknowledgementEnumerationType oldAcknowledgement = acknowledgement;
		boolean oldAcknowledgementESet = acknowledgementESet;
		acknowledgement = ACKNOWLEDGEMENT_EDEFAULT;
		acknowledgementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.LICENSE_TYPE__ACKNOWLEDGEMENT, oldAcknowledgement, ACKNOWLEDGEMENT_EDEFAULT, oldAcknowledgementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAcknowledgement() {
		return acknowledgementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSE_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.LICENSE_TYPE__TEXT:
				return basicSetText(null, msgs);
			case BOMPackage.LICENSE_TYPE__LICENSING:
				return basicSetLicensing(null, msgs);
			case BOMPackage.LICENSE_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.LICENSE_TYPE__ANY:
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
			case BOMPackage.LICENSE_TYPE__ID:
				return getId();
			case BOMPackage.LICENSE_TYPE__NAME:
				return getName();
			case BOMPackage.LICENSE_TYPE__TEXT:
				return getText();
			case BOMPackage.LICENSE_TYPE__URL:
				return getUrl();
			case BOMPackage.LICENSE_TYPE__LICENSING:
				return getLicensing();
			case BOMPackage.LICENSE_TYPE__PROPERTIES:
				return getProperties();
			case BOMPackage.LICENSE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.LICENSE_TYPE__ACKNOWLEDGEMENT:
				return getAcknowledgement();
			case BOMPackage.LICENSE_TYPE__BOM_REF:
				return getBomRef();
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
			case BOMPackage.LICENSE_TYPE__ID:
				setId((LicenseId)newValue);
				return;
			case BOMPackage.LICENSE_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.LICENSE_TYPE__TEXT:
				setText((AttachedTextType)newValue);
				return;
			case BOMPackage.LICENSE_TYPE__URL:
				setUrl((String)newValue);
				return;
			case BOMPackage.LICENSE_TYPE__LICENSING:
				setLicensing((LicensingType)newValue);
				return;
			case BOMPackage.LICENSE_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.LICENSE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.LICENSE_TYPE__ACKNOWLEDGEMENT:
				setAcknowledgement((LicenseAcknowledgementEnumerationType)newValue);
				return;
			case BOMPackage.LICENSE_TYPE__BOM_REF:
				setBomRef((String)newValue);
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
			case BOMPackage.LICENSE_TYPE__ID:
				unsetId();
				return;
			case BOMPackage.LICENSE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.LICENSE_TYPE__TEXT:
				setText((AttachedTextType)null);
				return;
			case BOMPackage.LICENSE_TYPE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case BOMPackage.LICENSE_TYPE__LICENSING:
				setLicensing((LicensingType)null);
				return;
			case BOMPackage.LICENSE_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.LICENSE_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.LICENSE_TYPE__ACKNOWLEDGEMENT:
				unsetAcknowledgement();
				return;
			case BOMPackage.LICENSE_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
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
			case BOMPackage.LICENSE_TYPE__ID:
				return isSetId();
			case BOMPackage.LICENSE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.LICENSE_TYPE__TEXT:
				return text != null;
			case BOMPackage.LICENSE_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case BOMPackage.LICENSE_TYPE__LICENSING:
				return licensing != null;
			case BOMPackage.LICENSE_TYPE__PROPERTIES:
				return properties != null;
			case BOMPackage.LICENSE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.LICENSE_TYPE__ACKNOWLEDGEMENT:
				return isSetAcknowledgement();
			case BOMPackage.LICENSE_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(", any: ");
		result.append(any);
		result.append(", acknowledgement: ");
		if (acknowledgementESet) result.append(acknowledgement); else result.append("<unset>");
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(')');
		return result.toString();
	}

} //LicenseTypeImpl
