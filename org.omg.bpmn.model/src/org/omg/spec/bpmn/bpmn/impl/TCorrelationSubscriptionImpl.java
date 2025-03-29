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
package org.omg.spec.bpmn.bpmn.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding;
import org.omg.spec.bpmn.bpmn.TCorrelationSubscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCorrelation Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationSubscriptionImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationSubscriptionImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCorrelationSubscriptionImpl extends TBaseElementImpl implements TCorrelationSubscription {
	/**
	 * The cached value of the '{@link #getCorrelationPropertyBinding() <em>Correlation Property Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TCorrelationPropertyBinding> correlationPropertyBinding;

	/**
	 * The default value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationKeyRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName CORRELATION_KEY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationKeyRef()
	 * @generated
	 * @ordered
	 */
	protected QName correlationKeyRef = CORRELATION_KEY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCorrelationSubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTCorrelationSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCorrelationPropertyBinding> getCorrelationPropertyBinding() {
		if (correlationPropertyBinding == null) {
			correlationPropertyBinding = new EObjectContainmentEList<TCorrelationPropertyBinding>(TCorrelationPropertyBinding.class, this, BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING);
		}
		return correlationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getCorrelationKeyRef() {
		return correlationKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationKeyRef(QName newCorrelationKeyRef) {
		QName oldCorrelationKeyRef = correlationKeyRef;
		correlationKeyRef = newCorrelationKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
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
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return getCorrelationPropertyBinding();
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				return getCorrelationKeyRef();
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
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				getCorrelationPropertyBinding().clear();
				getCorrelationPropertyBinding().addAll((Collection<? extends TCorrelationPropertyBinding>)newValue);
				return;
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				setCorrelationKeyRef((QName)newValue);
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
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				getCorrelationPropertyBinding().clear();
				return;
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				setCorrelationKeyRef(CORRELATION_KEY_REF_EDEFAULT);
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
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return correlationPropertyBinding != null && !correlationPropertyBinding.isEmpty();
			case BPMNPackage.TCORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				return CORRELATION_KEY_REF_EDEFAULT == null ? correlationKeyRef != null : !CORRELATION_KEY_REF_EDEFAULT.equals(correlationKeyRef);
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
		result.append(" (correlationKeyRef: ");
		result.append(correlationKeyRef);
		result.append(')');
		return result.toString();
	}

} //TCorrelationSubscriptionImpl
