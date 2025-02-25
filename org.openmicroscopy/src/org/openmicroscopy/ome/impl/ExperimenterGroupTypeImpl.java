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
package org.openmicroscopy.ome.impl;

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

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.ExperimenterGroupType;
import org.openmicroscopy.ome.ExperimenterRefType;
import org.openmicroscopy.ome.LeaderType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimenter Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimenterGroupTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimenterGroupTypeImpl#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimenterGroupTypeImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimenterGroupTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimenterGroupTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimenterGroupTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimenterGroupTypeImpl extends MinimalEObjectImpl.Container implements ExperimenterGroupType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExperimenterRef() <em>Experimenter Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimenterRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimenterRefType> experimenterRef;

	/**
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected EList<LeaderType> leader;

	/**
	 * The cached value of the '{@link #getAnnotationRef() <em>Annotation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationRefType> annotationRef;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

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
	protected ExperimenterGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getExperimenterGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXPERIMENTER_GROUP_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExperimenterRefType> getExperimenterRef() {
		if (experimenterRef == null) {
			experimenterRef = new EObjectContainmentEList<ExperimenterRefType>(ExperimenterRefType.class, this, OMEPackage.EXPERIMENTER_GROUP_TYPE__EXPERIMENTER_REF);
		}
		return experimenterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LeaderType> getLeader() {
		if (leader == null) {
			leader = new EObjectContainmentEList<LeaderType>(LeaderType.class, this, OMEPackage.EXPERIMENTER_GROUP_TYPE__LEADER);
		}
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.EXPERIMENTER_GROUP_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXPERIMENTER_GROUP_TYPE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXPERIMENTER_GROUP_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__EXPERIMENTER_REF:
				return ((InternalEList<?>)getExperimenterRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__LEADER:
				return ((InternalEList<?>)getLeader()).basicRemove(otherEnd, msgs);
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__DESCRIPTION:
				return getDescription();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__EXPERIMENTER_REF:
				return getExperimenterRef();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__LEADER:
				return getLeader();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ID:
				return getID();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__NAME:
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
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__EXPERIMENTER_REF:
				getExperimenterRef().clear();
				getExperimenterRef().addAll((Collection<? extends ExperimenterRefType>)newValue);
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__LEADER:
				getLeader().clear();
				getLeader().addAll((Collection<? extends LeaderType>)newValue);
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__NAME:
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
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__EXPERIMENTER_REF:
				getExperimenterRef().clear();
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__LEADER:
				getLeader().clear();
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__NAME:
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
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__EXPERIMENTER_REF:
				return experimenterRef != null && !experimenterRef.isEmpty();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__LEADER:
				return leader != null && !leader.isEmpty();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.EXPERIMENTER_GROUP_TYPE__NAME:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ExperimenterGroupTypeImpl
