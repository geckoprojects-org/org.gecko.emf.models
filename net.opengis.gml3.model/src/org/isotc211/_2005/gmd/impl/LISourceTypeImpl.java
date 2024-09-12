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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.EXExtentPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LIProcessStepPropertyType;
import org.isotc211._2005.gmd.LISourceType;
import org.isotc211._2005.gmd.MDReferenceSystemPropertyType;
import org.isotc211._2005.gmd.MDRepresentativeFractionPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LI Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.LISourceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LISourceTypeImpl#getScaleDenominator <em>Scale Denominator</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LISourceTypeImpl#getSourceReferenceSystem <em>Source Reference System</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LISourceTypeImpl#getSourceCitation <em>Source Citation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LISourceTypeImpl#getSourceExtent <em>Source Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LISourceTypeImpl#getSourceStep <em>Source Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LISourceTypeImpl extends AbstractObjectTypeImpl implements LISourceType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType description;

	/**
	 * The cached value of the '{@link #getScaleDenominator() <em>Scale Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected MDRepresentativeFractionPropertyType scaleDenominator;

	/**
	 * The cached value of the '{@link #getSourceReferenceSystem() <em>Source Reference System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReferenceSystem()
	 * @generated
	 * @ordered
	 */
	protected MDReferenceSystemPropertyType sourceReferenceSystem;

	/**
	 * The cached value of the '{@link #getSourceCitation() <em>Source Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCitation()
	 * @generated
	 * @ordered
	 */
	protected CICitationPropertyType sourceCitation;

	/**
	 * The cached value of the '{@link #getSourceExtent() <em>Source Extent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<EXExtentPropertyType> sourceExtent;

	/**
	 * The cached value of the '{@link #getSourceStep() <em>Source Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStep()
	 * @generated
	 * @ordered
	 */
	protected EList<LIProcessStepPropertyType> sourceStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LISourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getLISourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(CharacterStringPropertyType newDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LI_SOURCE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(CharacterStringPropertyType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_SOURCE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_SOURCE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LI_SOURCE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRepresentativeFractionPropertyType getScaleDenominator() {
		return scaleDenominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaleDenominator(MDRepresentativeFractionPropertyType newScaleDenominator, NotificationChain msgs) {
		MDRepresentativeFractionPropertyType oldScaleDenominator = scaleDenominator;
		scaleDenominator = newScaleDenominator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR, oldScaleDenominator, newScaleDenominator);
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
	public void setScaleDenominator(MDRepresentativeFractionPropertyType newScaleDenominator) {
		if (newScaleDenominator != scaleDenominator) {
			NotificationChain msgs = null;
			if (scaleDenominator != null)
				msgs = ((InternalEObject)scaleDenominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR, null, msgs);
			if (newScaleDenominator != null)
				msgs = ((InternalEObject)newScaleDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR, null, msgs);
			msgs = basicSetScaleDenominator(newScaleDenominator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR, newScaleDenominator, newScaleDenominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDReferenceSystemPropertyType getSourceReferenceSystem() {
		return sourceReferenceSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceReferenceSystem(MDReferenceSystemPropertyType newSourceReferenceSystem, NotificationChain msgs) {
		MDReferenceSystemPropertyType oldSourceReferenceSystem = sourceReferenceSystem;
		sourceReferenceSystem = newSourceReferenceSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM, oldSourceReferenceSystem, newSourceReferenceSystem);
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
	public void setSourceReferenceSystem(MDReferenceSystemPropertyType newSourceReferenceSystem) {
		if (newSourceReferenceSystem != sourceReferenceSystem) {
			NotificationChain msgs = null;
			if (sourceReferenceSystem != null)
				msgs = ((InternalEObject)sourceReferenceSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM, null, msgs);
			if (newSourceReferenceSystem != null)
				msgs = ((InternalEObject)newSourceReferenceSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM, null, msgs);
			msgs = basicSetSourceReferenceSystem(newSourceReferenceSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM, newSourceReferenceSystem, newSourceReferenceSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationPropertyType getSourceCitation() {
		return sourceCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceCitation(CICitationPropertyType newSourceCitation, NotificationChain msgs) {
		CICitationPropertyType oldSourceCitation = sourceCitation;
		sourceCitation = newSourceCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION, oldSourceCitation, newSourceCitation);
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
	public void setSourceCitation(CICitationPropertyType newSourceCitation) {
		if (newSourceCitation != sourceCitation) {
			NotificationChain msgs = null;
			if (sourceCitation != null)
				msgs = ((InternalEObject)sourceCitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION, null, msgs);
			if (newSourceCitation != null)
				msgs = ((InternalEObject)newSourceCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION, null, msgs);
			msgs = basicSetSourceCitation(newSourceCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION, newSourceCitation, newSourceCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EXExtentPropertyType> getSourceExtent() {
		if (sourceExtent == null) {
			sourceExtent = new EObjectContainmentEList<EXExtentPropertyType>(EXExtentPropertyType.class, this, GMDPackage.LI_SOURCE_TYPE__SOURCE_EXTENT);
		}
		return sourceExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LIProcessStepPropertyType> getSourceStep() {
		if (sourceStep == null) {
			sourceStep = new EObjectContainmentEList<LIProcessStepPropertyType>(LIProcessStepPropertyType.class, this, GMDPackage.LI_SOURCE_TYPE__SOURCE_STEP);
		}
		return sourceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.LI_SOURCE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR:
				return basicSetScaleDenominator(null, msgs);
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM:
				return basicSetSourceReferenceSystem(null, msgs);
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION:
				return basicSetSourceCitation(null, msgs);
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_EXTENT:
				return ((InternalEList<?>)getSourceExtent()).basicRemove(otherEnd, msgs);
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_STEP:
				return ((InternalEList<?>)getSourceStep()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.LI_SOURCE_TYPE__DESCRIPTION:
				return getDescription();
			case GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR:
				return getScaleDenominator();
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM:
				return getSourceReferenceSystem();
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION:
				return getSourceCitation();
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_EXTENT:
				return getSourceExtent();
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_STEP:
				return getSourceStep();
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
			case GMDPackage.LI_SOURCE_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR:
				setScaleDenominator((MDRepresentativeFractionPropertyType)newValue);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM:
				setSourceReferenceSystem((MDReferenceSystemPropertyType)newValue);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION:
				setSourceCitation((CICitationPropertyType)newValue);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_EXTENT:
				getSourceExtent().clear();
				getSourceExtent().addAll((Collection<? extends EXExtentPropertyType>)newValue);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_STEP:
				getSourceStep().clear();
				getSourceStep().addAll((Collection<? extends LIProcessStepPropertyType>)newValue);
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
			case GMDPackage.LI_SOURCE_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR:
				setScaleDenominator((MDRepresentativeFractionPropertyType)null);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM:
				setSourceReferenceSystem((MDReferenceSystemPropertyType)null);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION:
				setSourceCitation((CICitationPropertyType)null);
				return;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_EXTENT:
				getSourceExtent().clear();
				return;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_STEP:
				getSourceStep().clear();
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
			case GMDPackage.LI_SOURCE_TYPE__DESCRIPTION:
				return description != null;
			case GMDPackage.LI_SOURCE_TYPE__SCALE_DENOMINATOR:
				return scaleDenominator != null;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_REFERENCE_SYSTEM:
				return sourceReferenceSystem != null;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_CITATION:
				return sourceCitation != null;
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_EXTENT:
				return sourceExtent != null && !sourceExtent.isEmpty();
			case GMDPackage.LI_SOURCE_TYPE__SOURCE_STEP:
				return sourceStep != null && !sourceStep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LISourceTypeImpl
