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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CommitsType;
import org.cyclonedx.schema.bom.ComponentsType2;
import org.cyclonedx.schema.bom.PatchesType;
import org.cyclonedx.schema.bom.PedigreeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedigree Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PedigreeTypeImpl#getAncestors <em>Ancestors</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PedigreeTypeImpl#getDescendants <em>Descendants</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PedigreeTypeImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PedigreeTypeImpl#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PedigreeTypeImpl#getPatches <em>Patches</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PedigreeTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PedigreeTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedigreeTypeImpl extends MinimalEObjectImpl.Container implements PedigreeType {
	/**
	 * The cached value of the '{@link #getAncestors() <em>Ancestors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncestors()
	 * @generated
	 * @ordered
	 */
	protected ComponentsType2 ancestors;

	/**
	 * The cached value of the '{@link #getDescendants() <em>Descendants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescendants()
	 * @generated
	 * @ordered
	 */
	protected ComponentsType2 descendants;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected ComponentsType2 variants;

	/**
	 * The cached value of the '{@link #getCommits() <em>Commits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommits()
	 * @generated
	 * @ordered
	 */
	protected CommitsType commits;

	/**
	 * The cached value of the '{@link #getPatches() <em>Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatches()
	 * @generated
	 * @ordered
	 */
	protected PatchesType patches;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedigreeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getPedigreeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType2 getAncestors() {
		return ancestors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAncestors(ComponentsType2 newAncestors, NotificationChain msgs) {
		ComponentsType2 oldAncestors = ancestors;
		ancestors = newAncestors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__ANCESTORS, oldAncestors, newAncestors);
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
	public void setAncestors(ComponentsType2 newAncestors) {
		if (newAncestors != ancestors) {
			NotificationChain msgs = null;
			if (ancestors != null)
				msgs = ((InternalEObject)ancestors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__ANCESTORS, null, msgs);
			if (newAncestors != null)
				msgs = ((InternalEObject)newAncestors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__ANCESTORS, null, msgs);
			msgs = basicSetAncestors(newAncestors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__ANCESTORS, newAncestors, newAncestors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType2 getDescendants() {
		return descendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescendants(ComponentsType2 newDescendants, NotificationChain msgs) {
		ComponentsType2 oldDescendants = descendants;
		descendants = newDescendants;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__DESCENDANTS, oldDescendants, newDescendants);
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
	public void setDescendants(ComponentsType2 newDescendants) {
		if (newDescendants != descendants) {
			NotificationChain msgs = null;
			if (descendants != null)
				msgs = ((InternalEObject)descendants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__DESCENDANTS, null, msgs);
			if (newDescendants != null)
				msgs = ((InternalEObject)newDescendants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__DESCENDANTS, null, msgs);
			msgs = basicSetDescendants(newDescendants, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__DESCENDANTS, newDescendants, newDescendants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType2 getVariants() {
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariants(ComponentsType2 newVariants, NotificationChain msgs) {
		ComponentsType2 oldVariants = variants;
		variants = newVariants;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__VARIANTS, oldVariants, newVariants);
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
	public void setVariants(ComponentsType2 newVariants) {
		if (newVariants != variants) {
			NotificationChain msgs = null;
			if (variants != null)
				msgs = ((InternalEObject)variants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__VARIANTS, null, msgs);
			if (newVariants != null)
				msgs = ((InternalEObject)newVariants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__VARIANTS, null, msgs);
			msgs = basicSetVariants(newVariants, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__VARIANTS, newVariants, newVariants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommitsType getCommits() {
		return commits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommits(CommitsType newCommits, NotificationChain msgs) {
		CommitsType oldCommits = commits;
		commits = newCommits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__COMMITS, oldCommits, newCommits);
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
	public void setCommits(CommitsType newCommits) {
		if (newCommits != commits) {
			NotificationChain msgs = null;
			if (commits != null)
				msgs = ((InternalEObject)commits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__COMMITS, null, msgs);
			if (newCommits != null)
				msgs = ((InternalEObject)newCommits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__COMMITS, null, msgs);
			msgs = basicSetCommits(newCommits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__COMMITS, newCommits, newCommits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatchesType getPatches() {
		return patches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatches(PatchesType newPatches, NotificationChain msgs) {
		PatchesType oldPatches = patches;
		patches = newPatches;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__PATCHES, oldPatches, newPatches);
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
	public void setPatches(PatchesType newPatches) {
		if (newPatches != patches) {
			NotificationChain msgs = null;
			if (patches != null)
				msgs = ((InternalEObject)patches).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__PATCHES, null, msgs);
			if (newPatches != null)
				msgs = ((InternalEObject)newPatches).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PEDIGREE_TYPE__PATCHES, null, msgs);
			msgs = basicSetPatches(newPatches, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__PATCHES, newPatches, newPatches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PEDIGREE_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.PEDIGREE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.PEDIGREE_TYPE__ANCESTORS:
				return basicSetAncestors(null, msgs);
			case BOMPackage.PEDIGREE_TYPE__DESCENDANTS:
				return basicSetDescendants(null, msgs);
			case BOMPackage.PEDIGREE_TYPE__VARIANTS:
				return basicSetVariants(null, msgs);
			case BOMPackage.PEDIGREE_TYPE__COMMITS:
				return basicSetCommits(null, msgs);
			case BOMPackage.PEDIGREE_TYPE__PATCHES:
				return basicSetPatches(null, msgs);
			case BOMPackage.PEDIGREE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.PEDIGREE_TYPE__ANCESTORS:
				return getAncestors();
			case BOMPackage.PEDIGREE_TYPE__DESCENDANTS:
				return getDescendants();
			case BOMPackage.PEDIGREE_TYPE__VARIANTS:
				return getVariants();
			case BOMPackage.PEDIGREE_TYPE__COMMITS:
				return getCommits();
			case BOMPackage.PEDIGREE_TYPE__PATCHES:
				return getPatches();
			case BOMPackage.PEDIGREE_TYPE__NOTES:
				return getNotes();
			case BOMPackage.PEDIGREE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case BOMPackage.PEDIGREE_TYPE__ANCESTORS:
				setAncestors((ComponentsType2)newValue);
				return;
			case BOMPackage.PEDIGREE_TYPE__DESCENDANTS:
				setDescendants((ComponentsType2)newValue);
				return;
			case BOMPackage.PEDIGREE_TYPE__VARIANTS:
				setVariants((ComponentsType2)newValue);
				return;
			case BOMPackage.PEDIGREE_TYPE__COMMITS:
				setCommits((CommitsType)newValue);
				return;
			case BOMPackage.PEDIGREE_TYPE__PATCHES:
				setPatches((PatchesType)newValue);
				return;
			case BOMPackage.PEDIGREE_TYPE__NOTES:
				setNotes((String)newValue);
				return;
			case BOMPackage.PEDIGREE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case BOMPackage.PEDIGREE_TYPE__ANCESTORS:
				setAncestors((ComponentsType2)null);
				return;
			case BOMPackage.PEDIGREE_TYPE__DESCENDANTS:
				setDescendants((ComponentsType2)null);
				return;
			case BOMPackage.PEDIGREE_TYPE__VARIANTS:
				setVariants((ComponentsType2)null);
				return;
			case BOMPackage.PEDIGREE_TYPE__COMMITS:
				setCommits((CommitsType)null);
				return;
			case BOMPackage.PEDIGREE_TYPE__PATCHES:
				setPatches((PatchesType)null);
				return;
			case BOMPackage.PEDIGREE_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case BOMPackage.PEDIGREE_TYPE__ANY:
				getAny().clear();
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
			case BOMPackage.PEDIGREE_TYPE__ANCESTORS:
				return ancestors != null;
			case BOMPackage.PEDIGREE_TYPE__DESCENDANTS:
				return descendants != null;
			case BOMPackage.PEDIGREE_TYPE__VARIANTS:
				return variants != null;
			case BOMPackage.PEDIGREE_TYPE__COMMITS:
				return commits != null;
			case BOMPackage.PEDIGREE_TYPE__PATCHES:
				return patches != null;
			case BOMPackage.PEDIGREE_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case BOMPackage.PEDIGREE_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (notes: ");
		result.append(notes);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //PedigreeTypeImpl
