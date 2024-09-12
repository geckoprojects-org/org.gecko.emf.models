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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.MedicationKnowledgeCost;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeCostImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeCostImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeCostImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeCostImpl#getCostMoney <em>Cost Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeCostImpl#getCostCodeableConcept <em>Cost Codeable Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeCostImpl extends BackboneElementImpl implements MedicationKnowledgeCost {
	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> effectiveDate;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String source;

	/**
	 * The cached value of the '{@link #getCostMoney() <em>Cost Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostMoney()
	 * @generated
	 * @ordered
	 */
	protected Money costMoney;

	/**
	 * The cached value of the '{@link #getCostCodeableConcept() <em>Cost Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept costCodeableConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMedicationKnowledgeCost();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getEffectiveDate() {
		if (effectiveDate == null) {
			effectiveDate = new EObjectContainmentEList<Period>(Period.class, this, FHIRPackage.MEDICATION_KNOWLEDGE_COST__EFFECTIVE_DATE);
		}
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(org.hl7.fhir.String newSource, NotificationChain msgs) {
		org.hl7.fhir.String oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE, oldSource, newSource);
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
	public void setSource(org.hl7.fhir.String newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getCostMoney() {
		return costMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostMoney(Money newCostMoney, NotificationChain msgs) {
		Money oldCostMoney = costMoney;
		costMoney = newCostMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY, oldCostMoney, newCostMoney);
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
	public void setCostMoney(Money newCostMoney) {
		if (newCostMoney != costMoney) {
			NotificationChain msgs = null;
			if (costMoney != null)
				msgs = ((InternalEObject)costMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY, null, msgs);
			if (newCostMoney != null)
				msgs = ((InternalEObject)newCostMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY, null, msgs);
			msgs = basicSetCostMoney(newCostMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY, newCostMoney, newCostMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCostCodeableConcept() {
		return costCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostCodeableConcept(CodeableConcept newCostCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldCostCodeableConcept = costCodeableConcept;
		costCodeableConcept = newCostCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT, oldCostCodeableConcept, newCostCodeableConcept);
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
	public void setCostCodeableConcept(CodeableConcept newCostCodeableConcept) {
		if (newCostCodeableConcept != costCodeableConcept) {
			NotificationChain msgs = null;
			if (costCodeableConcept != null)
				msgs = ((InternalEObject)costCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT, null, msgs);
			if (newCostCodeableConcept != null)
				msgs = ((InternalEObject)newCostCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetCostCodeableConcept(newCostCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT, newCostCodeableConcept, newCostCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__EFFECTIVE_DATE:
				return ((InternalEList<?>)getEffectiveDate()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE:
				return basicSetSource(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY:
				return basicSetCostMoney(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT:
				return basicSetCostCodeableConcept(null, msgs);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__EFFECTIVE_DATE:
				return getEffectiveDate();
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE:
				return getType();
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE:
				return getSource();
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY:
				return getCostMoney();
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT:
				return getCostCodeableConcept();
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__EFFECTIVE_DATE:
				getEffectiveDate().clear();
				getEffectiveDate().addAll((Collection<? extends Period>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE:
				setSource((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY:
				setCostMoney((Money)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT:
				setCostCodeableConcept((CodeableConcept)newValue);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__EFFECTIVE_DATE:
				getEffectiveDate().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE:
				setSource((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY:
				setCostMoney((Money)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT:
				setCostCodeableConcept((CodeableConcept)null);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__EFFECTIVE_DATE:
				return effectiveDate != null && !effectiveDate.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__TYPE:
				return type != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__SOURCE:
				return source != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_MONEY:
				return costMoney != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE_COST__COST_CODEABLE_CONCEPT:
				return costCodeableConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeCostImpl
