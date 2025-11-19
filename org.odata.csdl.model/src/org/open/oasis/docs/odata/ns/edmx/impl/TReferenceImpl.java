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
package org.open.oasis.docs.odata.ns.edmx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.odata.ns.edm.AnnotationType;

import org.open.oasis.docs.odata.ns.edmx.EdmxPackage;
import org.open.oasis.docs.odata.ns.edmx.TInclude;
import org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations;
import org.open.oasis.docs.odata.ns.edmx.TReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl#getIncludeAnnotations <em>Include Annotations</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TReferenceImpl extends MinimalEObjectImpl.Container implements TReference {
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
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmxPackage.Literals.TREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmxPackage.TREFERENCE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInclude> getInclude() {
		return getGroup().list(EdmxPackage.Literals.TREFERENCE__INCLUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TIncludeAnnotations> getIncludeAnnotations() {
		return getGroup().list(EdmxPackage.Literals.TREFERENCE__INCLUDE_ANNOTATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmxPackage.Literals.TREFERENCE__ANNOTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmxPackage.TREFERENCE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmxPackage.TREFERENCE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmxPackage.TREFERENCE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case EdmxPackage.TREFERENCE__INCLUDE_ANNOTATIONS:
				return ((InternalEList<?>)getIncludeAnnotations()).basicRemove(otherEnd, msgs);
			case EdmxPackage.TREFERENCE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case EdmxPackage.TREFERENCE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmxPackage.TREFERENCE__INCLUDE:
				return getInclude();
			case EdmxPackage.TREFERENCE__INCLUDE_ANNOTATIONS:
				return getIncludeAnnotations();
			case EdmxPackage.TREFERENCE__ANNOTATION:
				return getAnnotation();
			case EdmxPackage.TREFERENCE__URI:
				return getUri();
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
			case EdmxPackage.TREFERENCE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmxPackage.TREFERENCE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends TInclude>)newValue);
				return;
			case EdmxPackage.TREFERENCE__INCLUDE_ANNOTATIONS:
				getIncludeAnnotations().clear();
				getIncludeAnnotations().addAll((Collection<? extends TIncludeAnnotations>)newValue);
				return;
			case EdmxPackage.TREFERENCE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmxPackage.TREFERENCE__URI:
				setUri((String)newValue);
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
			case EdmxPackage.TREFERENCE__GROUP:
				getGroup().clear();
				return;
			case EdmxPackage.TREFERENCE__INCLUDE:
				getInclude().clear();
				return;
			case EdmxPackage.TREFERENCE__INCLUDE_ANNOTATIONS:
				getIncludeAnnotations().clear();
				return;
			case EdmxPackage.TREFERENCE__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmxPackage.TREFERENCE__URI:
				setUri(URI_EDEFAULT);
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
			case EdmxPackage.TREFERENCE__GROUP:
				return group != null && !group.isEmpty();
			case EdmxPackage.TREFERENCE__INCLUDE:
				return !getInclude().isEmpty();
			case EdmxPackage.TREFERENCE__INCLUDE_ANNOTATIONS:
				return !getIncludeAnnotations().isEmpty();
			case EdmxPackage.TREFERENCE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmxPackage.TREFERENCE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //TReferenceImpl
