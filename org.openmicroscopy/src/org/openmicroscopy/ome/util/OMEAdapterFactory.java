/**
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
package org.openmicroscopy.ome.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openmicroscopy.ome.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage
 * @generated
 */
public class OMEAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OMEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMEAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OMEPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMESwitch<Adapter> modelSwitch =
		new OMESwitch<Adapter>() {
			@Override
			public Adapter caseAffineTransform(AffineTransform object) {
				return createAffineTransformAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationRefType(AnnotationRefType object) {
				return createAnnotationRefTypeAdapter();
			}
			@Override
			public Adapter caseArcType(ArcType object) {
				return createArcTypeAdapter();
			}
			@Override
			public Adapter caseBasicAnnotation(BasicAnnotation object) {
				return createBasicAnnotationAdapter();
			}
			@Override
			public Adapter caseBinaryFileType(BinaryFileType object) {
				return createBinaryFileTypeAdapter();
			}
			@Override
			public Adapter caseBinaryOnlyType(BinaryOnlyType object) {
				return createBinaryOnlyTypeAdapter();
			}
			@Override
			public Adapter caseBinDataType(BinDataType object) {
				return createBinDataTypeAdapter();
			}
			@Override
			public Adapter caseBooleanAnnotationType(BooleanAnnotationType object) {
				return createBooleanAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseChannelRefType(ChannelRefType object) {
				return createChannelRefTypeAdapter();
			}
			@Override
			public Adapter caseChannelType(ChannelType object) {
				return createChannelTypeAdapter();
			}
			@Override
			public Adapter caseCommentAnnotationType(CommentAnnotationType object) {
				return createCommentAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseDatasetRefType(DatasetRefType object) {
				return createDatasetRefTypeAdapter();
			}
			@Override
			public Adapter caseDatasetType(DatasetType object) {
				return createDatasetTypeAdapter();
			}
			@Override
			public Adapter caseDetectorSettingsType(DetectorSettingsType object) {
				return createDetectorSettingsTypeAdapter();
			}
			@Override
			public Adapter caseDetectorType(DetectorType object) {
				return createDetectorTypeAdapter();
			}
			@Override
			public Adapter caseDichroicRefType(DichroicRefType object) {
				return createDichroicRefTypeAdapter();
			}
			@Override
			public Adapter caseDichroicType(DichroicType object) {
				return createDichroicTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoubleAnnotationType(DoubleAnnotationType object) {
				return createDoubleAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseEllipseType(EllipseType object) {
				return createEllipseTypeAdapter();
			}
			@Override
			public Adapter caseExperimenterGroupRefType(ExperimenterGroupRefType object) {
				return createExperimenterGroupRefTypeAdapter();
			}
			@Override
			public Adapter caseExperimenterGroupType(ExperimenterGroupType object) {
				return createExperimenterGroupTypeAdapter();
			}
			@Override
			public Adapter caseExperimenterRefType(ExperimenterRefType object) {
				return createExperimenterRefTypeAdapter();
			}
			@Override
			public Adapter caseExperimenterType(ExperimenterType object) {
				return createExperimenterTypeAdapter();
			}
			@Override
			public Adapter caseExperimentRefType(ExperimentRefType object) {
				return createExperimentRefTypeAdapter();
			}
			@Override
			public Adapter caseExperimentType(ExperimentType object) {
				return createExperimentTypeAdapter();
			}
			@Override
			public Adapter caseExternalType(ExternalType object) {
				return createExternalTypeAdapter();
			}
			@Override
			public Adapter caseFilamentType(FilamentType object) {
				return createFilamentTypeAdapter();
			}
			@Override
			public Adapter caseFileAnnotationType(FileAnnotationType object) {
				return createFileAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseFilterRef(FilterRef object) {
				return createFilterRefAdapter();
			}
			@Override
			public Adapter caseFilterSetRefType(FilterSetRefType object) {
				return createFilterSetRefTypeAdapter();
			}
			@Override
			public Adapter caseFilterSetType(FilterSetType object) {
				return createFilterSetTypeAdapter();
			}
			@Override
			public Adapter caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			@Override
			public Adapter caseFolderRefType(FolderRefType object) {
				return createFolderRefTypeAdapter();
			}
			@Override
			public Adapter caseFolderType(FolderType object) {
				return createFolderTypeAdapter();
			}
			@Override
			public Adapter caseGenericExcitationSourceType(GenericExcitationSourceType object) {
				return createGenericExcitationSourceTypeAdapter();
			}
			@Override
			public Adapter caseImageRefType(ImageRefType object) {
				return createImageRefTypeAdapter();
			}
			@Override
			public Adapter caseImageType(ImageType object) {
				return createImageTypeAdapter();
			}
			@Override
			public Adapter caseImagingEnvironmentType(ImagingEnvironmentType object) {
				return createImagingEnvironmentTypeAdapter();
			}
			@Override
			public Adapter caseInstrumentRefType(InstrumentRefType object) {
				return createInstrumentRefTypeAdapter();
			}
			@Override
			public Adapter caseInstrumentType(InstrumentType object) {
				return createInstrumentTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLaserType(LaserType object) {
				return createLaserTypeAdapter();
			}
			@Override
			public Adapter caseLeaderType(LeaderType object) {
				return createLeaderTypeAdapter();
			}
			@Override
			public Adapter caseLightEmittingDiodeType(LightEmittingDiodeType object) {
				return createLightEmittingDiodeTypeAdapter();
			}
			@Override
			public Adapter caseLightPathType(LightPathType object) {
				return createLightPathTypeAdapter();
			}
			@Override
			public Adapter caseLightSource(LightSource object) {
				return createLightSourceAdapter();
			}
			@Override
			public Adapter caseLightSourceSettingsType(LightSourceSettingsType object) {
				return createLightSourceSettingsTypeAdapter();
			}
			@Override
			public Adapter caseLineType(LineType object) {
				return createLineTypeAdapter();
			}
			@Override
			public Adapter caseListAnnotationType(ListAnnotationType object) {
				return createListAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseLongAnnotationType(LongAnnotationType object) {
				return createLongAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseManufacturerSpec(ManufacturerSpec object) {
				return createManufacturerSpecAdapter();
			}
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseMapAnnotationType(MapAnnotationType object) {
				return createMapAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseMaskType(MaskType object) {
				return createMaskTypeAdapter();
			}
			@Override
			public Adapter caseMicrobeamManipulationRefType(MicrobeamManipulationRefType object) {
				return createMicrobeamManipulationRefTypeAdapter();
			}
			@Override
			public Adapter caseMicrobeamManipulationType(MicrobeamManipulationType object) {
				return createMicrobeamManipulationTypeAdapter();
			}
			@Override
			public Adapter caseMicroscopeType(MicroscopeType object) {
				return createMicroscopeTypeAdapter();
			}
			@Override
			public Adapter caseMType(MType object) {
				return createMTypeAdapter();
			}
			@Override
			public Adapter caseNumericAnnotation(NumericAnnotation object) {
				return createNumericAnnotationAdapter();
			}
			@Override
			public Adapter caseObjectiveSettingsType(ObjectiveSettingsType object) {
				return createObjectiveSettingsTypeAdapter();
			}
			@Override
			public Adapter caseObjectiveType(ObjectiveType object) {
				return createObjectiveTypeAdapter();
			}
			@Override
			public Adapter caseOMEType(OMEType object) {
				return createOMETypeAdapter();
			}
			@Override
			public Adapter casePixelsType(PixelsType object) {
				return createPixelsTypeAdapter();
			}
			@Override
			public Adapter casePlaneType(PlaneType object) {
				return createPlaneTypeAdapter();
			}
			@Override
			public Adapter casePlateAcquisitionType(PlateAcquisitionType object) {
				return createPlateAcquisitionTypeAdapter();
			}
			@Override
			public Adapter casePlateRefType(PlateRefType object) {
				return createPlateRefTypeAdapter();
			}
			@Override
			public Adapter casePlateType(PlateType object) {
				return createPlateTypeAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePolygonType(PolygonType object) {
				return createPolygonTypeAdapter();
			}
			@Override
			public Adapter casePolylineType(PolylineType object) {
				return createPolylineTypeAdapter();
			}
			@Override
			public Adapter caseProjectRefType(ProjectRefType object) {
				return createProjectRefTypeAdapter();
			}
			@Override
			public Adapter caseProjectType(ProjectType object) {
				return createProjectTypeAdapter();
			}
			@Override
			public Adapter casePumpType(PumpType object) {
				return createPumpTypeAdapter();
			}
			@Override
			public Adapter caseReagentRefType(ReagentRefType object) {
				return createReagentRefTypeAdapter();
			}
			@Override
			public Adapter caseReagentType(ReagentType object) {
				return createReagentTypeAdapter();
			}
			@Override
			public Adapter caseRectangleType(RectangleType object) {
				return createRectangleTypeAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseRightsType(RightsType object) {
				return createRightsTypeAdapter();
			}
			@Override
			public Adapter caseROIRefType(ROIRefType object) {
				return createROIRefTypeAdapter();
			}
			@Override
			public Adapter caseROIType(ROIType object) {
				return createROITypeAdapter();
			}
			@Override
			public Adapter caseScreenType(ScreenType object) {
				return createScreenTypeAdapter();
			}
			@Override
			public Adapter caseSettings(Settings object) {
				return createSettingsAdapter();
			}
			@Override
			public Adapter caseShape(Shape object) {
				return createShapeAdapter();
			}
			@Override
			public Adapter caseStageLabelType(StageLabelType object) {
				return createStageLabelTypeAdapter();
			}
			@Override
			public Adapter caseStructuredAnnotationsType(StructuredAnnotationsType object) {
				return createStructuredAnnotationsTypeAdapter();
			}
			@Override
			public Adapter caseTagAnnotationType(TagAnnotationType object) {
				return createTagAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseTermAnnotationType(TermAnnotationType object) {
				return createTermAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseTextAnnotation(TextAnnotation object) {
				return createTextAnnotationAdapter();
			}
			@Override
			public Adapter caseTiffDataType(TiffDataType object) {
				return createTiffDataTypeAdapter();
			}
			@Override
			public Adapter caseTimestampAnnotationType(TimestampAnnotationType object) {
				return createTimestampAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseTransmittanceRangeType(TransmittanceRangeType object) {
				return createTransmittanceRangeTypeAdapter();
			}
			@Override
			public Adapter caseTypeAnnotation(TypeAnnotation object) {
				return createTypeAnnotationAdapter();
			}
			@Override
			public Adapter caseUnionType(UnionType object) {
				return createUnionTypeAdapter();
			}
			@Override
			public Adapter caseUUIDType(UUIDType object) {
				return createUUIDTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseWellSampleRefType(WellSampleRefType object) {
				return createWellSampleRefTypeAdapter();
			}
			@Override
			public Adapter caseWellSampleType(WellSampleType object) {
				return createWellSampleTypeAdapter();
			}
			@Override
			public Adapter caseWellType(WellType object) {
				return createWellTypeAdapter();
			}
			@Override
			public Adapter caseXMLAnnotationType(XMLAnnotationType object) {
				return createXMLAnnotationTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.AffineTransform <em>Affine Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.AffineTransform
	 * @generated
	 */
	public Adapter createAffineTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.AnnotationRefType <em>Annotation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.AnnotationRefType
	 * @generated
	 */
	public Adapter createAnnotationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ArcType
	 * @generated
	 */
	public Adapter createArcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.BasicAnnotation <em>Basic Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.BasicAnnotation
	 * @generated
	 */
	public Adapter createBasicAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.BinaryFileType <em>Binary File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.BinaryFileType
	 * @generated
	 */
	public Adapter createBinaryFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.BinaryOnlyType <em>Binary Only Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.BinaryOnlyType
	 * @generated
	 */
	public Adapter createBinaryOnlyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.BinDataType <em>Bin Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.BinDataType
	 * @generated
	 */
	public Adapter createBinDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.BooleanAnnotationType <em>Boolean Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.BooleanAnnotationType
	 * @generated
	 */
	public Adapter createBooleanAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ChannelRefType <em>Channel Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ChannelRefType
	 * @generated
	 */
	public Adapter createChannelRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ChannelType
	 * @generated
	 */
	public Adapter createChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.CommentAnnotationType <em>Comment Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.CommentAnnotationType
	 * @generated
	 */
	public Adapter createCommentAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.DatasetRefType <em>Dataset Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.DatasetRefType
	 * @generated
	 */
	public Adapter createDatasetRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.DatasetType
	 * @generated
	 */
	public Adapter createDatasetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.DetectorSettingsType <em>Detector Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.DetectorSettingsType
	 * @generated
	 */
	public Adapter createDetectorSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.DetectorType <em>Detector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.DetectorType
	 * @generated
	 */
	public Adapter createDetectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.DichroicRefType <em>Dichroic Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.DichroicRefType
	 * @generated
	 */
	public Adapter createDichroicRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.DichroicType <em>Dichroic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.DichroicType
	 * @generated
	 */
	public Adapter createDichroicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.DoubleAnnotationType <em>Double Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.DoubleAnnotationType
	 * @generated
	 */
	public Adapter createDoubleAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.EllipseType <em>Ellipse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.EllipseType
	 * @generated
	 */
	public Adapter createEllipseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ExperimenterGroupRefType <em>Experimenter Group Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ExperimenterGroupRefType
	 * @generated
	 */
	public Adapter createExperimenterGroupRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ExperimenterGroupType <em>Experimenter Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ExperimenterGroupType
	 * @generated
	 */
	public Adapter createExperimenterGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ExperimenterRefType <em>Experimenter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ExperimenterRefType
	 * @generated
	 */
	public Adapter createExperimenterRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ExperimenterType <em>Experimenter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ExperimenterType
	 * @generated
	 */
	public Adapter createExperimenterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ExperimentRefType <em>Experiment Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ExperimentRefType
	 * @generated
	 */
	public Adapter createExperimentRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ExperimentType <em>Experiment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ExperimentType
	 * @generated
	 */
	public Adapter createExperimentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ExternalType <em>External Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ExternalType
	 * @generated
	 */
	public Adapter createExternalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.FilamentType <em>Filament Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.FilamentType
	 * @generated
	 */
	public Adapter createFilamentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.FileAnnotationType <em>File Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.FileAnnotationType
	 * @generated
	 */
	public Adapter createFileAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.FilterRef <em>Filter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.FilterRef
	 * @generated
	 */
	public Adapter createFilterRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.FilterSetRefType <em>Filter Set Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.FilterSetRefType
	 * @generated
	 */
	public Adapter createFilterSetRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.FilterSetType <em>Filter Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.FilterSetType
	 * @generated
	 */
	public Adapter createFilterSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.FolderRefType <em>Folder Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.FolderRefType
	 * @generated
	 */
	public Adapter createFolderRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.FolderType
	 * @generated
	 */
	public Adapter createFolderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.GenericExcitationSourceType <em>Generic Excitation Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.GenericExcitationSourceType
	 * @generated
	 */
	public Adapter createGenericExcitationSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ImageRefType <em>Image Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ImageRefType
	 * @generated
	 */
	public Adapter createImageRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ImageType
	 * @generated
	 */
	public Adapter createImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ImagingEnvironmentType <em>Imaging Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ImagingEnvironmentType
	 * @generated
	 */
	public Adapter createImagingEnvironmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.InstrumentRefType <em>Instrument Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.InstrumentRefType
	 * @generated
	 */
	public Adapter createInstrumentRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.InstrumentType <em>Instrument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.InstrumentType
	 * @generated
	 */
	public Adapter createInstrumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LaserType <em>Laser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LaserType
	 * @generated
	 */
	public Adapter createLaserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LeaderType <em>Leader Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LeaderType
	 * @generated
	 */
	public Adapter createLeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LightEmittingDiodeType <em>Light Emitting Diode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LightEmittingDiodeType
	 * @generated
	 */
	public Adapter createLightEmittingDiodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LightPathType <em>Light Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LightPathType
	 * @generated
	 */
	public Adapter createLightPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LightSource <em>Light Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LightSource
	 * @generated
	 */
	public Adapter createLightSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LightSourceSettingsType <em>Light Source Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LightSourceSettingsType
	 * @generated
	 */
	public Adapter createLightSourceSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LineType
	 * @generated
	 */
	public Adapter createLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ListAnnotationType <em>List Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ListAnnotationType
	 * @generated
	 */
	public Adapter createListAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.LongAnnotationType <em>Long Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.LongAnnotationType
	 * @generated
	 */
	public Adapter createLongAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ManufacturerSpec <em>Manufacturer Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ManufacturerSpec
	 * @generated
	 */
	public Adapter createManufacturerSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.MapAnnotationType <em>Map Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.MapAnnotationType
	 * @generated
	 */
	public Adapter createMapAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.MaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.MaskType
	 * @generated
	 */
	public Adapter createMaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.MicrobeamManipulationRefType <em>Microbeam Manipulation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationRefType
	 * @generated
	 */
	public Adapter createMicrobeamManipulationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.MicrobeamManipulationType <em>Microbeam Manipulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.MicrobeamManipulationType
	 * @generated
	 */
	public Adapter createMicrobeamManipulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.MicroscopeType <em>Microscope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.MicroscopeType
	 * @generated
	 */
	public Adapter createMicroscopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.MType <em>MType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.MType
	 * @generated
	 */
	public Adapter createMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.NumericAnnotation <em>Numeric Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.NumericAnnotation
	 * @generated
	 */
	public Adapter createNumericAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ObjectiveSettingsType <em>Objective Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ObjectiveSettingsType
	 * @generated
	 */
	public Adapter createObjectiveSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ObjectiveType <em>Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ObjectiveType
	 * @generated
	 */
	public Adapter createObjectiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.OMEType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.OMEType
	 * @generated
	 */
	public Adapter createOMETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PixelsType <em>Pixels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PixelsType
	 * @generated
	 */
	public Adapter createPixelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PlaneType <em>Plane Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PlaneType
	 * @generated
	 */
	public Adapter createPlaneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PlateAcquisitionType <em>Plate Acquisition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PlateAcquisitionType
	 * @generated
	 */
	public Adapter createPlateAcquisitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PlateRefType <em>Plate Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PlateRefType
	 * @generated
	 */
	public Adapter createPlateRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PlateType <em>Plate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PlateType
	 * @generated
	 */
	public Adapter createPlateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PolygonType
	 * @generated
	 */
	public Adapter createPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PolylineType <em>Polyline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PolylineType
	 * @generated
	 */
	public Adapter createPolylineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ProjectRefType <em>Project Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ProjectRefType
	 * @generated
	 */
	public Adapter createProjectRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ProjectType
	 * @generated
	 */
	public Adapter createProjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.PumpType <em>Pump Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.PumpType
	 * @generated
	 */
	public Adapter createPumpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ReagentRefType <em>Reagent Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ReagentRefType
	 * @generated
	 */
	public Adapter createReagentRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ReagentType <em>Reagent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ReagentType
	 * @generated
	 */
	public Adapter createReagentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.RectangleType <em>Rectangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.RectangleType
	 * @generated
	 */
	public Adapter createRectangleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.RightsType <em>Rights Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.RightsType
	 * @generated
	 */
	public Adapter createRightsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ROIRefType <em>ROI Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ROIRefType
	 * @generated
	 */
	public Adapter createROIRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ROIType <em>ROI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ROIType
	 * @generated
	 */
	public Adapter createROITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ScreenType <em>Screen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ScreenType
	 * @generated
	 */
	public Adapter createScreenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.Settings
	 * @generated
	 */
	public Adapter createSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.StageLabelType <em>Stage Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.StageLabelType
	 * @generated
	 */
	public Adapter createStageLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.StructuredAnnotationsType <em>Structured Annotations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.StructuredAnnotationsType
	 * @generated
	 */
	public Adapter createStructuredAnnotationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.TagAnnotationType <em>Tag Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.TagAnnotationType
	 * @generated
	 */
	public Adapter createTagAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.TermAnnotationType <em>Term Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.TermAnnotationType
	 * @generated
	 */
	public Adapter createTermAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.TextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.TextAnnotation
	 * @generated
	 */
	public Adapter createTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.TiffDataType <em>Tiff Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.TiffDataType
	 * @generated
	 */
	public Adapter createTiffDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.TimestampAnnotationType <em>Timestamp Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.TimestampAnnotationType
	 * @generated
	 */
	public Adapter createTimestampAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.TransmittanceRangeType <em>Transmittance Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.TransmittanceRangeType
	 * @generated
	 */
	public Adapter createTransmittanceRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.TypeAnnotation <em>Type Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.TypeAnnotation
	 * @generated
	 */
	public Adapter createTypeAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.UnionType
	 * @generated
	 */
	public Adapter createUnionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.UUIDType <em>UUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.UUIDType
	 * @generated
	 */
	public Adapter createUUIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.WellSampleRefType <em>Well Sample Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.WellSampleRefType
	 * @generated
	 */
	public Adapter createWellSampleRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.WellSampleType <em>Well Sample Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.WellSampleType
	 * @generated
	 */
	public Adapter createWellSampleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.WellType <em>Well Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.WellType
	 * @generated
	 */
	public Adapter createWellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openmicroscopy.ome.XMLAnnotationType <em>XML Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openmicroscopy.ome.XMLAnnotationType
	 * @generated
	 */
	public Adapter createXMLAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OMEAdapterFactory
