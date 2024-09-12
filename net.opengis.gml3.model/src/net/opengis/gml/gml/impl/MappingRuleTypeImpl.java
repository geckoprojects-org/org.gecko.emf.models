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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.MappingRuleType;
import net.opengis.gml.gml.ReferenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.MappingRuleTypeImpl#getRuleDefinition <em>Rule Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MappingRuleTypeImpl#getRuleReference <em>Rule Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingRuleTypeImpl extends MinimalEObjectImpl.Container implements MappingRuleType {
	/**
	 * The default value of the '{@link #getRuleDefinition() <em>Rule Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleDefinition() <em>Rule Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleDefinition()
	 * @generated
	 * @ordered
	 */
	protected String ruleDefinition = RULE_DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuleReference() <em>Rule Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType ruleReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getMappingRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleDefinition() {
		return ruleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleDefinition(String newRuleDefinition) {
		String oldRuleDefinition = ruleDefinition;
		ruleDefinition = newRuleDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MAPPING_RULE_TYPE__RULE_DEFINITION, oldRuleDefinition, ruleDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getRuleReference() {
		return ruleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleReference(ReferenceType newRuleReference, NotificationChain msgs) {
		ReferenceType oldRuleReference = ruleReference;
		ruleReference = newRuleReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE, oldRuleReference, newRuleReference);
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
	public void setRuleReference(ReferenceType newRuleReference) {
		if (newRuleReference != ruleReference) {
			NotificationChain msgs = null;
			if (ruleReference != null)
				msgs = ((InternalEObject)ruleReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE, null, msgs);
			if (newRuleReference != null)
				msgs = ((InternalEObject)newRuleReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE, null, msgs);
			msgs = basicSetRuleReference(newRuleReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE, newRuleReference, newRuleReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE:
				return basicSetRuleReference(null, msgs);
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
			case GMLPackage.MAPPING_RULE_TYPE__RULE_DEFINITION:
				return getRuleDefinition();
			case GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE:
				return getRuleReference();
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
			case GMLPackage.MAPPING_RULE_TYPE__RULE_DEFINITION:
				setRuleDefinition((String)newValue);
				return;
			case GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE:
				setRuleReference((ReferenceType)newValue);
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
			case GMLPackage.MAPPING_RULE_TYPE__RULE_DEFINITION:
				setRuleDefinition(RULE_DEFINITION_EDEFAULT);
				return;
			case GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE:
				setRuleReference((ReferenceType)null);
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
			case GMLPackage.MAPPING_RULE_TYPE__RULE_DEFINITION:
				return RULE_DEFINITION_EDEFAULT == null ? ruleDefinition != null : !RULE_DEFINITION_EDEFAULT.equals(ruleDefinition);
			case GMLPackage.MAPPING_RULE_TYPE__RULE_REFERENCE:
				return ruleReference != null;
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
		result.append(" (ruleDefinition: ");
		result.append(ruleDefinition);
		result.append(')');
		return result.toString();
	}

} //MappingRuleTypeImpl
