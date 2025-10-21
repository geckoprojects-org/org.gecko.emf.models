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
import de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerPredicateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtered Symbolizer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FilteredSymbolizerTypeImpl#getSymbolizerPredicate <em>Symbolizer Predicate</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FilteredSymbolizerTypeImpl#getPureSymbolizer <em>Pure Symbolizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilteredSymbolizerTypeImpl extends SymbolizerType1Impl implements FilteredSymbolizerType {
	/**
	 * The cached value of the '{@link #getSymbolizerPredicate() <em>Symbolizer Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolizerPredicate()
	 * @generated
	 * @ordered
	 */
	protected SymbolizerPredicateType symbolizerPredicate;

	/**
	 * The cached value of the '{@link #getPureSymbolizer() <em>Pure Symbolizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPureSymbolizer()
	 * @generated
	 * @ordered
	 */
	protected PureSymbolizerType pureSymbolizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteredSymbolizerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getFilteredSymbolizerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolizerPredicateType getSymbolizerPredicate() {
		return symbolizerPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbolizerPredicate(SymbolizerPredicateType newSymbolizerPredicate, NotificationChain msgs) {
		SymbolizerPredicateType oldSymbolizerPredicate = symbolizerPredicate;
		symbolizerPredicate = newSymbolizerPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE, oldSymbolizerPredicate, newSymbolizerPredicate);
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
	public void setSymbolizerPredicate(SymbolizerPredicateType newSymbolizerPredicate) {
		if (newSymbolizerPredicate != symbolizerPredicate) {
			NotificationChain msgs = null;
			if (symbolizerPredicate != null)
				msgs = ((InternalEObject)symbolizerPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE, null, msgs);
			if (newSymbolizerPredicate != null)
				msgs = ((InternalEObject)newSymbolizerPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE, null, msgs);
			msgs = basicSetSymbolizerPredicate(newSymbolizerPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE, newSymbolizerPredicate, newSymbolizerPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PureSymbolizerType getPureSymbolizer() {
		return pureSymbolizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPureSymbolizer(PureSymbolizerType newPureSymbolizer, NotificationChain msgs) {
		PureSymbolizerType oldPureSymbolizer = pureSymbolizer;
		pureSymbolizer = newPureSymbolizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER, oldPureSymbolizer, newPureSymbolizer);
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
	public void setPureSymbolizer(PureSymbolizerType newPureSymbolizer) {
		if (newPureSymbolizer != pureSymbolizer) {
			NotificationChain msgs = null;
			if (pureSymbolizer != null)
				msgs = ((InternalEObject)pureSymbolizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER, null, msgs);
			if (newPureSymbolizer != null)
				msgs = ((InternalEObject)newPureSymbolizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER, null, msgs);
			msgs = basicSetPureSymbolizer(newPureSymbolizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER, newPureSymbolizer, newPureSymbolizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE:
				return basicSetSymbolizerPredicate(null, msgs);
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER:
				return basicSetPureSymbolizer(null, msgs);
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
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE:
				return getSymbolizerPredicate();
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER:
				return getPureSymbolizer();
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
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE:
				setSymbolizerPredicate((SymbolizerPredicateType)newValue);
				return;
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER:
				setPureSymbolizer((PureSymbolizerType)newValue);
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
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE:
				setSymbolizerPredicate((SymbolizerPredicateType)null);
				return;
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER:
				setPureSymbolizer((PureSymbolizerType)null);
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
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__SYMBOLIZER_PREDICATE:
				return symbolizerPredicate != null;
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE__PURE_SYMBOLIZER:
				return pureSymbolizer != null;
		}
		return super.eIsSet(featureID);
	}

} //FilteredSymbolizerTypeImpl
