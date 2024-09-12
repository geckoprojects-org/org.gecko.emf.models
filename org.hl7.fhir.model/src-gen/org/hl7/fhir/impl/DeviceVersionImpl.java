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
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DeviceVersion;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceVersionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceVersionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceVersionImpl#getInstallDate <em>Install Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceVersionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceVersionImpl extends BackboneElementImpl implements DeviceVersion {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Identifier component;

	/**
	 * The cached value of the '{@link #getInstallDate() <em>Install Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime installDate;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getDeviceVersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE_VERSION__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE_VERSION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE_VERSION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE_VERSION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Identifier newComponent, NotificationChain msgs) {
		Identifier oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE_VERSION__COMPONENT, oldComponent, newComponent);
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
	public void setComponent(Identifier newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE_VERSION__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE_VERSION__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE_VERSION__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getInstallDate() {
		return installDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstallDate(DateTime newInstallDate, NotificationChain msgs) {
		DateTime oldInstallDate = installDate;
		installDate = newInstallDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE_VERSION__INSTALL_DATE, oldInstallDate, newInstallDate);
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
	public void setInstallDate(DateTime newInstallDate) {
		if (newInstallDate != installDate) {
			NotificationChain msgs = null;
			if (installDate != null)
				msgs = ((InternalEObject)installDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE_VERSION__INSTALL_DATE, null, msgs);
			if (newInstallDate != null)
				msgs = ((InternalEObject)newInstallDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE_VERSION__INSTALL_DATE, null, msgs);
			msgs = basicSetInstallDate(newInstallDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE_VERSION__INSTALL_DATE, newInstallDate, newInstallDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(org.hl7.fhir.String newValue, NotificationChain msgs) {
		org.hl7.fhir.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE_VERSION__VALUE, oldValue, newValue);
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
	public void setValue(org.hl7.fhir.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE_VERSION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE_VERSION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE_VERSION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.DEVICE_VERSION__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.DEVICE_VERSION__COMPONENT:
				return basicSetComponent(null, msgs);
			case FHIRPackage.DEVICE_VERSION__INSTALL_DATE:
				return basicSetInstallDate(null, msgs);
			case FHIRPackage.DEVICE_VERSION__VALUE:
				return basicSetValue(null, msgs);
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
			case FHIRPackage.DEVICE_VERSION__TYPE:
				return getType();
			case FHIRPackage.DEVICE_VERSION__COMPONENT:
				return getComponent();
			case FHIRPackage.DEVICE_VERSION__INSTALL_DATE:
				return getInstallDate();
			case FHIRPackage.DEVICE_VERSION__VALUE:
				return getValue();
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
			case FHIRPackage.DEVICE_VERSION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.DEVICE_VERSION__COMPONENT:
				setComponent((Identifier)newValue);
				return;
			case FHIRPackage.DEVICE_VERSION__INSTALL_DATE:
				setInstallDate((DateTime)newValue);
				return;
			case FHIRPackage.DEVICE_VERSION__VALUE:
				setValue((org.hl7.fhir.String)newValue);
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
			case FHIRPackage.DEVICE_VERSION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.DEVICE_VERSION__COMPONENT:
				setComponent((Identifier)null);
				return;
			case FHIRPackage.DEVICE_VERSION__INSTALL_DATE:
				setInstallDate((DateTime)null);
				return;
			case FHIRPackage.DEVICE_VERSION__VALUE:
				setValue((org.hl7.fhir.String)null);
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
			case FHIRPackage.DEVICE_VERSION__TYPE:
				return type != null;
			case FHIRPackage.DEVICE_VERSION__COMPONENT:
				return component != null;
			case FHIRPackage.DEVICE_VERSION__INSTALL_DATE:
				return installDate != null;
			case FHIRPackage.DEVICE_VERSION__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceVersionImpl
