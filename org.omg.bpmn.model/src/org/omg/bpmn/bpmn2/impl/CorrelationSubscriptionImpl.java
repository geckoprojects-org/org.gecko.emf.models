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
package org.omg.bpmn.bpmn2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.bpmn.bpmn2.Bpmn2Package;
import org.omg.bpmn.bpmn2.CorrelationKey;
import org.omg.bpmn.bpmn2.CorrelationPropertyBinding;
import org.omg.bpmn.bpmn2.CorrelationSubscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.impl.CorrelationSubscriptionImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.impl.CorrelationSubscriptionImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrelationSubscriptionImpl extends BaseElementImpl implements CorrelationSubscription {
	/**
	 * The cached value of the '{@link #getCorrelationPropertyBinding() <em>Correlation Property Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<CorrelationPropertyBinding> correlationPropertyBinding;

	/**
	 * The cached value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationKeyRef()
	 * @generated
	 * @ordered
	 */
	protected CorrelationKey correlationKeyRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationSubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getCorrelationSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CorrelationPropertyBinding> getCorrelationPropertyBinding() {
		if (correlationPropertyBinding == null) {
			correlationPropertyBinding = new EObjectContainmentEList<CorrelationPropertyBinding>(CorrelationPropertyBinding.class, this, Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING);
		}
		return correlationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrelationKey getCorrelationKeyRef() {
		if (correlationKeyRef != null && correlationKeyRef.eIsProxy()) {
			InternalEObject oldCorrelationKeyRef = (InternalEObject)correlationKeyRef;
			correlationKeyRef = (CorrelationKey)eResolveProxy(oldCorrelationKeyRef);
			if (correlationKeyRef != oldCorrelationKeyRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef));
			}
		}
		return correlationKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey basicGetCorrelationKeyRef() {
		return correlationKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationKeyRef(CorrelationKey newCorrelationKeyRef) {
		CorrelationKey oldCorrelationKeyRef = correlationKeyRef;
		correlationKeyRef = newCorrelationKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return ((InternalEList<?>)getCorrelationPropertyBinding()).basicRemove(otherEnd, msgs);
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
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return getCorrelationPropertyBinding();
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				if (resolve) return getCorrelationKeyRef();
				return basicGetCorrelationKeyRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				getCorrelationPropertyBinding().clear();
				getCorrelationPropertyBinding().addAll((Collection<? extends CorrelationPropertyBinding>)newValue);
				return;
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				setCorrelationKeyRef((CorrelationKey)newValue);
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
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				getCorrelationPropertyBinding().clear();
				return;
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				setCorrelationKeyRef((CorrelationKey)null);
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
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return correlationPropertyBinding != null && !correlationPropertyBinding.isEmpty();
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				return correlationKeyRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CorrelationSubscriptionImpl
