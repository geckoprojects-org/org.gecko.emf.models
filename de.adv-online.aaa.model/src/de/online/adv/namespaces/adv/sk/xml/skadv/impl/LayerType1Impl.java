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
import de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LayerType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.StyleType1;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LayerType1Impl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LayerType1Impl#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LayerType1Impl#getAdditionalSymbolizers <em>Additional Symbolizers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerType1Impl extends ElementType1Impl implements LayerType1 {
	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleType1> style;

	/**
	 * The cached value of the '{@link #getRuleSet() <em>Rule Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleSetType1> ruleSet;

	/**
	 * The cached value of the '{@link #getAdditionalSymbolizers() <em>Additional Symbolizers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalSymbolizers()
	 * @generated
	 * @ordered
	 */
	protected AdditionalSymbolizersType additionalSymbolizers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getLayerType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyleType1> getStyle() {
		if (style == null) {
			style = new EObjectContainmentEList<StyleType1>(StyleType1.class, this, AAAPackage.LAYER_TYPE1__STYLE);
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RuleSetType1> getRuleSet() {
		if (ruleSet == null) {
			ruleSet = new EObjectContainmentEList<RuleSetType1>(RuleSetType1.class, this, AAAPackage.LAYER_TYPE1__RULE_SET);
		}
		return ruleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalSymbolizersType getAdditionalSymbolizers() {
		return additionalSymbolizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalSymbolizers(AdditionalSymbolizersType newAdditionalSymbolizers, NotificationChain msgs) {
		AdditionalSymbolizersType oldAdditionalSymbolizers = additionalSymbolizers;
		additionalSymbolizers = newAdditionalSymbolizers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS, oldAdditionalSymbolizers, newAdditionalSymbolizers);
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
	public void setAdditionalSymbolizers(AdditionalSymbolizersType newAdditionalSymbolizers) {
		if (newAdditionalSymbolizers != additionalSymbolizers) {
			NotificationChain msgs = null;
			if (additionalSymbolizers != null)
				msgs = ((InternalEObject)additionalSymbolizers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS, null, msgs);
			if (newAdditionalSymbolizers != null)
				msgs = ((InternalEObject)newAdditionalSymbolizers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS, null, msgs);
			msgs = basicSetAdditionalSymbolizers(newAdditionalSymbolizers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS, newAdditionalSymbolizers, newAdditionalSymbolizers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.LAYER_TYPE1__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case AAAPackage.LAYER_TYPE1__RULE_SET:
				return ((InternalEList<?>)getRuleSet()).basicRemove(otherEnd, msgs);
			case AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS:
				return basicSetAdditionalSymbolizers(null, msgs);
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
			case AAAPackage.LAYER_TYPE1__STYLE:
				return getStyle();
			case AAAPackage.LAYER_TYPE1__RULE_SET:
				return getRuleSet();
			case AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS:
				return getAdditionalSymbolizers();
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
			case AAAPackage.LAYER_TYPE1__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends StyleType1>)newValue);
				return;
			case AAAPackage.LAYER_TYPE1__RULE_SET:
				getRuleSet().clear();
				getRuleSet().addAll((Collection<? extends RuleSetType1>)newValue);
				return;
			case AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS:
				setAdditionalSymbolizers((AdditionalSymbolizersType)newValue);
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
			case AAAPackage.LAYER_TYPE1__STYLE:
				getStyle().clear();
				return;
			case AAAPackage.LAYER_TYPE1__RULE_SET:
				getRuleSet().clear();
				return;
			case AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS:
				setAdditionalSymbolizers((AdditionalSymbolizersType)null);
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
			case AAAPackage.LAYER_TYPE1__STYLE:
				return style != null && !style.isEmpty();
			case AAAPackage.LAYER_TYPE1__RULE_SET:
				return ruleSet != null && !ruleSet.isEmpty();
			case AAAPackage.LAYER_TYPE1__ADDITIONAL_SYMBOLIZERS:
				return additionalSymbolizers != null;
		}
		return super.eIsSet(featureID);
	}

} //LayerType1Impl
