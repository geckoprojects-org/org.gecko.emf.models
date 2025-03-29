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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression;
import org.omg.spec.bpmn.bpmn.TFormalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCorrelation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationPropertyRetrievalExpressionImpl#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationPropertyRetrievalExpressionImpl#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCorrelationPropertyRetrievalExpressionImpl extends TBaseElementImpl implements TCorrelationPropertyRetrievalExpression {
	/**
	 * The cached value of the '{@link #getMessagePath() <em>Message Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePath()
	 * @generated
	 * @ordered
	 */
	protected TFormalExpression messagePath;

	/**
	 * The default value of the '{@link #getMessageRef() <em>Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName MESSAGE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageRef() <em>Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRef()
	 * @generated
	 * @ordered
	 */
	protected QName messageRef = MESSAGE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCorrelationPropertyRetrievalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTCorrelationPropertyRetrievalExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFormalExpression getMessagePath() {
		return messagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagePath(TFormalExpression newMessagePath, NotificationChain msgs) {
		TFormalExpression oldMessagePath = messagePath;
		messagePath = newMessagePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, oldMessagePath, newMessagePath);
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
	public void setMessagePath(TFormalExpression newMessagePath) {
		if (newMessagePath != messagePath) {
			NotificationChain msgs = null;
			if (messagePath != null)
				msgs = ((InternalEObject)messagePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, null, msgs);
			if (newMessagePath != null)
				msgs = ((InternalEObject)newMessagePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, null, msgs);
			msgs = basicSetMessagePath(newMessagePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, newMessagePath, newMessagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getMessageRef() {
		return messageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageRef(QName newMessageRef) {
		QName oldMessageRef = messageRef;
		messageRef = newMessageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, oldMessageRef, messageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				return basicSetMessagePath(null, msgs);
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
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				return getMessagePath();
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				return getMessageRef();
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
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				setMessagePath((TFormalExpression)newValue);
				return;
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				setMessageRef((QName)newValue);
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
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				setMessagePath((TFormalExpression)null);
				return;
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				setMessageRef(MESSAGE_REF_EDEFAULT);
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
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				return messagePath != null;
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				return MESSAGE_REF_EDEFAULT == null ? messageRef != null : !MESSAGE_REF_EDEFAULT.equals(messageRef);
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
		result.append(" (messageRef: ");
		result.append(messageRef);
		result.append(')');
		return result.toString();
	}

} //TCorrelationPropertyRetrievalExpressionImpl
