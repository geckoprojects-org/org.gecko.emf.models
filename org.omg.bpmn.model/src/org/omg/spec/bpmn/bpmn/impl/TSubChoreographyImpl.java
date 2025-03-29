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
package org.omg.spec.bpmn.bpmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TArtifact;
import org.omg.spec.bpmn.bpmn.TFlowElement;
import org.omg.spec.bpmn.bpmn.TSubChoreography;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSub Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TSubChoreographyImpl#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TSubChoreographyImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TSubChoreographyImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TSubChoreographyImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSubChoreographyImpl extends TChoreographyActivityImpl implements TSubChoreography {
	/**
	 * The cached value of the '{@link #getFlowElementGroup() <em>Flow Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap flowElementGroup;

	/**
	 * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap artifactGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSubChoreographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTSubChoreography();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFlowElementGroup() {
		if (flowElementGroup == null) {
			flowElementGroup = new BasicFeatureMap(this, BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT_GROUP);
		}
		return flowElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFlowElement> getFlowElement() {
		return getFlowElementGroup().list(BPMNPackage.eINSTANCE.getTSubChoreography_FlowElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getArtifactGroup() {
		if (artifactGroup == null) {
			artifactGroup = new BasicFeatureMap(this, BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT_GROUP);
		}
		return artifactGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TArtifact> getArtifact() {
		return getArtifactGroup().list(BPMNPackage.eINSTANCE.getTSubChoreography_Artifact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
				return ((InternalEList<?>)getFlowElementGroup()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT:
				return ((InternalEList<?>)getFlowElement()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT_GROUP:
				return ((InternalEList<?>)getArtifactGroup()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT:
				return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
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
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
				if (coreType) return getFlowElementGroup();
				return ((FeatureMap.Internal)getFlowElementGroup()).getWrapper();
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT:
				return getFlowElement();
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT_GROUP:
				if (coreType) return getArtifactGroup();
				return ((FeatureMap.Internal)getArtifactGroup()).getWrapper();
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT:
				return getArtifact();
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
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
				((FeatureMap.Internal)getFlowElementGroup()).set(newValue);
				return;
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT:
				getFlowElement().clear();
				getFlowElement().addAll((Collection<? extends TFlowElement>)newValue);
				return;
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT_GROUP:
				((FeatureMap.Internal)getArtifactGroup()).set(newValue);
				return;
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends TArtifact>)newValue);
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
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
				getFlowElementGroup().clear();
				return;
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT:
				getFlowElement().clear();
				return;
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT_GROUP:
				getArtifactGroup().clear();
				return;
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT:
				getArtifact().clear();
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
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
				return flowElementGroup != null && !flowElementGroup.isEmpty();
			case BPMNPackage.TSUB_CHOREOGRAPHY__FLOW_ELEMENT:
				return !getFlowElement().isEmpty();
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT_GROUP:
				return artifactGroup != null && !artifactGroup.isEmpty();
			case BPMNPackage.TSUB_CHOREOGRAPHY__ARTIFACT:
				return !getArtifact().isEmpty();
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
		result.append(" (flowElementGroup: ");
		result.append(flowElementGroup);
		result.append(", artifactGroup: ");
		result.append(artifactGroup);
		result.append(')');
		return result.toString();
	}

} //TSubChoreographyImpl
