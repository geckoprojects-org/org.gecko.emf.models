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
import de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.PlacementType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RulesToConsiderType;

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
 * An implementation of the model object '<em><b>Design Rule Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DesignRuleType1Impl#getPositionierungsregel <em>Positionierungsregel</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DesignRuleType1Impl#getRulesToConsider <em>Rules To Consider</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DesignRuleType1Impl#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignRuleType1Impl extends ElementType1Impl implements DesignRuleType1 {
	/**
	 * The default value of the '{@link #getPositionierungsregel() <em>Positionierungsregel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionierungsregel()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIONIERUNGSREGEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionierungsregel() <em>Positionierungsregel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionierungsregel()
	 * @generated
	 * @ordered
	 */
	protected String positionierungsregel = POSITIONIERUNGSREGEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRulesToConsider() <em>Rules To Consider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulesToConsider()
	 * @generated
	 * @ordered
	 */
	protected EList<RulesToConsiderType> rulesToConsider;

	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected EList<PlacementType> placement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignRuleType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getDesignRuleType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionierungsregel() {
		return positionierungsregel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionierungsregel(String newPositionierungsregel) {
		String oldPositionierungsregel = positionierungsregel;
		positionierungsregel = newPositionierungsregel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.DESIGN_RULE_TYPE1__POSITIONIERUNGSREGEL, oldPositionierungsregel, positionierungsregel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RulesToConsiderType> getRulesToConsider() {
		if (rulesToConsider == null) {
			rulesToConsider = new EObjectContainmentEList<RulesToConsiderType>(RulesToConsiderType.class, this, AAAPackage.DESIGN_RULE_TYPE1__RULES_TO_CONSIDER);
		}
		return rulesToConsider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlacementType> getPlacement() {
		if (placement == null) {
			placement = new EObjectContainmentEList<PlacementType>(PlacementType.class, this, AAAPackage.DESIGN_RULE_TYPE1__PLACEMENT);
		}
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.DESIGN_RULE_TYPE1__RULES_TO_CONSIDER:
				return ((InternalEList<?>)getRulesToConsider()).basicRemove(otherEnd, msgs);
			case AAAPackage.DESIGN_RULE_TYPE1__PLACEMENT:
				return ((InternalEList<?>)getPlacement()).basicRemove(otherEnd, msgs);
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
			case AAAPackage.DESIGN_RULE_TYPE1__POSITIONIERUNGSREGEL:
				return getPositionierungsregel();
			case AAAPackage.DESIGN_RULE_TYPE1__RULES_TO_CONSIDER:
				return getRulesToConsider();
			case AAAPackage.DESIGN_RULE_TYPE1__PLACEMENT:
				return getPlacement();
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
			case AAAPackage.DESIGN_RULE_TYPE1__POSITIONIERUNGSREGEL:
				setPositionierungsregel((String)newValue);
				return;
			case AAAPackage.DESIGN_RULE_TYPE1__RULES_TO_CONSIDER:
				getRulesToConsider().clear();
				getRulesToConsider().addAll((Collection<? extends RulesToConsiderType>)newValue);
				return;
			case AAAPackage.DESIGN_RULE_TYPE1__PLACEMENT:
				getPlacement().clear();
				getPlacement().addAll((Collection<? extends PlacementType>)newValue);
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
			case AAAPackage.DESIGN_RULE_TYPE1__POSITIONIERUNGSREGEL:
				setPositionierungsregel(POSITIONIERUNGSREGEL_EDEFAULT);
				return;
			case AAAPackage.DESIGN_RULE_TYPE1__RULES_TO_CONSIDER:
				getRulesToConsider().clear();
				return;
			case AAAPackage.DESIGN_RULE_TYPE1__PLACEMENT:
				getPlacement().clear();
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
			case AAAPackage.DESIGN_RULE_TYPE1__POSITIONIERUNGSREGEL:
				return POSITIONIERUNGSREGEL_EDEFAULT == null ? positionierungsregel != null : !POSITIONIERUNGSREGEL_EDEFAULT.equals(positionierungsregel);
			case AAAPackage.DESIGN_RULE_TYPE1__RULES_TO_CONSIDER:
				return rulesToConsider != null && !rulesToConsider.isEmpty();
			case AAAPackage.DESIGN_RULE_TYPE1__PLACEMENT:
				return placement != null && !placement.isEmpty();
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
		result.append(" (positionierungsregel: ");
		result.append(positionierungsregel);
		result.append(')');
		return result.toString();
	}

} //DesignRuleType1Impl
