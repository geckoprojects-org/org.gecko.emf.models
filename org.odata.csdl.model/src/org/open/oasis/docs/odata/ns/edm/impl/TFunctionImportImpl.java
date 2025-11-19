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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.odata.ns.edm.AnnotationType;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;
import org.open.oasis.docs.odata.ns.edm.TFunctionImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFunction Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImportImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImportImpl#getEntitySet <em>Entity Set</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImportImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImportImpl#isIncludeInServiceDocument <em>Include In Service Document</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImportImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFunctionImportImpl extends MinimalEObjectImpl.Container implements TFunctionImport {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationType> annotation;

	/**
	 * The default value of the '{@link #getEntitySet() <em>Entity Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySet()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitySet() <em>Entity Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySet()
	 * @generated
	 * @ordered
	 */
	protected String entitySet = ENTITY_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeInServiceDocument() <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInServiceDocument()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeInServiceDocument() <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInServiceDocument()
	 * @generated
	 * @ordered
	 */
	protected boolean includeInServiceDocument = INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT;

	/**
	 * This is true if the Include In Service Document attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeInServiceDocumentESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFunctionImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTFunctionImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TFUNCTION_IMPORT__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntitySet() {
		return entitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySet(String newEntitySet) {
		String oldEntitySet = entitySet;
		entitySet = newEntitySet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION_IMPORT__ENTITY_SET, oldEntitySet, entitySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION_IMPORT__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeInServiceDocument() {
		return includeInServiceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInServiceDocument(boolean newIncludeInServiceDocument) {
		boolean oldIncludeInServiceDocument = includeInServiceDocument;
		includeInServiceDocument = newIncludeInServiceDocument;
		boolean oldIncludeInServiceDocumentESet = includeInServiceDocumentESet;
		includeInServiceDocumentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION_IMPORT__INCLUDE_IN_SERVICE_DOCUMENT, oldIncludeInServiceDocument, includeInServiceDocument, !oldIncludeInServiceDocumentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIncludeInServiceDocument() {
		boolean oldIncludeInServiceDocument = includeInServiceDocument;
		boolean oldIncludeInServiceDocumentESet = includeInServiceDocumentESet;
		includeInServiceDocument = INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT;
		includeInServiceDocumentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TFUNCTION_IMPORT__INCLUDE_IN_SERVICE_DOCUMENT, oldIncludeInServiceDocument, INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT, oldIncludeInServiceDocumentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIncludeInServiceDocument() {
		return includeInServiceDocumentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION_IMPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TFUNCTION_IMPORT__ANNOTATION:
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
			case EdmPackage.TFUNCTION_IMPORT__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TFUNCTION_IMPORT__ENTITY_SET:
				return getEntitySet();
			case EdmPackage.TFUNCTION_IMPORT__FUNCTION:
				return getFunction();
			case EdmPackage.TFUNCTION_IMPORT__INCLUDE_IN_SERVICE_DOCUMENT:
				return isIncludeInServiceDocument();
			case EdmPackage.TFUNCTION_IMPORT__NAME:
				return getName();
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
			case EdmPackage.TFUNCTION_IMPORT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TFUNCTION_IMPORT__ENTITY_SET:
				setEntitySet((String)newValue);
				return;
			case EdmPackage.TFUNCTION_IMPORT__FUNCTION:
				setFunction((String)newValue);
				return;
			case EdmPackage.TFUNCTION_IMPORT__INCLUDE_IN_SERVICE_DOCUMENT:
				setIncludeInServiceDocument((Boolean)newValue);
				return;
			case EdmPackage.TFUNCTION_IMPORT__NAME:
				setName((String)newValue);
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
			case EdmPackage.TFUNCTION_IMPORT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TFUNCTION_IMPORT__ENTITY_SET:
				setEntitySet(ENTITY_SET_EDEFAULT);
				return;
			case EdmPackage.TFUNCTION_IMPORT__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case EdmPackage.TFUNCTION_IMPORT__INCLUDE_IN_SERVICE_DOCUMENT:
				unsetIncludeInServiceDocument();
				return;
			case EdmPackage.TFUNCTION_IMPORT__NAME:
				setName(NAME_EDEFAULT);
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
			case EdmPackage.TFUNCTION_IMPORT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EdmPackage.TFUNCTION_IMPORT__ENTITY_SET:
				return ENTITY_SET_EDEFAULT == null ? entitySet != null : !ENTITY_SET_EDEFAULT.equals(entitySet);
			case EdmPackage.TFUNCTION_IMPORT__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case EdmPackage.TFUNCTION_IMPORT__INCLUDE_IN_SERVICE_DOCUMENT:
				return isSetIncludeInServiceDocument();
			case EdmPackage.TFUNCTION_IMPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (entitySet: ");
		result.append(entitySet);
		result.append(", function: ");
		result.append(function);
		result.append(", includeInServiceDocument: ");
		if (includeInServiceDocumentESet) result.append(includeInServiceDocument); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TFunctionImportImpl
