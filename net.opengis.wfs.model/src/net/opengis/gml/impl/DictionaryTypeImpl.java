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
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.DictionaryEntryType;
import net.opengis.gml.DictionaryType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.IndirectEntryType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.DictionaryTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DictionaryTypeImpl#getDictionaryEntryGroup <em>Dictionary Entry Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DictionaryTypeImpl#getDictionaryEntry <em>Dictionary Entry</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DictionaryTypeImpl#getIndirectEntry <em>Indirect Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DictionaryTypeImpl extends DefinitionTypeImpl implements DictionaryType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDictionaryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.DICTIONARY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDictionaryEntryGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getDictionaryType_DictionaryEntryGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DictionaryEntryType> getDictionaryEntry() {
		return getDictionaryEntryGroup().list(GMLPackage.eINSTANCE.getDictionaryType_DictionaryEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndirectEntryType> getIndirectEntry() {
		return getGroup().list(GMLPackage.eINSTANCE.getDictionaryType_IndirectEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				return ((InternalEList<?>)getDictionaryEntryGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				return ((InternalEList<?>)getDictionaryEntry()).basicRemove(otherEnd, msgs);
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				return ((InternalEList<?>)getIndirectEntry()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				if (coreType) return getDictionaryEntryGroup();
				return ((FeatureMap.Internal)getDictionaryEntryGroup()).getWrapper();
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				return getDictionaryEntry();
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				return getIndirectEntry();
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
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				((FeatureMap.Internal)getDictionaryEntryGroup()).set(newValue);
				return;
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				getDictionaryEntry().clear();
				getDictionaryEntry().addAll((Collection<? extends DictionaryEntryType>)newValue);
				return;
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				getIndirectEntry().clear();
				getIndirectEntry().addAll((Collection<? extends IndirectEntryType>)newValue);
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
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				getDictionaryEntryGroup().clear();
				return;
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				getDictionaryEntry().clear();
				return;
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				getIndirectEntry().clear();
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
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				return !getDictionaryEntryGroup().isEmpty();
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				return !getDictionaryEntry().isEmpty();
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				return !getIndirectEntry().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //DictionaryTypeImpl
