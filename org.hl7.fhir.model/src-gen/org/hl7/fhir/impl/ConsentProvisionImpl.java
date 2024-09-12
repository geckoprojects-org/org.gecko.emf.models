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
import org.hl7.fhir.Coding;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Provision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getDataPeriod <em>Data Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentProvisionImpl extends BackboneElementImpl implements ConsentProvision {
	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentActor> actor;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> action;

	/**
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securityLabel;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purpose;

	/**
	 * The cached value of the '{@link #getDocumentType() <em>Document Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> documentType;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> resourceType;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> code;

	/**
	 * The cached value of the '{@link #getDataPeriod() <em>Data Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period dataPeriod;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentData> data;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getProvision() <em>Provision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvision()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentProvision> provision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentProvisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getConsentProvision();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_PROVISION__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_PROVISION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_PROVISION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_PROVISION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentActor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<ConsentActor>(ConsentActor.class, this, FHIRPackage.CONSENT_PROVISION__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CONSENT_PROVISION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<Coding>(Coding.class, this, FHIRPackage.CONSENT_PROVISION__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getPurpose() {
		if (purpose == null) {
			purpose = new EObjectContainmentEList<Coding>(Coding.class, this, FHIRPackage.CONSENT_PROVISION__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getDocumentType() {
		if (documentType == null) {
			documentType = new EObjectContainmentEList<Coding>(Coding.class, this, FHIRPackage.CONSENT_PROVISION__DOCUMENT_TYPE);
		}
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getResourceType() {
		if (resourceType == null) {
			resourceType = new EObjectContainmentEList<Coding>(Coding.class, this, FHIRPackage.CONSENT_PROVISION__RESOURCE_TYPE);
		}
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CONSENT_PROVISION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getDataPeriod() {
		return dataPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPeriod(Period newDataPeriod, NotificationChain msgs) {
		Period oldDataPeriod = dataPeriod;
		dataPeriod = newDataPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_PROVISION__DATA_PERIOD, oldDataPeriod, newDataPeriod);
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
	public void setDataPeriod(Period newDataPeriod) {
		if (newDataPeriod != dataPeriod) {
			NotificationChain msgs = null;
			if (dataPeriod != null)
				msgs = ((InternalEObject)dataPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_PROVISION__DATA_PERIOD, null, msgs);
			if (newDataPeriod != null)
				msgs = ((InternalEObject)newDataPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_PROVISION__DATA_PERIOD, null, msgs);
			msgs = basicSetDataPeriod(newDataPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_PROVISION__DATA_PERIOD, newDataPeriod, newDataPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ConsentData>(ConsentData.class, this, FHIRPackage.CONSENT_PROVISION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_PROVISION__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_PROVISION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CONSENT_PROVISION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONSENT_PROVISION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentProvision> getProvision() {
		if (provision == null) {
			provision = new EObjectContainmentEList<ConsentProvision>(ConsentProvision.class, this, FHIRPackage.CONSENT_PROVISION__PROVISION);
		}
		return provision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CONSENT_PROVISION__PERIOD:
				return basicSetPeriod(null, msgs);
			case FHIRPackage.CONSENT_PROVISION__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT_PROVISION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT_PROVISION__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT_PROVISION__PURPOSE:
				return ((InternalEList<?>)getPurpose()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT_PROVISION__DOCUMENT_TYPE:
				return ((InternalEList<?>)getDocumentType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT_PROVISION__RESOURCE_TYPE:
				return ((InternalEList<?>)getResourceType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT_PROVISION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT_PROVISION__DATA_PERIOD:
				return basicSetDataPeriod(null, msgs);
			case FHIRPackage.CONSENT_PROVISION__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONSENT_PROVISION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case FHIRPackage.CONSENT_PROVISION__PROVISION:
				return ((InternalEList<?>)getProvision()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CONSENT_PROVISION__PERIOD:
				return getPeriod();
			case FHIRPackage.CONSENT_PROVISION__ACTOR:
				return getActor();
			case FHIRPackage.CONSENT_PROVISION__ACTION:
				return getAction();
			case FHIRPackage.CONSENT_PROVISION__SECURITY_LABEL:
				return getSecurityLabel();
			case FHIRPackage.CONSENT_PROVISION__PURPOSE:
				return getPurpose();
			case FHIRPackage.CONSENT_PROVISION__DOCUMENT_TYPE:
				return getDocumentType();
			case FHIRPackage.CONSENT_PROVISION__RESOURCE_TYPE:
				return getResourceType();
			case FHIRPackage.CONSENT_PROVISION__CODE:
				return getCode();
			case FHIRPackage.CONSENT_PROVISION__DATA_PERIOD:
				return getDataPeriod();
			case FHIRPackage.CONSENT_PROVISION__DATA:
				return getData();
			case FHIRPackage.CONSENT_PROVISION__EXPRESSION:
				return getExpression();
			case FHIRPackage.CONSENT_PROVISION__PROVISION:
				return getProvision();
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
			case FHIRPackage.CONSENT_PROVISION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends ConsentActor>)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends Coding>)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends Coding>)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__DOCUMENT_TYPE:
				getDocumentType().clear();
				getDocumentType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__RESOURCE_TYPE:
				getResourceType().clear();
				getResourceType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__DATA_PERIOD:
				setDataPeriod((Period)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ConsentData>)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case FHIRPackage.CONSENT_PROVISION__PROVISION:
				getProvision().clear();
				getProvision().addAll((Collection<? extends ConsentProvision>)newValue);
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
			case FHIRPackage.CONSENT_PROVISION__PERIOD:
				setPeriod((Period)null);
				return;
			case FHIRPackage.CONSENT_PROVISION__ACTOR:
				getActor().clear();
				return;
			case FHIRPackage.CONSENT_PROVISION__ACTION:
				getAction().clear();
				return;
			case FHIRPackage.CONSENT_PROVISION__SECURITY_LABEL:
				getSecurityLabel().clear();
				return;
			case FHIRPackage.CONSENT_PROVISION__PURPOSE:
				getPurpose().clear();
				return;
			case FHIRPackage.CONSENT_PROVISION__DOCUMENT_TYPE:
				getDocumentType().clear();
				return;
			case FHIRPackage.CONSENT_PROVISION__RESOURCE_TYPE:
				getResourceType().clear();
				return;
			case FHIRPackage.CONSENT_PROVISION__CODE:
				getCode().clear();
				return;
			case FHIRPackage.CONSENT_PROVISION__DATA_PERIOD:
				setDataPeriod((Period)null);
				return;
			case FHIRPackage.CONSENT_PROVISION__DATA:
				getData().clear();
				return;
			case FHIRPackage.CONSENT_PROVISION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case FHIRPackage.CONSENT_PROVISION__PROVISION:
				getProvision().clear();
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
			case FHIRPackage.CONSENT_PROVISION__PERIOD:
				return period != null;
			case FHIRPackage.CONSENT_PROVISION__ACTOR:
				return actor != null && !actor.isEmpty();
			case FHIRPackage.CONSENT_PROVISION__ACTION:
				return action != null && !action.isEmpty();
			case FHIRPackage.CONSENT_PROVISION__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
			case FHIRPackage.CONSENT_PROVISION__PURPOSE:
				return purpose != null && !purpose.isEmpty();
			case FHIRPackage.CONSENT_PROVISION__DOCUMENT_TYPE:
				return documentType != null && !documentType.isEmpty();
			case FHIRPackage.CONSENT_PROVISION__RESOURCE_TYPE:
				return resourceType != null && !resourceType.isEmpty();
			case FHIRPackage.CONSENT_PROVISION__CODE:
				return code != null && !code.isEmpty();
			case FHIRPackage.CONSENT_PROVISION__DATA_PERIOD:
				return dataPeriod != null;
			case FHIRPackage.CONSENT_PROVISION__DATA:
				return data != null && !data.isEmpty();
			case FHIRPackage.CONSENT_PROVISION__EXPRESSION:
				return expression != null;
			case FHIRPackage.CONSENT_PROVISION__PROVISION:
				return provision != null && !provision.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentProvisionImpl
