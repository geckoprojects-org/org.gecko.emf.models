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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyNameAndSignerIdsResponse;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType12;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Policy States For Policy Name And Signer Ids Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyNameAndSignerIdsResponseImpl#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetPolicyStatesForPolicyNameAndSignerIdsResponseImpl extends MinimalEObjectImpl.Container implements GetPolicyStatesForPolicyNameAndSignerIdsResponse {
	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected ReturnType12 return_;

	/**
	 * This is true if the Return containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetPolicyStatesForPolicyNameAndSignerIdsResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetPolicyStatesForPolicyNameAndSignerIdsResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType12 getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn(ReturnType12 newReturn, NotificationChain msgs) {
		ReturnType12 oldReturn = return_;
		return_ = newReturn;
		boolean oldReturnESet = returnESet;
		returnESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN, oldReturn, newReturn, !oldReturnESet);
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
	public void setReturn(ReturnType12 newReturn) {
		if (newReturn != return_) {
			NotificationChain msgs = null;
			if (return_ != null)
				msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN, null, msgs);
			if (newReturn != null)
				msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN, null, msgs);
			msgs = basicSetReturn(newReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReturnESet = returnESet;
			returnESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN, newReturn, newReturn, !oldReturnESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReturn(NotificationChain msgs) {
		ReturnType12 oldReturn = return_;
		return_ = null;
		boolean oldReturnESet = returnESet;
		returnESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN, oldReturn, null, oldReturnESet);
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
	public void unsetReturn() {
		if (return_ != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN, null, msgs);
			msgs = basicUnsetReturn(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReturnESet = returnESet;
			returnESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN, null, null, oldReturnESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReturn() {
		return returnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN:
				return basicUnsetReturn(msgs);
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
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN:
				return getReturn();
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
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN:
				setReturn((ReturnType12)newValue);
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
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN:
				unsetReturn();
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
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_NAME_AND_SIGNER_IDS_RESPONSE__RETURN:
				return isSetReturn();
		}
		return super.eIsSet(featureID);
	}

} //GetPolicyStatesForPolicyNameAndSignerIdsResponseImpl
