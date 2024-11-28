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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

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

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.Label;
import org.emau.icmvc.ganimed.ttp.cm2.QCProblemType;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QC Problem Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QCProblemTypeImpl#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QCProblemTypeImpl extends MinimalEObjectImpl.Container implements QCProblemType {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> label;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final QcProblemTypeError ERROR_EDEFAULT = QcProblemTypeError.MISSING;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected QcProblemTypeError error = ERROR_EDEFAULT;

	/**
	 * This is true if the Error attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorESet;

	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final QcProblemTypeField FIELD_EDEFAULT = QcProblemTypeField.TEMPLATENAME;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected QcProblemTypeField field = FIELD_EDEFAULT;

	/**
	 * This is true if the Field attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final QcProblemTypeOccurrence OCCURRENCE_EDEFAULT = QcProblemTypeOccurrence.PAPER;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected QcProblemTypeOccurrence occurrence = OCCURRENCE_EDEFAULT;

	/**
	 * This is true if the Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean occurrenceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QCProblemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getQCProblemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<Label>(Label.class, this, Cm2Package.QC_PROBLEM_TYPE__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_TYPE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcProblemTypeError getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setError(QcProblemTypeError newError) {
		QcProblemTypeError oldError = error;
		error = newError == null ? ERROR_EDEFAULT : newError;
		boolean oldErrorESet = errorESet;
		errorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_TYPE__ERROR, oldError, error, !oldErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetError() {
		QcProblemTypeError oldError = error;
		boolean oldErrorESet = errorESet;
		error = ERROR_EDEFAULT;
		errorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.QC_PROBLEM_TYPE__ERROR, oldError, ERROR_EDEFAULT, oldErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetError() {
		return errorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcProblemTypeField getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(QcProblemTypeField newField) {
		QcProblemTypeField oldField = field;
		field = newField == null ? FIELD_EDEFAULT : newField;
		boolean oldFieldESet = fieldESet;
		fieldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_TYPE__FIELD, oldField, field, !oldFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetField() {
		QcProblemTypeField oldField = field;
		boolean oldFieldESet = fieldESet;
		field = FIELD_EDEFAULT;
		fieldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.QC_PROBLEM_TYPE__FIELD, oldField, FIELD_EDEFAULT, oldFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetField() {
		return fieldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcProblemTypeOccurrence getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurrence(QcProblemTypeOccurrence newOccurrence) {
		QcProblemTypeOccurrence oldOccurrence = occurrence;
		occurrence = newOccurrence == null ? OCCURRENCE_EDEFAULT : newOccurrence;
		boolean oldOccurrenceESet = occurrenceESet;
		occurrenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_TYPE__OCCURRENCE, oldOccurrence, occurrence, !oldOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOccurrence() {
		QcProblemTypeOccurrence oldOccurrence = occurrence;
		boolean oldOccurrenceESet = occurrenceESet;
		occurrence = OCCURRENCE_EDEFAULT;
		occurrenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.QC_PROBLEM_TYPE__OCCURRENCE, oldOccurrence, OCCURRENCE_EDEFAULT, oldOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOccurrence() {
		return occurrenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.QC_PROBLEM_TYPE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.QC_PROBLEM_TYPE__LABEL:
				return getLabel();
			case Cm2Package.QC_PROBLEM_TYPE__ACTION:
				return getAction();
			case Cm2Package.QC_PROBLEM_TYPE__ERROR:
				return getError();
			case Cm2Package.QC_PROBLEM_TYPE__FIELD:
				return getField();
			case Cm2Package.QC_PROBLEM_TYPE__ID:
				return getId();
			case Cm2Package.QC_PROBLEM_TYPE__OCCURRENCE:
				return getOccurrence();
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
			case Cm2Package.QC_PROBLEM_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends Label>)newValue);
				return;
			case Cm2Package.QC_PROBLEM_TYPE__ACTION:
				setAction((String)newValue);
				return;
			case Cm2Package.QC_PROBLEM_TYPE__ERROR:
				setError((QcProblemTypeError)newValue);
				return;
			case Cm2Package.QC_PROBLEM_TYPE__FIELD:
				setField((QcProblemTypeField)newValue);
				return;
			case Cm2Package.QC_PROBLEM_TYPE__ID:
				setId((String)newValue);
				return;
			case Cm2Package.QC_PROBLEM_TYPE__OCCURRENCE:
				setOccurrence((QcProblemTypeOccurrence)newValue);
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
			case Cm2Package.QC_PROBLEM_TYPE__LABEL:
				getLabel().clear();
				return;
			case Cm2Package.QC_PROBLEM_TYPE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case Cm2Package.QC_PROBLEM_TYPE__ERROR:
				unsetError();
				return;
			case Cm2Package.QC_PROBLEM_TYPE__FIELD:
				unsetField();
				return;
			case Cm2Package.QC_PROBLEM_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Cm2Package.QC_PROBLEM_TYPE__OCCURRENCE:
				unsetOccurrence();
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
			case Cm2Package.QC_PROBLEM_TYPE__LABEL:
				return label != null && !label.isEmpty();
			case Cm2Package.QC_PROBLEM_TYPE__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case Cm2Package.QC_PROBLEM_TYPE__ERROR:
				return isSetError();
			case Cm2Package.QC_PROBLEM_TYPE__FIELD:
				return isSetField();
			case Cm2Package.QC_PROBLEM_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Cm2Package.QC_PROBLEM_TYPE__OCCURRENCE:
				return isSetOccurrence();
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
		result.append(" (action: ");
		result.append(action);
		result.append(", error: ");
		if (errorESet) result.append(error); else result.append("<unset>");
		result.append(", field: ");
		if (fieldESet) result.append(field); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", occurrence: ");
		if (occurrenceESet) result.append(occurrence); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QCProblemTypeImpl
