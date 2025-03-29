/**
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
package org.omg.spec.bpmn.di.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.omg.spec.bpmn.di.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNDIFactoryImpl extends EFactoryImpl implements BPMNDIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPMNDIFactory init() {
		try {
			BPMNDIFactory theBPMNDIFactory = (BPMNDIFactory)EPackage.Registry.INSTANCE.getEFactory(BPMNDIPackage.eNS_URI);
			if (theBPMNDIFactory != null) {
				return theBPMNDIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPMNDIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BPMNDIPackage.BPMN_DIAGRAM: return createBPMNDiagram();
			case BPMNDIPackage.BPMN_EDGE: return createBPMNEdge();
			case BPMNDIPackage.BPMN_LABEL: return createBPMNLabel();
			case BPMNDIPackage.BPMN_LABEL_STYLE: return createBPMNLabelStyle();
			case BPMNDIPackage.BPMN_PLANE: return createBPMNPlane();
			case BPMNDIPackage.BPMN_SHAPE: return createBPMNShape();
			case BPMNDIPackage.BPMNDI_ROOT: return createBPMNDIRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BPMNDIPackage.MESSAGE_VISIBLE_KIND:
				return createMessageVisibleKindFromString(eDataType, initialValue);
			case BPMNDIPackage.PARTICIPANT_BAND_KIND:
				return createParticipantBandKindFromString(eDataType, initialValue);
			case BPMNDIPackage.MESSAGE_VISIBLE_KIND_OBJECT:
				return createMessageVisibleKindObjectFromString(eDataType, initialValue);
			case BPMNDIPackage.PARTICIPANT_BAND_KIND_OBJECT:
				return createParticipantBandKindObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BPMNDIPackage.MESSAGE_VISIBLE_KIND:
				return convertMessageVisibleKindToString(eDataType, instanceValue);
			case BPMNDIPackage.PARTICIPANT_BAND_KIND:
				return convertParticipantBandKindToString(eDataType, instanceValue);
			case BPMNDIPackage.MESSAGE_VISIBLE_KIND_OBJECT:
				return convertMessageVisibleKindObjectToString(eDataType, instanceValue);
			case BPMNDIPackage.PARTICIPANT_BAND_KIND_OBJECT:
				return convertParticipantBandKindObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNDiagram createBPMNDiagram() {
		BPMNDiagramImpl bpmnDiagram = new BPMNDiagramImpl();
		return bpmnDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNEdge createBPMNEdge() {
		BPMNEdgeImpl bpmnEdge = new BPMNEdgeImpl();
		return bpmnEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNLabel createBPMNLabel() {
		BPMNLabelImpl bpmnLabel = new BPMNLabelImpl();
		return bpmnLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNLabelStyle createBPMNLabelStyle() {
		BPMNLabelStyleImpl bpmnLabelStyle = new BPMNLabelStyleImpl();
		return bpmnLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNPlane createBPMNPlane() {
		BPMNPlaneImpl bpmnPlane = new BPMNPlaneImpl();
		return bpmnPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNShape createBPMNShape() {
		BPMNShapeImpl bpmnShape = new BPMNShapeImpl();
		return bpmnShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNDIRoot createBPMNDIRoot() {
		BPMNDIRootImpl bpmndiRoot = new BPMNDIRootImpl();
		return bpmndiRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageVisibleKind createMessageVisibleKindFromString(EDataType eDataType, String initialValue) {
		MessageVisibleKind result = MessageVisibleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageVisibleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantBandKind createParticipantBandKindFromString(EDataType eDataType, String initialValue) {
		ParticipantBandKind result = ParticipantBandKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantBandKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageVisibleKind createMessageVisibleKindObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageVisibleKindFromString(BPMNDIPackage.Literals.MESSAGE_VISIBLE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageVisibleKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageVisibleKindToString(BPMNDIPackage.Literals.MESSAGE_VISIBLE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantBandKind createParticipantBandKindObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipantBandKindFromString(BPMNDIPackage.Literals.PARTICIPANT_BAND_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantBandKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipantBandKindToString(BPMNDIPackage.Literals.PARTICIPANT_BAND_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNDIPackage getBPMNDIPackage() {
		return (BPMNDIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPMNDIPackage getPackage() {
		return BPMNDIPackage.eINSTANCE;
	}

} //BPMNDIFactoryImpl
