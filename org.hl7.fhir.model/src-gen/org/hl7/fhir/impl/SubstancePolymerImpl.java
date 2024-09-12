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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.SubstancePolymer;
import org.hl7.fhir.SubstancePolymerMonomerSet;
import org.hl7.fhir.SubstancePolymerRepeat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getCopolymerConnectivity <em>Copolymer Connectivity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getMonomerSet <em>Monomer Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerImpl extends DomainResourceImpl implements SubstancePolymer {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept class_;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept geometry;

	/**
	 * The cached value of the '{@link #getCopolymerConnectivity() <em>Copolymer Connectivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopolymerConnectivity()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> copolymerConnectivity;

	/**
	 * The cached value of the '{@link #getModification() <em>Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String modification;

	/**
	 * The cached value of the '{@link #getMonomerSet() <em>Monomer Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonomerSet()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerMonomerSet> monomerSet;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerRepeat> repeat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSubstancePolymer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(CodeableConcept newClass, NotificationChain msgs) {
		CodeableConcept oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER__CLASS, oldClass, newClass);
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
	public void setClass(CodeableConcept newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(CodeableConcept newGeometry, NotificationChain msgs) {
		CodeableConcept oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY, oldGeometry, newGeometry);
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
	public void setGeometry(CodeableConcept newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCopolymerConnectivity() {
		if (copolymerConnectivity == null) {
			copolymerConnectivity = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY);
		}
		return copolymerConnectivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getModification() {
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModification(org.hl7.fhir.String newModification, NotificationChain msgs) {
		org.hl7.fhir.String oldModification = modification;
		modification = newModification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION, oldModification, newModification);
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
	public void setModification(org.hl7.fhir.String newModification) {
		if (newModification != modification) {
			NotificationChain msgs = null;
			if (modification != null)
				msgs = ((InternalEObject)modification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION, null, msgs);
			if (newModification != null)
				msgs = ((InternalEObject)newModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION, null, msgs);
			msgs = basicSetModification(newModification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION, newModification, newModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerMonomerSet> getMonomerSet() {
		if (monomerSet == null) {
			monomerSet = new EObjectContainmentEList<SubstancePolymerMonomerSet>(SubstancePolymerMonomerSet.class, this, FHIRPackage.SUBSTANCE_POLYMER__MONOMER_SET);
		}
		return monomerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerRepeat> getRepeat() {
		if (repeat == null) {
			repeat = new EObjectContainmentEList<SubstancePolymerRepeat>(SubstancePolymerRepeat.class, this, FHIRPackage.SUBSTANCE_POLYMER__REPEAT);
		}
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER__CLASS:
				return basicSetClass(null, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return ((InternalEList<?>)getCopolymerConnectivity()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return basicSetModification(null, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return ((InternalEList<?>)getMonomerSet()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER__REPEAT:
				return ((InternalEList<?>)getRepeat()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.SUBSTANCE_POLYMER__CLASS:
				return getClass_();
			case FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return getGeometry();
			case FHIRPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return getCopolymerConnectivity();
			case FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return getModification();
			case FHIRPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return getMonomerSet();
			case FHIRPackage.SUBSTANCE_POLYMER__REPEAT:
				return getRepeat();
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
			case FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__CLASS:
				setClass((CodeableConcept)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY:
				setGeometry((CodeableConcept)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				getCopolymerConnectivity().clear();
				getCopolymerConnectivity().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION:
				setModification((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				getMonomerSet().clear();
				getMonomerSet().addAll((Collection<? extends SubstancePolymerMonomerSet>)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__REPEAT:
				getRepeat().clear();
				getRepeat().addAll((Collection<? extends SubstancePolymerRepeat>)newValue);
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
			case FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__CLASS:
				setClass((CodeableConcept)null);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY:
				setGeometry((CodeableConcept)null);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				getCopolymerConnectivity().clear();
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION:
				setModification((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				getMonomerSet().clear();
				return;
			case FHIRPackage.SUBSTANCE_POLYMER__REPEAT:
				getRepeat().clear();
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
			case FHIRPackage.SUBSTANCE_POLYMER__IDENTIFIER:
				return identifier != null;
			case FHIRPackage.SUBSTANCE_POLYMER__CLASS:
				return class_ != null;
			case FHIRPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return geometry != null;
			case FHIRPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return copolymerConnectivity != null && !copolymerConnectivity.isEmpty();
			case FHIRPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return modification != null;
			case FHIRPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return monomerSet != null && !monomerSet.isEmpty();
			case FHIRPackage.SUBSTANCE_POLYMER__REPEAT:
				return repeat != null && !repeat.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerImpl
