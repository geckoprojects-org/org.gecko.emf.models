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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.InType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SatisfiesType;
import de.online.adv.namespaces.adv.sk.xml.skadv.VariableType3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.QuantifierTypeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.QuantifierTypeImpl#getIn <em>In</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.QuantifierTypeImpl#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuantifierTypeImpl extends ExpressionType1Impl implements QuantifierType {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableType3 variable;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected InType1 in;

	/**
	 * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfies()
	 * @generated
	 * @ordered
	 */
	protected SatisfiesType satisfies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getQuantifierType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType3 getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(VariableType3 newVariable, NotificationChain msgs) {
		VariableType3 oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.QUANTIFIER_TYPE__VARIABLE, oldVariable, newVariable);
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
	public void setVariable(VariableType3 newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.QUANTIFIER_TYPE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.QUANTIFIER_TYPE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.QUANTIFIER_TYPE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InType1 getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(InType1 newIn, NotificationChain msgs) {
		InType1 oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.QUANTIFIER_TYPE__IN, oldIn, newIn);
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
	public void setIn(InType1 newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.QUANTIFIER_TYPE__IN, null, msgs);
			if (newIn != null)
				msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.QUANTIFIER_TYPE__IN, null, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.QUANTIFIER_TYPE__IN, newIn, newIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SatisfiesType getSatisfies() {
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatisfies(SatisfiesType newSatisfies, NotificationChain msgs) {
		SatisfiesType oldSatisfies = satisfies;
		satisfies = newSatisfies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.QUANTIFIER_TYPE__SATISFIES, oldSatisfies, newSatisfies);
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
	public void setSatisfies(SatisfiesType newSatisfies) {
		if (newSatisfies != satisfies) {
			NotificationChain msgs = null;
			if (satisfies != null)
				msgs = ((InternalEObject)satisfies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.QUANTIFIER_TYPE__SATISFIES, null, msgs);
			if (newSatisfies != null)
				msgs = ((InternalEObject)newSatisfies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.QUANTIFIER_TYPE__SATISFIES, null, msgs);
			msgs = basicSetSatisfies(newSatisfies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.QUANTIFIER_TYPE__SATISFIES, newSatisfies, newSatisfies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.QUANTIFIER_TYPE__VARIABLE:
				return basicSetVariable(null, msgs);
			case AAAPackage.QUANTIFIER_TYPE__IN:
				return basicSetIn(null, msgs);
			case AAAPackage.QUANTIFIER_TYPE__SATISFIES:
				return basicSetSatisfies(null, msgs);
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
			case AAAPackage.QUANTIFIER_TYPE__VARIABLE:
				return getVariable();
			case AAAPackage.QUANTIFIER_TYPE__IN:
				return getIn();
			case AAAPackage.QUANTIFIER_TYPE__SATISFIES:
				return getSatisfies();
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
			case AAAPackage.QUANTIFIER_TYPE__VARIABLE:
				setVariable((VariableType3)newValue);
				return;
			case AAAPackage.QUANTIFIER_TYPE__IN:
				setIn((InType1)newValue);
				return;
			case AAAPackage.QUANTIFIER_TYPE__SATISFIES:
				setSatisfies((SatisfiesType)newValue);
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
			case AAAPackage.QUANTIFIER_TYPE__VARIABLE:
				setVariable((VariableType3)null);
				return;
			case AAAPackage.QUANTIFIER_TYPE__IN:
				setIn((InType1)null);
				return;
			case AAAPackage.QUANTIFIER_TYPE__SATISFIES:
				setSatisfies((SatisfiesType)null);
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
			case AAAPackage.QUANTIFIER_TYPE__VARIABLE:
				return variable != null;
			case AAAPackage.QUANTIFIER_TYPE__IN:
				return in != null;
			case AAAPackage.QUANTIFIER_TYPE__SATISFIES:
				return satisfies != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantifierTypeImpl
