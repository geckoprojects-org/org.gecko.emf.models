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

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.SubstanceReferenceInformation;
import org.hl7.fhir.SubstanceReferenceInformationGene;
import org.hl7.fhir.SubstanceReferenceInformationGeneElement;
import org.hl7.fhir.SubstanceReferenceInformationTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Reference Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getGene <em>Gene</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getGeneElement <em>Gene Element</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceReferenceInformationImpl extends DomainResourceImpl implements SubstanceReferenceInformation {
	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getGene() <em>Gene</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGene()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationGene> gene;

	/**
	 * The cached value of the '{@link #getGeneElement() <em>Gene Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationGeneElement> geneElement;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationTarget> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceReferenceInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSubstanceReferenceInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, oldComment, newComment);
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
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationGene> getGene() {
		if (gene == null) {
			gene = new EObjectContainmentEList<SubstanceReferenceInformationGene>(SubstanceReferenceInformationGene.class, this, FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE);
		}
		return gene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationGeneElement> getGeneElement() {
		if (geneElement == null) {
			geneElement = new EObjectContainmentEList<SubstanceReferenceInformationGeneElement>(SubstanceReferenceInformationGeneElement.class, this, FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT);
		}
		return geneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationTarget> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<SubstanceReferenceInformationTarget>(SubstanceReferenceInformationTarget.class, this, FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return basicSetComment(null, msgs);
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return ((InternalEList<?>)getGene()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return ((InternalEList<?>)getGeneElement()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return getComment();
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return getGene();
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return getGeneElement();
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return getTarget();
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
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				getGene().clear();
				getGene().addAll((Collection<? extends SubstanceReferenceInformationGene>)newValue);
				return;
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				getGeneElement().clear();
				getGeneElement().addAll((Collection<? extends SubstanceReferenceInformationGeneElement>)newValue);
				return;
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends SubstanceReferenceInformationTarget>)newValue);
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
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				getGene().clear();
				return;
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				getGeneElement().clear();
				return;
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				getTarget().clear();
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
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return comment != null;
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return gene != null && !gene.isEmpty();
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return geneElement != null && !geneElement.isEmpty();
			case FHIRPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceReferenceInformationImpl
