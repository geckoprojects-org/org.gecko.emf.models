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

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.AliasesType1;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.NotesType;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ReleaseNotesType;
import org.cyclonedx.schema.bom.ResolvesType;
import org.cyclonedx.schema.bom.TagsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release Notes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getFeaturedImage <em>Featured Image</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getSocialImage <em>Social Image</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ReleaseNotesTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseNotesTypeImpl extends MinimalEObjectImpl.Container implements ReleaseNotesType {
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
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseNotesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getReleaseNotesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BOMPackage.RELEASE_NOTES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getType() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Type());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTitle() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Title());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFeaturedImage() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_FeaturedImage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSocialImage() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_SocialImage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescription() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XMLGregorianCalendar> getTimestamp() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Timestamp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AliasesType1> getAliases() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Aliases());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TagsType> getTags() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Tags());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResolvesType> getResolves() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Resolves());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NotesType> getNotes() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Notes());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertiesType> getProperties() {
		return getGroup().list(BOMPackage.eINSTANCE.getReleaseNotesType_Properties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(BOMPackage.eINSTANCE.getReleaseNotesType_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.RELEASE_NOTES_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.RELEASE_NOTES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BOMPackage.RELEASE_NOTES_TYPE__ALIASES:
				return ((InternalEList<?>)getAliases()).basicRemove(otherEnd, msgs);
			case BOMPackage.RELEASE_NOTES_TYPE__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case BOMPackage.RELEASE_NOTES_TYPE__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case BOMPackage.RELEASE_NOTES_TYPE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case BOMPackage.RELEASE_NOTES_TYPE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case BOMPackage.RELEASE_NOTES_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.RELEASE_NOTES_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.RELEASE_NOTES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BOMPackage.RELEASE_NOTES_TYPE__TYPE:
				return getType();
			case BOMPackage.RELEASE_NOTES_TYPE__TITLE:
				return getTitle();
			case BOMPackage.RELEASE_NOTES_TYPE__FEATURED_IMAGE:
				return getFeaturedImage();
			case BOMPackage.RELEASE_NOTES_TYPE__SOCIAL_IMAGE:
				return getSocialImage();
			case BOMPackage.RELEASE_NOTES_TYPE__DESCRIPTION:
				return getDescription();
			case BOMPackage.RELEASE_NOTES_TYPE__TIMESTAMP:
				return getTimestamp();
			case BOMPackage.RELEASE_NOTES_TYPE__ALIASES:
				return getAliases();
			case BOMPackage.RELEASE_NOTES_TYPE__TAGS:
				return getTags();
			case BOMPackage.RELEASE_NOTES_TYPE__RESOLVES:
				return getResolves();
			case BOMPackage.RELEASE_NOTES_TYPE__NOTES:
				return getNotes();
			case BOMPackage.RELEASE_NOTES_TYPE__PROPERTIES:
				return getProperties();
			case BOMPackage.RELEASE_NOTES_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.RELEASE_NOTES_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case BOMPackage.RELEASE_NOTES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__FEATURED_IMAGE:
				getFeaturedImage().clear();
				getFeaturedImage().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__SOCIAL_IMAGE:
				getSocialImage().clear();
				getSocialImage().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__TIMESTAMP:
				getTimestamp().clear();
				getTimestamp().addAll((Collection<? extends XMLGregorianCalendar>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends AliasesType1>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends TagsType>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolvesType>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends NotesType>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertiesType>)newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case BOMPackage.RELEASE_NOTES_TYPE__GROUP:
				getGroup().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__TYPE:
				getType().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__TITLE:
				getTitle().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__FEATURED_IMAGE:
				getFeaturedImage().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__SOCIAL_IMAGE:
				getSocialImage().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__TIMESTAMP:
				getTimestamp().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__ALIASES:
				getAliases().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__TAGS:
				getTags().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__RESOLVES:
				getResolves().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__NOTES:
				getNotes().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__PROPERTIES:
				getProperties().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.RELEASE_NOTES_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case BOMPackage.RELEASE_NOTES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__TYPE:
				return !getType().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__TITLE:
				return !getTitle().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__FEATURED_IMAGE:
				return !getFeaturedImage().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__SOCIAL_IMAGE:
				return !getSocialImage().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__TIMESTAMP:
				return !getTimestamp().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__ALIASES:
				return !getAliases().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__TAGS:
				return !getTags().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__RESOLVES:
				return !getResolves().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__NOTES:
				return !getNotes().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__PROPERTIES:
				return !getProperties().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__ANY:
				return !getAny().isEmpty();
			case BOMPackage.RELEASE_NOTES_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ReleaseNotesTypeImpl
