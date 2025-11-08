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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ClaimType;
import org.cyclonedx.schema.bom.ExternalReferences;
import org.cyclonedx.schema.bom.MitigationStrategiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getMitigationStrategies <em>Mitigation Strategies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getReasoning <em>Reasoning</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getCounterEvidence <em>Counter Evidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ClaimTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimTypeImpl extends MinimalEObjectImpl.Container implements ClaimType {
	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected String predicate = PREDICATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMitigationStrategies() <em>Mitigation Strategies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationStrategies()
	 * @generated
	 * @ordered
	 */
	protected MitigationStrategiesType mitigationStrategies;

	/**
	 * The default value of the '{@link #getReasoning() <em>Reasoning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasoning()
	 * @generated
	 * @ordered
	 */
	protected static final String REASONING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReasoning() <em>Reasoning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasoning()
	 * @generated
	 * @ordered
	 */
	protected String reasoning = REASONING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> evidence;

	/**
	 * The cached value of the '{@link #getCounterEvidence() <em>Counter Evidence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> counterEvidence;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferences externalReferences;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getClaimType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CLAIM_TYPE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredicate(String newPredicate) {
		String oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CLAIM_TYPE__PREDICATE, oldPredicate, predicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MitigationStrategiesType getMitigationStrategies() {
		return mitigationStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMitigationStrategies(MitigationStrategiesType newMitigationStrategies, NotificationChain msgs) {
		MitigationStrategiesType oldMitigationStrategies = mitigationStrategies;
		mitigationStrategies = newMitigationStrategies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES, oldMitigationStrategies, newMitigationStrategies);
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
	public void setMitigationStrategies(MitigationStrategiesType newMitigationStrategies) {
		if (newMitigationStrategies != mitigationStrategies) {
			NotificationChain msgs = null;
			if (mitigationStrategies != null)
				msgs = ((InternalEObject)mitigationStrategies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES, null, msgs);
			if (newMitigationStrategies != null)
				msgs = ((InternalEObject)newMitigationStrategies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES, null, msgs);
			msgs = basicSetMitigationStrategies(newMitigationStrategies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES, newMitigationStrategies, newMitigationStrategies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReasoning() {
		return reasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasoning(String newReasoning) {
		String oldReasoning = reasoning;
		reasoning = newReasoning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CLAIM_TYPE__REASONING, oldReasoning, reasoning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEvidence() {
		if (evidence == null) {
			evidence = new EDataTypeEList<String>(String.class, this, BOMPackage.CLAIM_TYPE__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCounterEvidence() {
		if (counterEvidence == null) {
			counterEvidence = new EDataTypeEList<String>(String.class, this, BOMPackage.CLAIM_TYPE__COUNTER_EVIDENCE);
		}
		return counterEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReferences getExternalReferences() {
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalReferences(ExternalReferences newExternalReferences, NotificationChain msgs) {
		ExternalReferences oldExternalReferences = externalReferences;
		externalReferences = newExternalReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES, oldExternalReferences, newExternalReferences);
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
	public void setExternalReferences(ExternalReferences newExternalReferences) {
		if (newExternalReferences != externalReferences) {
			NotificationChain msgs = null;
			if (externalReferences != null)
				msgs = ((InternalEObject)externalReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES, null, msgs);
			if (newExternalReferences != null)
				msgs = ((InternalEObject)newExternalReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES, null, msgs);
			msgs = basicSetExternalReferences(newExternalReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES, newExternalReferences, newExternalReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.CLAIM_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CLAIM_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.CLAIM_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES:
				return basicSetMitigationStrategies(null, msgs);
			case BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES:
				return basicSetExternalReferences(null, msgs);
			case BOMPackage.CLAIM_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.CLAIM_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.CLAIM_TYPE__TARGET:
				return getTarget();
			case BOMPackage.CLAIM_TYPE__PREDICATE:
				return getPredicate();
			case BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES:
				return getMitigationStrategies();
			case BOMPackage.CLAIM_TYPE__REASONING:
				return getReasoning();
			case BOMPackage.CLAIM_TYPE__EVIDENCE:
				return getEvidence();
			case BOMPackage.CLAIM_TYPE__COUNTER_EVIDENCE:
				return getCounterEvidence();
			case BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BOMPackage.CLAIM_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.CLAIM_TYPE__BOM_REF:
				return getBomRef();
			case BOMPackage.CLAIM_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case BOMPackage.CLAIM_TYPE__TARGET:
				setTarget((String)newValue);
				return;
			case BOMPackage.CLAIM_TYPE__PREDICATE:
				setPredicate((String)newValue);
				return;
			case BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES:
				setMitigationStrategies((MitigationStrategiesType)newValue);
				return;
			case BOMPackage.CLAIM_TYPE__REASONING:
				setReasoning((String)newValue);
				return;
			case BOMPackage.CLAIM_TYPE__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.CLAIM_TYPE__COUNTER_EVIDENCE:
				getCounterEvidence().clear();
				getCounterEvidence().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)newValue);
				return;
			case BOMPackage.CLAIM_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.CLAIM_TYPE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.CLAIM_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case BOMPackage.CLAIM_TYPE__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case BOMPackage.CLAIM_TYPE__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
				return;
			case BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES:
				setMitigationStrategies((MitigationStrategiesType)null);
				return;
			case BOMPackage.CLAIM_TYPE__REASONING:
				setReasoning(REASONING_EDEFAULT);
				return;
			case BOMPackage.CLAIM_TYPE__EVIDENCE:
				getEvidence().clear();
				return;
			case BOMPackage.CLAIM_TYPE__COUNTER_EVIDENCE:
				getCounterEvidence().clear();
				return;
			case BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)null);
				return;
			case BOMPackage.CLAIM_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.CLAIM_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.CLAIM_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case BOMPackage.CLAIM_TYPE__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case BOMPackage.CLAIM_TYPE__PREDICATE:
				return PREDICATE_EDEFAULT == null ? predicate != null : !PREDICATE_EDEFAULT.equals(predicate);
			case BOMPackage.CLAIM_TYPE__MITIGATION_STRATEGIES:
				return mitigationStrategies != null;
			case BOMPackage.CLAIM_TYPE__REASONING:
				return REASONING_EDEFAULT == null ? reasoning != null : !REASONING_EDEFAULT.equals(reasoning);
			case BOMPackage.CLAIM_TYPE__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case BOMPackage.CLAIM_TYPE__COUNTER_EVIDENCE:
				return counterEvidence != null && !counterEvidence.isEmpty();
			case BOMPackage.CLAIM_TYPE__EXTERNAL_REFERENCES:
				return externalReferences != null;
			case BOMPackage.CLAIM_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.CLAIM_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.CLAIM_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (target: ");
		result.append(target);
		result.append(", predicate: ");
		result.append(predicate);
		result.append(", reasoning: ");
		result.append(reasoning);
		result.append(", evidence: ");
		result.append(evidence);
		result.append(", counterEvidence: ");
		result.append(counterEvidence);
		result.append(", any: ");
		result.append(any);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ClaimTypeImpl
