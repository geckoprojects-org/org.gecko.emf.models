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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TCompensateEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCompensate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCompensateEventDefinitionImpl#getActivityRef <em>Activity Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCompensateEventDefinitionImpl#isWaitForCompletion <em>Wait For Completion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCompensateEventDefinitionImpl extends TEventDefinitionImpl implements TCompensateEventDefinition {
	/**
	 * The default value of the '{@link #getActivityRef() <em>Activity Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName ACTIVITY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityRef() <em>Activity Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRef()
	 * @generated
	 * @ordered
	 */
	protected QName activityRef = ACTIVITY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WAIT_FOR_COMPLETION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected boolean waitForCompletion = WAIT_FOR_COMPLETION_EDEFAULT;

	/**
	 * This is true if the Wait For Completion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waitForCompletionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCompensateEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTCompensateEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getActivityRef() {
		return activityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityRef(QName newActivityRef) {
		QName oldActivityRef = activityRef;
		activityRef = newActivityRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__ACTIVITY_REF, oldActivityRef, activityRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWaitForCompletion() {
		return waitForCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitForCompletion(boolean newWaitForCompletion) {
		boolean oldWaitForCompletion = waitForCompletion;
		waitForCompletion = newWaitForCompletion;
		boolean oldWaitForCompletionESet = waitForCompletionESet;
		waitForCompletionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION, oldWaitForCompletion, waitForCompletion, !oldWaitForCompletionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWaitForCompletion() {
		boolean oldWaitForCompletion = waitForCompletion;
		boolean oldWaitForCompletionESet = waitForCompletionESet;
		waitForCompletion = WAIT_FOR_COMPLETION_EDEFAULT;
		waitForCompletionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION, oldWaitForCompletion, WAIT_FOR_COMPLETION_EDEFAULT, oldWaitForCompletionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWaitForCompletion() {
		return waitForCompletionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
				return getActivityRef();
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
				return isWaitForCompletion();
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
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
				setActivityRef((QName)newValue);
				return;
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
				setWaitForCompletion((Boolean)newValue);
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
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
				setActivityRef(ACTIVITY_REF_EDEFAULT);
				return;
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
				unsetWaitForCompletion();
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
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
				return ACTIVITY_REF_EDEFAULT == null ? activityRef != null : !ACTIVITY_REF_EDEFAULT.equals(activityRef);
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
				return isSetWaitForCompletion();
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
		result.append(" (activityRef: ");
		result.append(activityRef);
		result.append(", waitForCompletion: ");
		if (waitForCompletionESet) result.append(waitForCompletion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TCompensateEventDefinitionImpl
