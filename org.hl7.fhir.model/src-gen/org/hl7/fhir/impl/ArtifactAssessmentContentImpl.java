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

import org.hl7.fhir.ArtifactAssessmentContent;
import org.hl7.fhir.ArtifactAssessmentInformationType;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Assessment Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getInformationType <em>Information Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getFreeToShare <em>Free To Share</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ArtifactAssessmentContentImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactAssessmentContentImpl extends BackboneElementImpl implements ArtifactAssessmentContent {
	/**
	 * The cached value of the '{@link #getInformationType() <em>Information Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationType()
	 * @generated
	 * @ordered
	 */
	protected ArtifactAssessmentInformationType informationType;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected Markdown summary;

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
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classifier;

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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> path;

	/**
	 * The cached value of the '{@link #getRelatedArtifact() <em>Related Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifact;

	/**
	 * The cached value of the '{@link #getFreeToShare() <em>Free To Share</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeToShare()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean freeToShare;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactAssessmentContent> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactAssessmentContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getArtifactAssessmentContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactAssessmentInformationType getInformationType() {
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationType(ArtifactAssessmentInformationType newInformationType, NotificationChain msgs) {
		ArtifactAssessmentInformationType oldInformationType = informationType;
		informationType = newInformationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE, oldInformationType, newInformationType);
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
	public void setInformationType(ArtifactAssessmentInformationType newInformationType) {
		if (newInformationType != informationType) {
			NotificationChain msgs = null;
			if (informationType != null)
				msgs = ((InternalEObject)informationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE, null, msgs);
			if (newInformationType != null)
				msgs = ((InternalEObject)newInformationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE, null, msgs);
			msgs = basicSetInformationType(newInformationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE, newInformationType, newInformationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSummary(Markdown newSummary, NotificationChain msgs) {
		Markdown oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY, oldSummary, newSummary);
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
	public void setSummary(Markdown newSummary) {
		if (newSummary != summary) {
			NotificationChain msgs = null;
			if (summary != null)
				msgs = ((InternalEObject)summary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY, null, msgs);
			if (newSummary != null)
				msgs = ((InternalEObject)newSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY, null, msgs);
			msgs = basicSetSummary(newSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY, newSummary, newSummary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__CLASSIFIER);
		}
		return classifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getPath() {
		if (path == null) {
			path = new EObjectContainmentEList<Uri>(Uri.class, this, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getFreeToShare() {
		return freeToShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreeToShare(org.hl7.fhir.Boolean newFreeToShare, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldFreeToShare = freeToShare;
		freeToShare = newFreeToShare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE, oldFreeToShare, newFreeToShare);
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
	public void setFreeToShare(org.hl7.fhir.Boolean newFreeToShare) {
		if (newFreeToShare != freeToShare) {
			NotificationChain msgs = null;
			if (freeToShare != null)
				msgs = ((InternalEObject)freeToShare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE, null, msgs);
			if (newFreeToShare != null)
				msgs = ((InternalEObject)newFreeToShare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE, null, msgs);
			msgs = basicSetFreeToShare(newFreeToShare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE, newFreeToShare, newFreeToShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactAssessmentContent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ArtifactAssessmentContent>(ArtifactAssessmentContent.class, this, FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE:
				return basicSetInformationType(null, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY:
				return basicSetSummary(null, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE:
				return basicSetFreeToShare(null, msgs);
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE:
				return getInformationType();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY:
				return getSummary();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE:
				return getType();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__CLASSIFIER:
				return getClassifier();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY:
				return getQuantity();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR:
				return getAuthor();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__PATH:
				return getPath();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE:
				return getFreeToShare();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__COMPONENT:
				return getComponent();
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
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE:
				setInformationType((ArtifactAssessmentInformationType)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY:
				setSummary((Markdown)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends Uri>)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE:
				setFreeToShare((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ArtifactAssessmentContent>)newValue);
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
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE:
				setInformationType((ArtifactAssessmentInformationType)null);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY:
				setSummary((Markdown)null);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__CLASSIFIER:
				getClassifier().clear();
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__PATH:
				getPath().clear();
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE:
				setFreeToShare((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__COMPONENT:
				getComponent().clear();
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
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__INFORMATION_TYPE:
				return informationType != null;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__SUMMARY:
				return summary != null;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__TYPE:
				return type != null;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__QUANTITY:
				return quantity != null;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__AUTHOR:
				return author != null;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__PATH:
				return path != null && !path.isEmpty();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__FREE_TO_SHARE:
				return freeToShare != null;
			case FHIRPackage.ARTIFACT_ASSESSMENT_CONTENT__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactAssessmentContentImpl
