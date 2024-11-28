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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.CountConsentsForDomainWithFilterResponse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Consents For Domain With Filter Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.CountConsentsForDomainWithFilterResponseImpl#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountConsentsForDomainWithFilterResponseImpl extends MinimalEObjectImpl.Container implements CountConsentsForDomainWithFilterResponse {
	/**
	 * The default value of the '{@link #getReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected static final long RETURN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected long return_ = RETURN_EDEFAULT;

	/**
	 * This is true if the Return attribute has been set.
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
	protected CountConsentsForDomainWithFilterResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getCountConsentsForDomainWithFilterResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturn(long newReturn) {
		long oldReturn = return_;
		return_ = newReturn;
		boolean oldReturnESet = returnESet;
		returnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE__RETURN, oldReturn, return_, !oldReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReturn() {
		long oldReturn = return_;
		boolean oldReturnESet = returnESet;
		return_ = RETURN_EDEFAULT;
		returnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE__RETURN, oldReturn, RETURN_EDEFAULT, oldReturnESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE__RETURN:
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
			case Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE__RETURN:
				setReturn((Long)newValue);
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
			case Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE__RETURN:
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
			case Cm2Package.COUNT_CONSENTS_FOR_DOMAIN_WITH_FILTER_RESPONSE__RETURN:
				return isSetReturn();
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
		result.append(" (return: ");
		if (returnESet) result.append(return_); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CountConsentsForDomainWithFilterResponseImpl
