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

import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Sub Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getProductOrServiceEnd <em>Product Or Service End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getPatientPaid <em>Patient Paid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getTax <em>Tax</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimSubDetailImpl#getUdi <em>Udi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimSubDetailImpl extends BackboneElementImpl implements ClaimSubDetail {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getTraceNumber() <em>Trace Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> traceNumber;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept revenue;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getProductOrService() <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrService;

	/**
	 * The cached value of the '{@link #getProductOrServiceEnd() <em>Product Or Service End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrServiceEnd()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrServiceEnd;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifier;

	/**
	 * The cached value of the '{@link #getProgramCode() <em>Program Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> programCode;

	/**
	 * The cached value of the '{@link #getPatientPaid() <em>Patient Paid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPaid()
	 * @generated
	 * @ordered
	 */
	protected Money patientPaid;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getTax() <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax()
	 * @generated
	 * @ordered
	 */
	protected Money tax;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdi() <em>Udi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdi()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> udi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimSubDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getClaimSubDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getTraceNumber() {
		if (traceNumber == null) {
			traceNumber = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.CLAIM_SUB_DETAIL__TRACE_NUMBER);
		}
		return traceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevenue(CodeableConcept newRevenue, NotificationChain msgs) {
		CodeableConcept oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__REVENUE, oldRevenue, newRevenue);
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
	public void setRevenue(CodeableConcept newRevenue) {
		if (newRevenue != revenue) {
			NotificationChain msgs = null;
			if (revenue != null)
				msgs = ((InternalEObject)revenue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__REVENUE, null, msgs);
			if (newRevenue != null)
				msgs = ((InternalEObject)newRevenue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__REVENUE, null, msgs);
			msgs = basicSetRevenue(newRevenue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__REVENUE, newRevenue, newRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductOrService() {
		return productOrService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrService(CodeableConcept newProductOrService, NotificationChain msgs) {
		CodeableConcept oldProductOrService = productOrService;
		productOrService = newProductOrService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
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
	public void setProductOrService(CodeableConcept newProductOrService) {
		if (newProductOrService != productOrService) {
			NotificationChain msgs = null;
			if (productOrService != null)
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductOrServiceEnd() {
		return productOrServiceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrServiceEnd(CodeableConcept newProductOrServiceEnd, NotificationChain msgs) {
		CodeableConcept oldProductOrServiceEnd = productOrServiceEnd;
		productOrServiceEnd = newProductOrServiceEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END, oldProductOrServiceEnd, newProductOrServiceEnd);
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
	public void setProductOrServiceEnd(CodeableConcept newProductOrServiceEnd) {
		if (newProductOrServiceEnd != productOrServiceEnd) {
			NotificationChain msgs = null;
			if (productOrServiceEnd != null)
				msgs = ((InternalEObject)productOrServiceEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END, null, msgs);
			if (newProductOrServiceEnd != null)
				msgs = ((InternalEObject)newProductOrServiceEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END, null, msgs);
			msgs = basicSetProductOrServiceEnd(newProductOrServiceEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END, newProductOrServiceEnd, newProductOrServiceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CLAIM_SUB_DETAIL__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProgramCode() {
		if (programCode == null) {
			programCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CLAIM_SUB_DETAIL__PROGRAM_CODE);
		}
		return programCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getPatientPaid() {
		return patientPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientPaid(Money newPatientPaid, NotificationChain msgs) {
		Money oldPatientPaid = patientPaid;
		patientPaid = newPatientPaid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID, oldPatientPaid, newPatientPaid);
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
	public void setPatientPaid(Money newPatientPaid) {
		if (newPatientPaid != patientPaid) {
			NotificationChain msgs = null;
			if (patientPaid != null)
				msgs = ((InternalEObject)patientPaid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID, null, msgs);
			if (newPatientPaid != null)
				msgs = ((InternalEObject)newPatientPaid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID, null, msgs);
			msgs = basicSetPatientPaid(newPatientPaid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID, newPatientPaid, newPatientPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__FACTOR, oldFactor, newFactor);
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
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getTax() {
		return tax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTax(Money newTax, NotificationChain msgs) {
		Money oldTax = tax;
		tax = newTax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__TAX, oldTax, newTax);
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
	public void setTax(Money newTax) {
		if (newTax != tax) {
			NotificationChain msgs = null;
			if (tax != null)
				msgs = ((InternalEObject)tax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__TAX, null, msgs);
			if (newTax != null)
				msgs = ((InternalEObject)newTax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__TAX, null, msgs);
			msgs = basicSetTax(newTax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__TAX, newTax, newTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__NET, oldNet, newNet);
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
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLAIM_SUB_DETAIL__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLAIM_SUB_DETAIL__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getUdi() {
		if (udi == null) {
			udi = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.CLAIM_SUB_DETAIL__UDI);
		}
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__TRACE_NUMBER:
				return ((InternalEList<?>)getTraceNumber()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__REVENUE:
				return basicSetRevenue(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY:
				return basicSetCategory(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END:
				return basicSetProductOrServiceEnd(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__PROGRAM_CODE:
				return ((InternalEList<?>)getProgramCode()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID:
				return basicSetPatientPaid(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__FACTOR:
				return basicSetFactor(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__TAX:
				return basicSetTax(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__NET:
				return basicSetNet(null, msgs);
			case FHIRPackage.CLAIM_SUB_DETAIL__UDI:
				return ((InternalEList<?>)getUdi()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE:
				return getSequence();
			case FHIRPackage.CLAIM_SUB_DETAIL__TRACE_NUMBER:
				return getTraceNumber();
			case FHIRPackage.CLAIM_SUB_DETAIL__REVENUE:
				return getRevenue();
			case FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY:
				return getCategory();
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END:
				return getProductOrServiceEnd();
			case FHIRPackage.CLAIM_SUB_DETAIL__MODIFIER:
				return getModifier();
			case FHIRPackage.CLAIM_SUB_DETAIL__PROGRAM_CODE:
				return getProgramCode();
			case FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID:
				return getPatientPaid();
			case FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY:
				return getQuantity();
			case FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE:
				return getUnitPrice();
			case FHIRPackage.CLAIM_SUB_DETAIL__FACTOR:
				return getFactor();
			case FHIRPackage.CLAIM_SUB_DETAIL__TAX:
				return getTax();
			case FHIRPackage.CLAIM_SUB_DETAIL__NET:
				return getNet();
			case FHIRPackage.CLAIM_SUB_DETAIL__UDI:
				return getUdi();
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
			case FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__TRACE_NUMBER:
				getTraceNumber().clear();
				getTraceNumber().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__REVENUE:
				setRevenue((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END:
				setProductOrServiceEnd((CodeableConcept)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__PROGRAM_CODE:
				getProgramCode().clear();
				getProgramCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID:
				setPatientPaid((Money)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__TAX:
				setTax((Money)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__NET:
				setNet((Money)newValue);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__UDI:
				getUdi().clear();
				getUdi().addAll((Collection<? extends Reference>)newValue);
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
			case FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__TRACE_NUMBER:
				getTraceNumber().clear();
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__REVENUE:
				setRevenue((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END:
				setProductOrServiceEnd((CodeableConcept)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__MODIFIER:
				getModifier().clear();
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__PROGRAM_CODE:
				getProgramCode().clear();
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID:
				setPatientPaid((Money)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__FACTOR:
				setFactor((Decimal)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__TAX:
				setTax((Money)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__NET:
				setNet((Money)null);
				return;
			case FHIRPackage.CLAIM_SUB_DETAIL__UDI:
				getUdi().clear();
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
			case FHIRPackage.CLAIM_SUB_DETAIL__SEQUENCE:
				return sequence != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__TRACE_NUMBER:
				return traceNumber != null && !traceNumber.isEmpty();
			case FHIRPackage.CLAIM_SUB_DETAIL__REVENUE:
				return revenue != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__CATEGORY:
				return category != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__PRODUCT_OR_SERVICE_END:
				return productOrServiceEnd != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FHIRPackage.CLAIM_SUB_DETAIL__PROGRAM_CODE:
				return programCode != null && !programCode.isEmpty();
			case FHIRPackage.CLAIM_SUB_DETAIL__PATIENT_PAID:
				return patientPaid != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__QUANTITY:
				return quantity != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__UNIT_PRICE:
				return unitPrice != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__FACTOR:
				return factor != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__TAX:
				return tax != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__NET:
				return net != null;
			case FHIRPackage.CLAIM_SUB_DETAIL__UDI:
				return udi != null && !udi.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimSubDetailImpl
