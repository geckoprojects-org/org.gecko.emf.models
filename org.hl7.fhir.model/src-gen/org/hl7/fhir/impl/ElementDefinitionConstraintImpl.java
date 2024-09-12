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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Canonical;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionConstraintImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionConstraintImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionConstraintImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionConstraintImpl#getSuppress <em>Suppress</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionConstraintImpl#getHuman <em>Human</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionConstraintImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionConstraintImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionConstraintImpl extends BackboneTypeImpl implements ElementDefinitionConstraint {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Id key;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected Markdown requirements;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected ConstraintSeverity severity;

	/**
	 * The cached value of the '{@link #getSuppress() <em>Suppress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppress()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean suppress;

	/**
	 * The cached value of the '{@link #getHuman() <em>Human</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHuman()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String human;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String expression;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Canonical source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getElementDefinitionConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(Id newKey, NotificationChain msgs) {
		Id oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY, oldKey, newKey);
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
	public void setKey(Id newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(Markdown newRequirements, NotificationChain msgs) {
		Markdown oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS, oldRequirements, newRequirements);
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
	public void setRequirements(Markdown newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(ConstraintSeverity newSeverity, NotificationChain msgs) {
		ConstraintSeverity oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY, oldSeverity, newSeverity);
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
	public void setSeverity(ConstraintSeverity newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getSuppress() {
		return suppress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuppress(org.hl7.fhir.Boolean newSuppress, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldSuppress = suppress;
		suppress = newSuppress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS, oldSuppress, newSuppress);
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
	public void setSuppress(org.hl7.fhir.Boolean newSuppress) {
		if (newSuppress != suppress) {
			NotificationChain msgs = null;
			if (suppress != null)
				msgs = ((InternalEObject)suppress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS, null, msgs);
			if (newSuppress != null)
				msgs = ((InternalEObject)newSuppress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS, null, msgs);
			msgs = basicSetSuppress(newSuppress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS, newSuppress, newSuppress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getHuman() {
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHuman(org.hl7.fhir.String newHuman, NotificationChain msgs) {
		org.hl7.fhir.String oldHuman = human;
		human = newHuman;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN, oldHuman, newHuman);
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
	public void setHuman(org.hl7.fhir.String newHuman) {
		if (newHuman != human) {
			NotificationChain msgs = null;
			if (human != null)
				msgs = ((InternalEObject)human).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN, null, msgs);
			if (newHuman != null)
				msgs = ((InternalEObject)newHuman).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN, null, msgs);
			msgs = basicSetHuman(newHuman, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN, newHuman, newHuman));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(org.hl7.fhir.String newExpression, NotificationChain msgs) {
		org.hl7.fhir.String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(org.hl7.fhir.String newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Canonical newSource, NotificationChain msgs) {
		Canonical oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE, oldSource, newSource);
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
	public void setSource(Canonical newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				return basicSetKey(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS:
				return basicSetSuppress(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				return basicSetHuman(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE:
				return basicSetSource(null, msgs);
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
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				return getKey();
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				return getRequirements();
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				return getSeverity();
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS:
				return getSuppress();
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				return getHuman();
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION:
				return getExpression();
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE:
				return getSource();
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
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				setKey((Id)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				setRequirements((Markdown)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				setSeverity((ConstraintSeverity)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS:
				setSuppress((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				setHuman((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION:
				setExpression((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE:
				setSource((Canonical)newValue);
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
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				setKey((Id)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				setRequirements((Markdown)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				setSeverity((ConstraintSeverity)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS:
				setSuppress((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				setHuman((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION:
				setExpression((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE:
				setSource((Canonical)null);
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
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				return key != null;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				return requirements != null;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				return severity != null;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SUPPRESS:
				return suppress != null;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				return human != null;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__EXPRESSION:
				return expression != null;
			case FHIRPackage.ELEMENT_DEFINITION_CONSTRAINT__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionConstraintImpl
