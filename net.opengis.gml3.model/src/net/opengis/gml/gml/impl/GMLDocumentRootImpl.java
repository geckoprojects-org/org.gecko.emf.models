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
package net.opengis.gml.gml.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.gml.AbstractCRSType;
import net.opengis.gml.gml.AbstractContinuousCoverageType;
import net.opengis.gml.gml.AbstractCoordinateOperationType;
import net.opengis.gml.gml.AbstractCoordinateSystemType;
import net.opengis.gml.gml.AbstractCoverageType;
import net.opengis.gml.gml.AbstractCurveSegmentType;
import net.opengis.gml.gml.AbstractCurveType;
import net.opengis.gml.gml.AbstractDatumType;
import net.opengis.gml.gml.AbstractFeatureCollectionType;
import net.opengis.gml.gml.AbstractFeatureType;
import net.opengis.gml.gml.AbstractGMLType;
import net.opengis.gml.gml.AbstractGeneralConversionType;
import net.opengis.gml.gml.AbstractGeneralDerivedCRSType;
import net.opengis.gml.gml.AbstractGeneralOperationParameterPropertyType;
import net.opengis.gml.gml.AbstractGeneralOperationParameterType;
import net.opengis.gml.gml.AbstractGeneralParameterValuePropertyType;
import net.opengis.gml.gml.AbstractGeneralParameterValueType;
import net.opengis.gml.gml.AbstractGeneralTransformationType;
import net.opengis.gml.gml.AbstractGeometricAggregateType;
import net.opengis.gml.gml.AbstractGeometricPrimitiveType;
import net.opengis.gml.gml.AbstractGeometryType;
import net.opengis.gml.gml.AbstractGriddedSurfaceType;
import net.opengis.gml.gml.AbstractMetaDataType;
import net.opengis.gml.gml.AbstractParametricCurveSurfaceType;
import net.opengis.gml.gml.AbstractRingPropertyType;
import net.opengis.gml.gml.AbstractRingType;
import net.opengis.gml.gml.AbstractSolidType;
import net.opengis.gml.gml.AbstractSurfacePatchType;
import net.opengis.gml.gml.AbstractSurfaceType;
import net.opengis.gml.gml.AbstractTimeComplexType;
import net.opengis.gml.gml.AbstractTimeGeometricPrimitiveType;
import net.opengis.gml.gml.AbstractTimeObjectType;
import net.opengis.gml.gml.AbstractTimePrimitiveType;
import net.opengis.gml.gml.AbstractTimeSliceType;
import net.opengis.gml.gml.AbstractTimeTopologyPrimitiveType;
import net.opengis.gml.gml.AbstractTopoPrimitiveType;
import net.opengis.gml.gml.AbstractTopologyType;
import net.opengis.gml.gml.AffineCSPropertyType;
import net.opengis.gml.gml.AffineCSType;
import net.opengis.gml.gml.AffinePlacementType;
import net.opengis.gml.gml.AngleType;
import net.opengis.gml.gml.ArcByBulgeType;
import net.opengis.gml.gml.ArcByCenterPointType;
import net.opengis.gml.gml.ArcStringByBulgeType;
import net.opengis.gml.gml.ArcStringType;
import net.opengis.gml.gml.ArcType;
import net.opengis.gml.gml.ArrayAssociationType;
import net.opengis.gml.gml.ArrayType;
import net.opengis.gml.gml.AssociationRoleType;
import net.opengis.gml.gml.BSplineType;
import net.opengis.gml.gml.BagType;
import net.opengis.gml.gml.BaseUnitType;
import net.opengis.gml.gml.BezierType;
import net.opengis.gml.gml.BooleanType;
import net.opengis.gml.gml.BoundingShapeType;
import net.opengis.gml.gml.CRSPropertyType;
import net.opengis.gml.gml.CartesianCSPropertyType;
import net.opengis.gml.gml.CartesianCSType;
import net.opengis.gml.gml.CategoryExtentType;
import net.opengis.gml.gml.CategoryType;
import net.opengis.gml.gml.CircleByCenterPointType;
import net.opengis.gml.gml.CircleType;
import net.opengis.gml.gml.ClothoidType;
import net.opengis.gml.gml.CodeOrNilReasonListType;
import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.CodeWithAuthorityType;
import net.opengis.gml.gml.CompositeCurveType;
import net.opengis.gml.gml.CompositeSolidType;
import net.opengis.gml.gml.CompositeSurfaceType;
import net.opengis.gml.gml.CompositeValueType;
import net.opengis.gml.gml.CompoundCRSPropertyType;
import net.opengis.gml.gml.CompoundCRSType;
import net.opengis.gml.gml.ConcatenatedOperationPropertyType;
import net.opengis.gml.gml.ConcatenatedOperationType;
import net.opengis.gml.gml.ConeType;
import net.opengis.gml.gml.ConventionalUnitType;
import net.opengis.gml.gml.ConversionPropertyType;
import net.opengis.gml.gml.ConversionToPreferredUnitType;
import net.opengis.gml.gml.ConversionType;
import net.opengis.gml.gml.CoordinateOperationAccuracyType;
import net.opengis.gml.gml.CoordinateOperationPropertyType;
import net.opengis.gml.gml.CoordinateSystemAxisPropertyType;
import net.opengis.gml.gml.CoordinateSystemAxisType;
import net.opengis.gml.gml.CoordinateSystemPropertyType;
import net.opengis.gml.gml.CoordinatesType;
import net.opengis.gml.gml.CountType;
import net.opengis.gml.gml.CoverageFunctionType;
import net.opengis.gml.gml.CubicSplineType;
import net.opengis.gml.gml.CurveArrayPropertyType;
import net.opengis.gml.gml.CurvePropertyType;
import net.opengis.gml.gml.CurveSegmentArrayPropertyType;
import net.opengis.gml.gml.CurveType;
import net.opengis.gml.gml.CylinderType;
import net.opengis.gml.gml.CylindricalCSPropertyType;
import net.opengis.gml.gml.CylindricalCSType;
import net.opengis.gml.gml.DMSAngleType;
import net.opengis.gml.gml.DataBlockType;
import net.opengis.gml.gml.DatumPropertyType;
import net.opengis.gml.gml.DefinitionProxyType;
import net.opengis.gml.gml.DefinitionType;
import net.opengis.gml.gml.DegreesType;
import net.opengis.gml.gml.DerivationUnitTermType;
import net.opengis.gml.gml.DerivedCRSPropertyType;
import net.opengis.gml.gml.DerivedCRSType;
import net.opengis.gml.gml.DerivedUnitType;
import net.opengis.gml.gml.DictionaryEntryType;
import net.opengis.gml.gml.DictionaryType;
import net.opengis.gml.gml.DirectPositionListType;
import net.opengis.gml.gml.DirectPositionType;
import net.opengis.gml.gml.DirectedEdgePropertyType;
import net.opengis.gml.gml.DirectedFacePropertyType;
import net.opengis.gml.gml.DirectedNodePropertyType;
import net.opengis.gml.gml.DirectedObservationAtDistanceType;
import net.opengis.gml.gml.DirectedObservationType;
import net.opengis.gml.gml.DirectedTopoSolidPropertyType;
import net.opengis.gml.gml.DirectionPropertyType;
import net.opengis.gml.gml.DiscreteCoverageType;
import net.opengis.gml.gml.DomainOfValidityType;
import net.opengis.gml.gml.DomainSetType;
import net.opengis.gml.gml.DynamicFeatureCollectionType;
import net.opengis.gml.gml.DynamicFeatureMemberType;
import net.opengis.gml.gml.DynamicFeatureType;
import net.opengis.gml.gml.EdgeType;
import net.opengis.gml.gml.EllipsoidPropertyType;
import net.opengis.gml.gml.EllipsoidType;
import net.opengis.gml.gml.EllipsoidalCSPropertyType;
import net.opengis.gml.gml.EllipsoidalCSType;
import net.opengis.gml.gml.EngineeringCRSPropertyType;
import net.opengis.gml.gml.EngineeringCRSType;
import net.opengis.gml.gml.EngineeringDatumPropertyType;
import net.opengis.gml.gml.EngineeringDatumType;
import net.opengis.gml.gml.EnvelopeType;
import net.opengis.gml.gml.EnvelopeWithTimePeriodType;
import net.opengis.gml.gml.FaceType;
import net.opengis.gml.gml.FeatureArrayPropertyType;
import net.opengis.gml.gml.FeatureCollectionType;
import net.opengis.gml.gml.FeaturePropertyType;
import net.opengis.gml.gml.FileType;
import net.opengis.gml.gml.FormulaCitationType;
import net.opengis.gml.gml.GMLDocumentRoot;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.GeneralConversionPropertyType;
import net.opengis.gml.gml.GeneralTransformationPropertyType;
import net.opengis.gml.gml.GenericMetaDataType;
import net.opengis.gml.gml.GeocentricCRSPropertyType;
import net.opengis.gml.gml.GeocentricCRSType;
import net.opengis.gml.gml.GeodesicStringType;
import net.opengis.gml.gml.GeodesicType;
import net.opengis.gml.gml.GeodeticCRSPropertyType;
import net.opengis.gml.gml.GeodeticCRSType;
import net.opengis.gml.gml.GeodeticDatumPropertyType;
import net.opengis.gml.gml.GeodeticDatumType;
import net.opengis.gml.gml.GeographicCRSPropertyType;
import net.opengis.gml.gml.GeographicCRSType;
import net.opengis.gml.gml.GeometricComplexType;
import net.opengis.gml.gml.GeometryArrayPropertyType;
import net.opengis.gml.gml.GeometryPropertyType;
import net.opengis.gml.gml.GridFunctionType;
import net.opengis.gml.gml.GridType;
import net.opengis.gml.gml.HistoryPropertyType;
import net.opengis.gml.gml.ImageCRSPropertyType;
import net.opengis.gml.gml.ImageCRSType;
import net.opengis.gml.gml.ImageDatumPropertyType;
import net.opengis.gml.gml.ImageDatumType;
import net.opengis.gml.gml.IndirectEntryType;
import net.opengis.gml.gml.InlinePropertyType;
import net.opengis.gml.gml.LineStringSegmentType;
import net.opengis.gml.gml.LineStringType;
import net.opengis.gml.gml.LinearCSPropertyType;
import net.opengis.gml.gml.LinearCSType;
import net.opengis.gml.gml.LinearRingType;
import net.opengis.gml.gml.LocationPropertyType;
import net.opengis.gml.gml.MappingRuleType;
import net.opengis.gml.gml.MeasureListType;
import net.opengis.gml.gml.MeasureOrNilReasonListType;
import net.opengis.gml.gml.MeasureType;
import net.opengis.gml.gml.MetaDataPropertyType;
import net.opengis.gml.gml.MovingObjectStatusType;
import net.opengis.gml.gml.MultiCurvePropertyType;
import net.opengis.gml.gml.MultiCurveType;
import net.opengis.gml.gml.MultiGeometryPropertyType;
import net.opengis.gml.gml.MultiGeometryType;
import net.opengis.gml.gml.MultiPointPropertyType;
import net.opengis.gml.gml.MultiPointType;
import net.opengis.gml.gml.MultiSolidPropertyType;
import net.opengis.gml.gml.MultiSolidType;
import net.opengis.gml.gml.MultiSurfacePropertyType;
import net.opengis.gml.gml.MultiSurfaceType;
import net.opengis.gml.gml.NodeType;
import net.opengis.gml.gml.ObliqueCartesianCSPropertyType;
import net.opengis.gml.gml.ObliqueCartesianCSType;
import net.opengis.gml.gml.ObservationType;
import net.opengis.gml.gml.OffsetCurveType;
import net.opengis.gml.gml.OperationMethodPropertyType;
import net.opengis.gml.gml.OperationMethodType;
import net.opengis.gml.gml.OperationParameterGroupPropertyType;
import net.opengis.gml.gml.OperationParameterGroupType;
import net.opengis.gml.gml.OperationParameterPropertyType;
import net.opengis.gml.gml.OperationParameterType;
import net.opengis.gml.gml.OperationPropertyType;
import net.opengis.gml.gml.OrientableCurveType;
import net.opengis.gml.gml.OrientableSurfaceType;
import net.opengis.gml.gml.ParameterValueGroupType;
import net.opengis.gml.gml.ParameterValueType;
import net.opengis.gml.gml.PassThroughOperationPropertyType;
import net.opengis.gml.gml.PassThroughOperationType;
import net.opengis.gml.gml.PointArrayPropertyType;
import net.opengis.gml.gml.PointPropertyType;
import net.opengis.gml.gml.PointType;
import net.opengis.gml.gml.PolarCSPropertyType;
import net.opengis.gml.gml.PolarCSType;
import net.opengis.gml.gml.PolygonPatchType;
import net.opengis.gml.gml.PolygonType;
import net.opengis.gml.gml.PrimeMeridianPropertyType;
import net.opengis.gml.gml.PrimeMeridianType;
import net.opengis.gml.gml.PriorityLocationPropertyType;
import net.opengis.gml.gml.ProcedurePropertyType;
import net.opengis.gml.gml.ProjectedCRSPropertyType;
import net.opengis.gml.gml.ProjectedCRSType;
import net.opengis.gml.gml.QuantityExtentType;
import net.opengis.gml.gml.QuantityType;
import net.opengis.gml.gml.RangeSetType;
import net.opengis.gml.gml.RectangleType;
import net.opengis.gml.gml.RectifiedGridType;
import net.opengis.gml.gml.ReferenceType;
import net.opengis.gml.gml.ResultType;
import net.opengis.gml.gml.RingType;
import net.opengis.gml.gml.SecondDefiningParameterType;
import net.opengis.gml.gml.SecondDefiningParameterType1;
import net.opengis.gml.gml.SecondDefiningParameterType2;
import net.opengis.gml.gml.SecondDefiningParameterType3;
import net.opengis.gml.gml.ShellType;
import net.opengis.gml.gml.SingleCRSPropertyType;
import net.opengis.gml.gml.SingleOperationPropertyType;
import net.opengis.gml.gml.SolidArrayPropertyType;
import net.opengis.gml.gml.SolidPropertyType;
import net.opengis.gml.gml.SolidType;
import net.opengis.gml.gml.SphereType;
import net.opengis.gml.gml.SphericalCSPropertyType;
import net.opengis.gml.gml.SphericalCSType;
import net.opengis.gml.gml.StringOrRefType;
import net.opengis.gml.gml.SurfaceArrayPropertyType;
import net.opengis.gml.gml.SurfacePatchArrayPropertyType;
import net.opengis.gml.gml.SurfacePropertyType;
import net.opengis.gml.gml.SurfaceType;
import net.opengis.gml.gml.TargetPropertyType;
import net.opengis.gml.gml.TemporalCRSPropertyType;
import net.opengis.gml.gml.TemporalCRSType;
import net.opengis.gml.gml.TemporalCSPropertyType;
import net.opengis.gml.gml.TemporalCSType;
import net.opengis.gml.gml.TemporalDatumPropertyType;
import net.opengis.gml.gml.TemporalDatumType;
import net.opengis.gml.gml.TimeCSPropertyType;
import net.opengis.gml.gml.TimeCSType;
import net.opengis.gml.gml.TimeCalendarEraType;
import net.opengis.gml.gml.TimeCalendarType;
import net.opengis.gml.gml.TimeClockType;
import net.opengis.gml.gml.TimeCoordinateSystemType;
import net.opengis.gml.gml.TimeEdgeType;
import net.opengis.gml.gml.TimeInstantType;
import net.opengis.gml.gml.TimeIntervalLengthType;
import net.opengis.gml.gml.TimeNodeType;
import net.opengis.gml.gml.TimeOrdinalEraType;
import net.opengis.gml.gml.TimeOrdinalReferenceSystemType;
import net.opengis.gml.gml.TimePeriodType;
import net.opengis.gml.gml.TimePositionType;
import net.opengis.gml.gml.TimePrimitivePropertyType;
import net.opengis.gml.gml.TimeReferenceSystemType;
import net.opengis.gml.gml.TimeTopologyComplexType;
import net.opengis.gml.gml.TinType;
import net.opengis.gml.gml.TopoComplexPropertyType;
import net.opengis.gml.gml.TopoComplexType;
import net.opengis.gml.gml.TopoCurvePropertyType;
import net.opengis.gml.gml.TopoCurveType;
import net.opengis.gml.gml.TopoPointPropertyType;
import net.opengis.gml.gml.TopoPointType;
import net.opengis.gml.gml.TopoPrimitiveArrayAssociationType;
import net.opengis.gml.gml.TopoPrimitiveMemberType;
import net.opengis.gml.gml.TopoSolidType;
import net.opengis.gml.gml.TopoSurfacePropertyType;
import net.opengis.gml.gml.TopoSurfaceType;
import net.opengis.gml.gml.TopoVolumePropertyType;
import net.opengis.gml.gml.TopoVolumeType;
import net.opengis.gml.gml.TransformationPropertyType;
import net.opengis.gml.gml.TransformationType;
import net.opengis.gml.gml.TriangleType;
import net.opengis.gml.gml.UnitDefinitionType;
import net.opengis.gml.gml.UnitOfMeasureType;
import net.opengis.gml.gml.UserDefinedCSPropertyType;
import net.opengis.gml.gml.UserDefinedCSType;
import net.opengis.gml.gml.ValueArrayPropertyType;
import net.opengis.gml.gml.ValueArrayType;
import net.opengis.gml.gml.ValuePropertyType;
import net.opengis.gml.gml.VectorType;
import net.opengis.gml.gml.VerticalCRSPropertyType;
import net.opengis.gml.gml.VerticalCRSType;
import net.opengis.gml.gml.VerticalCSPropertyType;
import net.opengis.gml.gml.VerticalCSType;
import net.opengis.gml.gml.VerticalDatumPropertyType;
import net.opengis.gml.gml.VerticalDatumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractAssociationRole <em>Abstract Association Role</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractContinuousCoverage <em>Abstract Continuous Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractFeature <em>Abstract Feature</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGML <em>Abstract GML</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractObject <em>Abstract Object</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractCoordinateOperation <em>Abstract Coordinate Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractCoordinateSystem <em>Abstract Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractCoverage <em>Abstract Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractCRS <em>Abstract CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractCurve <em>Abstract Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeometricPrimitive <em>Abstract Geometric Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeometry <em>Abstract Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractCurveSegment <em>Abstract Curve Segment</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractDatum <em>Abstract Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractDiscreteCoverage <em>Abstract Discrete Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractFeatureCollection <em>Abstract Feature Collection</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeneralConversion <em>Abstract General Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractOperation <em>Abstract Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractSingleOperation <em>Abstract Single Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeneralDerivedCRS <em>Abstract General Derived CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractSingleCRS <em>Abstract Single CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeneralOperationParameter <em>Abstract General Operation Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeneralOperationParameterRef <em>Abstract General Operation Parameter Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeneralParameterValue <em>Abstract General Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeneralTransformation <em>Abstract General Transformation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGeometricAggregate <em>Abstract Geometric Aggregate</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractGriddedSurface <em>Abstract Gridded Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractParametricCurveSurface <em>Abstract Parametric Curve Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractSurfacePatch <em>Abstract Surface Patch</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractImplicitGeometry <em>Abstract Implicit Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractInlineProperty <em>Abstract Inline Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractMetaData <em>Abstract Meta Data</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractReference <em>Abstract Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractRing <em>Abstract Ring</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractScalarValue <em>Abstract Scalar Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractValue <em>Abstract Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractScalarValueList <em>Abstract Scalar Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractSolid <em>Abstract Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractStrictAssociationRole <em>Abstract Strict Association Role</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractSurface <em>Abstract Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractTimeComplex <em>Abstract Time Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractTimeObject <em>Abstract Time Object</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractTimeGeometricPrimitive <em>Abstract Time Geometric Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractTimePrimitive <em>Abstract Time Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractTimeSlice <em>Abstract Time Slice</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractTimeTopologyPrimitive <em>Abstract Time Topology Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractTopology <em>Abstract Topology</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAbstractTopoPrimitive <em>Abstract Topo Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAffineCS <em>Affine CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAffineCS1 <em>Affine CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAffineCS2 <em>Affine CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAffineCS3 <em>Affine CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAffinePlacement <em>Affine Placement</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAnchorDefinition <em>Anchor Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAnchorPoint <em>Anchor Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getArcString <em>Arc String</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getArcByBulge <em>Arc By Bulge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getArcStringByBulge <em>Arc String By Bulge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getArcByCenterPoint <em>Arc By Center Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getArray <em>Array</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAssociationName <em>Association Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAxisAbbrev <em>Axis Abbrev</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getAxisDirection <em>Axis Direction</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBaseCRS <em>Base CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBaseCurve <em>Base Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBaseGeodeticCRS <em>Base Geodetic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBaseGeographicCRS <em>Base Geographic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUnitDefinition <em>Unit Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBezier <em>Bezier</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBSpline <em>BSpline</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBooleanList <em>Boolean List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getBoundedBy <em>Bounded By</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCartesianCS1 <em>Cartesian CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCartesianCS2 <em>Cartesian CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCartesianCS3 <em>Cartesian CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCartesianCSRef <em>Cartesian CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCatalogSymbol <em>Catalog Symbol</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCategoryExtent <em>Category Extent</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCategoryList <em>Category List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCenterLineOf <em>Center Line Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCenterOf <em>Center Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCircleByCenterPoint <em>Circle By Center Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getClothoid <em>Clothoid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getComponentReferenceSystem <em>Component Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCompositeCurve <em>Composite Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCompositeSolid <em>Composite Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCompositeSurface <em>Composite Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCompoundCRS <em>Compound CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCompoundCRSRef <em>Compound CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConcatenatedOperation <em>Concatenated Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConcatenatedOperationRef <em>Concatenated Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCone <em>Cone</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConventionalUnit <em>Conventional Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConversion <em>Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConversion1 <em>Conversion1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConversion2 <em>Conversion2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConversion3 <em>Conversion3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConversionRef <em>Conversion Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getConversionToPreferredUnit <em>Conversion To Preferred Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoordinateOperationAccuracy <em>Coordinate Operation Accuracy</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoordinateOperationRef <em>Coordinate Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoordinateSystemAxis <em>Coordinate System Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoordinateSystemAxisRef <em>Coordinate System Axis Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoordinateSystemRef <em>Coordinate System Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoordOperation <em>Coord Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCount <em>Count</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCountExtent <em>Count Extent</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCountList <em>Count List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoverageFunction <em>Coverage Function</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCoverageMappingRule <em>Coverage Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCrsRef <em>Crs Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCubicSpline <em>Cubic Spline</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCurveArrayProperty <em>Curve Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCurveMember <em>Curve Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCurveMembers <em>Curve Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCurveProperty <em>Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCylindricalCS <em>Cylindrical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCylindricalCS1 <em>Cylindrical CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCylindricalCS2 <em>Cylindrical CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCylindricalCS3 <em>Cylindrical CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getCylindricalCSRef <em>Cylindrical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDataBlock <em>Data Block</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDataSourceReference <em>Data Source Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDatumRef <em>Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDecimalMinutes <em>Decimal Minutes</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDefaultCodeSpace <em>Default Code Space</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDefinedByConversion <em>Defined By Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDefinitionCollection <em>Definition Collection</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDefinitionMember <em>Definition Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDictionaryEntry <em>Dictionary Entry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDefinitionProxy <em>Definition Proxy</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDerivationUnitTerm <em>Derivation Unit Term</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDerivedCRS <em>Derived CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDerivedCRSRef <em>Derived CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDerivedCRSType <em>Derived CRS Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDerivedUnit <em>Derived Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDescriptionReference <em>Description Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDirectedFace <em>Directed Face</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDirectedNode <em>Directed Node</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDirectedObservation <em>Directed Observation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDirectedObservationAtDistance <em>Directed Observation At Distance</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDirectedTopoSolid <em>Directed Topo Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDmsAngle <em>Dms Angle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDmsAngleValue <em>Dms Angle Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDomainSet <em>Domain Set</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDoubleOrNilReasonTupleList <em>Double Or Nil Reason Tuple List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDynamicFeature <em>Dynamic Feature</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDynamicFeatureCollection <em>Dynamic Feature Collection</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getDynamicMembers <em>Dynamic Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEdgeOf <em>Edge Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoid <em>Ellipsoid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoid1 <em>Ellipsoid1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoid2 <em>Ellipsoid2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoid3 <em>Ellipsoid3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoidalCS <em>Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoidalCS1 <em>Ellipsoidal CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoidalCS2 <em>Ellipsoidal CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoidalCS3 <em>Ellipsoidal CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoidalCSRef <em>Ellipsoidal CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEllipsoidRef <em>Ellipsoid Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEngineeringCRS <em>Engineering CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEngineeringCRSRef <em>Engineering CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEngineeringDatum <em>Engineering Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEngineeringDatum1 <em>Engineering Datum1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEngineeringDatum2 <em>Engineering Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEngineeringDatum3 <em>Engineering Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEngineeringDatumRef <em>Engineering Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getEnvelopeWithTimePeriod <em>Envelope With Time Period</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getExtentOf <em>Extent Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getFace <em>Face</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getFeatureCollection <em>Feature Collection</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getFeatureMember <em>Feature Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getFeatureMembers <em>Feature Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getFeatureProperty <em>Feature Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getFile <em>File</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getFormulaCitation <em>Formula Citation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeneralConversionRef <em>General Conversion Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeneralOperationParameter <em>General Operation Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeneralOperationParameter1 <em>General Operation Parameter1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeneralTransformationRef <em>General Transformation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGenericMetaData <em>Generic Meta Data</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeocentricCRS <em>Geocentric CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeocentricCRSRef <em>Geocentric CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeodesic <em>Geodesic</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeodesicString <em>Geodesic String</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeodeticCRS <em>Geodetic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeodeticDatum <em>Geodetic Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeodeticDatum1 <em>Geodetic Datum1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeodeticDatum2 <em>Geodetic Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeodeticDatum3 <em>Geodetic Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeodeticDatumRef <em>Geodetic Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeographicCRS <em>Geographic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeographicCRSRef <em>Geographic CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeometricComplex <em>Geometric Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeometryMember <em>Geometry Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGeometryMembers <em>Geometry Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGmlProfileSchema <em>Gml Profile Schema</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGreenwichLongitude <em>Greenwich Longitude</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGridCoverage <em>Grid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGridDomain <em>Grid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGridFunction <em>Grid Function</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getHistory <em>History</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getImageCRS <em>Image CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getImageCRSRef <em>Image CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getImageDatum <em>Image Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getImageDatum1 <em>Image Datum1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getImageDatum2 <em>Image Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getImageDatum3 <em>Image Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getImageDatumRef <em>Image Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getIncludesParameter <em>Includes Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getIncludesSingleCRS <em>Includes Single CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getIncludesValue <em>Includes Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getIndirectEntry <em>Indirect Entry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getIntegerValueList <em>Integer Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getInterior <em>Interior</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLinearCS <em>Linear CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLinearCS1 <em>Linear CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLinearCS2 <em>Linear CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLinearCS3 <em>Linear CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLinearCSRef <em>Linear CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLineString <em>Line String</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLineStringSegment <em>Line String Segment</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLocationKeyWord <em>Location Key Word</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getLocationString <em>Location String</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMappingRule <em>Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMaximalComplex <em>Maximal Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMaximumOccurs <em>Maximum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMetaDataProperty <em>Meta Data Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMethodFormula <em>Method Formula</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMinimumOccurs <em>Minimum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getModifiedCoordinate <em>Modified Coordinate</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMovingObjectStatus <em>Moving Object Status</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiCenterLineOf <em>Multi Center Line Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiCenterOf <em>Multi Center Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiCoverage <em>Multi Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiCurve <em>Multi Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiCurveCoverage <em>Multi Curve Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiCurveDomain <em>Multi Curve Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiCurveProperty <em>Multi Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiEdgeOf <em>Multi Edge Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiExtentOf <em>Multi Extent Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiGeometry <em>Multi Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiGeometryProperty <em>Multi Geometry Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiLocation <em>Multi Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiPoint <em>Multi Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiPointCoverage <em>Multi Point Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiPointDomain <em>Multi Point Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiPointProperty <em>Multi Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiPosition <em>Multi Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiSolid <em>Multi Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiSolidCoverage <em>Multi Solid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiSolidDomain <em>Multi Solid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiSolidProperty <em>Multi Solid Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiSurface <em>Multi Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiSurfaceCoverage <em>Multi Surface Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiSurfaceDomain <em>Multi Surface Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getMultiSurfaceProperty <em>Multi Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getNull <em>Null</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getObliqueCartesianCS <em>Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getObliqueCartesianCSRef <em>Oblique Cartesian CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOffsetCurve <em>Offset Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationMethod <em>Operation Method</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationMethodRef <em>Operation Method Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationParameter1 <em>Operation Parameter1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationParameter2 <em>Operation Parameter2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationParameter3 <em>Operation Parameter3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationParameterGroup <em>Operation Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationParameterGroupRef <em>Operation Parameter Group Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationParameterRef <em>Operation Parameter Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOperationVersion <em>Operation Version</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOrientableCurve <em>Orientable Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOrientableSurface <em>Orientable Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getParameterValue1 <em>Parameter Value1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getParameterValue2 <em>Parameter Value2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getParameterValue3 <em>Parameter Value3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getParameterValueGroup <em>Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPassThroughOperation <em>Pass Through Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPassThroughOperationRef <em>Pass Through Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPatches <em>Patches</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPixelInCell <em>Pixel In Cell</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPointArrayProperty <em>Point Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPointMember <em>Point Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPointMembers <em>Point Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolarCS <em>Polar CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolarCS1 <em>Polar CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolarCS2 <em>Polar CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolarCS3 <em>Polar CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolarCSRef <em>Polar CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolygonPatch <em>Polygon Patch</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolygonPatches <em>Polygon Patches</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPolyhedralSurface <em>Polyhedral Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPrimeMeridian <em>Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPrimeMeridian1 <em>Prime Meridian1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPrimeMeridian2 <em>Prime Meridian2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPrimeMeridian3 <em>Prime Meridian3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPrimeMeridianRef <em>Prime Meridian Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getPriorityLocation <em>Priority Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getProjectedCRS <em>Projected CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getProjectedCRSRef <em>Projected CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getQuantityExtent <em>Quantity Extent</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getQuantityList <em>Quantity List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getQuantityType <em>Quantity Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getQuantityTypeReference <em>Quantity Type Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRangeMeaning <em>Range Meaning</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRangeParameters <em>Range Parameters</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRangeSet <em>Range Set</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRealizationEpoch <em>Realization Epoch</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRectifiedGrid <em>Rectified Grid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRectifiedGridCoverage <em>Rectified Grid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRectifiedGridDomain <em>Rectified Grid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getReferenceSystemRef <em>Reference System Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getReversePropertyName <em>Reverse Property Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRing <em>Ring</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRoughConversionToPreferredUnit <em>Rough Conversion To Preferred Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSecondDefiningParameter <em>Second Defining Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSecondDefiningParameter1 <em>Second Defining Parameter1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSecondDefiningParameter2 <em>Second Defining Parameter2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSecondDefiningParameter3 <em>Second Defining Parameter3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSemiMajorAxis <em>Semi Major Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSingleCRSRef <em>Single CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSingleOperationRef <em>Single Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSolid <em>Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSolidArrayProperty <em>Solid Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSolidMember <em>Solid Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSolidMembers <em>Solid Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSolidProperty <em>Solid Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSourceCRS <em>Source CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSourceDimensions <em>Source Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSphericalCS <em>Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSphericalCS1 <em>Spherical CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSphericalCS2 <em>Spherical CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSphericalCS3 <em>Spherical CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSphericalCSRef <em>Spherical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getStatusReference <em>Status Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSubComplex <em>Sub Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSuperComplex <em>Super Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSurfaceArrayProperty <em>Surface Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSurfaceMember <em>Surface Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSurfaceMembers <em>Surface Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getSurfaceProperty <em>Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTargetCRS <em>Target CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTargetDimensions <em>Target Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalCRS <em>Temporal CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalCRSRef <em>Temporal CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalCS <em>Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalCSRef <em>Temporal CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalDatum <em>Temporal Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalDatum1 <em>Temporal Datum1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalDatum2 <em>Temporal Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalDatum3 <em>Temporal Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTemporalDatumRef <em>Temporal Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeCalendar <em>Time Calendar</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeReferenceSystem <em>Time Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeCalendarEra <em>Time Calendar Era</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeClock <em>Time Clock</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeCoordinateSystem <em>Time Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeCS <em>Time CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeCS1 <em>Time CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeCS2 <em>Time CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeCS3 <em>Time CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeEdge <em>Time Edge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeInstant <em>Time Instant</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeNode <em>Time Node</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeOrdinalEra <em>Time Ordinal Era</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeOrdinalReferenceSystem <em>Time Ordinal Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimePosition <em>Time Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTimeTopologyComplex <em>Time Topology Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTin <em>Tin</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTriangulatedSurface <em>Triangulated Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoComplex <em>Topo Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoComplexProperty <em>Topo Complex Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoCurve <em>Topo Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoCurveProperty <em>Topo Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoPoint <em>Topo Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoPointProperty <em>Topo Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoPrimitiveMember <em>Topo Primitive Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoPrimitiveMembers <em>Topo Primitive Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoSolid <em>Topo Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoSurface <em>Topo Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoSurfaceProperty <em>Topo Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoVolume <em>Topo Volume</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTopoVolumeProperty <em>Topo Volume Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTransformationRef <em>Transformation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTriangle <em>Triangle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTrianglePatches <em>Triangle Patches</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getTupleList <em>Tuple List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUserDefinedCS <em>User Defined CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUserDefinedCS1 <em>User Defined CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUserDefinedCS2 <em>User Defined CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUserDefinedCS3 <em>User Defined CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUserDefinedCSRef <em>User Defined CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesAffineCS <em>Uses Affine CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesAxis <em>Uses Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesCS <em>Uses CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesEllipsoid <em>Uses Ellipsoid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesEngineeringDatum <em>Uses Engineering Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesImageDatum <em>Uses Image Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesMethod <em>Uses Method</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesObliqueCartesianCS <em>Uses Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesOperation <em>Uses Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesParameter <em>Uses Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesPrimeMeridian <em>Uses Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesSingleOperation <em>Uses Single Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesSphericalCS <em>Uses Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesTemporalCS <em>Uses Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesTemporalDatum <em>Uses Temporal Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesTimeCS <em>Uses Time CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesValue <em>Uses Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesVerticalCS <em>Uses Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalCS <em>Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsesVerticalDatum <em>Uses Vertical Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalDatum <em>Vertical Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUsing <em>Using</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValueArray <em>Value Array</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValueComponents <em>Value Components</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValueFile <em>Value File</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValueOfParameter <em>Value Of Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValueProperty <em>Value Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getValuesOfGroup <em>Values Of Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalCRS <em>Vertical CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalCRSRef <em>Vertical CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalCS2 <em>Vertical CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalCS3 <em>Vertical CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalCSRef <em>Vertical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalDatum2 <em>Vertical Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalDatum3 <em>Vertical Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getVerticalDatumRef <em>Vertical Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GMLDocumentRootImpl#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GMLDocumentRootImpl extends MinimalEObjectImpl.Container implements GMLDocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBooleanList() <em>Boolean List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanList()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> BOOLEAN_LIST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCountExtent() <em>Count Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountExtent()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> COUNT_EXTENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCountList() <em>Count List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountList()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> COUNT_LIST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDecimalMinutes() <em>Decimal Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DECIMAL_MINUTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDefaultCodeSpace() <em>Default Code Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCodeSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CODE_SPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDoubleOrNilReasonTupleList() <em>Double Or Nil Reason Tuple List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleOrNilReasonTupleList()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> DOUBLE_OR_NIL_REASON_TUPLE_LIST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGmlProfileSchema() <em>Gml Profile Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlProfileSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String GML_PROFILE_SCHEMA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INTEGER_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIntegerValueList() <em>Integer Value List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValueList()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> INTEGER_VALUE_LIST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaximumOccurs() <em>Maximum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_OCCURS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_VALUE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinimumOccurs() <em>Minimum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_OCCURS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_VALUE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINUTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModifiedCoordinate() <em>Modified Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MODIFIED_COORDINATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected static final Object NULL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOperationVersion() <em>Operation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ORIGIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRealizationEpoch() <em>Realization Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizationEpoch()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REALIZATION_EPOCH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReversePropertyName() <em>Reverse Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReversePropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String REVERSE_PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SECONDS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSourceDimensions() <em>Source Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOURCE_DIMENSIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetDimensions() <em>Target Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TARGET_DIMENSIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ELEMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValueFile() <em>Value File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFile()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FILE_EDEFAULT = null;

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
	 * The default value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected String remoteSchema = REMOTE_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected String uom = UOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMLDocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getGMLDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GMLPackage.GML_DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GMLPackage.GML_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GMLPackage.GML_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationRoleType getAbstractAssociationRole() {
		return (AssociationRoleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractAssociationRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractAssociationRole(AssociationRoleType newAbstractAssociationRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractAssociationRole(), newAbstractAssociationRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractContinuousCoverageType getAbstractContinuousCoverage() {
		return (AbstractContinuousCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractContinuousCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractContinuousCoverage(AbstractContinuousCoverageType newAbstractContinuousCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractContinuousCoverage(), newAbstractContinuousCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFeatureType getAbstractFeature() {
		return (AbstractFeatureType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractFeature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFeature(AbstractFeatureType newAbstractFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractFeature(), newAbstractFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGMLType getAbstractGML() {
		return (AbstractGMLType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGML(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGML(AbstractGMLType newAbstractGML, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGML(), newAbstractGML, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAbstractObject() {
		return (EObject)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractObject(EObject newAbstractObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractObject(), newAbstractObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCoordinateOperationType getAbstractCoordinateOperation() {
		return (AbstractCoordinateOperationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCoordinateOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCoordinateOperation(AbstractCoordinateOperationType newAbstractCoordinateOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCoordinateOperation(), newAbstractCoordinateOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionType getDefinition() {
		return (DefinitionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Definition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(DefinitionType newDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Definition(), newDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(DefinitionType newDefinition) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Definition(), newDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCoordinateSystemType getAbstractCoordinateSystem() {
		return (AbstractCoordinateSystemType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCoordinateSystem(AbstractCoordinateSystemType newAbstractCoordinateSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCoordinateSystem(), newAbstractCoordinateSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCoverageType getAbstractCoverage() {
		return (AbstractCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCoverage(AbstractCoverageType newAbstractCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCoverage(), newAbstractCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCRSType getAbstractCRS() {
		return (AbstractCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCRS(AbstractCRSType newAbstractCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCRS(), newAbstractCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCurveType getAbstractCurve() {
		return (AbstractCurveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCurve(AbstractCurveType newAbstractCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCurve(), newAbstractCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeometricPrimitiveType getAbstractGeometricPrimitive() {
		return (AbstractGeometricPrimitiveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeometricPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeometricPrimitive(AbstractGeometricPrimitiveType newAbstractGeometricPrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeometricPrimitive(), newAbstractGeometricPrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeometryType getAbstractGeometry() {
		return (AbstractGeometryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeometry(AbstractGeometryType newAbstractGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeometry(), newAbstractGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCurveSegmentType getAbstractCurveSegment() {
		return (AbstractCurveSegmentType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCurveSegment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCurveSegment(AbstractCurveSegmentType newAbstractCurveSegment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractCurveSegment(), newAbstractCurveSegment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDatumType getAbstractDatum() {
		return (AbstractDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDatum(AbstractDatumType newAbstractDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractDatum(), newAbstractDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteCoverageType getAbstractDiscreteCoverage() {
		return (DiscreteCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractDiscreteCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDiscreteCoverage(DiscreteCoverageType newAbstractDiscreteCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractDiscreteCoverage(), newAbstractDiscreteCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFeatureCollectionType getAbstractFeatureCollection() {
		return (AbstractFeatureCollectionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractFeatureCollection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFeatureCollection(AbstractFeatureCollectionType newAbstractFeatureCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractFeatureCollection(), newAbstractFeatureCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralConversionType getAbstractGeneralConversion() {
		return (AbstractGeneralConversionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralConversion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeneralConversion(AbstractGeneralConversionType newAbstractGeneralConversion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralConversion(), newAbstractGeneralConversion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCoordinateOperationType getAbstractOperation() {
		return (AbstractCoordinateOperationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractOperation(AbstractCoordinateOperationType newAbstractOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractOperation(), newAbstractOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCoordinateOperationType getAbstractSingleOperation() {
		return (AbstractCoordinateOperationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSingleOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSingleOperation(AbstractCoordinateOperationType newAbstractSingleOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSingleOperation(), newAbstractSingleOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralDerivedCRSType getAbstractGeneralDerivedCRS() {
		return (AbstractGeneralDerivedCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralDerivedCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeneralDerivedCRS(AbstractGeneralDerivedCRSType newAbstractGeneralDerivedCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralDerivedCRS(), newAbstractGeneralDerivedCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCRSType getAbstractSingleCRS() {
		return (AbstractCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSingleCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSingleCRS(AbstractCRSType newAbstractSingleCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSingleCRS(), newAbstractSingleCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralOperationParameterType getAbstractGeneralOperationParameter() {
		return (AbstractGeneralOperationParameterType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralOperationParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeneralOperationParameter(AbstractGeneralOperationParameterType newAbstractGeneralOperationParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralOperationParameter(), newAbstractGeneralOperationParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralOperationParameterPropertyType getAbstractGeneralOperationParameterRef() {
		return (AbstractGeneralOperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralOperationParameterRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeneralOperationParameterRef(AbstractGeneralOperationParameterPropertyType newAbstractGeneralOperationParameterRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralOperationParameterRef(), newAbstractGeneralOperationParameterRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractGeneralOperationParameterRef(AbstractGeneralOperationParameterPropertyType newAbstractGeneralOperationParameterRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralOperationParameterRef(), newAbstractGeneralOperationParameterRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralParameterValueType getAbstractGeneralParameterValue() {
		return (AbstractGeneralParameterValueType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralParameterValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeneralParameterValue(AbstractGeneralParameterValueType newAbstractGeneralParameterValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralParameterValue(), newAbstractGeneralParameterValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralTransformationType getAbstractGeneralTransformation() {
		return (AbstractGeneralTransformationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralTransformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeneralTransformation(AbstractGeneralTransformationType newAbstractGeneralTransformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeneralTransformation(), newAbstractGeneralTransformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeometricAggregateType getAbstractGeometricAggregate() {
		return (AbstractGeometricAggregateType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeometricAggregate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeometricAggregate(AbstractGeometricAggregateType newAbstractGeometricAggregate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGeometricAggregate(), newAbstractGeometricAggregate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGriddedSurfaceType getAbstractGriddedSurface() {
		return (AbstractGriddedSurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGriddedSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGriddedSurface(AbstractGriddedSurfaceType newAbstractGriddedSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractGriddedSurface(), newAbstractGriddedSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractParametricCurveSurfaceType getAbstractParametricCurveSurface() {
		return (AbstractParametricCurveSurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractParametricCurveSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractParametricCurveSurface(AbstractParametricCurveSurfaceType newAbstractParametricCurveSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractParametricCurveSurface(), newAbstractParametricCurveSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractSurfacePatchType getAbstractSurfacePatch() {
		return (AbstractSurfacePatchType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSurfacePatch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSurfacePatch(AbstractSurfacePatchType newAbstractSurfacePatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSurfacePatch(), newAbstractSurfacePatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeometryType getAbstractImplicitGeometry() {
		return (AbstractGeometryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractImplicitGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractImplicitGeometry(AbstractGeometryType newAbstractImplicitGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractImplicitGeometry(), newAbstractImplicitGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlinePropertyType getAbstractInlineProperty() {
		return (InlinePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractInlineProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractInlineProperty(InlinePropertyType newAbstractInlineProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractInlineProperty(), newAbstractInlineProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMetaDataType getAbstractMetaData() {
		return (AbstractMetaDataType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractMetaData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractMetaData(AbstractMetaDataType newAbstractMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractMetaData(), newAbstractMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getAbstractReference() {
		return (ReferenceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractReference(ReferenceType newAbstractReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractReference(), newAbstractReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRingType getAbstractRing() {
		return (AbstractRingType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractRing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractRing(AbstractRingType newAbstractRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractRing(), newAbstractRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAbstractScalarValue() {
		return (EObject)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractScalarValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractScalarValue(EObject newAbstractScalarValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractScalarValue(), newAbstractScalarValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAbstractValue() {
		return (EObject)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractValue(EObject newAbstractValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractValue(), newAbstractValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAbstractScalarValueList() {
		return (EObject)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractScalarValueList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractScalarValueList(EObject newAbstractScalarValueList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractScalarValueList(), newAbstractScalarValueList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractSolidType getAbstractSolid() {
		return (AbstractSolidType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSolid(AbstractSolidType newAbstractSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSolid(), newAbstractSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationRoleType getAbstractStrictAssociationRole() {
		return (AssociationRoleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractStrictAssociationRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractStrictAssociationRole(AssociationRoleType newAbstractStrictAssociationRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractStrictAssociationRole(), newAbstractStrictAssociationRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractSurfaceType getAbstractSurface() {
		return (AbstractSurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSurface(AbstractSurfaceType newAbstractSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractSurface(), newAbstractSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimeComplexType getAbstractTimeComplex() {
		return (AbstractTimeComplexType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimeComplex(AbstractTimeComplexType newAbstractTimeComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeComplex(), newAbstractTimeComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimeObjectType getAbstractTimeObject() {
		return (AbstractTimeObjectType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimeObject(AbstractTimeObjectType newAbstractTimeObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeObject(), newAbstractTimeObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimeGeometricPrimitiveType getAbstractTimeGeometricPrimitive() {
		return (AbstractTimeGeometricPrimitiveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeGeometricPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimeGeometricPrimitive(AbstractTimeGeometricPrimitiveType newAbstractTimeGeometricPrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeGeometricPrimitive(), newAbstractTimeGeometricPrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimePrimitiveType getAbstractTimePrimitive() {
		return (AbstractTimePrimitiveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimePrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimePrimitive(AbstractTimePrimitiveType newAbstractTimePrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimePrimitive(), newAbstractTimePrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimeSliceType getAbstractTimeSlice() {
		return (AbstractTimeSliceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeSlice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimeSlice(AbstractTimeSliceType newAbstractTimeSlice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeSlice(), newAbstractTimeSlice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimeTopologyPrimitiveType getAbstractTimeTopologyPrimitive() {
		return (AbstractTimeTopologyPrimitiveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeTopologyPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimeTopologyPrimitive(AbstractTimeTopologyPrimitiveType newAbstractTimeTopologyPrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTimeTopologyPrimitive(), newAbstractTimeTopologyPrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTopologyType getAbstractTopology() {
		return (AbstractTopologyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTopology(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTopology(AbstractTopologyType newAbstractTopology, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTopology(), newAbstractTopology, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTopoPrimitiveType getAbstractTopoPrimitive() {
		return (AbstractTopoPrimitiveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTopoPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTopoPrimitive(AbstractTopoPrimitiveType newAbstractTopoPrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AbstractTopoPrimitive(), newAbstractTopoPrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineCSPropertyType getAffineCS() {
		return (AffineCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffineCS(AffineCSPropertyType newAffineCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS(), newAffineCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffineCS(AffineCSPropertyType newAffineCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS(), newAffineCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineCSPropertyType getAffineCS1() {
		return (AffineCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffineCS1(AffineCSPropertyType newAffineCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS1(), newAffineCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffineCS1(AffineCSPropertyType newAffineCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS1(), newAffineCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineCSType getAffineCS2() {
		return (AffineCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffineCS2(AffineCSType newAffineCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS2(), newAffineCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffineCS2(AffineCSType newAffineCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS2(), newAffineCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineCSType getAffineCS3() {
		return (AffineCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffineCS3(AffineCSType newAffineCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS3(), newAffineCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffineCS3(AffineCSType newAffineCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffineCS3(), newAffineCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffinePlacementType getAffinePlacement() {
		return (AffinePlacementType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffinePlacement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffinePlacement(AffinePlacementType newAffinePlacement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffinePlacement(), newAffinePlacement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffinePlacement(AffinePlacementType newAffinePlacement) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AffinePlacement(), newAffinePlacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAnchorDefinition() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AnchorDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchorDefinition(CodeType newAnchorDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AnchorDefinition(), newAnchorDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchorDefinition(CodeType newAnchorDefinition) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AnchorDefinition(), newAnchorDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAnchorPoint() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AnchorPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchorPoint(CodeType newAnchorPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AnchorPoint(), newAnchorPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchorPoint(CodeType newAnchorPoint) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AnchorPoint(), newAnchorPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleType getAngle() {
		return (AngleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Angle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(AngleType newAngle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Angle(), newAngle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngle(AngleType newAngle) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Angle(), newAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType getArc() {
		return (ArcType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Arc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArc(ArcType newArc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Arc(), newArc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArc(ArcType newArc) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Arc(), newArc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcStringType getArcString() {
		return (ArcStringType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcString(ArcStringType newArcString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcString(), newArcString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcString(ArcStringType newArcString) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcString(), newArcString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcByBulgeType getArcByBulge() {
		return (ArcByBulgeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcByBulge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcByBulge(ArcByBulgeType newArcByBulge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcByBulge(), newArcByBulge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcByBulge(ArcByBulgeType newArcByBulge) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcByBulge(), newArcByBulge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcStringByBulgeType getArcStringByBulge() {
		return (ArcStringByBulgeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcStringByBulge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcStringByBulge(ArcStringByBulgeType newArcStringByBulge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcStringByBulge(), newArcStringByBulge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcStringByBulge(ArcStringByBulgeType newArcStringByBulge) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcStringByBulge(), newArcStringByBulge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcByCenterPointType getArcByCenterPoint() {
		return (ArcByCenterPointType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcByCenterPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcByCenterPoint(ArcByCenterPointType newArcByCenterPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcByCenterPoint(), newArcByCenterPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcByCenterPoint(ArcByCenterPointType newArcByCenterPoint) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ArcByCenterPoint(), newArcByCenterPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType getArray() {
		return (ArrayType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Array(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(ArrayType newArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Array(), newArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArray(ArrayType newArray) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Array(), newArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssociationName() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AssociationName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociationName(String newAssociationName) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AssociationName(), newAssociationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemAxisPropertyType getAxis() {
		return (CoordinateSystemAxisPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Axis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis(CoordinateSystemAxisPropertyType newAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Axis(), newAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxis(CoordinateSystemAxisPropertyType newAxis) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Axis(), newAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAxisAbbrev() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AxisAbbrev(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisAbbrev(CodeType newAxisAbbrev, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AxisAbbrev(), newAxisAbbrev, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxisAbbrev(CodeType newAxisAbbrev) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AxisAbbrev(), newAxisAbbrev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getAxisDirection() {
		return (CodeWithAuthorityType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_AxisDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisDirection(CodeWithAuthorityType newAxisDirection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_AxisDirection(), newAxisDirection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxisDirection(CodeWithAuthorityType newAxisDirection) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_AxisDirection(), newAxisDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BagType getBag() {
		return (BagType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Bag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBag(BagType newBag, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Bag(), newBag, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBag(BagType newBag) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Bag(), newBag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleCRSPropertyType getBaseCRS() {
		return (SingleCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseCRS(SingleCRSPropertyType newBaseCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseCRS(), newBaseCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseCRS(SingleCRSPropertyType newBaseCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseCRS(), newBaseCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePropertyType getBaseCurve() {
		return (CurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseCurve(CurvePropertyType newBaseCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseCurve(), newBaseCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseCurve(CurvePropertyType newBaseCurve) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseCurve(), newBaseCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticCRSPropertyType getBaseGeodeticCRS() {
		return (GeodeticCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseGeodeticCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseGeodeticCRS(GeodeticCRSPropertyType newBaseGeodeticCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseGeodeticCRS(), newBaseGeodeticCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseGeodeticCRS(GeodeticCRSPropertyType newBaseGeodeticCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseGeodeticCRS(), newBaseGeodeticCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicCRSPropertyType getBaseGeographicCRS() {
		return (GeographicCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseGeographicCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseGeographicCRS(GeographicCRSPropertyType newBaseGeographicCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseGeographicCRS(), newBaseGeographicCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseGeographicCRS(GeographicCRSPropertyType newBaseGeographicCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseGeographicCRS(), newBaseGeographicCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePropertyType getBaseSurface() {
		return (SurfacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseSurface(SurfacePropertyType newBaseSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseSurface(), newBaseSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseSurface(SurfacePropertyType newBaseSurface) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseSurface(), newBaseSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseUnitType getBaseUnit() {
		return (BaseUnitType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseUnit(BaseUnitType newBaseUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseUnit(), newBaseUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseUnit(BaseUnitType newBaseUnit) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BaseUnit(), newBaseUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitDefinitionType getUnitDefinition() {
		return (UnitDefinitionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UnitDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitDefinition(UnitDefinitionType newUnitDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UnitDefinition(), newUnitDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitDefinition(UnitDefinitionType newUnitDefinition) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UnitDefinition(), newUnitDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BezierType getBezier() {
		return (BezierType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Bezier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezier(BezierType newBezier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Bezier(), newBezier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezier(BezierType newBezier) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Bezier(), newBezier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSplineType getBSpline() {
		return (BSplineType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BSpline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBSpline(BSplineType newBSpline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_BSpline(), newBSpline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBSpline(BSplineType newBSpline) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BSpline(), newBSpline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanType getBoolean() {
		return (BooleanType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Boolean(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolean(BooleanType newBoolean, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Boolean(), newBoolean, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoolean(BooleanType newBoolean) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Boolean(), newBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getBooleanList() {
		return (List<Object>)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BooleanList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanList(List<Object> newBooleanList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BooleanList(), newBooleanList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBooleanValue() {
		return (Boolean)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BooleanValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanValue(boolean newBooleanValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BooleanValue(), newBooleanValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingShapeType getBoundedBy() {
		return (BoundingShapeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_BoundedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundedBy(BoundingShapeType newBoundedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_BoundedBy(), newBoundedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundedBy(BoundingShapeType newBoundedBy) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_BoundedBy(), newBoundedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSPropertyType getCartesianCS() {
		return (CartesianCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS(CartesianCSPropertyType newCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS(), newCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCS(CartesianCSPropertyType newCartesianCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS(), newCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSPropertyType getCartesianCS1() {
		return (CartesianCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS1(CartesianCSPropertyType newCartesianCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS1(), newCartesianCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCS1(CartesianCSPropertyType newCartesianCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS1(), newCartesianCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSType getCartesianCS2() {
		return (CartesianCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS2(CartesianCSType newCartesianCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS2(), newCartesianCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCS2(CartesianCSType newCartesianCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS2(), newCartesianCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSType getCartesianCS3() {
		return (CartesianCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS3(CartesianCSType newCartesianCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS3(), newCartesianCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCS3(CartesianCSType newCartesianCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCS3(), newCartesianCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSPropertyType getCartesianCSRef() {
		return (CartesianCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCSRef(CartesianCSPropertyType newCartesianCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCSRef(), newCartesianCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCSRef(CartesianCSPropertyType newCartesianCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CartesianCSRef(), newCartesianCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getCatalogSymbol() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CatalogSymbol(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogSymbol(CodeType newCatalogSymbol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CatalogSymbol(), newCatalogSymbol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogSymbol(CodeType newCatalogSymbol) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CatalogSymbol(), newCatalogSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CategoryType getCategory() {
		return (CategoryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Category(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CategoryType newCategory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Category(), newCategory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(CategoryType newCategory) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Category(), newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CategoryExtentType getCategoryExtent() {
		return (CategoryExtentType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CategoryExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategoryExtent(CategoryExtentType newCategoryExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CategoryExtent(), newCategoryExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryExtent(CategoryExtentType newCategoryExtent) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CategoryExtent(), newCategoryExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeOrNilReasonListType getCategoryList() {
		return (CodeOrNilReasonListType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CategoryList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategoryList(CodeOrNilReasonListType newCategoryList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CategoryList(), newCategoryList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryList(CodeOrNilReasonListType newCategoryList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CategoryList(), newCategoryList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePropertyType getCenterLineOf() {
		return (CurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CenterLineOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterLineOf(CurvePropertyType newCenterLineOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CenterLineOf(), newCenterLineOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCenterLineOf(CurvePropertyType newCenterLineOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CenterLineOf(), newCenterLineOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPropertyType getCenterOf() {
		return (PointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CenterOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterOf(PointPropertyType newCenterOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CenterOf(), newCenterOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCenterOf(PointPropertyType newCenterOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CenterOf(), newCenterOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleType getCircle() {
		return (CircleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Circle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircle(CircleType newCircle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Circle(), newCircle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCircle(CircleType newCircle) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Circle(), newCircle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleByCenterPointType getCircleByCenterPoint() {
		return (CircleByCenterPointType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CircleByCenterPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircleByCenterPoint(CircleByCenterPointType newCircleByCenterPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CircleByCenterPoint(), newCircleByCenterPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCircleByCenterPoint(CircleByCenterPointType newCircleByCenterPoint) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CircleByCenterPoint(), newCircleByCenterPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClothoidType getClothoid() {
		return (ClothoidType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Clothoid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClothoid(ClothoidType newClothoid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Clothoid(), newClothoid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClothoid(ClothoidType newClothoid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Clothoid(), newClothoid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleCRSPropertyType getComponentReferenceSystem() {
		return (SingleCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ComponentReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentReferenceSystem(SingleCRSPropertyType newComponentReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ComponentReferenceSystem(), newComponentReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentReferenceSystem(SingleCRSPropertyType newComponentReferenceSystem) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ComponentReferenceSystem(), newComponentReferenceSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeCurveType getCompositeCurve() {
		return (CompositeCurveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeCurve(CompositeCurveType newCompositeCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeCurve(), newCompositeCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompositeCurve(CompositeCurveType newCompositeCurve) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeCurve(), newCompositeCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeSolidType getCompositeSolid() {
		return (CompositeSolidType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeSolid(CompositeSolidType newCompositeSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeSolid(), newCompositeSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompositeSolid(CompositeSolidType newCompositeSolid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeSolid(), newCompositeSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeSurfaceType getCompositeSurface() {
		return (CompositeSurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeSurface(CompositeSurfaceType newCompositeSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeSurface(), newCompositeSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompositeSurface(CompositeSurfaceType newCompositeSurface) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeSurface(), newCompositeSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeValueType getCompositeValue() {
		return (CompositeValueType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeValue(CompositeValueType newCompositeValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeValue(), newCompositeValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompositeValue(CompositeValueType newCompositeValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompositeValue(), newCompositeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundCRSType getCompoundCRS() {
		return (CompoundCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompoundCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundCRS(CompoundCRSType newCompoundCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompoundCRS(), newCompoundCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompoundCRS(CompoundCRSType newCompoundCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompoundCRS(), newCompoundCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundCRSPropertyType getCompoundCRSRef() {
		return (CompoundCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompoundCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundCRSRef(CompoundCRSPropertyType newCompoundCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompoundCRSRef(), newCompoundCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompoundCRSRef(CompoundCRSPropertyType newCompoundCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CompoundCRSRef(), newCompoundCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcatenatedOperationType getConcatenatedOperation() {
		return (ConcatenatedOperationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConcatenatedOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcatenatedOperation(ConcatenatedOperationType newConcatenatedOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConcatenatedOperation(), newConcatenatedOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcatenatedOperation(ConcatenatedOperationType newConcatenatedOperation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConcatenatedOperation(), newConcatenatedOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcatenatedOperationPropertyType getConcatenatedOperationRef() {
		return (ConcatenatedOperationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConcatenatedOperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcatenatedOperationRef(ConcatenatedOperationPropertyType newConcatenatedOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConcatenatedOperationRef(), newConcatenatedOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcatenatedOperationRef(ConcatenatedOperationPropertyType newConcatenatedOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConcatenatedOperationRef(), newConcatenatedOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConeType getCone() {
		return (ConeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Cone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCone(ConeType newCone, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Cone(), newCone, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCone(ConeType newCone) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Cone(), newCone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConventionalUnitType getConventionalUnit() {
		return (ConventionalUnitType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConventionalUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConventionalUnit(ConventionalUnitType newConventionalUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConventionalUnit(), newConventionalUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConventionalUnit(ConventionalUnitType newConventionalUnit) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConventionalUnit(), newConventionalUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralConversionPropertyType getConversion() {
		return (GeneralConversionPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversion(GeneralConversionPropertyType newConversion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion(), newConversion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversion(GeneralConversionPropertyType newConversion) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion(), newConversion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralConversionPropertyType getConversion1() {
		return (GeneralConversionPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversion1(GeneralConversionPropertyType newConversion1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion1(), newConversion1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversion1(GeneralConversionPropertyType newConversion1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion1(), newConversion1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionType getConversion2() {
		return (ConversionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversion2(ConversionType newConversion2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion2(), newConversion2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversion2(ConversionType newConversion2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion2(), newConversion2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionType getConversion3() {
		return (ConversionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversion3(ConversionType newConversion3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion3(), newConversion3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversion3(ConversionType newConversion3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Conversion3(), newConversion3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionPropertyType getConversionRef() {
		return (ConversionPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConversionRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversionRef(ConversionPropertyType newConversionRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConversionRef(), newConversionRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversionRef(ConversionPropertyType newConversionRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConversionRef(), newConversionRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionToPreferredUnitType getConversionToPreferredUnit() {
		return (ConversionToPreferredUnitType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConversionToPreferredUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversionToPreferredUnit(ConversionToPreferredUnitType newConversionToPreferredUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConversionToPreferredUnit(), newConversionToPreferredUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversionToPreferredUnit(ConversionToPreferredUnitType newConversionToPreferredUnit) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ConversionToPreferredUnit(), newConversionToPreferredUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateOperationAccuracyType getCoordinateOperationAccuracy() {
		return (CoordinateOperationAccuracyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateOperationAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateOperationAccuracy(CoordinateOperationAccuracyType newCoordinateOperationAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateOperationAccuracy(), newCoordinateOperationAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinateOperationAccuracy(CoordinateOperationAccuracyType newCoordinateOperationAccuracy) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateOperationAccuracy(), newCoordinateOperationAccuracy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateOperationPropertyType getCoordinateOperationRef() {
		return (CoordinateOperationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateOperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateOperationRef(CoordinateOperationPropertyType newCoordinateOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateOperationRef(), newCoordinateOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinateOperationRef(CoordinateOperationPropertyType newCoordinateOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateOperationRef(), newCoordinateOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinatesType getCoordinates() {
		return (CoordinatesType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Coordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinates(CoordinatesType newCoordinates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Coordinates(), newCoordinates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinates(CoordinatesType newCoordinates) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Coordinates(), newCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemPropertyType getCoordinateSystem() {
		return (CoordinateSystemPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(CoordinateSystemPropertyType newCoordinateSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystem(), newCoordinateSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinateSystem(CoordinateSystemPropertyType newCoordinateSystem) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystem(), newCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemAxisType getCoordinateSystemAxis() {
		return (CoordinateSystemAxisType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemAxis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystemAxis(CoordinateSystemAxisType newCoordinateSystemAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemAxis(), newCoordinateSystemAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinateSystemAxis(CoordinateSystemAxisType newCoordinateSystemAxis) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemAxis(), newCoordinateSystemAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemAxisPropertyType getCoordinateSystemAxisRef() {
		return (CoordinateSystemAxisPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemAxisRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystemAxisRef(CoordinateSystemAxisPropertyType newCoordinateSystemAxisRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemAxisRef(), newCoordinateSystemAxisRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinateSystemAxisRef(CoordinateSystemAxisPropertyType newCoordinateSystemAxisRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemAxisRef(), newCoordinateSystemAxisRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemPropertyType getCoordinateSystemRef() {
		return (CoordinateSystemPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystemRef(CoordinateSystemPropertyType newCoordinateSystemRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemRef(), newCoordinateSystemRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinateSystemRef(CoordinateSystemPropertyType newCoordinateSystemRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordinateSystemRef(), newCoordinateSystemRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateOperationPropertyType getCoordOperation() {
		return (CoordinateOperationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordOperation(CoordinateOperationPropertyType newCoordOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordOperation(), newCoordOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordOperation(CoordinateOperationPropertyType newCoordOperation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoordOperation(), newCoordOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountType getCount() {
		return (CountType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Count(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(CountType newCount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Count(), newCount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(CountType newCount) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Count(), newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getCountExtent() {
		return (List<Object>)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CountExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountExtent(List<Object> newCountExtent) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CountExtent(), newCountExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getCountList() {
		return (List<Object>)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CountList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountList(List<Object> newCountList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CountList(), newCountList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageFunctionType getCoverageFunction() {
		return (CoverageFunctionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoverageFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageFunction(CoverageFunctionType newCoverageFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoverageFunction(), newCoverageFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverageFunction(CoverageFunctionType newCoverageFunction) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoverageFunction(), newCoverageFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingRuleType getCoverageMappingRule() {
		return (MappingRuleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoverageMappingRule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageMappingRule(MappingRuleType newCoverageMappingRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoverageMappingRule(), newCoverageMappingRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverageMappingRule(MappingRuleType newCoverageMappingRule) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CoverageMappingRule(), newCoverageMappingRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CRSPropertyType getCrsRef() {
		return (CRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CrsRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrsRef(CRSPropertyType newCrsRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CrsRef(), newCrsRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrsRef(CRSPropertyType newCrsRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CrsRef(), newCrsRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CubicSplineType getCubicSpline() {
		return (CubicSplineType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CubicSpline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCubicSpline(CubicSplineType newCubicSpline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CubicSpline(), newCubicSpline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCubicSpline(CubicSplineType newCubicSpline) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CubicSpline(), newCubicSpline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveType getCurve() {
		return (CurveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Curve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurve(CurveType newCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Curve(), newCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurve(CurveType newCurve) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Curve(), newCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveArrayPropertyType getCurveArrayProperty() {
		return (CurveArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveArrayProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveArrayProperty(CurveArrayPropertyType newCurveArrayProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveArrayProperty(), newCurveArrayProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurveArrayProperty(CurveArrayPropertyType newCurveArrayProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveArrayProperty(), newCurveArrayProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePropertyType getCurveMember() {
		return (CurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveMember(CurvePropertyType newCurveMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveMember(), newCurveMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurveMember(CurvePropertyType newCurveMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveMember(), newCurveMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveArrayPropertyType getCurveMembers() {
		return (CurveArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveMembers(CurveArrayPropertyType newCurveMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveMembers(), newCurveMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurveMembers(CurveArrayPropertyType newCurveMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveMembers(), newCurveMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePropertyType getCurveProperty() {
		return (CurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveProperty(CurvePropertyType newCurveProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveProperty(), newCurveProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurveProperty(CurvePropertyType newCurveProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CurveProperty(), newCurveProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylinderType getCylinder() {
		return (CylinderType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Cylinder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylinder(CylinderType newCylinder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Cylinder(), newCylinder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylinder(CylinderType newCylinder) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Cylinder(), newCylinder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylindricalCSPropertyType getCylindricalCS() {
		return (CylindricalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylindricalCS(CylindricalCSPropertyType newCylindricalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS(), newCylindricalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylindricalCS(CylindricalCSPropertyType newCylindricalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS(), newCylindricalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylindricalCSPropertyType getCylindricalCS1() {
		return (CylindricalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylindricalCS1(CylindricalCSPropertyType newCylindricalCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS1(), newCylindricalCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylindricalCS1(CylindricalCSPropertyType newCylindricalCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS1(), newCylindricalCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylindricalCSType getCylindricalCS2() {
		return (CylindricalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylindricalCS2(CylindricalCSType newCylindricalCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS2(), newCylindricalCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylindricalCS2(CylindricalCSType newCylindricalCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS2(), newCylindricalCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylindricalCSType getCylindricalCS3() {
		return (CylindricalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylindricalCS3(CylindricalCSType newCylindricalCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS3(), newCylindricalCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylindricalCS3(CylindricalCSType newCylindricalCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCS3(), newCylindricalCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylindricalCSPropertyType getCylindricalCSRef() {
		return (CylindricalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylindricalCSRef(CylindricalCSPropertyType newCylindricalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCSRef(), newCylindricalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylindricalCSRef(CylindricalCSPropertyType newCylindricalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_CylindricalCSRef(), newCylindricalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataBlockType getDataBlock() {
		return (DataBlockType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataBlock(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataBlock(DataBlockType newDataBlock, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataBlock(), newDataBlock, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataBlock(DataBlockType newDataBlock) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataBlock(), newDataBlock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getDataSource() {
		return (StringOrRefType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(StringOrRefType newDataSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataSource(), newDataSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSource(StringOrRefType newDataSource) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataSource(), newDataSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getDataSourceReference() {
		return (ReferenceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataSourceReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSourceReference(ReferenceType newDataSourceReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataSourceReference(), newDataSourceReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceReference(ReferenceType newDataSourceReference) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DataSourceReference(), newDataSourceReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatumPropertyType getDatumRef() {
		return (DatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumRef(DatumPropertyType newDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DatumRef(), newDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatumRef(DatumPropertyType newDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DatumRef(), newDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDecimalMinutes() {
		return (BigDecimal)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DecimalMinutes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimalMinutes(BigDecimal newDecimalMinutes) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DecimalMinutes(), newDecimalMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCodeSpace() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefaultCodeSpace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCodeSpace(String newDefaultCodeSpace) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefaultCodeSpace(), newDefaultCodeSpace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralConversionPropertyType getDefinedByConversion() {
		return (GeneralConversionPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinedByConversion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedByConversion(GeneralConversionPropertyType newDefinedByConversion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinedByConversion(), newDefinedByConversion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinedByConversion(GeneralConversionPropertyType newDefinedByConversion) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinedByConversion(), newDefinedByConversion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictionaryType getDefinitionCollection() {
		return (DictionaryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionCollection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCollection(DictionaryType newDefinitionCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionCollection(), newDefinitionCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionCollection(DictionaryType newDefinitionCollection) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionCollection(), newDefinitionCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictionaryEntryType getDefinitionMember() {
		return (DictionaryEntryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionMember(DictionaryEntryType newDefinitionMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionMember(), newDefinitionMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionMember(DictionaryEntryType newDefinitionMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionMember(), newDefinitionMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictionaryEntryType getDictionaryEntry() {
		return (DictionaryEntryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DictionaryEntry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionaryEntry(DictionaryEntryType newDictionaryEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DictionaryEntry(), newDictionaryEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDictionaryEntry(DictionaryEntryType newDictionaryEntry) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DictionaryEntry(), newDictionaryEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionProxyType getDefinitionProxy() {
		return (DefinitionProxyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionProxy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionProxy(DefinitionProxyType newDefinitionProxy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionProxy(), newDefinitionProxy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionProxy(DefinitionProxyType newDefinitionProxy) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionProxy(), newDefinitionProxy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getDefinitionRef() {
		return (ReferenceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionRef(ReferenceType newDefinitionRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionRef(), newDefinitionRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionRef(ReferenceType newDefinitionRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DefinitionRef(), newDefinitionRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreesType getDegrees() {
		return (DegreesType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Degrees(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegrees(DegreesType newDegrees, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Degrees(), newDegrees, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegrees(DegreesType newDegrees) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Degrees(), newDegrees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivationUnitTermType getDerivationUnitTerm() {
		return (DerivationUnitTermType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivationUnitTerm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationUnitTerm(DerivationUnitTermType newDerivationUnitTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivationUnitTerm(), newDerivationUnitTerm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivationUnitTerm(DerivationUnitTermType newDerivationUnitTerm) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivationUnitTerm(), newDerivationUnitTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedCRSType getDerivedCRS() {
		return (DerivedCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedCRS(DerivedCRSType newDerivedCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRS(), newDerivedCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedCRS(DerivedCRSType newDerivedCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRS(), newDerivedCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedCRSPropertyType getDerivedCRSRef() {
		return (DerivedCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedCRSRef(DerivedCRSPropertyType newDerivedCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRSRef(), newDerivedCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedCRSRef(DerivedCRSPropertyType newDerivedCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRSRef(), newDerivedCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getDerivedCRSType() {
		return (CodeWithAuthorityType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRSType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedCRSType(CodeWithAuthorityType newDerivedCRSType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRSType(), newDerivedCRSType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedCRSType(CodeWithAuthorityType newDerivedCRSType) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedCRSType(), newDerivedCRSType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedUnitType getDerivedUnit() {
		return (DerivedUnitType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedUnit(DerivedUnitType newDerivedUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedUnit(), newDerivedUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedUnit(DerivedUnitType newDerivedUnit) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DerivedUnit(), newDerivedUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getDescription() {
		return (StringOrRefType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringOrRefType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Description(), newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(StringOrRefType newDescription) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getDescriptionReference() {
		return (ReferenceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DescriptionReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionReference(ReferenceType newDescriptionReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DescriptionReference(), newDescriptionReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptionReference(ReferenceType newDescriptionReference) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DescriptionReference(), newDescriptionReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictionaryType getDictionary() {
		return (DictionaryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Dictionary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionary(DictionaryType newDictionary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Dictionary(), newDictionary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDictionary(DictionaryType newDictionary) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Dictionary(), newDictionary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedEdgePropertyType getDirectedEdge() {
		return (DirectedEdgePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedEdge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedEdge(DirectedEdgePropertyType newDirectedEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedEdge(), newDirectedEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectedEdge(DirectedEdgePropertyType newDirectedEdge) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedEdge(), newDirectedEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedFacePropertyType getDirectedFace() {
		return (DirectedFacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedFace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedFace(DirectedFacePropertyType newDirectedFace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedFace(), newDirectedFace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectedFace(DirectedFacePropertyType newDirectedFace) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedFace(), newDirectedFace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedNodePropertyType getDirectedNode() {
		return (DirectedNodePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedNode(DirectedNodePropertyType newDirectedNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedNode(), newDirectedNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectedNode(DirectedNodePropertyType newDirectedNode) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedNode(), newDirectedNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedObservationType getDirectedObservation() {
		return (DirectedObservationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedObservation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedObservation(DirectedObservationType newDirectedObservation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedObservation(), newDirectedObservation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectedObservation(DirectedObservationType newDirectedObservation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedObservation(), newDirectedObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationType getObservation() {
		return (ObservationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Observation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(ObservationType newObservation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Observation(), newObservation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservation(ObservationType newObservation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Observation(), newObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedObservationAtDistanceType getDirectedObservationAtDistance() {
		return (DirectedObservationAtDistanceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedObservationAtDistance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedObservationAtDistance(DirectedObservationAtDistanceType newDirectedObservationAtDistance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedObservationAtDistance(), newDirectedObservationAtDistance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectedObservationAtDistance(DirectedObservationAtDistanceType newDirectedObservationAtDistance) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedObservationAtDistance(), newDirectedObservationAtDistance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedTopoSolidPropertyType getDirectedTopoSolid() {
		return (DirectedTopoSolidPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedTopoSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedTopoSolid(DirectedTopoSolidPropertyType newDirectedTopoSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedTopoSolid(), newDirectedTopoSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectedTopoSolid(DirectedTopoSolidPropertyType newDirectedTopoSolid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DirectedTopoSolid(), newDirectedTopoSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionPropertyType getDirection() {
		return (DirectionPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Direction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(DirectionPropertyType newDirection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Direction(), newDirection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(DirectionPropertyType newDirection) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Direction(), newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMSAngleType getDmsAngle() {
		return (DMSAngleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DmsAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDmsAngle(DMSAngleType newDmsAngle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DmsAngle(), newDmsAngle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDmsAngle(DMSAngleType newDmsAngle) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DmsAngle(), newDmsAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMSAngleType getDmsAngleValue() {
		return (DMSAngleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DmsAngleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDmsAngleValue(DMSAngleType newDmsAngleValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DmsAngleValue(), newDmsAngleValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDmsAngleValue(DMSAngleType newDmsAngleValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DmsAngleValue(), newDmsAngleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainOfValidityType getDomainOfValidity() {
		return (DomainOfValidityType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DomainOfValidity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainOfValidity(DomainOfValidityType newDomainOfValidity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DomainOfValidity(), newDomainOfValidity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainOfValidity(DomainOfValidityType newDomainOfValidity) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DomainOfValidity(), newDomainOfValidity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSetType getDomainSet() {
		return (DomainSetType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DomainSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainSet(DomainSetType newDomainSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DomainSet(), newDomainSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainSet(DomainSetType newDomainSet) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DomainSet(), newDomainSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getDoubleOrNilReasonTupleList() {
		return (List<Object>)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DoubleOrNilReasonTupleList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoubleOrNilReasonTupleList(List<Object> newDoubleOrNilReasonTupleList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DoubleOrNilReasonTupleList(), newDoubleOrNilReasonTupleList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Duration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Duration(), newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicFeatureType getDynamicFeature() {
		return (DynamicFeatureType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicFeature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicFeature(DynamicFeatureType newDynamicFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicFeature(), newDynamicFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamicFeature(DynamicFeatureType newDynamicFeature) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicFeature(), newDynamicFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicFeatureCollectionType getDynamicFeatureCollection() {
		return (DynamicFeatureCollectionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicFeatureCollection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicFeatureCollection(DynamicFeatureCollectionType newDynamicFeatureCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicFeatureCollection(), newDynamicFeatureCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamicFeatureCollection(DynamicFeatureCollectionType newDynamicFeatureCollection) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicFeatureCollection(), newDynamicFeatureCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicFeatureMemberType getDynamicMembers() {
		return (DynamicFeatureMemberType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicMembers(DynamicFeatureMemberType newDynamicMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicMembers(), newDynamicMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamicMembers(DynamicFeatureMemberType newDynamicMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_DynamicMembers(), newDynamicMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgeType getEdge() {
		return (EdgeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Edge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdge(EdgeType newEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Edge(), newEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdge(EdgeType newEdge) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Edge(), newEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePropertyType getEdgeOf() {
		return (CurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EdgeOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeOf(CurvePropertyType newEdgeOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EdgeOf(), newEdgeOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdgeOf(CurvePropertyType newEdgeOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EdgeOf(), newEdgeOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidPropertyType getEllipsoid() {
		return (EllipsoidPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoid(EllipsoidPropertyType newEllipsoid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid(), newEllipsoid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoid(EllipsoidPropertyType newEllipsoid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid(), newEllipsoid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidPropertyType getEllipsoid1() {
		return (EllipsoidPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoid1(EllipsoidPropertyType newEllipsoid1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid1(), newEllipsoid1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoid1(EllipsoidPropertyType newEllipsoid1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid1(), newEllipsoid1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidType getEllipsoid2() {
		return (EllipsoidType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoid2(EllipsoidType newEllipsoid2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid2(), newEllipsoid2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoid2(EllipsoidType newEllipsoid2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid2(), newEllipsoid2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidType getEllipsoid3() {
		return (EllipsoidType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoid3(EllipsoidType newEllipsoid3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid3(), newEllipsoid3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoid3(EllipsoidType newEllipsoid3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ellipsoid3(), newEllipsoid3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSPropertyType getEllipsoidalCS() {
		return (EllipsoidalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidalCS(EllipsoidalCSPropertyType newEllipsoidalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS(), newEllipsoidalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoidalCS(EllipsoidalCSPropertyType newEllipsoidalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS(), newEllipsoidalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSPropertyType getEllipsoidalCS1() {
		return (EllipsoidalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidalCS1(EllipsoidalCSPropertyType newEllipsoidalCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS1(), newEllipsoidalCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoidalCS1(EllipsoidalCSPropertyType newEllipsoidalCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS1(), newEllipsoidalCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSType getEllipsoidalCS2() {
		return (EllipsoidalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidalCS2(EllipsoidalCSType newEllipsoidalCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS2(), newEllipsoidalCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoidalCS2(EllipsoidalCSType newEllipsoidalCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS2(), newEllipsoidalCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSType getEllipsoidalCS3() {
		return (EllipsoidalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidalCS3(EllipsoidalCSType newEllipsoidalCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS3(), newEllipsoidalCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoidalCS3(EllipsoidalCSType newEllipsoidalCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCS3(), newEllipsoidalCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSPropertyType getEllipsoidalCSRef() {
		return (EllipsoidalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidalCSRef(EllipsoidalCSPropertyType newEllipsoidalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCSRef(), newEllipsoidalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoidalCSRef(EllipsoidalCSPropertyType newEllipsoidalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidalCSRef(), newEllipsoidalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidPropertyType getEllipsoidRef() {
		return (EllipsoidPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidRef(EllipsoidPropertyType newEllipsoidRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidRef(), newEllipsoidRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoidRef(EllipsoidPropertyType newEllipsoidRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EllipsoidRef(), newEllipsoidRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringCRSType getEngineeringCRS() {
		return (EngineeringCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringCRS(EngineeringCRSType newEngineeringCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringCRS(), newEngineeringCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineeringCRS(EngineeringCRSType newEngineeringCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringCRS(), newEngineeringCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringCRSPropertyType getEngineeringCRSRef() {
		return (EngineeringCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringCRSRef(EngineeringCRSPropertyType newEngineeringCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringCRSRef(), newEngineeringCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineeringCRSRef(EngineeringCRSPropertyType newEngineeringCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringCRSRef(), newEngineeringCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumPropertyType getEngineeringDatum() {
		return (EngineeringDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringDatum(EngineeringDatumPropertyType newEngineeringDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum(), newEngineeringDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineeringDatum(EngineeringDatumPropertyType newEngineeringDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum(), newEngineeringDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumPropertyType getEngineeringDatum1() {
		return (EngineeringDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringDatum1(EngineeringDatumPropertyType newEngineeringDatum1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum1(), newEngineeringDatum1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineeringDatum1(EngineeringDatumPropertyType newEngineeringDatum1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum1(), newEngineeringDatum1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumType getEngineeringDatum2() {
		return (EngineeringDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringDatum2(EngineeringDatumType newEngineeringDatum2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum2(), newEngineeringDatum2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineeringDatum2(EngineeringDatumType newEngineeringDatum2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum2(), newEngineeringDatum2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumType getEngineeringDatum3() {
		return (EngineeringDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringDatum3(EngineeringDatumType newEngineeringDatum3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum3(), newEngineeringDatum3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineeringDatum3(EngineeringDatumType newEngineeringDatum3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatum3(), newEngineeringDatum3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumPropertyType getEngineeringDatumRef() {
		return (EngineeringDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringDatumRef(EngineeringDatumPropertyType newEngineeringDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatumRef(), newEngineeringDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineeringDatumRef(EngineeringDatumPropertyType newEngineeringDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EngineeringDatumRef(), newEngineeringDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvelopeType getEnvelope() {
		return (EnvelopeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Envelope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvelope(EnvelopeType newEnvelope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Envelope(), newEnvelope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvelope(EnvelopeType newEnvelope) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Envelope(), newEnvelope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvelopeWithTimePeriodType getEnvelopeWithTimePeriod() {
		return (EnvelopeWithTimePeriodType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_EnvelopeWithTimePeriod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType newEnvelopeWithTimePeriod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_EnvelopeWithTimePeriod(), newEnvelopeWithTimePeriod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType newEnvelopeWithTimePeriod) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_EnvelopeWithTimePeriod(), newEnvelopeWithTimePeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePropertyType getExtentOf() {
		return (SurfacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ExtentOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtentOf(SurfacePropertyType newExtentOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ExtentOf(), newExtentOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentOf(SurfacePropertyType newExtentOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ExtentOf(), newExtentOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRingPropertyType getExterior() {
		return (AbstractRingPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Exterior(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExterior(AbstractRingPropertyType newExterior, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Exterior(), newExterior, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExterior(AbstractRingPropertyType newExterior) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Exterior(), newExterior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaceType getFace() {
		return (FaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Face(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFace(FaceType newFace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Face(), newFace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFace(FaceType newFace) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Face(), newFace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCollectionType getFeatureCollection() {
		return (FeatureCollectionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureCollection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureCollection(FeatureCollectionType newFeatureCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureCollection(), newFeatureCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureCollection(FeatureCollectionType newFeatureCollection) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureCollection(), newFeatureCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePropertyType getFeatureMember() {
		return (FeaturePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureMember(FeaturePropertyType newFeatureMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureMember(), newFeatureMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureMember(FeaturePropertyType newFeatureMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureMember(), newFeatureMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureArrayPropertyType getFeatureMembers() {
		return (FeatureArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureMembers(FeatureArrayPropertyType newFeatureMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureMembers(), newFeatureMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureMembers(FeatureArrayPropertyType newFeatureMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureMembers(), newFeatureMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePropertyType getFeatureProperty() {
		return (FeaturePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureProperty(FeaturePropertyType newFeatureProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureProperty(), newFeatureProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureProperty(FeaturePropertyType newFeatureProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_FeatureProperty(), newFeatureProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileType getFile() {
		return (FileType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_File(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_File(), newFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile(FileType newFile) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_File(), newFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getFormula() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Formula(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(CodeType newFormula, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Formula(), newFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormula(CodeType newFormula) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Formula(), newFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulaCitationType getFormulaCitation() {
		return (FormulaCitationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_FormulaCitation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormulaCitation(FormulaCitationType newFormulaCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_FormulaCitation(), newFormulaCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormulaCitation(FormulaCitationType newFormulaCitation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_FormulaCitation(), newFormulaCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralConversionPropertyType getGeneralConversionRef() {
		return (GeneralConversionPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralConversionRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralConversionRef(GeneralConversionPropertyType newGeneralConversionRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralConversionRef(), newGeneralConversionRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralConversionRef(GeneralConversionPropertyType newGeneralConversionRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralConversionRef(), newGeneralConversionRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralOperationParameterPropertyType getGeneralOperationParameter() {
		return (AbstractGeneralOperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralOperationParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralOperationParameter(AbstractGeneralOperationParameterPropertyType newGeneralOperationParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralOperationParameter(), newGeneralOperationParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralOperationParameter(AbstractGeneralOperationParameterPropertyType newGeneralOperationParameter) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralOperationParameter(), newGeneralOperationParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralOperationParameterPropertyType getGeneralOperationParameter1() {
		return (AbstractGeneralOperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralOperationParameter1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralOperationParameter1(AbstractGeneralOperationParameterPropertyType newGeneralOperationParameter1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralOperationParameter1(), newGeneralOperationParameter1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralOperationParameter1(AbstractGeneralOperationParameterPropertyType newGeneralOperationParameter1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralOperationParameter1(), newGeneralOperationParameter1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralTransformationPropertyType getGeneralTransformationRef() {
		return (GeneralTransformationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralTransformationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralTransformationRef(GeneralTransformationPropertyType newGeneralTransformationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralTransformationRef(), newGeneralTransformationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralTransformationRef(GeneralTransformationPropertyType newGeneralTransformationRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeneralTransformationRef(), newGeneralTransformationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMetaDataType getGenericMetaData() {
		return (GenericMetaDataType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GenericMetaData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericMetaData(GenericMetaDataType newGenericMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GenericMetaData(), newGenericMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenericMetaData(GenericMetaDataType newGenericMetaData) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GenericMetaData(), newGenericMetaData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeocentricCRSType getGeocentricCRS() {
		return (GeocentricCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeocentricCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeocentricCRS(GeocentricCRSType newGeocentricCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeocentricCRS(), newGeocentricCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeocentricCRS(GeocentricCRSType newGeocentricCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeocentricCRS(), newGeocentricCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeocentricCRSPropertyType getGeocentricCRSRef() {
		return (GeocentricCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeocentricCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeocentricCRSRef(GeocentricCRSPropertyType newGeocentricCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeocentricCRSRef(), newGeocentricCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeocentricCRSRef(GeocentricCRSPropertyType newGeocentricCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeocentricCRSRef(), newGeocentricCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodesicType getGeodesic() {
		return (GeodesicType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Geodesic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodesic(GeodesicType newGeodesic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Geodesic(), newGeodesic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodesic(GeodesicType newGeodesic) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Geodesic(), newGeodesic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodesicStringType getGeodesicString() {
		return (GeodesicStringType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodesicString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodesicString(GeodesicStringType newGeodesicString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodesicString(), newGeodesicString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodesicString(GeodesicStringType newGeodesicString) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodesicString(), newGeodesicString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticCRSType getGeodeticCRS() {
		return (GeodeticCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticCRS(GeodeticCRSType newGeodeticCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticCRS(), newGeodeticCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodeticCRS(GeodeticCRSType newGeodeticCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticCRS(), newGeodeticCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumPropertyType getGeodeticDatum() {
		return (GeodeticDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticDatum(GeodeticDatumPropertyType newGeodeticDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum(), newGeodeticDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodeticDatum(GeodeticDatumPropertyType newGeodeticDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum(), newGeodeticDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumPropertyType getGeodeticDatum1() {
		return (GeodeticDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticDatum1(GeodeticDatumPropertyType newGeodeticDatum1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum1(), newGeodeticDatum1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodeticDatum1(GeodeticDatumPropertyType newGeodeticDatum1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum1(), newGeodeticDatum1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumType getGeodeticDatum2() {
		return (GeodeticDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticDatum2(GeodeticDatumType newGeodeticDatum2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum2(), newGeodeticDatum2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodeticDatum2(GeodeticDatumType newGeodeticDatum2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum2(), newGeodeticDatum2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumType getGeodeticDatum3() {
		return (GeodeticDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticDatum3(GeodeticDatumType newGeodeticDatum3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum3(), newGeodeticDatum3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodeticDatum3(GeodeticDatumType newGeodeticDatum3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatum3(), newGeodeticDatum3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumPropertyType getGeodeticDatumRef() {
		return (GeodeticDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticDatumRef(GeodeticDatumPropertyType newGeodeticDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatumRef(), newGeodeticDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodeticDatumRef(GeodeticDatumPropertyType newGeodeticDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeodeticDatumRef(), newGeodeticDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicCRSType getGeographicCRS() {
		return (GeographicCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeographicCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicCRS(GeographicCRSType newGeographicCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeographicCRS(), newGeographicCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeographicCRS(GeographicCRSType newGeographicCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeographicCRS(), newGeographicCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicCRSPropertyType getGeographicCRSRef() {
		return (GeographicCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeographicCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicCRSRef(GeographicCRSPropertyType newGeographicCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeographicCRSRef(), newGeographicCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeographicCRSRef(GeographicCRSPropertyType newGeographicCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeographicCRSRef(), newGeographicCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometricComplexType getGeometricComplex() {
		return (GeometricComplexType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometricComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricComplex(GeometricComplexType newGeometricComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometricComplex(), newGeometricComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeometricComplex(GeometricComplexType newGeometricComplex) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometricComplex(), newGeometricComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryPropertyType getGeometryMember() {
		return (GeometryPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometryMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryMember(GeometryPropertyType newGeometryMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometryMember(), newGeometryMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeometryMember(GeometryPropertyType newGeometryMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometryMember(), newGeometryMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryArrayPropertyType getGeometryMembers() {
		return (GeometryArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometryMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryMembers(GeometryArrayPropertyType newGeometryMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometryMembers(), newGeometryMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeometryMembers(GeometryArrayPropertyType newGeometryMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GeometryMembers(), newGeometryMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGmlProfileSchema() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GmlProfileSchema(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGmlProfileSchema(String newGmlProfileSchema) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GmlProfileSchema(), newGmlProfileSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleType getGreenwichLongitude() {
		return (AngleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GreenwichLongitude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreenwichLongitude(AngleType newGreenwichLongitude, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GreenwichLongitude(), newGreenwichLongitude, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGreenwichLongitude(AngleType newGreenwichLongitude) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GreenwichLongitude(), newGreenwichLongitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridType getGrid() {
		return (GridType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Grid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(GridType newGrid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Grid(), newGrid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrid(GridType newGrid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Grid(), newGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteCoverageType getGridCoverage() {
		return (DiscreteCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridCoverage(DiscreteCoverageType newGridCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridCoverage(), newGridCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGridCoverage(DiscreteCoverageType newGridCoverage) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridCoverage(), newGridCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSetType getGridDomain() {
		return (DomainSetType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridDomain(DomainSetType newGridDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridDomain(), newGridDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGridDomain(DomainSetType newGridDomain) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridDomain(), newGridDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridFunctionType getGridFunction() {
		return (GridFunctionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridFunction(GridFunctionType newGridFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridFunction(), newGridFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGridFunction(GridFunctionType newGridFunction) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_GridFunction(), newGridFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterGroupPropertyType getGroup() {
		return (OperationParameterGroupPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Group(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(OperationParameterGroupPropertyType newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Group(), newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(OperationParameterGroupPropertyType newGroup) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Group(), newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryPropertyType getHistory() {
		return (HistoryPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_History(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(HistoryPropertyType newHistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_History(), newHistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistory(HistoryPropertyType newHistory) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_History(), newHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getIdentifier() {
		return (CodeWithAuthorityType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Identifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(CodeWithAuthorityType newIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Identifier(), newIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(CodeWithAuthorityType newIdentifier) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Identifier(), newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageCRSType getImageCRS() {
		return (ImageCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageCRS(ImageCRSType newImageCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageCRS(), newImageCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageCRS(ImageCRSType newImageCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageCRS(), newImageCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageCRSPropertyType getImageCRSRef() {
		return (ImageCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageCRSRef(ImageCRSPropertyType newImageCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageCRSRef(), newImageCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageCRSRef(ImageCRSPropertyType newImageCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageCRSRef(), newImageCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumPropertyType getImageDatum() {
		return (ImageDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDatum(ImageDatumPropertyType newImageDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum(), newImageDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageDatum(ImageDatumPropertyType newImageDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum(), newImageDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumPropertyType getImageDatum1() {
		return (ImageDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDatum1(ImageDatumPropertyType newImageDatum1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum1(), newImageDatum1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageDatum1(ImageDatumPropertyType newImageDatum1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum1(), newImageDatum1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumType getImageDatum2() {
		return (ImageDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDatum2(ImageDatumType newImageDatum2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum2(), newImageDatum2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageDatum2(ImageDatumType newImageDatum2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum2(), newImageDatum2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumType getImageDatum3() {
		return (ImageDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDatum3(ImageDatumType newImageDatum3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum3(), newImageDatum3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageDatum3(ImageDatumType newImageDatum3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatum3(), newImageDatum3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumPropertyType getImageDatumRef() {
		return (ImageDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDatumRef(ImageDatumPropertyType newImageDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatumRef(), newImageDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageDatumRef(ImageDatumPropertyType newImageDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ImageDatumRef(), newImageDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralOperationParameterPropertyType getIncludesParameter() {
		return (AbstractGeneralOperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludesParameter(AbstractGeneralOperationParameterPropertyType newIncludesParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesParameter(), newIncludesParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludesParameter(AbstractGeneralOperationParameterPropertyType newIncludesParameter) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesParameter(), newIncludesParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleCRSPropertyType getIncludesSingleCRS() {
		return (SingleCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesSingleCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludesSingleCRS(SingleCRSPropertyType newIncludesSingleCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesSingleCRS(), newIncludesSingleCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludesSingleCRS(SingleCRSPropertyType newIncludesSingleCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesSingleCRS(), newIncludesSingleCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralParameterValuePropertyType getIncludesValue() {
		return (AbstractGeneralParameterValuePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludesValue(AbstractGeneralParameterValuePropertyType newIncludesValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesValue(), newIncludesValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludesValue(AbstractGeneralParameterValuePropertyType newIncludesValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_IncludesValue(), newIncludesValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralParameterValuePropertyType getParameterValue() {
		return (AbstractGeneralParameterValuePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValue(AbstractGeneralParameterValuePropertyType newParameterValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue(), newParameterValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterValue(AbstractGeneralParameterValuePropertyType newParameterValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue(), newParameterValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndirectEntryType getIndirectEntry() {
		return (IndirectEntryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_IndirectEntry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndirectEntry(IndirectEntryType newIndirectEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_IndirectEntry(), newIndirectEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndirectEntry(IndirectEntryType newIndirectEntry) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_IndirectEntry(), newIndirectEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIntegerValue() {
		return (BigInteger)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_IntegerValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegerValue(BigInteger newIntegerValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_IntegerValue(), newIntegerValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BigInteger> getIntegerValueList() {
		return (List<BigInteger>)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_IntegerValueList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegerValueList(List<BigInteger> newIntegerValueList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_IntegerValueList(), newIntegerValueList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRingPropertyType getInterior() {
		return (AbstractRingPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Interior(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterior(AbstractRingPropertyType newInterior, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Interior(), newInterior, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterior(AbstractRingPropertyType newInterior) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Interior(), newInterior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearCSPropertyType getLinearCS() {
		return (LinearCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCS(LinearCSPropertyType newLinearCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS(), newLinearCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearCS(LinearCSPropertyType newLinearCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS(), newLinearCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearCSPropertyType getLinearCS1() {
		return (LinearCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCS1(LinearCSPropertyType newLinearCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS1(), newLinearCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearCS1(LinearCSPropertyType newLinearCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS1(), newLinearCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearCSType getLinearCS2() {
		return (LinearCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCS2(LinearCSType newLinearCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS2(), newLinearCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearCS2(LinearCSType newLinearCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS2(), newLinearCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearCSType getLinearCS3() {
		return (LinearCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCS3(LinearCSType newLinearCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS3(), newLinearCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearCS3(LinearCSType newLinearCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCS3(), newLinearCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearCSPropertyType getLinearCSRef() {
		return (LinearCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCSRef(LinearCSPropertyType newLinearCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCSRef(), newLinearCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearCSRef(LinearCSPropertyType newLinearCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearCSRef(), newLinearCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearRingType getLinearRing() {
		return (LinearRingType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearRing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearRing(LinearRingType newLinearRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearRing(), newLinearRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearRing(LinearRingType newLinearRing) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LinearRing(), newLinearRing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringType getLineString() {
		return (LineStringType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LineString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineString(LineStringType newLineString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LineString(), newLineString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineString(LineStringType newLineString) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LineString(), newLineString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringSegmentType getLineStringSegment() {
		return (LineStringSegmentType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LineStringSegment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStringSegment(LineStringSegmentType newLineStringSegment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LineStringSegment(), newLineStringSegment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineStringSegment(LineStringSegmentType newLineStringSegment) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LineStringSegment(), newLineStringSegment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationPropertyType getLocation() {
		return (LocationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationPropertyType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Location(), newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(LocationPropertyType newLocation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getLocationKeyWord() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationKeyWord(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationKeyWord(CodeType newLocationKeyWord, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationKeyWord(), newLocationKeyWord, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationKeyWord(CodeType newLocationKeyWord) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationKeyWord(), newLocationKeyWord);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getLocationName() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationName(CodeType newLocationName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationName(), newLocationName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationName(CodeType newLocationName) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationName(), newLocationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getLocationReference() {
		return (ReferenceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationReference(ReferenceType newLocationReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationReference(), newLocationReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationReference(ReferenceType newLocationReference) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationReference(), newLocationReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getLocationString() {
		return (StringOrRefType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationString(StringOrRefType newLocationString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationString(), newLocationString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationString(StringOrRefType newLocationString) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_LocationString(), newLocationString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getMappingRule() {
		return (StringOrRefType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MappingRule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingRule(StringOrRefType newMappingRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MappingRule(), newMappingRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingRule(StringOrRefType newMappingRule) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MappingRule(), newMappingRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoComplexPropertyType getMaximalComplex() {
		return (TopoComplexPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MaximalComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximalComplex(TopoComplexPropertyType newMaximalComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MaximalComplex(), newMaximalComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximalComplex(TopoComplexPropertyType newMaximalComplex) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MaximalComplex(), newMaximalComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaximumOccurs() {
		return (BigInteger)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MaximumOccurs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumOccurs(BigInteger newMaximumOccurs) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MaximumOccurs(), newMaximumOccurs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaximumValue() {
		return (Double)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MaximumValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumValue(double newMaximumValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MaximumValue(), newMaximumValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getMeasure() {
		return (MeasureType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Measure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureType newMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Measure(), newMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasure(MeasureType newMeasure) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Measure(), newMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationRoleType getMember() {
		return (AssociationRoleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Member(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(AssociationRoleType newMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Member(), newMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMember(AssociationRoleType newMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Member(), newMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAssociationType getMembers() {
		return (ArrayAssociationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Members(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembers(ArrayAssociationType newMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Members(), newMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMembers(ArrayAssociationType newMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Members(), newMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaDataPropertyType getMetaDataProperty() {
		return (MetaDataPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MetaDataProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaDataProperty(MetaDataPropertyType newMetaDataProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MetaDataProperty(), newMetaDataProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaDataProperty(MetaDataPropertyType newMetaDataProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MetaDataProperty(), newMetaDataProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationMethodPropertyType getMethod() {
		return (OperationMethodPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Method(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(OperationMethodPropertyType newMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Method(), newMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(OperationMethodPropertyType newMethod) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Method(), newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getMethodFormula() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MethodFormula(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodFormula(CodeType newMethodFormula, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MethodFormula(), newMethodFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodFormula(CodeType newMethodFormula) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MethodFormula(), newMethodFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMinimumOccurs() {
		return (BigInteger)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MinimumOccurs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumOccurs(BigInteger newMinimumOccurs) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MinimumOccurs(), newMinimumOccurs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinimumValue() {
		return (Double)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MinimumValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumValue(double newMinimumValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MinimumValue(), newMinimumValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMinutes() {
		return (BigInteger)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Minutes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinutes(BigInteger newMinutes) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Minutes(), newMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getModifiedCoordinate() {
		return (BigInteger)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ModifiedCoordinate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedCoordinate(BigInteger newModifiedCoordinate) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ModifiedCoordinate(), newModifiedCoordinate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MovingObjectStatusType getMovingObjectStatus() {
		return (MovingObjectStatusType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MovingObjectStatus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovingObjectStatus(MovingObjectStatusType newMovingObjectStatus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MovingObjectStatus(), newMovingObjectStatus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMovingObjectStatus(MovingObjectStatusType newMovingObjectStatus) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MovingObjectStatus(), newMovingObjectStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurvePropertyType getMultiCenterLineOf() {
		return (MultiCurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCenterLineOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCenterLineOf(MultiCurvePropertyType newMultiCenterLineOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCenterLineOf(), newMultiCenterLineOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiCenterLineOf(MultiCurvePropertyType newMultiCenterLineOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCenterLineOf(), newMultiCenterLineOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointPropertyType getMultiCenterOf() {
		return (MultiPointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCenterOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCenterOf(MultiPointPropertyType newMultiCenterOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCenterOf(), newMultiCenterOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiCenterOf(MultiPointPropertyType newMultiCenterOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCenterOf(), newMultiCenterOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfacePropertyType getMultiCoverage() {
		return (MultiSurfacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCoverage(MultiSurfacePropertyType newMultiCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCoverage(), newMultiCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiCoverage(MultiSurfacePropertyType newMultiCoverage) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCoverage(), newMultiCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurveType getMultiCurve() {
		return (MultiCurveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurve(MultiCurveType newMultiCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurve(), newMultiCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiCurve(MultiCurveType newMultiCurve) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurve(), newMultiCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteCoverageType getMultiCurveCoverage() {
		return (DiscreteCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurveCoverage(DiscreteCoverageType newMultiCurveCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveCoverage(), newMultiCurveCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiCurveCoverage(DiscreteCoverageType newMultiCurveCoverage) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveCoverage(), newMultiCurveCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSetType getMultiCurveDomain() {
		return (DomainSetType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurveDomain(DomainSetType newMultiCurveDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveDomain(), newMultiCurveDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiCurveDomain(DomainSetType newMultiCurveDomain) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveDomain(), newMultiCurveDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurvePropertyType getMultiCurveProperty() {
		return (MultiCurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurveProperty(MultiCurvePropertyType newMultiCurveProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveProperty(), newMultiCurveProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiCurveProperty(MultiCurvePropertyType newMultiCurveProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiCurveProperty(), newMultiCurveProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurvePropertyType getMultiEdgeOf() {
		return (MultiCurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiEdgeOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiEdgeOf(MultiCurvePropertyType newMultiEdgeOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiEdgeOf(), newMultiEdgeOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiEdgeOf(MultiCurvePropertyType newMultiEdgeOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiEdgeOf(), newMultiEdgeOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfacePropertyType getMultiExtentOf() {
		return (MultiSurfacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiExtentOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiExtentOf(MultiSurfacePropertyType newMultiExtentOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiExtentOf(), newMultiExtentOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiExtentOf(MultiSurfacePropertyType newMultiExtentOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiExtentOf(), newMultiExtentOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiGeometryType getMultiGeometry() {
		return (MultiGeometryType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiGeometry(MultiGeometryType newMultiGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiGeometry(), newMultiGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiGeometry(MultiGeometryType newMultiGeometry) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiGeometry(), newMultiGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiGeometryPropertyType getMultiGeometryProperty() {
		return (MultiGeometryPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiGeometryProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiGeometryProperty(MultiGeometryPropertyType newMultiGeometryProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiGeometryProperty(), newMultiGeometryProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiGeometryProperty(MultiGeometryPropertyType newMultiGeometryProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiGeometryProperty(), newMultiGeometryProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointPropertyType getMultiLocation() {
		return (MultiPointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiLocation(MultiPointPropertyType newMultiLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiLocation(), newMultiLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiLocation(MultiPointPropertyType newMultiLocation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiLocation(), newMultiLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointType getMultiPoint() {
		return (MultiPointType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPoint(MultiPointType newMultiPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPoint(), newMultiPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiPoint(MultiPointType newMultiPoint) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPoint(), newMultiPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteCoverageType getMultiPointCoverage() {
		return (DiscreteCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPointCoverage(DiscreteCoverageType newMultiPointCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointCoverage(), newMultiPointCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiPointCoverage(DiscreteCoverageType newMultiPointCoverage) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointCoverage(), newMultiPointCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSetType getMultiPointDomain() {
		return (DomainSetType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPointDomain(DomainSetType newMultiPointDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointDomain(), newMultiPointDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiPointDomain(DomainSetType newMultiPointDomain) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointDomain(), newMultiPointDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointPropertyType getMultiPointProperty() {
		return (MultiPointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPointProperty(MultiPointPropertyType newMultiPointProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointProperty(), newMultiPointProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiPointProperty(MultiPointPropertyType newMultiPointProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPointProperty(), newMultiPointProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointPropertyType getMultiPosition() {
		return (MultiPointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPosition(MultiPointPropertyType newMultiPosition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPosition(), newMultiPosition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiPosition(MultiPointPropertyType newMultiPosition) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiPosition(), newMultiPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSolidType getMultiSolid() {
		return (MultiSolidType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolid(MultiSolidType newMultiSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolid(), newMultiSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiSolid(MultiSolidType newMultiSolid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolid(), newMultiSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteCoverageType getMultiSolidCoverage() {
		return (DiscreteCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolidCoverage(DiscreteCoverageType newMultiSolidCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidCoverage(), newMultiSolidCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiSolidCoverage(DiscreteCoverageType newMultiSolidCoverage) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidCoverage(), newMultiSolidCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSetType getMultiSolidDomain() {
		return (DomainSetType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolidDomain(DomainSetType newMultiSolidDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidDomain(), newMultiSolidDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiSolidDomain(DomainSetType newMultiSolidDomain) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidDomain(), newMultiSolidDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSolidPropertyType getMultiSolidProperty() {
		return (MultiSolidPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolidProperty(MultiSolidPropertyType newMultiSolidProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidProperty(), newMultiSolidProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiSolidProperty(MultiSolidPropertyType newMultiSolidProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSolidProperty(), newMultiSolidProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfaceType getMultiSurface() {
		return (MultiSurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurface(MultiSurfaceType newMultiSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurface(), newMultiSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiSurface(MultiSurfaceType newMultiSurface) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurface(), newMultiSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteCoverageType getMultiSurfaceCoverage() {
		return (DiscreteCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurfaceCoverage(DiscreteCoverageType newMultiSurfaceCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceCoverage(), newMultiSurfaceCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiSurfaceCoverage(DiscreteCoverageType newMultiSurfaceCoverage) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceCoverage(), newMultiSurfaceCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSetType getMultiSurfaceDomain() {
		return (DomainSetType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurfaceDomain(DomainSetType newMultiSurfaceDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceDomain(), newMultiSurfaceDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiSurfaceDomain(DomainSetType newMultiSurfaceDomain) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceDomain(), newMultiSurfaceDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfacePropertyType getMultiSurfaceProperty() {
		return (MultiSurfacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurfaceProperty(MultiSurfacePropertyType newMultiSurfaceProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceProperty(), newMultiSurfaceProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiSurfaceProperty(MultiSurfacePropertyType newMultiSurfaceProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_MultiSurfaceProperty(), newMultiSurfaceProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getName() {
		return (CodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CodeType newName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Name(), newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(CodeType newName) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeType getNode() {
		return (NodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Node(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(NodeType newNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Node(), newNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNode(NodeType newNode) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Node(), newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNull() {
		return getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Null(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNull(Object newNull) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Null(), newNull);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObliqueCartesianCSType getObliqueCartesianCS() {
		return (ObliqueCartesianCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ObliqueCartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObliqueCartesianCS(ObliqueCartesianCSType newObliqueCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ObliqueCartesianCS(), newObliqueCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObliqueCartesianCS(ObliqueCartesianCSType newObliqueCartesianCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ObliqueCartesianCS(), newObliqueCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObliqueCartesianCSPropertyType getObliqueCartesianCSRef() {
		return (ObliqueCartesianCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ObliqueCartesianCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObliqueCartesianCSRef(ObliqueCartesianCSPropertyType newObliqueCartesianCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ObliqueCartesianCSRef(), newObliqueCartesianCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObliqueCartesianCSRef(ObliqueCartesianCSPropertyType newObliqueCartesianCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ObliqueCartesianCSRef(), newObliqueCartesianCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffsetCurveType getOffsetCurve() {
		return (OffsetCurveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OffsetCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetCurve(OffsetCurveType newOffsetCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OffsetCurve(), newOffsetCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffsetCurve(OffsetCurveType newOffsetCurve) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OffsetCurve(), newOffsetCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationMethodType getOperationMethod() {
		return (OperationMethodType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationMethod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationMethod(OperationMethodType newOperationMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationMethod(), newOperationMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationMethod(OperationMethodType newOperationMethod) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationMethod(), newOperationMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationMethodPropertyType getOperationMethodRef() {
		return (OperationMethodPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationMethodRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationMethodRef(OperationMethodPropertyType newOperationMethodRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationMethodRef(), newOperationMethodRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationMethodRef(OperationMethodPropertyType newOperationMethodRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationMethodRef(), newOperationMethodRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterPropertyType getOperationParameter() {
		return (OperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameter(OperationParameterPropertyType newOperationParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter(), newOperationParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameter(OperationParameterPropertyType newOperationParameter) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter(), newOperationParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterPropertyType getOperationParameter1() {
		return (OperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameter1(OperationParameterPropertyType newOperationParameter1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter1(), newOperationParameter1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameter1(OperationParameterPropertyType newOperationParameter1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter1(), newOperationParameter1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterType getOperationParameter2() {
		return (OperationParameterType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameter2(OperationParameterType newOperationParameter2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter2(), newOperationParameter2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameter2(OperationParameterType newOperationParameter2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter2(), newOperationParameter2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterType getOperationParameter3() {
		return (OperationParameterType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameter3(OperationParameterType newOperationParameter3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter3(), newOperationParameter3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameter3(OperationParameterType newOperationParameter3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameter3(), newOperationParameter3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterGroupType getOperationParameterGroup() {
		return (OperationParameterGroupType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameterGroup(OperationParameterGroupType newOperationParameterGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterGroup(), newOperationParameterGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameterGroup(OperationParameterGroupType newOperationParameterGroup) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterGroup(), newOperationParameterGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterPropertyType getOperationParameterGroupRef() {
		return (OperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterGroupRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameterGroupRef(OperationParameterPropertyType newOperationParameterGroupRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterGroupRef(), newOperationParameterGroupRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameterGroupRef(OperationParameterPropertyType newOperationParameterGroupRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterGroupRef(), newOperationParameterGroupRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterPropertyType getOperationParameterRef() {
		return (OperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameterRef(OperationParameterPropertyType newOperationParameterRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterRef(), newOperationParameterRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameterRef(OperationParameterPropertyType newOperationParameterRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationParameterRef(), newOperationParameterRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationPropertyType getOperationRef() {
		return (OperationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationRef(OperationPropertyType newOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationRef(), newOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationRef(OperationPropertyType newOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationRef(), newOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationVersion() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationVersion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationVersion(String newOperationVersion) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OperationVersion(), newOperationVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientableCurveType getOrientableCurve() {
		return (OrientableCurveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OrientableCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientableCurve(OrientableCurveType newOrientableCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OrientableCurve(), newOrientableCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientableCurve(OrientableCurveType newOrientableCurve) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OrientableCurve(), newOrientableCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientableSurfaceType getOrientableSurface() {
		return (OrientableSurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_OrientableSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientableSurface(OrientableSurfaceType newOrientableSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_OrientableSurface(), newOrientableSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientableSurface(OrientableSurfaceType newOrientableSurface) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_OrientableSurface(), newOrientableSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getOrigin() {
		return (XMLGregorianCalendar)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Origin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(XMLGregorianCalendar newOrigin) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Origin(), newOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralOperationParameterPropertyType getParameter() {
		return (AbstractGeneralOperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Parameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(AbstractGeneralOperationParameterPropertyType newParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Parameter(), newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(AbstractGeneralOperationParameterPropertyType newParameter) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Parameter(), newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralParameterValuePropertyType getParameterValue1() {
		return (AbstractGeneralParameterValuePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValue1(AbstractGeneralParameterValuePropertyType newParameterValue1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue1(), newParameterValue1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterValue1(AbstractGeneralParameterValuePropertyType newParameterValue1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue1(), newParameterValue1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValueType getParameterValue2() {
		return (ParameterValueType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValue2(ParameterValueType newParameterValue2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue2(), newParameterValue2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterValue2(ParameterValueType newParameterValue2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue2(), newParameterValue2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValueType getParameterValue3() {
		return (ParameterValueType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValue3(ParameterValueType newParameterValue3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue3(), newParameterValue3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterValue3(ParameterValueType newParameterValue3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValue3(), newParameterValue3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValueGroupType getParameterValueGroup() {
		return (ParameterValueGroupType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValueGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValueGroup(ParameterValueGroupType newParameterValueGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValueGroup(), newParameterValueGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterValueGroup(ParameterValueGroupType newParameterValueGroup) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ParameterValueGroup(), newParameterValueGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassThroughOperationType getPassThroughOperation() {
		return (PassThroughOperationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PassThroughOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassThroughOperation(PassThroughOperationType newPassThroughOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PassThroughOperation(), newPassThroughOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassThroughOperation(PassThroughOperationType newPassThroughOperation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PassThroughOperation(), newPassThroughOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassThroughOperationPropertyType getPassThroughOperationRef() {
		return (PassThroughOperationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PassThroughOperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassThroughOperationRef(PassThroughOperationPropertyType newPassThroughOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PassThroughOperationRef(), newPassThroughOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassThroughOperationRef(PassThroughOperationPropertyType newPassThroughOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PassThroughOperationRef(), newPassThroughOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePatchArrayPropertyType getPatches() {
		return (SurfacePatchArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Patches(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatches(SurfacePatchArrayPropertyType newPatches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Patches(), newPatches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatches(SurfacePatchArrayPropertyType newPatches) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Patches(), newPatches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getPixelInCell() {
		return (CodeWithAuthorityType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PixelInCell(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelInCell(CodeWithAuthorityType newPixelInCell, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PixelInCell(), newPixelInCell, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPixelInCell(CodeWithAuthorityType newPixelInCell) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PixelInCell(), newPixelInCell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getPoint() {
		return (PointType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Point(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoint(PointType newPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Point(), newPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoint(PointType newPoint) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Point(), newPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointArrayPropertyType getPointArrayProperty() {
		return (PointArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointArrayProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointArrayProperty(PointArrayPropertyType newPointArrayProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointArrayProperty(), newPointArrayProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointArrayProperty(PointArrayPropertyType newPointArrayProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointArrayProperty(), newPointArrayProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPropertyType getPointMember() {
		return (PointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointMember(PointPropertyType newPointMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointMember(), newPointMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointMember(PointPropertyType newPointMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointMember(), newPointMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointArrayPropertyType getPointMembers() {
		return (PointArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointMembers(PointArrayPropertyType newPointMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointMembers(), newPointMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointMembers(PointArrayPropertyType newPointMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointMembers(), newPointMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPropertyType getPointProperty() {
		return (PointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointProperty(PointPropertyType newPointProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointProperty(), newPointProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointProperty(PointPropertyType newPointProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointProperty(), newPointProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPropertyType getPointRep() {
		return (PointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointRep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointRep(PointPropertyType newPointRep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointRep(), newPointRep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointRep(PointPropertyType newPointRep) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PointRep(), newPointRep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolarCSPropertyType getPolarCS() {
		return (PolarCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolarCS(PolarCSPropertyType newPolarCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS(), newPolarCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolarCS(PolarCSPropertyType newPolarCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS(), newPolarCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolarCSPropertyType getPolarCS1() {
		return (PolarCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolarCS1(PolarCSPropertyType newPolarCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS1(), newPolarCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolarCS1(PolarCSPropertyType newPolarCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS1(), newPolarCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolarCSType getPolarCS2() {
		return (PolarCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolarCS2(PolarCSType newPolarCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS2(), newPolarCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolarCS2(PolarCSType newPolarCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS2(), newPolarCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolarCSType getPolarCS3() {
		return (PolarCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolarCS3(PolarCSType newPolarCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS3(), newPolarCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolarCS3(PolarCSType newPolarCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCS3(), newPolarCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolarCSPropertyType getPolarCSRef() {
		return (PolarCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolarCSRef(PolarCSPropertyType newPolarCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCSRef(), newPolarCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolarCSRef(PolarCSPropertyType newPolarCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolarCSRef(), newPolarCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonType getPolygon() {
		return (PolygonType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Polygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygon(PolygonType newPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Polygon(), newPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolygon(PolygonType newPolygon) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Polygon(), newPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonPatchType getPolygonPatch() {
		return (PolygonPatchType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolygonPatch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonPatch(PolygonPatchType newPolygonPatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolygonPatch(), newPolygonPatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolygonPatch(PolygonPatchType newPolygonPatch) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolygonPatch(), newPolygonPatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePatchArrayPropertyType getPolygonPatches() {
		return (SurfacePatchArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolygonPatches(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonPatches(SurfacePatchArrayPropertyType newPolygonPatches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolygonPatches(), newPolygonPatches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolygonPatches(SurfacePatchArrayPropertyType newPolygonPatches) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolygonPatches(), newPolygonPatches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfaceType getPolyhedralSurface() {
		return (SurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolyhedralSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyhedralSurface(SurfaceType newPolyhedralSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolyhedralSurface(), newPolyhedralSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolyhedralSurface(SurfaceType newPolyhedralSurface) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PolyhedralSurface(), newPolyhedralSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfaceType getSurface() {
		return (SurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Surface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurface(SurfaceType newSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Surface(), newSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurface(SurfaceType newSurface) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Surface(), newSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectPositionType getPos() {
		return (DirectPositionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Pos(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPos(DirectPositionType newPos, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Pos(), newPos, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPos(DirectPositionType newPos) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Pos(), newPos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPropertyType getPosition() {
		return (PointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(PointPropertyType newPosition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Position(), newPosition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(PointPropertyType newPosition) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Position(), newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectPositionListType getPosList() {
		return (DirectPositionListType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PosList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosList(DirectPositionListType newPosList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PosList(), newPosList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosList(DirectPositionListType newPosList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PosList(), newPosList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianPropertyType getPrimeMeridian() {
		return (PrimeMeridianPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridian(PrimeMeridianPropertyType newPrimeMeridian, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian(), newPrimeMeridian, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimeMeridian(PrimeMeridianPropertyType newPrimeMeridian) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian(), newPrimeMeridian);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianPropertyType getPrimeMeridian1() {
		return (PrimeMeridianPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridian1(PrimeMeridianPropertyType newPrimeMeridian1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian1(), newPrimeMeridian1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimeMeridian1(PrimeMeridianPropertyType newPrimeMeridian1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian1(), newPrimeMeridian1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianType getPrimeMeridian2() {
		return (PrimeMeridianType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridian2(PrimeMeridianType newPrimeMeridian2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian2(), newPrimeMeridian2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimeMeridian2(PrimeMeridianType newPrimeMeridian2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian2(), newPrimeMeridian2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianType getPrimeMeridian3() {
		return (PrimeMeridianType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridian3(PrimeMeridianType newPrimeMeridian3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian3(), newPrimeMeridian3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimeMeridian3(PrimeMeridianType newPrimeMeridian3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridian3(), newPrimeMeridian3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianPropertyType getPrimeMeridianRef() {
		return (PrimeMeridianPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridianRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridianRef(PrimeMeridianPropertyType newPrimeMeridianRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridianRef(), newPrimeMeridianRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimeMeridianRef(PrimeMeridianPropertyType newPrimeMeridianRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PrimeMeridianRef(), newPrimeMeridianRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriorityLocationPropertyType getPriorityLocation() {
		return (PriorityLocationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_PriorityLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorityLocation(PriorityLocationPropertyType newPriorityLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_PriorityLocation(), newPriorityLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriorityLocation(PriorityLocationPropertyType newPriorityLocation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_PriorityLocation(), newPriorityLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectedCRSType getProjectedCRS() {
		return (ProjectedCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ProjectedCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectedCRS(ProjectedCRSType newProjectedCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ProjectedCRS(), newProjectedCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectedCRS(ProjectedCRSType newProjectedCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ProjectedCRS(), newProjectedCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectedCRSPropertyType getProjectedCRSRef() {
		return (ProjectedCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ProjectedCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectedCRSRef(ProjectedCRSPropertyType newProjectedCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ProjectedCRSRef(), newProjectedCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectedCRSRef(ProjectedCRSPropertyType newProjectedCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ProjectedCRSRef(), newProjectedCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityType getQuantity() {
		return (QuantityType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Quantity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(QuantityType newQuantity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Quantity(), newQuantity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(QuantityType newQuantity) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Quantity(), newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityExtentType getQuantityExtent() {
		return (QuantityExtentType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityExtent(QuantityExtentType newQuantityExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityExtent(), newQuantityExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityExtent(QuantityExtentType newQuantityExtent) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityExtent(), newQuantityExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureOrNilReasonListType getQuantityList() {
		return (MeasureOrNilReasonListType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityList(MeasureOrNilReasonListType newQuantityList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityList(), newQuantityList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityList(MeasureOrNilReasonListType newQuantityList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityList(), newQuantityList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getQuantityType() {
		return (StringOrRefType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityType(StringOrRefType newQuantityType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityType(), newQuantityType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityType(StringOrRefType newQuantityType) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityType(), newQuantityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getQuantityTypeReference() {
		return (ReferenceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityTypeReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityTypeReference(ReferenceType newQuantityTypeReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityTypeReference(), newQuantityTypeReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityTypeReference(ReferenceType newQuantityTypeReference) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_QuantityTypeReference(), newQuantityTypeReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getRangeMeaning() {
		return (CodeWithAuthorityType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeMeaning(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeMeaning(CodeWithAuthorityType newRangeMeaning, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeMeaning(), newRangeMeaning, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRangeMeaning(CodeWithAuthorityType newRangeMeaning) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeMeaning(), newRangeMeaning);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationRoleType getRangeParameters() {
		return (AssociationRoleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeParameters(AssociationRoleType newRangeParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeParameters(), newRangeParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRangeParameters(AssociationRoleType newRangeParameters) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeParameters(), newRangeParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeSetType getRangeSet() {
		return (RangeSetType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeSet(RangeSetType newRangeSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeSet(), newRangeSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRangeSet(RangeSetType newRangeSet) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_RangeSet(), newRangeSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRealizationEpoch() {
		return (XMLGregorianCalendar)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_RealizationEpoch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealizationEpoch(XMLGregorianCalendar newRealizationEpoch) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_RealizationEpoch(), newRealizationEpoch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangleType getRectangle() {
		return (RectangleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Rectangle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectangle(RectangleType newRectangle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Rectangle(), newRectangle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRectangle(RectangleType newRectangle) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Rectangle(), newRectangle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectifiedGridType getRectifiedGrid() {
		return (RectifiedGridType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGrid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGrid(RectifiedGridType newRectifiedGrid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGrid(), newRectifiedGrid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRectifiedGrid(RectifiedGridType newRectifiedGrid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGrid(), newRectifiedGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteCoverageType getRectifiedGridCoverage() {
		return (DiscreteCoverageType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGridCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGridCoverage(DiscreteCoverageType newRectifiedGridCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGridCoverage(), newRectifiedGridCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRectifiedGridCoverage(DiscreteCoverageType newRectifiedGridCoverage) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGridCoverage(), newRectifiedGridCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSetType getRectifiedGridDomain() {
		return (DomainSetType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGridDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGridDomain(DomainSetType newRectifiedGridDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGridDomain(), newRectifiedGridDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRectifiedGridDomain(DomainSetType newRectifiedGridDomain) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_RectifiedGridDomain(), newRectifiedGridDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CRSPropertyType getReferenceSystemRef() {
		return (CRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ReferenceSystemRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSystemRef(CRSPropertyType newReferenceSystemRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ReferenceSystemRef(), newReferenceSystemRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceSystemRef(CRSPropertyType newReferenceSystemRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ReferenceSystemRef(), newReferenceSystemRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Remarks(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Remarks(), newRemarks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultType getResultOf() {
		return (ResultType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ResultOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultOf(ResultType newResultOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ResultOf(), newResultOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultOf(ResultType newResultOf) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ResultOf(), newResultOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReversePropertyName() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ReversePropertyName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReversePropertyName(String newReversePropertyName) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ReversePropertyName(), newReversePropertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RingType getRing() {
		return (RingType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ring(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRing(RingType newRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ring(), newRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRing(RingType newRing) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Ring(), newRing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionToPreferredUnitType getRoughConversionToPreferredUnit() {
		return (ConversionToPreferredUnitType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_RoughConversionToPreferredUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoughConversionToPreferredUnit(ConversionToPreferredUnitType newRoughConversionToPreferredUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_RoughConversionToPreferredUnit(), newRoughConversionToPreferredUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoughConversionToPreferredUnit(ConversionToPreferredUnitType newRoughConversionToPreferredUnit) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_RoughConversionToPreferredUnit(), newRoughConversionToPreferredUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Scope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Scope(), newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType getSecondDefiningParameter() {
		return (SecondDefiningParameterType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondDefiningParameter(SecondDefiningParameterType newSecondDefiningParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter(), newSecondDefiningParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondDefiningParameter(SecondDefiningParameterType newSecondDefiningParameter) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter(), newSecondDefiningParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType1 getSecondDefiningParameter1() {
		return (SecondDefiningParameterType1)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondDefiningParameter1(SecondDefiningParameterType1 newSecondDefiningParameter1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter1(), newSecondDefiningParameter1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondDefiningParameter1(SecondDefiningParameterType1 newSecondDefiningParameter1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter1(), newSecondDefiningParameter1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType2 getSecondDefiningParameter2() {
		return (SecondDefiningParameterType2)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondDefiningParameter2(SecondDefiningParameterType2 newSecondDefiningParameter2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter2(), newSecondDefiningParameter2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondDefiningParameter2(SecondDefiningParameterType2 newSecondDefiningParameter2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter2(), newSecondDefiningParameter2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType3 getSecondDefiningParameter3() {
		return (SecondDefiningParameterType3)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondDefiningParameter3(SecondDefiningParameterType3 newSecondDefiningParameter3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter3(), newSecondDefiningParameter3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondDefiningParameter3(SecondDefiningParameterType3 newSecondDefiningParameter3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SecondDefiningParameter3(), newSecondDefiningParameter3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSeconds() {
		return (BigDecimal)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Seconds(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeconds(BigDecimal newSeconds) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Seconds(), newSeconds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveSegmentArrayPropertyType getSegments() {
		return (CurveSegmentArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Segments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(CurveSegmentArrayPropertyType newSegments, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Segments(), newSegments, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegments(CurveSegmentArrayPropertyType newSegments) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Segments(), newSegments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getSemiMajorAxis() {
		return (MeasureType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SemiMajorAxis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemiMajorAxis(MeasureType newSemiMajorAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SemiMajorAxis(), newSemiMajorAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemiMajorAxis(MeasureType newSemiMajorAxis) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SemiMajorAxis(), newSemiMajorAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellType getShell() {
		return (ShellType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Shell(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShell(ShellType newShell, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Shell(), newShell, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShell(ShellType newShell) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Shell(), newShell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleCRSPropertyType getSingleCRSRef() {
		return (SingleCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SingleCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleCRSRef(SingleCRSPropertyType newSingleCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SingleCRSRef(), newSingleCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleCRSRef(SingleCRSPropertyType newSingleCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SingleCRSRef(), newSingleCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleOperationPropertyType getSingleOperationRef() {
		return (SingleOperationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SingleOperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleOperationRef(SingleOperationPropertyType newSingleOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SingleOperationRef(), newSingleOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleOperationRef(SingleOperationPropertyType newSingleOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SingleOperationRef(), newSingleOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidType getSolid() {
		return (SolidType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Solid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolid(SolidType newSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Solid(), newSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolid(SolidType newSolid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Solid(), newSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidArrayPropertyType getSolidArrayProperty() {
		return (SolidArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidArrayProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidArrayProperty(SolidArrayPropertyType newSolidArrayProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidArrayProperty(), newSolidArrayProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolidArrayProperty(SolidArrayPropertyType newSolidArrayProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidArrayProperty(), newSolidArrayProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidPropertyType getSolidMember() {
		return (SolidPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidMember(SolidPropertyType newSolidMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidMember(), newSolidMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolidMember(SolidPropertyType newSolidMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidMember(), newSolidMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidArrayPropertyType getSolidMembers() {
		return (SolidArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidMembers(SolidArrayPropertyType newSolidMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidMembers(), newSolidMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolidMembers(SolidArrayPropertyType newSolidMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidMembers(), newSolidMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidPropertyType getSolidProperty() {
		return (SolidPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidProperty(SolidPropertyType newSolidProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidProperty(), newSolidProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolidProperty(SolidPropertyType newSolidProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SolidProperty(), newSolidProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CRSPropertyType getSourceCRS() {
		return (CRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SourceCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceCRS(CRSPropertyType newSourceCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SourceCRS(), newSourceCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceCRS(CRSPropertyType newSourceCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SourceCRS(), newSourceCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSourceDimensions() {
		return (BigInteger)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SourceDimensions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceDimensions(BigInteger newSourceDimensions) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SourceDimensions(), newSourceDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphereType getSphere() {
		return (SphereType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Sphere(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphere(SphereType newSphere, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Sphere(), newSphere, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphere(SphereType newSphere) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Sphere(), newSphere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSPropertyType getSphericalCS() {
		return (SphericalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCS(SphericalCSPropertyType newSphericalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS(), newSphericalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphericalCS(SphericalCSPropertyType newSphericalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS(), newSphericalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSPropertyType getSphericalCS1() {
		return (SphericalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCS1(SphericalCSPropertyType newSphericalCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS1(), newSphericalCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphericalCS1(SphericalCSPropertyType newSphericalCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS1(), newSphericalCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSType getSphericalCS2() {
		return (SphericalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCS2(SphericalCSType newSphericalCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS2(), newSphericalCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphericalCS2(SphericalCSType newSphericalCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS2(), newSphericalCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSType getSphericalCS3() {
		return (SphericalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCS3(SphericalCSType newSphericalCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS3(), newSphericalCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphericalCS3(SphericalCSType newSphericalCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCS3(), newSphericalCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSPropertyType getSphericalCSRef() {
		return (SphericalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCSRef(SphericalCSPropertyType newSphericalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCSRef(), newSphericalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphericalCSRef(SphericalCSPropertyType newSphericalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SphericalCSRef(), newSphericalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getStatus() {
		return (StringOrRefType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Status(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StringOrRefType newStatus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Status(), newStatus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StringOrRefType newStatus) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Status(), newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getStatusReference() {
		return (ReferenceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_StatusReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReference(ReferenceType newStatusReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_StatusReference(), newStatusReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusReference(ReferenceType newStatusReference) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_StatusReference(), newStatusReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStringValue() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_StringValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringValue(String newStringValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_StringValue(), newStringValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoComplexPropertyType getSubComplex() {
		return (TopoComplexPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SubComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubComplex(TopoComplexPropertyType newSubComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SubComplex(), newSubComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubComplex(TopoComplexPropertyType newSubComplex) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SubComplex(), newSubComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPropertyType getSubject() {
		return (TargetPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Subject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(TargetPropertyType newSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Subject(), newSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(TargetPropertyType newSubject) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Subject(), newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPropertyType getTarget() {
		return (TargetPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Target(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetPropertyType newTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Target(), newTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TargetPropertyType newTarget) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Target(), newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoComplexPropertyType getSuperComplex() {
		return (TopoComplexPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SuperComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperComplex(TopoComplexPropertyType newSuperComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SuperComplex(), newSuperComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperComplex(TopoComplexPropertyType newSuperComplex) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SuperComplex(), newSuperComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfaceArrayPropertyType getSurfaceArrayProperty() {
		return (SurfaceArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceArrayProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceArrayProperty(SurfaceArrayPropertyType newSurfaceArrayProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceArrayProperty(), newSurfaceArrayProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurfaceArrayProperty(SurfaceArrayPropertyType newSurfaceArrayProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceArrayProperty(), newSurfaceArrayProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePropertyType getSurfaceMember() {
		return (SurfacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceMember(SurfacePropertyType newSurfaceMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceMember(), newSurfaceMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurfaceMember(SurfacePropertyType newSurfaceMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceMember(), newSurfaceMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfaceArrayPropertyType getSurfaceMembers() {
		return (SurfaceArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceMembers(SurfaceArrayPropertyType newSurfaceMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceMembers(), newSurfaceMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurfaceMembers(SurfaceArrayPropertyType newSurfaceMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceMembers(), newSurfaceMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePropertyType getSurfaceProperty() {
		return (SurfacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceProperty(SurfacePropertyType newSurfaceProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceProperty(), newSurfaceProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurfaceProperty(SurfacePropertyType newSurfaceProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_SurfaceProperty(), newSurfaceProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CRSPropertyType getTargetCRS() {
		return (CRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TargetCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetCRS(CRSPropertyType newTargetCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TargetCRS(), newTargetCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetCRS(CRSPropertyType newTargetCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TargetCRS(), newTargetCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTargetDimensions() {
		return (BigInteger)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TargetDimensions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDimensions(BigInteger newTargetDimensions) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TargetDimensions(), newTargetDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetElement() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TargetElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetElement(String newTargetElement) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TargetElement(), newTargetElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCRSType getTemporalCRS() {
		return (TemporalCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCRS(TemporalCRSType newTemporalCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCRS(), newTemporalCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalCRS(TemporalCRSType newTemporalCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCRS(), newTemporalCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCRSPropertyType getTemporalCRSRef() {
		return (TemporalCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCRSRef(TemporalCRSPropertyType newTemporalCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCRSRef(), newTemporalCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalCRSRef(TemporalCRSPropertyType newTemporalCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCRSRef(), newTemporalCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCSType getTemporalCS() {
		return (TemporalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCS(TemporalCSType newTemporalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCS(), newTemporalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalCS(TemporalCSType newTemporalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCS(), newTemporalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCSPropertyType getTemporalCSRef() {
		return (TemporalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCSRef(TemporalCSPropertyType newTemporalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCSRef(), newTemporalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalCSRef(TemporalCSPropertyType newTemporalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalCSRef(), newTemporalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumPropertyType getTemporalDatum() {
		return (TemporalDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDatum(TemporalDatumPropertyType newTemporalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum(), newTemporalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalDatum(TemporalDatumPropertyType newTemporalDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum(), newTemporalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumPropertyType getTemporalDatum1() {
		return (TemporalDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDatum1(TemporalDatumPropertyType newTemporalDatum1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum1(), newTemporalDatum1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalDatum1(TemporalDatumPropertyType newTemporalDatum1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum1(), newTemporalDatum1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumType getTemporalDatum2() {
		return (TemporalDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDatum2(TemporalDatumType newTemporalDatum2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum2(), newTemporalDatum2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalDatum2(TemporalDatumType newTemporalDatum2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum2(), newTemporalDatum2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumType getTemporalDatum3() {
		return (TemporalDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDatum3(TemporalDatumType newTemporalDatum3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum3(), newTemporalDatum3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalDatum3(TemporalDatumType newTemporalDatum3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatum3(), newTemporalDatum3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumPropertyType getTemporalDatumRef() {
		return (TemporalDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDatumRef(TemporalDatumPropertyType newTemporalDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatumRef(), newTemporalDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalDatumRef(TemporalDatumPropertyType newTemporalDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TemporalDatumRef(), newTemporalDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCalendarType getTimeCalendar() {
		return (TimeCalendarType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCalendar(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCalendar(TimeCalendarType newTimeCalendar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCalendar(), newTimeCalendar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCalendar(TimeCalendarType newTimeCalendar) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCalendar(), newTimeCalendar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeReferenceSystemType getTimeReferenceSystem() {
		return (TimeReferenceSystemType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeReferenceSystem(TimeReferenceSystemType newTimeReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeReferenceSystem(), newTimeReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeReferenceSystem(TimeReferenceSystemType newTimeReferenceSystem) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeReferenceSystem(), newTimeReferenceSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCalendarEraType getTimeCalendarEra() {
		return (TimeCalendarEraType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCalendarEra(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCalendarEra(TimeCalendarEraType newTimeCalendarEra, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCalendarEra(), newTimeCalendarEra, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCalendarEra(TimeCalendarEraType newTimeCalendarEra) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCalendarEra(), newTimeCalendarEra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeClockType getTimeClock() {
		return (TimeClockType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeClock(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeClock(TimeClockType newTimeClock, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeClock(), newTimeClock, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeClock(TimeClockType newTimeClock) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeClock(), newTimeClock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCoordinateSystemType getTimeCoordinateSystem() {
		return (TimeCoordinateSystemType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCoordinateSystem(TimeCoordinateSystemType newTimeCoordinateSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCoordinateSystem(), newTimeCoordinateSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCoordinateSystem(TimeCoordinateSystemType newTimeCoordinateSystem) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCoordinateSystem(), newTimeCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCSPropertyType getTimeCS() {
		return (TimeCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCS(TimeCSPropertyType newTimeCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS(), newTimeCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCS(TimeCSPropertyType newTimeCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS(), newTimeCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCSPropertyType getTimeCS1() {
		return (TimeCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCS1(TimeCSPropertyType newTimeCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS1(), newTimeCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCS1(TimeCSPropertyType newTimeCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS1(), newTimeCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCSType getTimeCS2() {
		return (TimeCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCS2(TimeCSType newTimeCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS2(), newTimeCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCS2(TimeCSType newTimeCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS2(), newTimeCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCSType getTimeCS3() {
		return (TimeCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCS3(TimeCSType newTimeCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS3(), newTimeCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCS3(TimeCSType newTimeCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeCS3(), newTimeCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeEdgeType getTimeEdge() {
		return (TimeEdgeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeEdge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeEdge(TimeEdgeType newTimeEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeEdge(), newTimeEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeEdge(TimeEdgeType newTimeEdge) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeEdge(), newTimeEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeInstantType getTimeInstant() {
		return (TimeInstantType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeInstant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeInstant(TimeInstantType newTimeInstant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeInstant(), newTimeInstant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeInstant(TimeInstantType newTimeInstant) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeInstant(), newTimeInstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeIntervalLengthType getTimeInterval() {
		return (TimeIntervalLengthType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeInterval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeInterval(TimeIntervalLengthType newTimeInterval, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeInterval(), newTimeInterval, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeInterval(TimeIntervalLengthType newTimeInterval) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeInterval(), newTimeInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeNodeType getTimeNode() {
		return (TimeNodeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeNode(TimeNodeType newTimeNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeNode(), newTimeNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeNode(TimeNodeType newTimeNode) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeNode(), newTimeNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeOrdinalEraType getTimeOrdinalEra() {
		return (TimeOrdinalEraType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeOrdinalEra(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeOrdinalEra(TimeOrdinalEraType newTimeOrdinalEra, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeOrdinalEra(), newTimeOrdinalEra, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOrdinalEra(TimeOrdinalEraType newTimeOrdinalEra) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeOrdinalEra(), newTimeOrdinalEra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeOrdinalReferenceSystemType getTimeOrdinalReferenceSystem() {
		return (TimeOrdinalReferenceSystemType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeOrdinalReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeOrdinalReferenceSystem(TimeOrdinalReferenceSystemType newTimeOrdinalReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeOrdinalReferenceSystem(), newTimeOrdinalReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOrdinalReferenceSystem(TimeOrdinalReferenceSystemType newTimeOrdinalReferenceSystem) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeOrdinalReferenceSystem(), newTimeOrdinalReferenceSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePeriodType getTimePeriod() {
		return (TimePeriodType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimePeriod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePeriod(TimePeriodType newTimePeriod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimePeriod(), newTimePeriod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimePeriod(TimePeriodType newTimePeriod) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimePeriod(), newTimePeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePositionType getTimePosition() {
		return (TimePositionType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimePosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePosition(TimePositionType newTimePosition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimePosition(), newTimePosition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimePosition(TimePositionType newTimePosition) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimePosition(), newTimePosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTopologyComplexType getTimeTopologyComplex() {
		return (TimeTopologyComplexType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeTopologyComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTopologyComplex(TimeTopologyComplexType newTimeTopologyComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeTopologyComplex(), newTimeTopologyComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeTopologyComplex(TimeTopologyComplexType newTimeTopologyComplex) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TimeTopologyComplex(), newTimeTopologyComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinType getTin() {
		return (TinType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Tin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTin(TinType newTin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Tin(), newTin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTin(TinType newTin) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Tin(), newTin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfaceType getTriangulatedSurface() {
		return (SurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TriangulatedSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriangulatedSurface(SurfaceType newTriangulatedSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TriangulatedSurface(), newTriangulatedSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriangulatedSurface(SurfaceType newTriangulatedSurface) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TriangulatedSurface(), newTriangulatedSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoComplexType getTopoComplex() {
		return (TopoComplexType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoComplex(TopoComplexType newTopoComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoComplex(), newTopoComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoComplex(TopoComplexType newTopoComplex) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoComplex(), newTopoComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoComplexPropertyType getTopoComplexProperty() {
		return (TopoComplexPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoComplexProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoComplexProperty(TopoComplexPropertyType newTopoComplexProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoComplexProperty(), newTopoComplexProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoComplexProperty(TopoComplexPropertyType newTopoComplexProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoComplexProperty(), newTopoComplexProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoCurveType getTopoCurve() {
		return (TopoCurveType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoCurve(TopoCurveType newTopoCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoCurve(), newTopoCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoCurve(TopoCurveType newTopoCurve) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoCurve(), newTopoCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoCurvePropertyType getTopoCurveProperty() {
		return (TopoCurvePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoCurveProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoCurveProperty(TopoCurvePropertyType newTopoCurveProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoCurveProperty(), newTopoCurveProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoCurveProperty(TopoCurvePropertyType newTopoCurveProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoCurveProperty(), newTopoCurveProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPointType getTopoPoint() {
		return (TopoPointType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPoint(TopoPointType newTopoPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPoint(), newTopoPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoPoint(TopoPointType newTopoPoint) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPoint(), newTopoPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPointPropertyType getTopoPointProperty() {
		return (TopoPointPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPointProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPointProperty(TopoPointPropertyType newTopoPointProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPointProperty(), newTopoPointProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoPointProperty(TopoPointPropertyType newTopoPointProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPointProperty(), newTopoPointProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPrimitiveMemberType getTopoPrimitiveMember() {
		return (TopoPrimitiveMemberType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPrimitiveMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPrimitiveMember(TopoPrimitiveMemberType newTopoPrimitiveMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPrimitiveMember(), newTopoPrimitiveMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoPrimitiveMember(TopoPrimitiveMemberType newTopoPrimitiveMember) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPrimitiveMember(), newTopoPrimitiveMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers() {
		return (TopoPrimitiveArrayAssociationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPrimitiveMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType newTopoPrimitiveMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPrimitiveMembers(), newTopoPrimitiveMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType newTopoPrimitiveMembers) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoPrimitiveMembers(), newTopoPrimitiveMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoSolidType getTopoSolid() {
		return (TopoSolidType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoSolid(TopoSolidType newTopoSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSolid(), newTopoSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoSolid(TopoSolidType newTopoSolid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSolid(), newTopoSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoSurfaceType getTopoSurface() {
		return (TopoSurfaceType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoSurface(TopoSurfaceType newTopoSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSurface(), newTopoSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoSurface(TopoSurfaceType newTopoSurface) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSurface(), newTopoSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoSurfacePropertyType getTopoSurfaceProperty() {
		return (TopoSurfacePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSurfaceProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoSurfaceProperty(TopoSurfacePropertyType newTopoSurfaceProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSurfaceProperty(), newTopoSurfaceProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoSurfaceProperty(TopoSurfacePropertyType newTopoSurfaceProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoSurfaceProperty(), newTopoSurfaceProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoVolumeType getTopoVolume() {
		return (TopoVolumeType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoVolume(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoVolume(TopoVolumeType newTopoVolume, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoVolume(), newTopoVolume, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoVolume(TopoVolumeType newTopoVolume) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoVolume(), newTopoVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoVolumePropertyType getTopoVolumeProperty() {
		return (TopoVolumePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoVolumeProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoVolumeProperty(TopoVolumePropertyType newTopoVolumeProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoVolumeProperty(), newTopoVolumeProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopoVolumeProperty(TopoVolumePropertyType newTopoVolumeProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TopoVolumeProperty(), newTopoVolumeProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryPropertyType getTrack() {
		return (HistoryPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Track(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrack(HistoryPropertyType newTrack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Track(), newTrack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrack(HistoryPropertyType newTrack) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Track(), newTrack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType getTransformation() {
		return (TransformationType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Transformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(TransformationType newTransformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Transformation(), newTransformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformation(TransformationType newTransformation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Transformation(), newTransformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationPropertyType getTransformationRef() {
		return (TransformationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TransformationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationRef(TransformationPropertyType newTransformationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TransformationRef(), newTransformationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformationRef(TransformationPropertyType newTransformationRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TransformationRef(), newTransformationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriangleType getTriangle() {
		return (TriangleType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Triangle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriangle(TriangleType newTriangle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Triangle(), newTriangle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriangle(TriangleType newTriangle) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Triangle(), newTriangle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePatchArrayPropertyType getTrianglePatches() {
		return (SurfacePatchArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TrianglePatches(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrianglePatches(SurfacePatchArrayPropertyType newTrianglePatches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TrianglePatches(), newTrianglePatches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrianglePatches(SurfacePatchArrayPropertyType newTrianglePatches) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TrianglePatches(), newTrianglePatches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinatesType getTupleList() {
		return (CoordinatesType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_TupleList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleList(CoordinatesType newTupleList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_TupleList(), newTupleList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTupleList(CoordinatesType newTupleList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_TupleList(), newTupleList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitOfMeasureType getUnitOfMeasure() {
		return (UnitOfMeasureType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UnitOfMeasure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfMeasure(UnitOfMeasureType newUnitOfMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UnitOfMeasure(), newUnitOfMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitOfMeasure(UnitOfMeasureType newUnitOfMeasure) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UnitOfMeasure(), newUnitOfMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedCSPropertyType getUserDefinedCS() {
		return (UserDefinedCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedCS(UserDefinedCSPropertyType newUserDefinedCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS(), newUserDefinedCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDefinedCS(UserDefinedCSPropertyType newUserDefinedCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS(), newUserDefinedCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedCSPropertyType getUserDefinedCS1() {
		return (UserDefinedCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedCS1(UserDefinedCSPropertyType newUserDefinedCS1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS1(), newUserDefinedCS1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDefinedCS1(UserDefinedCSPropertyType newUserDefinedCS1) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS1(), newUserDefinedCS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedCSType getUserDefinedCS2() {
		return (UserDefinedCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedCS2(UserDefinedCSType newUserDefinedCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS2(), newUserDefinedCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDefinedCS2(UserDefinedCSType newUserDefinedCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS2(), newUserDefinedCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedCSType getUserDefinedCS3() {
		return (UserDefinedCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedCS3(UserDefinedCSType newUserDefinedCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS3(), newUserDefinedCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDefinedCS3(UserDefinedCSType newUserDefinedCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCS3(), newUserDefinedCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedCSPropertyType getUserDefinedCSRef() {
		return (UserDefinedCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedCSRef(UserDefinedCSPropertyType newUserDefinedCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCSRef(), newUserDefinedCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDefinedCSRef(UserDefinedCSPropertyType newUserDefinedCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UserDefinedCSRef(), newUserDefinedCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineCSPropertyType getUsesAffineCS() {
		return (AffineCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesAffineCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesAffineCS(AffineCSPropertyType newUsesAffineCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesAffineCS(), newUsesAffineCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesAffineCS(AffineCSPropertyType newUsesAffineCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesAffineCS(), newUsesAffineCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemAxisPropertyType getUsesAxis() {
		return (CoordinateSystemAxisPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesAxis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesAxis(CoordinateSystemAxisPropertyType newUsesAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesAxis(), newUsesAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesAxis(CoordinateSystemAxisPropertyType newUsesAxis) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesAxis(), newUsesAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSPropertyType getUsesCartesianCS() {
		return (CartesianCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesCartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesCartesianCS(CartesianCSPropertyType newUsesCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesCartesianCS(), newUsesCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesCartesianCS(CartesianCSPropertyType newUsesCartesianCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesCartesianCS(), newUsesCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemPropertyType getUsesCS() {
		return (CoordinateSystemPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesCS(CoordinateSystemPropertyType newUsesCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesCS(), newUsesCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesCS(CoordinateSystemPropertyType newUsesCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesCS(), newUsesCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidPropertyType getUsesEllipsoid() {
		return (EllipsoidPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEllipsoid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEllipsoid(EllipsoidPropertyType newUsesEllipsoid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEllipsoid(), newUsesEllipsoid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesEllipsoid(EllipsoidPropertyType newUsesEllipsoid) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEllipsoid(), newUsesEllipsoid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSPropertyType getUsesEllipsoidalCS() {
		return (EllipsoidalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEllipsoidalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEllipsoidalCS(EllipsoidalCSPropertyType newUsesEllipsoidalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEllipsoidalCS(), newUsesEllipsoidalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesEllipsoidalCS(EllipsoidalCSPropertyType newUsesEllipsoidalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEllipsoidalCS(), newUsesEllipsoidalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumPropertyType getUsesEngineeringDatum() {
		return (EngineeringDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEngineeringDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEngineeringDatum(EngineeringDatumPropertyType newUsesEngineeringDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEngineeringDatum(), newUsesEngineeringDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesEngineeringDatum(EngineeringDatumPropertyType newUsesEngineeringDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesEngineeringDatum(), newUsesEngineeringDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumPropertyType getUsesGeodeticDatum() {
		return (GeodeticDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesGeodeticDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesGeodeticDatum(GeodeticDatumPropertyType newUsesGeodeticDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesGeodeticDatum(), newUsesGeodeticDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesGeodeticDatum(GeodeticDatumPropertyType newUsesGeodeticDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesGeodeticDatum(), newUsesGeodeticDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumPropertyType getUsesImageDatum() {
		return (ImageDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesImageDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesImageDatum(ImageDatumPropertyType newUsesImageDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesImageDatum(), newUsesImageDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesImageDatum(ImageDatumPropertyType newUsesImageDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesImageDatum(), newUsesImageDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationMethodPropertyType getUsesMethod() {
		return (OperationMethodPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesMethod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesMethod(OperationMethodPropertyType newUsesMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesMethod(), newUsesMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesMethod(OperationMethodPropertyType newUsesMethod) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesMethod(), newUsesMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS() {
		return (ObliqueCartesianCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesObliqueCartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType newUsesObliqueCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesObliqueCartesianCS(), newUsesObliqueCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType newUsesObliqueCartesianCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesObliqueCartesianCS(), newUsesObliqueCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateOperationPropertyType getUsesOperation() {
		return (CoordinateOperationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesOperation(CoordinateOperationPropertyType newUsesOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesOperation(), newUsesOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesOperation(CoordinateOperationPropertyType newUsesOperation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesOperation(), newUsesOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralOperationParameterPropertyType getUsesParameter() {
		return (AbstractGeneralOperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesParameter(AbstractGeneralOperationParameterPropertyType newUsesParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesParameter(), newUsesParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesParameter(AbstractGeneralOperationParameterPropertyType newUsesParameter) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesParameter(), newUsesParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianPropertyType getUsesPrimeMeridian() {
		return (PrimeMeridianPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesPrimeMeridian(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesPrimeMeridian(PrimeMeridianPropertyType newUsesPrimeMeridian, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesPrimeMeridian(), newUsesPrimeMeridian, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesPrimeMeridian(PrimeMeridianPropertyType newUsesPrimeMeridian) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesPrimeMeridian(), newUsesPrimeMeridian);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateOperationPropertyType getUsesSingleOperation() {
		return (CoordinateOperationPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesSingleOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesSingleOperation(CoordinateOperationPropertyType newUsesSingleOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesSingleOperation(), newUsesSingleOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesSingleOperation(CoordinateOperationPropertyType newUsesSingleOperation) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesSingleOperation(), newUsesSingleOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSPropertyType getUsesSphericalCS() {
		return (SphericalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesSphericalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesSphericalCS(SphericalCSPropertyType newUsesSphericalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesSphericalCS(), newUsesSphericalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesSphericalCS(SphericalCSPropertyType newUsesSphericalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesSphericalCS(), newUsesSphericalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCSPropertyType getUsesTemporalCS() {
		return (TemporalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTemporalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesTemporalCS(TemporalCSPropertyType newUsesTemporalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTemporalCS(), newUsesTemporalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesTemporalCS(TemporalCSPropertyType newUsesTemporalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTemporalCS(), newUsesTemporalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumPropertyType getUsesTemporalDatum() {
		return (TemporalDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTemporalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesTemporalDatum(TemporalDatumPropertyType newUsesTemporalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTemporalDatum(), newUsesTemporalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesTemporalDatum(TemporalDatumPropertyType newUsesTemporalDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTemporalDatum(), newUsesTemporalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCSPropertyType getUsesTimeCS() {
		return (TimeCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTimeCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesTimeCS(TimeCSPropertyType newUsesTimeCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTimeCS(), newUsesTimeCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesTimeCS(TimeCSPropertyType newUsesTimeCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesTimeCS(), newUsesTimeCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralParameterValuePropertyType getUsesValue() {
		return (AbstractGeneralParameterValuePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesValue(AbstractGeneralParameterValuePropertyType newUsesValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesValue(), newUsesValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesValue(AbstractGeneralParameterValuePropertyType newUsesValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesValue(), newUsesValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSPropertyType getUsesVerticalCS() {
		return (VerticalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesVerticalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesVerticalCS(VerticalCSPropertyType newUsesVerticalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesVerticalCS(), newUsesVerticalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesVerticalCS(VerticalCSPropertyType newUsesVerticalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesVerticalCS(), newUsesVerticalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSPropertyType getVerticalCS() {
		return (VerticalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCS(VerticalCSPropertyType newVerticalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS(), newVerticalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalCS(VerticalCSPropertyType newVerticalCS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS(), newVerticalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumPropertyType getUsesVerticalDatum() {
		return (VerticalDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesVerticalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesVerticalDatum(VerticalDatumPropertyType newUsesVerticalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesVerticalDatum(), newUsesVerticalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesVerticalDatum(VerticalDatumPropertyType newUsesVerticalDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_UsesVerticalDatum(), newUsesVerticalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumPropertyType getVerticalDatum() {
		return (VerticalDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatum(VerticalDatumPropertyType newVerticalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum(), newVerticalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDatum(VerticalDatumPropertyType newVerticalDatum) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum(), newVerticalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedurePropertyType getUsing() {
		return (ProcedurePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Using(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsing(ProcedurePropertyType newUsing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Using(), newUsing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsing(ProcedurePropertyType newUsing) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Using(), newUsing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePrimitivePropertyType getValidTime() {
		return (TimePrimitivePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValidTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTime(TimePrimitivePropertyType newValidTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValidTime(), newValidTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidTime(TimePrimitivePropertyType newValidTime) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValidTime(), newValidTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getValue() {
		return (MeasureType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Value(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(MeasureType newValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Value(), newValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(MeasureType newValue) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Value(), newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueArrayType getValueArray() {
		return (ValueArrayType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueArray(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueArray(ValueArrayType newValueArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueArray(), newValueArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueArray(ValueArrayType newValueArray) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueArray(), newValueArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePropertyType getValueComponent() {
		return (ValuePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueComponent(ValuePropertyType newValueComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueComponent(), newValueComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueComponent(ValuePropertyType newValueComponent) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueComponent(), newValueComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueArrayPropertyType getValueComponents() {
		return (ValueArrayPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueComponents(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueComponents(ValueArrayPropertyType newValueComponents, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueComponents(), newValueComponents, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueComponents(ValueArrayPropertyType newValueComponents) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueComponents(), newValueComponents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueFile() {
		return (String)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueFile(String newValueFile) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueFile(), newValueFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureListType getValueList() {
		return (MeasureListType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueList(MeasureListType newValueList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueList(), newValueList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueList(MeasureListType newValueList) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueList(), newValueList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterPropertyType getValueOfParameter() {
		return (OperationParameterPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueOfParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueOfParameter(OperationParameterPropertyType newValueOfParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueOfParameter(), newValueOfParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueOfParameter(OperationParameterPropertyType newValueOfParameter) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueOfParameter(), newValueOfParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePropertyType getValueProperty() {
		return (ValuePropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueProperty(ValuePropertyType newValueProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueProperty(), newValueProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueProperty(ValuePropertyType newValueProperty) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValueProperty(), newValueProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterGroupPropertyType getValuesOfGroup() {
		return (OperationParameterGroupPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValuesOfGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuesOfGroup(OperationParameterGroupPropertyType newValuesOfGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValuesOfGroup(), newValuesOfGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValuesOfGroup(OperationParameterGroupPropertyType newValuesOfGroup) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_ValuesOfGroup(), newValuesOfGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VectorType getVector() {
		return (VectorType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_Vector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(VectorType newVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_Vector(), newVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVector(VectorType newVector) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_Vector(), newVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCRSType getVerticalCRS() {
		return (VerticalCRSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCRS(VerticalCRSType newVerticalCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCRS(), newVerticalCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalCRS(VerticalCRSType newVerticalCRS) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCRS(), newVerticalCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCRSPropertyType getVerticalCRSRef() {
		return (VerticalCRSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCRSRef(VerticalCRSPropertyType newVerticalCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCRSRef(), newVerticalCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalCRSRef(VerticalCRSPropertyType newVerticalCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCRSRef(), newVerticalCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSType getVerticalCS2() {
		return (VerticalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCS2(VerticalCSType newVerticalCS2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS2(), newVerticalCS2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalCS2(VerticalCSType newVerticalCS2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS2(), newVerticalCS2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSType getVerticalCS3() {
		return (VerticalCSType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCS3(VerticalCSType newVerticalCS3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS3(), newVerticalCS3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalCS3(VerticalCSType newVerticalCS3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCS3(), newVerticalCS3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSPropertyType getVerticalCSRef() {
		return (VerticalCSPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCSRef(VerticalCSPropertyType newVerticalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCSRef(), newVerticalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalCSRef(VerticalCSPropertyType newVerticalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalCSRef(), newVerticalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumType getVerticalDatum2() {
		return (VerticalDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatum2(VerticalDatumType newVerticalDatum2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum2(), newVerticalDatum2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDatum2(VerticalDatumType newVerticalDatum2) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum2(), newVerticalDatum2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumType getVerticalDatum3() {
		return (VerticalDatumType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatum3(VerticalDatumType newVerticalDatum3, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum3(), newVerticalDatum3, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDatum3(VerticalDatumType newVerticalDatum3) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatum3(), newVerticalDatum3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumPropertyType getVerticalDatumRef() {
		return (VerticalDatumPropertyType)getMixed().get(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatumRef(VerticalDatumPropertyType newVerticalDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatumRef(), newVerticalDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDatumRef(VerticalDatumPropertyType newVerticalDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GMLPackage.eINSTANCE.getGMLDocumentRoot_VerticalDatumRef(), newVerticalDatumRef);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GML_DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemoteSchema() {
		return remoteSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteSchema(String newRemoteSchema) {
		String oldRemoteSchema = remoteSchema;
		remoteSchema = newRemoteSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GML_DOCUMENT_ROOT__REMOTE_SCHEMA, oldRemoteSchema, remoteSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUom() {
		return uom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUom(String newUom) {
		String oldUom = uom;
		uom = newUom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GML_DOCUMENT_ROOT__UOM, oldUom, uom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.GML_DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_ASSOCIATION_ROLE:
				return basicSetAbstractAssociationRole(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CONTINUOUS_COVERAGE:
				return basicSetAbstractContinuousCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_FEATURE:
				return basicSetAbstractFeature(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GML:
				return basicSetAbstractGML(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_OBJECT:
				return basicSetAbstractObject(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COORDINATE_OPERATION:
				return basicSetAbstractCoordinateOperation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION:
				return basicSetDefinition(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COORDINATE_SYSTEM:
				return basicSetAbstractCoordinateSystem(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COVERAGE:
				return basicSetAbstractCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CRS:
				return basicSetAbstractCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CURVE:
				return basicSetAbstractCurve(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRIC_PRIMITIVE:
				return basicSetAbstractGeometricPrimitive(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRY:
				return basicSetAbstractGeometry(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CURVE_SEGMENT:
				return basicSetAbstractCurveSegment(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_DATUM:
				return basicSetAbstractDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_DISCRETE_COVERAGE:
				return basicSetAbstractDiscreteCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_FEATURE_COLLECTION:
				return basicSetAbstractFeatureCollection(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_CONVERSION:
				return basicSetAbstractGeneralConversion(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_OPERATION:
				return basicSetAbstractOperation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SINGLE_OPERATION:
				return basicSetAbstractSingleOperation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_DERIVED_CRS:
				return basicSetAbstractGeneralDerivedCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SINGLE_CRS:
				return basicSetAbstractSingleCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER:
				return basicSetAbstractGeneralOperationParameter(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				return basicSetAbstractGeneralOperationParameterRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_PARAMETER_VALUE:
				return basicSetAbstractGeneralParameterValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_TRANSFORMATION:
				return basicSetAbstractGeneralTransformation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRIC_AGGREGATE:
				return basicSetAbstractGeometricAggregate(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GRIDDED_SURFACE:
				return basicSetAbstractGriddedSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_PARAMETRIC_CURVE_SURFACE:
				return basicSetAbstractParametricCurveSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SURFACE_PATCH:
				return basicSetAbstractSurfacePatch(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_IMPLICIT_GEOMETRY:
				return basicSetAbstractImplicitGeometry(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_INLINE_PROPERTY:
				return basicSetAbstractInlineProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_META_DATA:
				return basicSetAbstractMetaData(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_REFERENCE:
				return basicSetAbstractReference(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_RING:
				return basicSetAbstractRing(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SCALAR_VALUE:
				return basicSetAbstractScalarValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_VALUE:
				return basicSetAbstractValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SCALAR_VALUE_LIST:
				return basicSetAbstractScalarValueList(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SOLID:
				return basicSetAbstractSolid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_STRICT_ASSOCIATION_ROLE:
				return basicSetAbstractStrictAssociationRole(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SURFACE:
				return basicSetAbstractSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_COMPLEX:
				return basicSetAbstractTimeComplex(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_OBJECT:
				return basicSetAbstractTimeObject(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_GEOMETRIC_PRIMITIVE:
				return basicSetAbstractTimeGeometricPrimitive(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE:
				return basicSetAbstractTimePrimitive(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_SLICE:
				return basicSetAbstractTimeSlice(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_TOPOLOGY_PRIMITIVE:
				return basicSetAbstractTimeTopologyPrimitive(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TOPOLOGY:
				return basicSetAbstractTopology(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TOPO_PRIMITIVE:
				return basicSetAbstractTopoPrimitive(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS:
				return basicSetAffineCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS1:
				return basicSetAffineCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS2:
				return basicSetAffineCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS3:
				return basicSetAffineCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_PLACEMENT:
				return basicSetAffinePlacement(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_DEFINITION:
				return basicSetAnchorDefinition(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_POINT:
				return basicSetAnchorPoint(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ANGLE:
				return basicSetAngle(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ARC:
				return basicSetArc(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING:
				return basicSetArcString(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_BULGE:
				return basicSetArcByBulge(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				return basicSetArcStringByBulge(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				return basicSetArcByCenterPoint(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ARRAY:
				return basicSetArray(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS:
				return basicSetAxis(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_ABBREV:
				return basicSetAxisAbbrev(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_DIRECTION:
				return basicSetAxisDirection(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BAG:
				return basicSetBag(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CRS:
				return basicSetBaseCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CURVE:
				return basicSetBaseCurve(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEODETIC_CRS:
				return basicSetBaseGeodeticCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEOGRAPHIC_CRS:
				return basicSetBaseGeographicCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_SURFACE:
				return basicSetBaseSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_UNIT:
				return basicSetBaseUnit(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_DEFINITION:
				return basicSetUnitDefinition(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BEZIER:
				return basicSetBezier(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BSPLINE:
				return basicSetBSpline(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN:
				return basicSetBoolean(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__BOUNDED_BY:
				return basicSetBoundedBy(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS:
				return basicSetCartesianCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS1:
				return basicSetCartesianCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS2:
				return basicSetCartesianCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS3:
				return basicSetCartesianCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS_REF:
				return basicSetCartesianCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CATALOG_SYMBOL:
				return basicSetCatalogSymbol(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY:
				return basicSetCategory(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_EXTENT:
				return basicSetCategoryExtent(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_LIST:
				return basicSetCategoryList(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_LINE_OF:
				return basicSetCenterLineOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_OF:
				return basicSetCenterOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE:
				return basicSetCircle(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				return basicSetCircleByCenterPoint(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CLOTHOID:
				return basicSetClothoid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COMPONENT_REFERENCE_SYSTEM:
				return basicSetComponentReferenceSystem(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_CURVE:
				return basicSetCompositeCurve(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SOLID:
				return basicSetCompositeSolid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SURFACE:
				return basicSetCompositeSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_VALUE:
				return basicSetCompositeValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS:
				return basicSetCompoundCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS_REF:
				return basicSetCompoundCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION:
				return basicSetConcatenatedOperation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				return basicSetConcatenatedOperationRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONE:
				return basicSetCone(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				return basicSetConventionalUnit(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION:
				return basicSetConversion(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION1:
				return basicSetConversion1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION2:
				return basicSetConversion2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION3:
				return basicSetConversion3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_REF:
				return basicSetConversionRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				return basicSetConversionToPreferredUnit(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_ACCURACY:
				return basicSetCoordinateOperationAccuracy(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				return basicSetCoordinateOperationRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATES:
				return basicSetCoordinates(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				return basicSetCoordinateSystemAxis(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				return basicSetCoordinateSystemAxisRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				return basicSetCoordinateSystemRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COORD_OPERATION:
				return basicSetCoordOperation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT:
				return basicSetCount(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_FUNCTION:
				return basicSetCoverageFunction(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_MAPPING_RULE:
				return basicSetCoverageMappingRule(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CRS_REF:
				return basicSetCrsRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CUBIC_SPLINE:
				return basicSetCubicSpline(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE:
				return basicSetCurve(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				return basicSetCurveArrayProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBER:
				return basicSetCurveMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBERS:
				return basicSetCurveMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_PROPERTY:
				return basicSetCurveProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDER:
				return basicSetCylinder(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS:
				return basicSetCylindricalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS1:
				return basicSetCylindricalCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS2:
				return basicSetCylindricalCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS3:
				return basicSetCylindricalCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				return basicSetCylindricalCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_BLOCK:
				return basicSetDataBlock(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE_REFERENCE:
				return basicSetDataSourceReference(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DATUM_REF:
				return basicSetDatumRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				return basicSetDefinedByConversion(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_COLLECTION:
				return basicSetDefinitionCollection(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_MEMBER:
				return basicSetDefinitionMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY_ENTRY:
				return basicSetDictionaryEntry(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_PROXY:
				return basicSetDefinitionProxy(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_REF:
				return basicSetDefinitionRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DEGREES:
				return basicSetDegrees(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				return basicSetDerivationUnitTerm(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS:
				return basicSetDerivedCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_REF:
				return basicSetDerivedCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				return basicSetDerivedCRSType(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_UNIT:
				return basicSetDerivedUnit(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION_REFERENCE:
				return basicSetDescriptionReference(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY:
				return basicSetDictionary(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_EDGE:
				return basicSetDirectedEdge(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_FACE:
				return basicSetDirectedFace(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_NODE:
				return basicSetDirectedNode(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				return basicSetDirectedObservation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OBSERVATION:
				return basicSetObservation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				return basicSetDirectedObservationAtDistance(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				return basicSetDirectedTopoSolid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTION:
				return basicSetDirection(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE:
				return basicSetDmsAngle(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				return basicSetDmsAngleValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_OF_VALIDITY:
				return basicSetDomainOfValidity(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_SET:
				return basicSetDomainSet(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE:
				return basicSetDynamicFeature(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE_COLLECTION:
				return basicSetDynamicFeatureCollection(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_MEMBERS:
				return basicSetDynamicMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE:
				return basicSetEdge(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE_OF:
				return basicSetEdgeOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID:
				return basicSetEllipsoid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID1:
				return basicSetEllipsoid1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID2:
				return basicSetEllipsoid2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID3:
				return basicSetEllipsoid3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				return basicSetEllipsoidalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS1:
				return basicSetEllipsoidalCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS2:
				return basicSetEllipsoidalCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS3:
				return basicSetEllipsoidalCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				return basicSetEllipsoidalCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID_REF:
				return basicSetEllipsoidRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS:
				return basicSetEngineeringCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				return basicSetEngineeringCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM:
				return basicSetEngineeringDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM1:
				return basicSetEngineeringDatum1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM2:
				return basicSetEngineeringDatum2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM3:
				return basicSetEngineeringDatum3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				return basicSetEngineeringDatumRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE:
				return basicSetEnvelope(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				return basicSetEnvelopeWithTimePeriod(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__EXTENT_OF:
				return basicSetExtentOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__EXTERIOR:
				return basicSetExterior(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__FACE:
				return basicSetFace(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_COLLECTION:
				return basicSetFeatureCollection(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBER:
				return basicSetFeatureMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBERS:
				return basicSetFeatureMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_PROPERTY:
				return basicSetFeatureProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__FILE:
				return basicSetFile(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA:
				return basicSetFormula(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA_CITATION:
				return basicSetFormulaCitation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				return basicSetGeneralConversionRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
				return basicSetGeneralOperationParameter(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER1:
				return basicSetGeneralOperationParameter1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				return basicSetGeneralTransformationRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GENERIC_META_DATA:
				return basicSetGenericMetaData(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS:
				return basicSetGeocentricCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				return basicSetGeocentricCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC:
				return basicSetGeodesic(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC_STRING:
				return basicSetGeodesicString(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_CRS:
				return basicSetGeodeticCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM:
				return basicSetGeodeticDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM1:
				return basicSetGeodeticDatum1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM2:
				return basicSetGeodeticDatum2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM3:
				return basicSetGeodeticDatum3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				return basicSetGeodeticDatumRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				return basicSetGeographicCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				return basicSetGeographicCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				return basicSetGeometricComplex(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBER:
				return basicSetGeometryMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				return basicSetGeometryMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				return basicSetGreenwichLongitude(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GRID:
				return basicSetGrid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_COVERAGE:
				return basicSetGridCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_DOMAIN:
				return basicSetGridDomain(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_FUNCTION:
				return basicSetGridFunction(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__HISTORY:
				return basicSetHistory(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS:
				return basicSetImageCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS_REF:
				return basicSetImageCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM:
				return basicSetImageDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM1:
				return basicSetImageDatum1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM2:
				return basicSetImageDatum2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM3:
				return basicSetImageDatum3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM_REF:
				return basicSetImageDatumRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_PARAMETER:
				return basicSetIncludesParameter(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_SINGLE_CRS:
				return basicSetIncludesSingleCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_VALUE:
				return basicSetIncludesValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE:
				return basicSetParameterValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__INDIRECT_ENTRY:
				return basicSetIndirectEntry(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__INTERIOR:
				return basicSetInterior(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS:
				return basicSetLinearCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS1:
				return basicSetLinearCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS2:
				return basicSetLinearCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS3:
				return basicSetLinearCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS_REF:
				return basicSetLinearCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_RING:
				return basicSetLinearRing(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING:
				return basicSetLineString(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				return basicSetLineStringSegment(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_KEY_WORD:
				return basicSetLocationKeyWord(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_NAME:
				return basicSetLocationName(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_REFERENCE:
				return basicSetLocationReference(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_STRING:
				return basicSetLocationString(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MAPPING_RULE:
				return basicSetMappingRule(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				return basicSetMaximalComplex(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MEASURE:
				return basicSetMeasure(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBER:
				return basicSetMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBERS:
				return basicSetMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__META_DATA_PROPERTY:
				return basicSetMetaDataProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD:
				return basicSetMethod(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD_FORMULA:
				return basicSetMethodFormula(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				return basicSetMovingObjectStatus(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				return basicSetMultiCenterLineOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_OF:
				return basicSetMultiCenterOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_COVERAGE:
				return basicSetMultiCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE:
				return basicSetMultiCurve(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				return basicSetMultiCurveCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				return basicSetMultiCurveDomain(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				return basicSetMultiCurveProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EDGE_OF:
				return basicSetMultiEdgeOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EXTENT_OF:
				return basicSetMultiExtentOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY:
				return basicSetMultiGeometry(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				return basicSetMultiGeometryProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_LOCATION:
				return basicSetMultiLocation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT:
				return basicSetMultiPoint(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				return basicSetMultiPointCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				return basicSetMultiPointDomain(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				return basicSetMultiPointProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POSITION:
				return basicSetMultiPosition(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID:
				return basicSetMultiSolid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				return basicSetMultiSolidCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				return basicSetMultiSolidDomain(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				return basicSetMultiSolidProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE:
				return basicSetMultiSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				return basicSetMultiSurfaceCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				return basicSetMultiSurfaceDomain(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				return basicSetMultiSurfaceProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__NODE:
				return basicSetNode(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				return basicSetObliqueCartesianCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				return basicSetObliqueCartesianCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OFFSET_CURVE:
				return basicSetOffsetCurve(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD:
				return basicSetOperationMethod(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD_REF:
				return basicSetOperationMethodRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER:
				return basicSetOperationParameter(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER1:
				return basicSetOperationParameter1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER2:
				return basicSetOperationParameter2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER3:
				return basicSetOperationParameter3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				return basicSetOperationParameterGroup(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				return basicSetOperationParameterGroupRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				return basicSetOperationParameterRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_REF:
				return basicSetOperationRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_CURVE:
				return basicSetOrientableCurve(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				return basicSetOrientableSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE1:
				return basicSetParameterValue1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE2:
				return basicSetParameterValue2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE3:
				return basicSetParameterValue3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				return basicSetParameterValueGroup(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				return basicSetPassThroughOperation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				return basicSetPassThroughOperationRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PATCHES:
				return basicSetPatches(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PIXEL_IN_CELL:
				return basicSetPixelInCell(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POINT:
				return basicSetPoint(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				return basicSetPointArrayProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBER:
				return basicSetPointMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBERS:
				return basicSetPointMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_PROPERTY:
				return basicSetPointProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_REP:
				return basicSetPointRep(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS:
				return basicSetPolarCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS1:
				return basicSetPolarCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS2:
				return basicSetPolarCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS3:
				return basicSetPolarCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS_REF:
				return basicSetPolarCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON:
				return basicSetPolygon(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCH:
				return basicSetPolygonPatch(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCHES:
				return basicSetPolygonPatches(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				return basicSetPolyhedralSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE:
				return basicSetSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POS:
				return basicSetPos(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POSITION:
				return basicSetPosition(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__POS_LIST:
				return basicSetPosList(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN:
				return basicSetPrimeMeridian(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN1:
				return basicSetPrimeMeridian1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN2:
				return basicSetPrimeMeridian2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN3:
				return basicSetPrimeMeridian3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				return basicSetPrimeMeridianRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PRIORITY_LOCATION:
				return basicSetPriorityLocation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS:
				return basicSetProjectedCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS_REF:
				return basicSetProjectedCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_EXTENT:
				return basicSetQuantityExtent(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_LIST:
				return basicSetQuantityList(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE:
				return basicSetQuantityType(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE_REFERENCE:
				return basicSetQuantityTypeReference(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_MEANING:
				return basicSetRangeMeaning(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_PARAMETERS:
				return basicSetRangeParameters(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_SET:
				return basicSetRangeSet(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RECTANGLE:
				return basicSetRectangle(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID:
				return basicSetRectifiedGrid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				return basicSetRectifiedGridCoverage(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				return basicSetRectifiedGridDomain(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				return basicSetReferenceSystemRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RESULT_OF:
				return basicSetResultOf(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__RING:
				return basicSetRing(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				return basicSetRoughConversionToPreferredUnit(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				return basicSetSecondDefiningParameter(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER1:
				return basicSetSecondDefiningParameter1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER2:
				return basicSetSecondDefiningParameter2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER3:
				return basicSetSecondDefiningParameter3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SEGMENTS:
				return basicSetSegments(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				return basicSetSemiMajorAxis(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SHELL:
				return basicSetShell(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_CRS_REF:
				return basicSetSingleCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				return basicSetSingleOperationRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID:
				return basicSetSolid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				return basicSetSolidArrayProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBER:
				return basicSetSolidMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBERS:
				return basicSetSolidMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_PROPERTY:
				return basicSetSolidProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_CRS:
				return basicSetSourceCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERE:
				return basicSetSphere(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS:
				return basicSetSphericalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS1:
				return basicSetSphericalCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS2:
				return basicSetSphericalCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS3:
				return basicSetSphericalCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS_REF:
				return basicSetSphericalCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS:
				return basicSetStatus(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS_REFERENCE:
				return basicSetStatusReference(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SUB_COMPLEX:
				return basicSetSubComplex(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SUBJECT:
				return basicSetSubject(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET:
				return basicSetTarget(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SUPER_COMPLEX:
				return basicSetSuperComplex(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				return basicSetSurfaceArrayProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBER:
				return basicSetSurfaceMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBERS:
				return basicSetSurfaceMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_PROPERTY:
				return basicSetSurfaceProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_CRS:
				return basicSetTargetCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS:
				return basicSetTemporalCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				return basicSetTemporalCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS:
				return basicSetTemporalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS_REF:
				return basicSetTemporalCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM:
				return basicSetTemporalDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM1:
				return basicSetTemporalDatum1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM2:
				return basicSetTemporalDatum2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM3:
				return basicSetTemporalDatum3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				return basicSetTemporalDatumRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR:
				return basicSetTimeCalendar(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
				return basicSetTimeReferenceSystem(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				return basicSetTimeCalendarEra(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CLOCK:
				return basicSetTimeClock(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				return basicSetTimeCoordinateSystem(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS:
				return basicSetTimeCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS1:
				return basicSetTimeCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS2:
				return basicSetTimeCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS3:
				return basicSetTimeCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_EDGE:
				return basicSetTimeEdge(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INSTANT:
				return basicSetTimeInstant(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INTERVAL:
				return basicSetTimeInterval(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_NODE:
				return basicSetTimeNode(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				return basicSetTimeOrdinalEra(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				return basicSetTimeOrdinalReferenceSystem(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_PERIOD:
				return basicSetTimePeriod(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_POSITION:
				return basicSetTimePosition(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				return basicSetTimeTopologyComplex(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TIN:
				return basicSetTin(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				return basicSetTriangulatedSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX:
				return basicSetTopoComplex(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				return basicSetTopoComplexProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE:
				return basicSetTopoCurve(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				return basicSetTopoCurveProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT:
				return basicSetTopoPoint(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				return basicSetTopoPointProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				return basicSetTopoPrimitiveMember(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				return basicSetTopoPrimitiveMembers(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SOLID:
				return basicSetTopoSolid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE:
				return basicSetTopoSurface(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				return basicSetTopoSurfaceProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME:
				return basicSetTopoVolume(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				return basicSetTopoVolumeProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TRACK:
				return basicSetTrack(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION_REF:
				return basicSetTransformationRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE:
				return basicSetTriangle(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE_PATCHES:
				return basicSetTrianglePatches(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__TUPLE_LIST:
				return basicSetTupleList(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return basicSetUnitOfMeasure(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS:
				return basicSetUserDefinedCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS1:
				return basicSetUserDefinedCS1(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS2:
				return basicSetUserDefinedCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS3:
				return basicSetUserDefinedCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				return basicSetUserDefinedCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AFFINE_CS:
				return basicSetUsesAffineCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AXIS:
				return basicSetUsesAxis(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CARTESIAN_CS:
				return basicSetUsesCartesianCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CS:
				return basicSetUsesCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOID:
				return basicSetUsesEllipsoid(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				return basicSetUsesEllipsoidalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				return basicSetUsesEngineeringDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				return basicSetUsesGeodeticDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_IMAGE_DATUM:
				return basicSetUsesImageDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_METHOD:
				return basicSetUsesMethod(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				return basicSetUsesObliqueCartesianCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OPERATION:
				return basicSetUsesOperation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PARAMETER:
				return basicSetUsesParameter(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				return basicSetUsesPrimeMeridian(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				return basicSetUsesSingleOperation(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SPHERICAL_CS:
				return basicSetUsesSphericalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_CS:
				return basicSetUsesTemporalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				return basicSetUsesTemporalDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TIME_CS:
				return basicSetUsesTimeCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VALUE:
				return basicSetUsesValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_CS:
				return basicSetUsesVerticalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS:
				return basicSetVerticalCS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				return basicSetUsesVerticalDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM:
				return basicSetVerticalDatum(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__USING:
				return basicSetUsing(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALID_TIME:
				return basicSetValidTime(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE:
				return basicSetValue(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_ARRAY:
				return basicSetValueArray(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENT:
				return basicSetValueComponent(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENTS:
				return basicSetValueComponents(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_LIST:
				return basicSetValueList(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				return basicSetValueOfParameter(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_PROPERTY:
				return basicSetValueProperty(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VALUES_OF_GROUP:
				return basicSetValuesOfGroup(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VECTOR:
				return basicSetVector(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS:
				return basicSetVerticalCRS(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS_REF:
				return basicSetVerticalCRSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS2:
				return basicSetVerticalCS2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS3:
				return basicSetVerticalCS3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS_REF:
				return basicSetVerticalCSRef(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM2:
				return basicSetVerticalDatum2(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM3:
				return basicSetVerticalDatum3(null, msgs);
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				return basicSetVerticalDatumRef(null, msgs);
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
			case GMLPackage.GML_DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GMLPackage.GML_DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case GMLPackage.GML_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_ASSOCIATION_ROLE:
				return getAbstractAssociationRole();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CONTINUOUS_COVERAGE:
				return getAbstractContinuousCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_FEATURE:
				return getAbstractFeature();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GML:
				return getAbstractGML();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_OBJECT:
				return getAbstractObject();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COORDINATE_OPERATION:
				return getAbstractCoordinateOperation();
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION:
				return getDefinition();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COORDINATE_SYSTEM:
				return getAbstractCoordinateSystem();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COVERAGE:
				return getAbstractCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CRS:
				return getAbstractCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CURVE:
				return getAbstractCurve();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRIC_PRIMITIVE:
				return getAbstractGeometricPrimitive();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRY:
				return getAbstractGeometry();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CURVE_SEGMENT:
				return getAbstractCurveSegment();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_DATUM:
				return getAbstractDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_DISCRETE_COVERAGE:
				return getAbstractDiscreteCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_FEATURE_COLLECTION:
				return getAbstractFeatureCollection();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_CONVERSION:
				return getAbstractGeneralConversion();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_OPERATION:
				return getAbstractOperation();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SINGLE_OPERATION:
				return getAbstractSingleOperation();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_DERIVED_CRS:
				return getAbstractGeneralDerivedCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SINGLE_CRS:
				return getAbstractSingleCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER:
				return getAbstractGeneralOperationParameter();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				return getAbstractGeneralOperationParameterRef();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_PARAMETER_VALUE:
				return getAbstractGeneralParameterValue();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_TRANSFORMATION:
				return getAbstractGeneralTransformation();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRIC_AGGREGATE:
				return getAbstractGeometricAggregate();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GRIDDED_SURFACE:
				return getAbstractGriddedSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_PARAMETRIC_CURVE_SURFACE:
				return getAbstractParametricCurveSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SURFACE_PATCH:
				return getAbstractSurfacePatch();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_IMPLICIT_GEOMETRY:
				return getAbstractImplicitGeometry();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_INLINE_PROPERTY:
				return getAbstractInlineProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_META_DATA:
				return getAbstractMetaData();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_REFERENCE:
				return getAbstractReference();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_RING:
				return getAbstractRing();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SCALAR_VALUE:
				return getAbstractScalarValue();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_VALUE:
				return getAbstractValue();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SCALAR_VALUE_LIST:
				return getAbstractScalarValueList();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SOLID:
				return getAbstractSolid();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_STRICT_ASSOCIATION_ROLE:
				return getAbstractStrictAssociationRole();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SURFACE:
				return getAbstractSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_COMPLEX:
				return getAbstractTimeComplex();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_OBJECT:
				return getAbstractTimeObject();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_GEOMETRIC_PRIMITIVE:
				return getAbstractTimeGeometricPrimitive();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE:
				return getAbstractTimePrimitive();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_SLICE:
				return getAbstractTimeSlice();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_TOPOLOGY_PRIMITIVE:
				return getAbstractTimeTopologyPrimitive();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TOPOLOGY:
				return getAbstractTopology();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TOPO_PRIMITIVE:
				return getAbstractTopoPrimitive();
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS:
				return getAffineCS();
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS1:
				return getAffineCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS2:
				return getAffineCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS3:
				return getAffineCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_PLACEMENT:
				return getAffinePlacement();
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_DEFINITION:
				return getAnchorDefinition();
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_POINT:
				return getAnchorPoint();
			case GMLPackage.GML_DOCUMENT_ROOT__ANGLE:
				return getAngle();
			case GMLPackage.GML_DOCUMENT_ROOT__ARC:
				return getArc();
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING:
				return getArcString();
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_BULGE:
				return getArcByBulge();
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				return getArcStringByBulge();
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				return getArcByCenterPoint();
			case GMLPackage.GML_DOCUMENT_ROOT__ARRAY:
				return getArray();
			case GMLPackage.GML_DOCUMENT_ROOT__ASSOCIATION_NAME:
				return getAssociationName();
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS:
				return getAxis();
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_ABBREV:
				return getAxisAbbrev();
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_DIRECTION:
				return getAxisDirection();
			case GMLPackage.GML_DOCUMENT_ROOT__BAG:
				return getBag();
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CRS:
				return getBaseCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CURVE:
				return getBaseCurve();
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEODETIC_CRS:
				return getBaseGeodeticCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEOGRAPHIC_CRS:
				return getBaseGeographicCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_SURFACE:
				return getBaseSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_UNIT:
				return getBaseUnit();
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_DEFINITION:
				return getUnitDefinition();
			case GMLPackage.GML_DOCUMENT_ROOT__BEZIER:
				return getBezier();
			case GMLPackage.GML_DOCUMENT_ROOT__BSPLINE:
				return getBSpline();
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN:
				return getBoolean();
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN_LIST:
				return getBooleanList();
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN_VALUE:
				return isBooleanValue();
			case GMLPackage.GML_DOCUMENT_ROOT__BOUNDED_BY:
				return getBoundedBy();
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS:
				return getCartesianCS();
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS1:
				return getCartesianCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS2:
				return getCartesianCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS3:
				return getCartesianCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS_REF:
				return getCartesianCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__CATALOG_SYMBOL:
				return getCatalogSymbol();
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY:
				return getCategory();
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_EXTENT:
				return getCategoryExtent();
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_LIST:
				return getCategoryList();
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_LINE_OF:
				return getCenterLineOf();
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_OF:
				return getCenterOf();
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE:
				return getCircle();
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				return getCircleByCenterPoint();
			case GMLPackage.GML_DOCUMENT_ROOT__CLOTHOID:
				return getClothoid();
			case GMLPackage.GML_DOCUMENT_ROOT__COMPONENT_REFERENCE_SYSTEM:
				return getComponentReferenceSystem();
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_CURVE:
				return getCompositeCurve();
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SOLID:
				return getCompositeSolid();
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SURFACE:
				return getCompositeSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_VALUE:
				return getCompositeValue();
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS:
				return getCompoundCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS_REF:
				return getCompoundCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION:
				return getConcatenatedOperation();
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				return getConcatenatedOperationRef();
			case GMLPackage.GML_DOCUMENT_ROOT__CONE:
				return getCone();
			case GMLPackage.GML_DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				return getConventionalUnit();
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION:
				return getConversion();
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION1:
				return getConversion1();
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION2:
				return getConversion2();
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION3:
				return getConversion3();
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_REF:
				return getConversionRef();
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				return getConversionToPreferredUnit();
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_ACCURACY:
				return getCoordinateOperationAccuracy();
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				return getCoordinateOperationRef();
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATES:
				return getCoordinates();
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM:
				return getCoordinateSystem();
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				return getCoordinateSystemAxis();
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				return getCoordinateSystemAxisRef();
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				return getCoordinateSystemRef();
			case GMLPackage.GML_DOCUMENT_ROOT__COORD_OPERATION:
				return getCoordOperation();
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT:
				return getCount();
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT_EXTENT:
				return getCountExtent();
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT_LIST:
				return getCountList();
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_FUNCTION:
				return getCoverageFunction();
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_MAPPING_RULE:
				return getCoverageMappingRule();
			case GMLPackage.GML_DOCUMENT_ROOT__CRS_REF:
				return getCrsRef();
			case GMLPackage.GML_DOCUMENT_ROOT__CUBIC_SPLINE:
				return getCubicSpline();
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE:
				return getCurve();
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				return getCurveArrayProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBER:
				return getCurveMember();
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBERS:
				return getCurveMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_PROPERTY:
				return getCurveProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDER:
				return getCylinder();
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS:
				return getCylindricalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS1:
				return getCylindricalCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS2:
				return getCylindricalCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS3:
				return getCylindricalCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				return getCylindricalCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_BLOCK:
				return getDataBlock();
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE:
				return getDataSource();
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE_REFERENCE:
				return getDataSourceReference();
			case GMLPackage.GML_DOCUMENT_ROOT__DATUM_REF:
				return getDatumRef();
			case GMLPackage.GML_DOCUMENT_ROOT__DECIMAL_MINUTES:
				return getDecimalMinutes();
			case GMLPackage.GML_DOCUMENT_ROOT__DEFAULT_CODE_SPACE:
				return getDefaultCodeSpace();
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				return getDefinedByConversion();
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_COLLECTION:
				return getDefinitionCollection();
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_MEMBER:
				return getDefinitionMember();
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY_ENTRY:
				return getDictionaryEntry();
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_PROXY:
				return getDefinitionProxy();
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_REF:
				return getDefinitionRef();
			case GMLPackage.GML_DOCUMENT_ROOT__DEGREES:
				return getDegrees();
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				return getDerivationUnitTerm();
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS:
				return getDerivedCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_REF:
				return getDerivedCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				return getDerivedCRSType();
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_UNIT:
				return getDerivedUnit();
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION_REFERENCE:
				return getDescriptionReference();
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY:
				return getDictionary();
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_EDGE:
				return getDirectedEdge();
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_FACE:
				return getDirectedFace();
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_NODE:
				return getDirectedNode();
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				return getDirectedObservation();
			case GMLPackage.GML_DOCUMENT_ROOT__OBSERVATION:
				return getObservation();
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				return getDirectedObservationAtDistance();
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				return getDirectedTopoSolid();
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTION:
				return getDirection();
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE:
				return getDmsAngle();
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				return getDmsAngleValue();
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity();
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_SET:
				return getDomainSet();
			case GMLPackage.GML_DOCUMENT_ROOT__DOUBLE_OR_NIL_REASON_TUPLE_LIST:
				return getDoubleOrNilReasonTupleList();
			case GMLPackage.GML_DOCUMENT_ROOT__DURATION:
				return getDuration();
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE:
				return getDynamicFeature();
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE_COLLECTION:
				return getDynamicFeatureCollection();
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_MEMBERS:
				return getDynamicMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE:
				return getEdge();
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE_OF:
				return getEdgeOf();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID:
				return getEllipsoid();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID1:
				return getEllipsoid1();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID2:
				return getEllipsoid2();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID3:
				return getEllipsoid3();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				return getEllipsoidalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS1:
				return getEllipsoidalCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS2:
				return getEllipsoidalCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS3:
				return getEllipsoidalCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				return getEllipsoidalCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID_REF:
				return getEllipsoidRef();
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS:
				return getEngineeringCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				return getEngineeringCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM:
				return getEngineeringDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM1:
				return getEngineeringDatum1();
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM2:
				return getEngineeringDatum2();
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM3:
				return getEngineeringDatum3();
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				return getEngineeringDatumRef();
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE:
				return getEnvelope();
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				return getEnvelopeWithTimePeriod();
			case GMLPackage.GML_DOCUMENT_ROOT__EXTENT_OF:
				return getExtentOf();
			case GMLPackage.GML_DOCUMENT_ROOT__EXTERIOR:
				return getExterior();
			case GMLPackage.GML_DOCUMENT_ROOT__FACE:
				return getFace();
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_COLLECTION:
				return getFeatureCollection();
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBER:
				return getFeatureMember();
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBERS:
				return getFeatureMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_PROPERTY:
				return getFeatureProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__FILE:
				return getFile();
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA:
				return getFormula();
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA_CITATION:
				return getFormulaCitation();
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				return getGeneralConversionRef();
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
				return getGeneralOperationParameter();
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER1:
				return getGeneralOperationParameter1();
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				return getGeneralTransformationRef();
			case GMLPackage.GML_DOCUMENT_ROOT__GENERIC_META_DATA:
				return getGenericMetaData();
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS:
				return getGeocentricCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				return getGeocentricCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC:
				return getGeodesic();
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC_STRING:
				return getGeodesicString();
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_CRS:
				return getGeodeticCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM:
				return getGeodeticDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM1:
				return getGeodeticDatum1();
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM2:
				return getGeodeticDatum2();
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM3:
				return getGeodeticDatum3();
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				return getGeodeticDatumRef();
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				return getGeographicCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				return getGeographicCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				return getGeometricComplex();
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBER:
				return getGeometryMember();
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				return getGeometryMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__GML_PROFILE_SCHEMA:
				return getGmlProfileSchema();
			case GMLPackage.GML_DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				return getGreenwichLongitude();
			case GMLPackage.GML_DOCUMENT_ROOT__GRID:
				return getGrid();
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_COVERAGE:
				return getGridCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_DOMAIN:
				return getGridDomain();
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_FUNCTION:
				return getGridFunction();
			case GMLPackage.GML_DOCUMENT_ROOT__GROUP:
				return getGroup();
			case GMLPackage.GML_DOCUMENT_ROOT__HISTORY:
				return getHistory();
			case GMLPackage.GML_DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier();
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS:
				return getImageCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS_REF:
				return getImageCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM:
				return getImageDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM1:
				return getImageDatum1();
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM2:
				return getImageDatum2();
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM3:
				return getImageDatum3();
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM_REF:
				return getImageDatumRef();
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_PARAMETER:
				return getIncludesParameter();
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_SINGLE_CRS:
				return getIncludesSingleCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_VALUE:
				return getIncludesValue();
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE:
				return getParameterValue();
			case GMLPackage.GML_DOCUMENT_ROOT__INDIRECT_ENTRY:
				return getIndirectEntry();
			case GMLPackage.GML_DOCUMENT_ROOT__INTEGER_VALUE:
				return getIntegerValue();
			case GMLPackage.GML_DOCUMENT_ROOT__INTEGER_VALUE_LIST:
				return getIntegerValueList();
			case GMLPackage.GML_DOCUMENT_ROOT__INTERIOR:
				return getInterior();
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS:
				return getLinearCS();
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS1:
				return getLinearCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS2:
				return getLinearCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS3:
				return getLinearCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS_REF:
				return getLinearCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_RING:
				return getLinearRing();
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING:
				return getLineString();
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				return getLineStringSegment();
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_KEY_WORD:
				return getLocationKeyWord();
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_NAME:
				return getLocationName();
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_REFERENCE:
				return getLocationReference();
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_STRING:
				return getLocationString();
			case GMLPackage.GML_DOCUMENT_ROOT__MAPPING_RULE:
				return getMappingRule();
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				return getMaximalComplex();
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMUM_OCCURS:
				return getMaximumOccurs();
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMUM_VALUE:
				return getMaximumValue();
			case GMLPackage.GML_DOCUMENT_ROOT__MEASURE:
				return getMeasure();
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBER:
				return getMember();
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBERS:
				return getMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__META_DATA_PROPERTY:
				return getMetaDataProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD:
				return getMethod();
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD_FORMULA:
				return getMethodFormula();
			case GMLPackage.GML_DOCUMENT_ROOT__MINIMUM_OCCURS:
				return getMinimumOccurs();
			case GMLPackage.GML_DOCUMENT_ROOT__MINIMUM_VALUE:
				return getMinimumValue();
			case GMLPackage.GML_DOCUMENT_ROOT__MINUTES:
				return getMinutes();
			case GMLPackage.GML_DOCUMENT_ROOT__MODIFIED_COORDINATE:
				return getModifiedCoordinate();
			case GMLPackage.GML_DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				return getMovingObjectStatus();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				return getMultiCenterLineOf();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_OF:
				return getMultiCenterOf();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_COVERAGE:
				return getMultiCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE:
				return getMultiCurve();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				return getMultiCurveCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				return getMultiCurveDomain();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				return getMultiCurveProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EDGE_OF:
				return getMultiEdgeOf();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EXTENT_OF:
				return getMultiExtentOf();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY:
				return getMultiGeometry();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				return getMultiGeometryProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_LOCATION:
				return getMultiLocation();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT:
				return getMultiPoint();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				return getMultiPointCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				return getMultiPointDomain();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				return getMultiPointProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POSITION:
				return getMultiPosition();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID:
				return getMultiSolid();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				return getMultiSolidCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				return getMultiSolidDomain();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				return getMultiSolidProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE:
				return getMultiSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				return getMultiSurfaceCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				return getMultiSurfaceDomain();
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				return getMultiSurfaceProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__NAME:
				return getName();
			case GMLPackage.GML_DOCUMENT_ROOT__NODE:
				return getNode();
			case GMLPackage.GML_DOCUMENT_ROOT__NULL:
				return getNull();
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				return getObliqueCartesianCS();
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				return getObliqueCartesianCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__OFFSET_CURVE:
				return getOffsetCurve();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD:
				return getOperationMethod();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD_REF:
				return getOperationMethodRef();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER:
				return getOperationParameter();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER1:
				return getOperationParameter1();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER2:
				return getOperationParameter2();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER3:
				return getOperationParameter3();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				return getOperationParameterGroup();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				return getOperationParameterGroupRef();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				return getOperationParameterRef();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_REF:
				return getOperationRef();
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_VERSION:
				return getOperationVersion();
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_CURVE:
				return getOrientableCurve();
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				return getOrientableSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__ORIGIN:
				return getOrigin();
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER:
				return getParameter();
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE1:
				return getParameterValue1();
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE2:
				return getParameterValue2();
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE3:
				return getParameterValue3();
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				return getParameterValueGroup();
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				return getPassThroughOperation();
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				return getPassThroughOperationRef();
			case GMLPackage.GML_DOCUMENT_ROOT__PATCHES:
				return getPatches();
			case GMLPackage.GML_DOCUMENT_ROOT__PIXEL_IN_CELL:
				return getPixelInCell();
			case GMLPackage.GML_DOCUMENT_ROOT__POINT:
				return getPoint();
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				return getPointArrayProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBER:
				return getPointMember();
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBERS:
				return getPointMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_PROPERTY:
				return getPointProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_REP:
				return getPointRep();
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS:
				return getPolarCS();
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS1:
				return getPolarCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS2:
				return getPolarCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS3:
				return getPolarCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS_REF:
				return getPolarCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON:
				return getPolygon();
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCH:
				return getPolygonPatch();
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCHES:
				return getPolygonPatches();
			case GMLPackage.GML_DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				return getPolyhedralSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE:
				return getSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__POS:
				return getPos();
			case GMLPackage.GML_DOCUMENT_ROOT__POSITION:
				return getPosition();
			case GMLPackage.GML_DOCUMENT_ROOT__POS_LIST:
				return getPosList();
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN:
				return getPrimeMeridian();
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN1:
				return getPrimeMeridian1();
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN2:
				return getPrimeMeridian2();
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN3:
				return getPrimeMeridian3();
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				return getPrimeMeridianRef();
			case GMLPackage.GML_DOCUMENT_ROOT__PRIORITY_LOCATION:
				return getPriorityLocation();
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS:
				return getProjectedCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS_REF:
				return getProjectedCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY:
				return getQuantity();
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_EXTENT:
				return getQuantityExtent();
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_LIST:
				return getQuantityList();
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE:
				return getQuantityType();
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE_REFERENCE:
				return getQuantityTypeReference();
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_MEANING:
				return getRangeMeaning();
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_PARAMETERS:
				return getRangeParameters();
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_SET:
				return getRangeSet();
			case GMLPackage.GML_DOCUMENT_ROOT__REALIZATION_EPOCH:
				return getRealizationEpoch();
			case GMLPackage.GML_DOCUMENT_ROOT__RECTANGLE:
				return getRectangle();
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID:
				return getRectifiedGrid();
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				return getRectifiedGridCoverage();
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				return getRectifiedGridDomain();
			case GMLPackage.GML_DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				return getReferenceSystemRef();
			case GMLPackage.GML_DOCUMENT_ROOT__REMARKS:
				return getRemarks();
			case GMLPackage.GML_DOCUMENT_ROOT__RESULT_OF:
				return getResultOf();
			case GMLPackage.GML_DOCUMENT_ROOT__REVERSE_PROPERTY_NAME:
				return getReversePropertyName();
			case GMLPackage.GML_DOCUMENT_ROOT__RING:
				return getRing();
			case GMLPackage.GML_DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				return getRoughConversionToPreferredUnit();
			case GMLPackage.GML_DOCUMENT_ROOT__SCOPE:
				return getScope();
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				return getSecondDefiningParameter();
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER1:
				return getSecondDefiningParameter1();
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER2:
				return getSecondDefiningParameter2();
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER3:
				return getSecondDefiningParameter3();
			case GMLPackage.GML_DOCUMENT_ROOT__SECONDS:
				return getSeconds();
			case GMLPackage.GML_DOCUMENT_ROOT__SEGMENTS:
				return getSegments();
			case GMLPackage.GML_DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				return getSemiMajorAxis();
			case GMLPackage.GML_DOCUMENT_ROOT__SHELL:
				return getShell();
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_CRS_REF:
				return getSingleCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				return getSingleOperationRef();
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID:
				return getSolid();
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				return getSolidArrayProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBER:
				return getSolidMember();
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBERS:
				return getSolidMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_PROPERTY:
				return getSolidProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_CRS:
				return getSourceCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_DIMENSIONS:
				return getSourceDimensions();
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERE:
				return getSphere();
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS:
				return getSphericalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS1:
				return getSphericalCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS2:
				return getSphericalCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS3:
				return getSphericalCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS_REF:
				return getSphericalCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS:
				return getStatus();
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS_REFERENCE:
				return getStatusReference();
			case GMLPackage.GML_DOCUMENT_ROOT__STRING_VALUE:
				return getStringValue();
			case GMLPackage.GML_DOCUMENT_ROOT__SUB_COMPLEX:
				return getSubComplex();
			case GMLPackage.GML_DOCUMENT_ROOT__SUBJECT:
				return getSubject();
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET:
				return getTarget();
			case GMLPackage.GML_DOCUMENT_ROOT__SUPER_COMPLEX:
				return getSuperComplex();
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				return getSurfaceArrayProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBER:
				return getSurfaceMember();
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBERS:
				return getSurfaceMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_PROPERTY:
				return getSurfaceProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_CRS:
				return getTargetCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_DIMENSIONS:
				return getTargetDimensions();
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_ELEMENT:
				return getTargetElement();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS:
				return getTemporalCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				return getTemporalCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS:
				return getTemporalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS_REF:
				return getTemporalCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM:
				return getTemporalDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM1:
				return getTemporalDatum1();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM2:
				return getTemporalDatum2();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM3:
				return getTemporalDatum3();
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				return getTemporalDatumRef();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR:
				return getTimeCalendar();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
				return getTimeReferenceSystem();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				return getTimeCalendarEra();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CLOCK:
				return getTimeClock();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				return getTimeCoordinateSystem();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS:
				return getTimeCS();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS1:
				return getTimeCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS2:
				return getTimeCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS3:
				return getTimeCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_EDGE:
				return getTimeEdge();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INSTANT:
				return getTimeInstant();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INTERVAL:
				return getTimeInterval();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_NODE:
				return getTimeNode();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				return getTimeOrdinalEra();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				return getTimeOrdinalReferenceSystem();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_PERIOD:
				return getTimePeriod();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_POSITION:
				return getTimePosition();
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				return getTimeTopologyComplex();
			case GMLPackage.GML_DOCUMENT_ROOT__TIN:
				return getTin();
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				return getTriangulatedSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX:
				return getTopoComplex();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				return getTopoComplexProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE:
				return getTopoCurve();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				return getTopoCurveProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT:
				return getTopoPoint();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				return getTopoPointProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				return getTopoPrimitiveMember();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				return getTopoPrimitiveMembers();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SOLID:
				return getTopoSolid();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE:
				return getTopoSurface();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				return getTopoSurfaceProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME:
				return getTopoVolume();
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				return getTopoVolumeProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__TRACK:
				return getTrack();
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION:
				return getTransformation();
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION_REF:
				return getTransformationRef();
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE:
				return getTriangle();
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE_PATCHES:
				return getTrianglePatches();
			case GMLPackage.GML_DOCUMENT_ROOT__TUPLE_LIST:
				return getTupleList();
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS:
				return getUserDefinedCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS1:
				return getUserDefinedCS1();
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS2:
				return getUserDefinedCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS3:
				return getUserDefinedCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				return getUserDefinedCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AFFINE_CS:
				return getUsesAffineCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AXIS:
				return getUsesAxis();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CARTESIAN_CS:
				return getUsesCartesianCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CS:
				return getUsesCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOID:
				return getUsesEllipsoid();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				return getUsesEllipsoidalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				return getUsesEngineeringDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				return getUsesGeodeticDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_IMAGE_DATUM:
				return getUsesImageDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_METHOD:
				return getUsesMethod();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				return getUsesObliqueCartesianCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OPERATION:
				return getUsesOperation();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PARAMETER:
				return getUsesParameter();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				return getUsesPrimeMeridian();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				return getUsesSingleOperation();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SPHERICAL_CS:
				return getUsesSphericalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_CS:
				return getUsesTemporalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				return getUsesTemporalDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TIME_CS:
				return getUsesTimeCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VALUE:
				return getUsesValue();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_CS:
				return getUsesVerticalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS:
				return getVerticalCS();
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				return getUsesVerticalDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM:
				return getVerticalDatum();
			case GMLPackage.GML_DOCUMENT_ROOT__USING:
				return getUsing();
			case GMLPackage.GML_DOCUMENT_ROOT__VALID_TIME:
				return getValidTime();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE:
				return getValue();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_ARRAY:
				return getValueArray();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENT:
				return getValueComponent();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENTS:
				return getValueComponents();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_FILE:
				return getValueFile();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_LIST:
				return getValueList();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				return getValueOfParameter();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_PROPERTY:
				return getValueProperty();
			case GMLPackage.GML_DOCUMENT_ROOT__VALUES_OF_GROUP:
				return getValuesOfGroup();
			case GMLPackage.GML_DOCUMENT_ROOT__VECTOR:
				return getVector();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS:
				return getVerticalCRS();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS_REF:
				return getVerticalCRSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS2:
				return getVerticalCS2();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS3:
				return getVerticalCS3();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS_REF:
				return getVerticalCSRef();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM2:
				return getVerticalDatum2();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM3:
				return getVerticalDatum3();
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				return getVerticalDatumRef();
			case GMLPackage.GML_DOCUMENT_ROOT__ID:
				return getId();
			case GMLPackage.GML_DOCUMENT_ROOT__REMOTE_SCHEMA:
				return getRemoteSchema();
			case GMLPackage.GML_DOCUMENT_ROOT__UOM:
				return getUom();
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
			case GMLPackage.GML_DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION:
				setDefinition((DefinitionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				setAbstractGeneralOperationParameterRef((AbstractGeneralOperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS:
				setAffineCS((AffineCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS1:
				setAffineCS1((AffineCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS2:
				setAffineCS2((AffineCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS3:
				setAffineCS3((AffineCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_PLACEMENT:
				setAffinePlacement((AffinePlacementType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_DEFINITION:
				setAnchorDefinition((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_POINT:
				setAnchorPoint((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ANGLE:
				setAngle((AngleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC:
				setArc((ArcType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING:
				setArcString((ArcStringType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_BULGE:
				setArcByBulge((ArcByBulgeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				setArcStringByBulge((ArcStringByBulgeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				setArcByCenterPoint((ArcByCenterPointType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARRAY:
				setArray((ArrayType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ASSOCIATION_NAME:
				setAssociationName((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS:
				setAxis((CoordinateSystemAxisPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_ABBREV:
				setAxisAbbrev((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_DIRECTION:
				setAxisDirection((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BAG:
				setBag((BagType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CRS:
				setBaseCRS((SingleCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CURVE:
				setBaseCurve((CurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEODETIC_CRS:
				setBaseGeodeticCRS((GeodeticCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEOGRAPHIC_CRS:
				setBaseGeographicCRS((GeographicCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_SURFACE:
				setBaseSurface((SurfacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_UNIT:
				setBaseUnit((BaseUnitType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_DEFINITION:
				setUnitDefinition((UnitDefinitionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BEZIER:
				setBezier((BezierType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BSPLINE:
				setBSpline((BSplineType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN:
				setBoolean((BooleanType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN_LIST:
				setBooleanList((List<Object>)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN_VALUE:
				setBooleanValue((Boolean)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BOUNDED_BY:
				setBoundedBy((BoundingShapeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS1:
				setCartesianCS1((CartesianCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS2:
				setCartesianCS2((CartesianCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS3:
				setCartesianCS3((CartesianCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS_REF:
				setCartesianCSRef((CartesianCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CATALOG_SYMBOL:
				setCatalogSymbol((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY:
				setCategory((CategoryType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_EXTENT:
				setCategoryExtent((CategoryExtentType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_LIST:
				setCategoryList((CodeOrNilReasonListType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_LINE_OF:
				setCenterLineOf((CurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_OF:
				setCenterOf((PointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE:
				setCircle((CircleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				setCircleByCenterPoint((CircleByCenterPointType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CLOTHOID:
				setClothoid((ClothoidType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPONENT_REFERENCE_SYSTEM:
				setComponentReferenceSystem((SingleCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_CURVE:
				setCompositeCurve((CompositeCurveType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SOLID:
				setCompositeSolid((CompositeSolidType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SURFACE:
				setCompositeSurface((CompositeSurfaceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_VALUE:
				setCompositeValue((CompositeValueType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS:
				setCompoundCRS((CompoundCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS_REF:
				setCompoundCRSRef((CompoundCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION:
				setConcatenatedOperation((ConcatenatedOperationType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				setConcatenatedOperationRef((ConcatenatedOperationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONE:
				setCone((ConeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				setConventionalUnit((ConventionalUnitType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION:
				setConversion((GeneralConversionPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION1:
				setConversion1((GeneralConversionPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION2:
				setConversion2((ConversionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION3:
				setConversion3((ConversionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_REF:
				setConversionRef((ConversionPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				setConversionToPreferredUnit((ConversionToPreferredUnitType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_ACCURACY:
				setCoordinateOperationAccuracy((CoordinateOperationAccuracyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				setCoordinateOperationRef((CoordinateOperationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATES:
				setCoordinates((CoordinatesType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystemPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				setCoordinateSystemAxis((CoordinateSystemAxisType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				setCoordinateSystemAxisRef((CoordinateSystemAxisPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				setCoordinateSystemRef((CoordinateSystemPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORD_OPERATION:
				setCoordOperation((CoordinateOperationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT:
				setCount((CountType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT_EXTENT:
				setCountExtent((List<Object>)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT_LIST:
				setCountList((List<Object>)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_FUNCTION:
				setCoverageFunction((CoverageFunctionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_MAPPING_RULE:
				setCoverageMappingRule((MappingRuleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CRS_REF:
				setCrsRef((CRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CUBIC_SPLINE:
				setCubicSpline((CubicSplineType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE:
				setCurve((CurveType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				setCurveArrayProperty((CurveArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBER:
				setCurveMember((CurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBERS:
				setCurveMembers((CurveArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_PROPERTY:
				setCurveProperty((CurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDER:
				setCylinder((CylinderType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS:
				setCylindricalCS((CylindricalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS1:
				setCylindricalCS1((CylindricalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS2:
				setCylindricalCS2((CylindricalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS3:
				setCylindricalCS3((CylindricalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				setCylindricalCSRef((CylindricalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_BLOCK:
				setDataBlock((DataBlockType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE:
				setDataSource((StringOrRefType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE_REFERENCE:
				setDataSourceReference((ReferenceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DATUM_REF:
				setDatumRef((DatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DECIMAL_MINUTES:
				setDecimalMinutes((BigDecimal)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFAULT_CODE_SPACE:
				setDefaultCodeSpace((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				setDefinedByConversion((GeneralConversionPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_COLLECTION:
				setDefinitionCollection((DictionaryType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_MEMBER:
				setDefinitionMember((DictionaryEntryType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY_ENTRY:
				setDictionaryEntry((DictionaryEntryType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_PROXY:
				setDefinitionProxy((DefinitionProxyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_REF:
				setDefinitionRef((ReferenceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEGREES:
				setDegrees((DegreesType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				setDerivationUnitTerm((DerivationUnitTermType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS:
				setDerivedCRS((DerivedCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_REF:
				setDerivedCRSRef((DerivedCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				setDerivedCRSType((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_UNIT:
				setDerivedUnit((DerivedUnitType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION:
				setDescription((StringOrRefType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION_REFERENCE:
				setDescriptionReference((ReferenceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY:
				setDictionary((DictionaryType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_EDGE:
				setDirectedEdge((DirectedEdgePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_FACE:
				setDirectedFace((DirectedFacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_NODE:
				setDirectedNode((DirectedNodePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				setDirectedObservation((DirectedObservationType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OBSERVATION:
				setObservation((ObservationType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				setDirectedObservationAtDistance((DirectedObservationAtDistanceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				setDirectedTopoSolid((DirectedTopoSolidPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTION:
				setDirection((DirectionPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE:
				setDmsAngle((DMSAngleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				setDmsAngleValue((DMSAngleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((DomainOfValidityType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_SET:
				setDomainSet((DomainSetType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DOUBLE_OR_NIL_REASON_TUPLE_LIST:
				setDoubleOrNilReasonTupleList((List<Object>)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DURATION:
				setDuration((Duration)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE:
				setDynamicFeature((DynamicFeatureType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE_COLLECTION:
				setDynamicFeatureCollection((DynamicFeatureCollectionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_MEMBERS:
				setDynamicMembers((DynamicFeatureMemberType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE:
				setEdge((EdgeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE_OF:
				setEdgeOf((CurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID:
				setEllipsoid((EllipsoidPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID1:
				setEllipsoid1((EllipsoidPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID2:
				setEllipsoid2((EllipsoidType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID3:
				setEllipsoid3((EllipsoidType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				setEllipsoidalCS((EllipsoidalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS1:
				setEllipsoidalCS1((EllipsoidalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS2:
				setEllipsoidalCS2((EllipsoidalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS3:
				setEllipsoidalCS3((EllipsoidalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				setEllipsoidalCSRef((EllipsoidalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID_REF:
				setEllipsoidRef((EllipsoidPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS:
				setEngineeringCRS((EngineeringCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				setEngineeringCRSRef((EngineeringCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM:
				setEngineeringDatum((EngineeringDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM1:
				setEngineeringDatum1((EngineeringDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM2:
				setEngineeringDatum2((EngineeringDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM3:
				setEngineeringDatum3((EngineeringDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				setEngineeringDatumRef((EngineeringDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE:
				setEnvelope((EnvelopeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				setEnvelopeWithTimePeriod((EnvelopeWithTimePeriodType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__EXTENT_OF:
				setExtentOf((SurfacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__EXTERIOR:
				setExterior((AbstractRingPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FACE:
				setFace((FaceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_COLLECTION:
				setFeatureCollection((FeatureCollectionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBER:
				setFeatureMember((FeaturePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBERS:
				setFeatureMembers((FeatureArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_PROPERTY:
				setFeatureProperty((FeaturePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FILE:
				setFile((FileType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA:
				setFormula((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA_CITATION:
				setFormulaCitation((FormulaCitationType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				setGeneralConversionRef((GeneralConversionPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
				setGeneralOperationParameter((AbstractGeneralOperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER1:
				setGeneralOperationParameter1((AbstractGeneralOperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				setGeneralTransformationRef((GeneralTransformationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERIC_META_DATA:
				setGenericMetaData((GenericMetaDataType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS:
				setGeocentricCRS((GeocentricCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				setGeocentricCRSRef((GeocentricCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC:
				setGeodesic((GeodesicType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC_STRING:
				setGeodesicString((GeodesicStringType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_CRS:
				setGeodeticCRS((GeodeticCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM:
				setGeodeticDatum((GeodeticDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM1:
				setGeodeticDatum1((GeodeticDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM2:
				setGeodeticDatum2((GeodeticDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM3:
				setGeodeticDatum3((GeodeticDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				setGeodeticDatumRef((GeodeticDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				setGeographicCRS((GeographicCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				setGeographicCRSRef((GeographicCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				setGeometricComplex((GeometricComplexType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBER:
				setGeometryMember((GeometryPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				setGeometryMembers((GeometryArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GML_PROFILE_SCHEMA:
				setGmlProfileSchema((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				setGreenwichLongitude((AngleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID:
				setGrid((GridType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_COVERAGE:
				setGridCoverage((DiscreteCoverageType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_DOMAIN:
				setGridDomain((DomainSetType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_FUNCTION:
				setGridFunction((GridFunctionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GROUP:
				setGroup((OperationParameterGroupPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__HISTORY:
				setHistory((HistoryPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS:
				setImageCRS((ImageCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS_REF:
				setImageCRSRef((ImageCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM:
				setImageDatum((ImageDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM1:
				setImageDatum1((ImageDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM2:
				setImageDatum2((ImageDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM3:
				setImageDatum3((ImageDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM_REF:
				setImageDatumRef((ImageDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_PARAMETER:
				setIncludesParameter((AbstractGeneralOperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_SINGLE_CRS:
				setIncludesSingleCRS((SingleCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_VALUE:
				setIncludesValue((AbstractGeneralParameterValuePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE:
				setParameterValue((AbstractGeneralParameterValuePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INDIRECT_ENTRY:
				setIndirectEntry((IndirectEntryType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INTEGER_VALUE:
				setIntegerValue((BigInteger)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INTEGER_VALUE_LIST:
				setIntegerValueList((List<BigInteger>)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INTERIOR:
				setInterior((AbstractRingPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS:
				setLinearCS((LinearCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS1:
				setLinearCS1((LinearCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS2:
				setLinearCS2((LinearCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS3:
				setLinearCS3((LinearCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS_REF:
				setLinearCSRef((LinearCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_RING:
				setLinearRing((LinearRingType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING:
				setLineString((LineStringType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				setLineStringSegment((LineStringSegmentType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION:
				setLocation((LocationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_KEY_WORD:
				setLocationKeyWord((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_NAME:
				setLocationName((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_REFERENCE:
				setLocationReference((ReferenceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_STRING:
				setLocationString((StringOrRefType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MAPPING_RULE:
				setMappingRule((StringOrRefType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				setMaximalComplex((TopoComplexPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMUM_OCCURS:
				setMaximumOccurs((BigInteger)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMUM_VALUE:
				setMaximumValue((Double)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBER:
				setMember((AssociationRoleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBERS:
				setMembers((ArrayAssociationType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__META_DATA_PROPERTY:
				setMetaDataProperty((MetaDataPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD:
				setMethod((OperationMethodPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD_FORMULA:
				setMethodFormula((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MINIMUM_OCCURS:
				setMinimumOccurs((BigInteger)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MINIMUM_VALUE:
				setMinimumValue((Double)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MINUTES:
				setMinutes((BigInteger)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MODIFIED_COORDINATE:
				setModifiedCoordinate((BigInteger)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				setMovingObjectStatus((MovingObjectStatusType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				setMultiCenterLineOf((MultiCurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_OF:
				setMultiCenterOf((MultiPointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_COVERAGE:
				setMultiCoverage((MultiSurfacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE:
				setMultiCurve((MultiCurveType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				setMultiCurveCoverage((DiscreteCoverageType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				setMultiCurveDomain((DomainSetType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				setMultiCurveProperty((MultiCurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EDGE_OF:
				setMultiEdgeOf((MultiCurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EXTENT_OF:
				setMultiExtentOf((MultiSurfacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY:
				setMultiGeometry((MultiGeometryType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				setMultiGeometryProperty((MultiGeometryPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_LOCATION:
				setMultiLocation((MultiPointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT:
				setMultiPoint((MultiPointType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				setMultiPointCoverage((DiscreteCoverageType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				setMultiPointDomain((DomainSetType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				setMultiPointProperty((MultiPointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POSITION:
				setMultiPosition((MultiPointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID:
				setMultiSolid((MultiSolidType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				setMultiSolidCoverage((DiscreteCoverageType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				setMultiSolidDomain((DomainSetType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				setMultiSolidProperty((MultiSolidPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE:
				setMultiSurface((MultiSurfaceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				setMultiSurfaceCoverage((DiscreteCoverageType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				setMultiSurfaceDomain((DomainSetType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				setMultiSurfaceProperty((MultiSurfacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__NAME:
				setName((CodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__NODE:
				setNode((NodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__NULL:
				setNull(newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				setObliqueCartesianCS((ObliqueCartesianCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				setObliqueCartesianCSRef((ObliqueCartesianCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OFFSET_CURVE:
				setOffsetCurve((OffsetCurveType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD:
				setOperationMethod((OperationMethodType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD_REF:
				setOperationMethodRef((OperationMethodPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER:
				setOperationParameter((OperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER1:
				setOperationParameter1((OperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER2:
				setOperationParameter2((OperationParameterType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER3:
				setOperationParameter3((OperationParameterType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				setOperationParameterGroup((OperationParameterGroupType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				setOperationParameterGroupRef((OperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				setOperationParameterRef((OperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_REF:
				setOperationRef((OperationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_VERSION:
				setOperationVersion((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_CURVE:
				setOrientableCurve((OrientableCurveType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				setOrientableSurface((OrientableSurfaceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ORIGIN:
				setOrigin((XMLGregorianCalendar)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER:
				setParameter((AbstractGeneralOperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE1:
				setParameterValue1((AbstractGeneralParameterValuePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE2:
				setParameterValue2((ParameterValueType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE3:
				setParameterValue3((ParameterValueType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				setParameterValueGroup((ParameterValueGroupType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				setPassThroughOperation((PassThroughOperationType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				setPassThroughOperationRef((PassThroughOperationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PATCHES:
				setPatches((SurfacePatchArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PIXEL_IN_CELL:
				setPixelInCell((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT:
				setPoint((PointType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				setPointArrayProperty((PointArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBER:
				setPointMember((PointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBERS:
				setPointMembers((PointArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_PROPERTY:
				setPointProperty((PointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_REP:
				setPointRep((PointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS:
				setPolarCS((PolarCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS1:
				setPolarCS1((PolarCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS2:
				setPolarCS2((PolarCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS3:
				setPolarCS3((PolarCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS_REF:
				setPolarCSRef((PolarCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCH:
				setPolygonPatch((PolygonPatchType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCHES:
				setPolygonPatches((SurfacePatchArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				setPolyhedralSurface((SurfaceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE:
				setSurface((SurfaceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POS:
				setPos((DirectPositionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POSITION:
				setPosition((PointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POS_LIST:
				setPosList((DirectPositionListType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN:
				setPrimeMeridian((PrimeMeridianPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN1:
				setPrimeMeridian1((PrimeMeridianPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN2:
				setPrimeMeridian2((PrimeMeridianType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN3:
				setPrimeMeridian3((PrimeMeridianType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				setPrimeMeridianRef((PrimeMeridianPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIORITY_LOCATION:
				setPriorityLocation((PriorityLocationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS:
				setProjectedCRS((ProjectedCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS_REF:
				setProjectedCRSRef((ProjectedCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY:
				setQuantity((QuantityType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_EXTENT:
				setQuantityExtent((QuantityExtentType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_LIST:
				setQuantityList((MeasureOrNilReasonListType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE:
				setQuantityType((StringOrRefType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE_REFERENCE:
				setQuantityTypeReference((ReferenceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_MEANING:
				setRangeMeaning((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_PARAMETERS:
				setRangeParameters((AssociationRoleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_SET:
				setRangeSet((RangeSetType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REALIZATION_EPOCH:
				setRealizationEpoch((XMLGregorianCalendar)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTANGLE:
				setRectangle((RectangleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID:
				setRectifiedGrid((RectifiedGridType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				setRectifiedGridCoverage((DiscreteCoverageType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				setRectifiedGridDomain((DomainSetType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				setReferenceSystemRef((CRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REMARKS:
				setRemarks((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RESULT_OF:
				setResultOf((ResultType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REVERSE_PROPERTY_NAME:
				setReversePropertyName((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RING:
				setRing((RingType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				setRoughConversionToPreferredUnit((ConversionToPreferredUnitType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SCOPE:
				setScope((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				setSecondDefiningParameter((SecondDefiningParameterType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER1:
				setSecondDefiningParameter1((SecondDefiningParameterType1)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER2:
				setSecondDefiningParameter2((SecondDefiningParameterType2)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER3:
				setSecondDefiningParameter3((SecondDefiningParameterType3)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECONDS:
				setSeconds((BigDecimal)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SEGMENTS:
				setSegments((CurveSegmentArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				setSemiMajorAxis((MeasureType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SHELL:
				setShell((ShellType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_CRS_REF:
				setSingleCRSRef((SingleCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				setSingleOperationRef((SingleOperationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID:
				setSolid((SolidType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				setSolidArrayProperty((SolidArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBER:
				setSolidMember((SolidPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBERS:
				setSolidMembers((SolidArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_PROPERTY:
				setSolidProperty((SolidPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_CRS:
				setSourceCRS((CRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_DIMENSIONS:
				setSourceDimensions((BigInteger)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERE:
				setSphere((SphereType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS:
				setSphericalCS((SphericalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS1:
				setSphericalCS1((SphericalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS2:
				setSphericalCS2((SphericalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS3:
				setSphericalCS3((SphericalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS_REF:
				setSphericalCSRef((SphericalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS:
				setStatus((StringOrRefType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS_REFERENCE:
				setStatusReference((ReferenceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SUB_COMPLEX:
				setSubComplex((TopoComplexPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SUBJECT:
				setSubject((TargetPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET:
				setTarget((TargetPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SUPER_COMPLEX:
				setSuperComplex((TopoComplexPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				setSurfaceArrayProperty((SurfaceArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBER:
				setSurfaceMember((SurfacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBERS:
				setSurfaceMembers((SurfaceArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_PROPERTY:
				setSurfaceProperty((SurfacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_CRS:
				setTargetCRS((CRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_DIMENSIONS:
				setTargetDimensions((BigInteger)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_ELEMENT:
				setTargetElement((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS:
				setTemporalCRS((TemporalCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				setTemporalCRSRef((TemporalCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS:
				setTemporalCS((TemporalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS_REF:
				setTemporalCSRef((TemporalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM:
				setTemporalDatum((TemporalDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM1:
				setTemporalDatum1((TemporalDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM2:
				setTemporalDatum2((TemporalDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM3:
				setTemporalDatum3((TemporalDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				setTemporalDatumRef((TemporalDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR:
				setTimeCalendar((TimeCalendarType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
				setTimeReferenceSystem((TimeReferenceSystemType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				setTimeCalendarEra((TimeCalendarEraType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CLOCK:
				setTimeClock((TimeClockType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				setTimeCoordinateSystem((TimeCoordinateSystemType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS:
				setTimeCS((TimeCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS1:
				setTimeCS1((TimeCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS2:
				setTimeCS2((TimeCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS3:
				setTimeCS3((TimeCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_EDGE:
				setTimeEdge((TimeEdgeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INSTANT:
				setTimeInstant((TimeInstantType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INTERVAL:
				setTimeInterval((TimeIntervalLengthType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_NODE:
				setTimeNode((TimeNodeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				setTimeOrdinalEra((TimeOrdinalEraType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				setTimeOrdinalReferenceSystem((TimeOrdinalReferenceSystemType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_PERIOD:
				setTimePeriod((TimePeriodType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_POSITION:
				setTimePosition((TimePositionType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				setTimeTopologyComplex((TimeTopologyComplexType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIN:
				setTin((TinType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				setTriangulatedSurface((SurfaceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX:
				setTopoComplex((TopoComplexType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				setTopoComplexProperty((TopoComplexPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE:
				setTopoCurve((TopoCurveType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				setTopoCurveProperty((TopoCurvePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT:
				setTopoPoint((TopoPointType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				setTopoPointProperty((TopoPointPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				setTopoPrimitiveMember((TopoPrimitiveMemberType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				setTopoPrimitiveMembers((TopoPrimitiveArrayAssociationType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SOLID:
				setTopoSolid((TopoSolidType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE:
				setTopoSurface((TopoSurfaceType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				setTopoSurfaceProperty((TopoSurfacePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME:
				setTopoVolume((TopoVolumeType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				setTopoVolumeProperty((TopoVolumePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRACK:
				setTrack((HistoryPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION:
				setTransformation((TransformationType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION_REF:
				setTransformationRef((TransformationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE:
				setTriangle((TriangleType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE_PATCHES:
				setTrianglePatches((SurfacePatchArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TUPLE_LIST:
				setTupleList((CoordinatesType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_OF_MEASURE:
				setUnitOfMeasure((UnitOfMeasureType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS:
				setUserDefinedCS((UserDefinedCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS1:
				setUserDefinedCS1((UserDefinedCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS2:
				setUserDefinedCS2((UserDefinedCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS3:
				setUserDefinedCS3((UserDefinedCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				setUserDefinedCSRef((UserDefinedCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AFFINE_CS:
				setUsesAffineCS((AffineCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AXIS:
				setUsesAxis((CoordinateSystemAxisPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CS:
				setUsesCS((CoordinateSystemPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOID:
				setUsesEllipsoid((EllipsoidPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				setUsesEllipsoidalCS((EllipsoidalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				setUsesEngineeringDatum((EngineeringDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				setUsesGeodeticDatum((GeodeticDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_IMAGE_DATUM:
				setUsesImageDatum((ImageDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_METHOD:
				setUsesMethod((OperationMethodPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				setUsesObliqueCartesianCS((ObliqueCartesianCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OPERATION:
				setUsesOperation((CoordinateOperationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PARAMETER:
				setUsesParameter((AbstractGeneralOperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				setUsesPrimeMeridian((PrimeMeridianPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				setUsesSingleOperation((CoordinateOperationPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SPHERICAL_CS:
				setUsesSphericalCS((SphericalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_CS:
				setUsesTemporalCS((TemporalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				setUsesTemporalDatum((TemporalDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TIME_CS:
				setUsesTimeCS((TimeCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VALUE:
				setUsesValue((AbstractGeneralParameterValuePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_CS:
				setUsesVerticalCS((VerticalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS:
				setVerticalCS((VerticalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				setUsesVerticalDatum((VerticalDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM:
				setVerticalDatum((VerticalDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USING:
				setUsing((ProcedurePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE:
				setValue((MeasureType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_ARRAY:
				setValueArray((ValueArrayType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENT:
				setValueComponent((ValuePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENTS:
				setValueComponents((ValueArrayPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_FILE:
				setValueFile((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_LIST:
				setValueList((MeasureListType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				setValueOfParameter((OperationParameterPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_PROPERTY:
				setValueProperty((ValuePropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUES_OF_GROUP:
				setValuesOfGroup((OperationParameterGroupPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VECTOR:
				setVector((VectorType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS:
				setVerticalCRS((VerticalCRSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS_REF:
				setVerticalCRSRef((VerticalCRSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS2:
				setVerticalCS2((VerticalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS3:
				setVerticalCS3((VerticalCSType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS_REF:
				setVerticalCSRef((VerticalCSPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM2:
				setVerticalDatum2((VerticalDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM3:
				setVerticalDatum3((VerticalDatumType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				setVerticalDatumRef((VerticalDatumPropertyType)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REMOTE_SCHEMA:
				setRemoteSchema((String)newValue);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__UOM:
				setUom((String)newValue);
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
			case GMLPackage.GML_DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION:
				setDefinition((DefinitionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				setAbstractGeneralOperationParameterRef((AbstractGeneralOperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS:
				setAffineCS((AffineCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS1:
				setAffineCS1((AffineCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS2:
				setAffineCS2((AffineCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS3:
				setAffineCS3((AffineCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_PLACEMENT:
				setAffinePlacement((AffinePlacementType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_DEFINITION:
				setAnchorDefinition((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_POINT:
				setAnchorPoint((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ANGLE:
				setAngle((AngleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC:
				setArc((ArcType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING:
				setArcString((ArcStringType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_BULGE:
				setArcByBulge((ArcByBulgeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				setArcStringByBulge((ArcStringByBulgeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				setArcByCenterPoint((ArcByCenterPointType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ARRAY:
				setArray((ArrayType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ASSOCIATION_NAME:
				setAssociationName(ASSOCIATION_NAME_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS:
				setAxis((CoordinateSystemAxisPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_ABBREV:
				setAxisAbbrev((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_DIRECTION:
				setAxisDirection((CodeWithAuthorityType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BAG:
				setBag((BagType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CRS:
				setBaseCRS((SingleCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CURVE:
				setBaseCurve((CurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEODETIC_CRS:
				setBaseGeodeticCRS((GeodeticCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEOGRAPHIC_CRS:
				setBaseGeographicCRS((GeographicCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_SURFACE:
				setBaseSurface((SurfacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_UNIT:
				setBaseUnit((BaseUnitType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_DEFINITION:
				setUnitDefinition((UnitDefinitionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BEZIER:
				setBezier((BezierType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BSPLINE:
				setBSpline((BSplineType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN:
				setBoolean((BooleanType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN_LIST:
				setBooleanList(BOOLEAN_LIST_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN_VALUE:
				setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__BOUNDED_BY:
				setBoundedBy((BoundingShapeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS1:
				setCartesianCS1((CartesianCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS2:
				setCartesianCS2((CartesianCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS3:
				setCartesianCS3((CartesianCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS_REF:
				setCartesianCSRef((CartesianCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CATALOG_SYMBOL:
				setCatalogSymbol((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY:
				setCategory((CategoryType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_EXTENT:
				setCategoryExtent((CategoryExtentType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_LIST:
				setCategoryList((CodeOrNilReasonListType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_LINE_OF:
				setCenterLineOf((CurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_OF:
				setCenterOf((PointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE:
				setCircle((CircleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				setCircleByCenterPoint((CircleByCenterPointType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CLOTHOID:
				setClothoid((ClothoidType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPONENT_REFERENCE_SYSTEM:
				setComponentReferenceSystem((SingleCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_CURVE:
				setCompositeCurve((CompositeCurveType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SOLID:
				setCompositeSolid((CompositeSolidType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SURFACE:
				setCompositeSurface((CompositeSurfaceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_VALUE:
				setCompositeValue((CompositeValueType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS:
				setCompoundCRS((CompoundCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS_REF:
				setCompoundCRSRef((CompoundCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION:
				setConcatenatedOperation((ConcatenatedOperationType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				setConcatenatedOperationRef((ConcatenatedOperationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONE:
				setCone((ConeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				setConventionalUnit((ConventionalUnitType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION:
				setConversion((GeneralConversionPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION1:
				setConversion1((GeneralConversionPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION2:
				setConversion2((ConversionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION3:
				setConversion3((ConversionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_REF:
				setConversionRef((ConversionPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				setConversionToPreferredUnit((ConversionToPreferredUnitType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_ACCURACY:
				setCoordinateOperationAccuracy((CoordinateOperationAccuracyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				setCoordinateOperationRef((CoordinateOperationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATES:
				setCoordinates((CoordinatesType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystemPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				setCoordinateSystemAxis((CoordinateSystemAxisType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				setCoordinateSystemAxisRef((CoordinateSystemAxisPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				setCoordinateSystemRef((CoordinateSystemPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COORD_OPERATION:
				setCoordOperation((CoordinateOperationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT:
				setCount((CountType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT_EXTENT:
				setCountExtent(COUNT_EXTENT_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT_LIST:
				setCountList(COUNT_LIST_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_FUNCTION:
				setCoverageFunction((CoverageFunctionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_MAPPING_RULE:
				setCoverageMappingRule((MappingRuleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CRS_REF:
				setCrsRef((CRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CUBIC_SPLINE:
				setCubicSpline((CubicSplineType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE:
				setCurve((CurveType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				setCurveArrayProperty((CurveArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBER:
				setCurveMember((CurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBERS:
				setCurveMembers((CurveArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_PROPERTY:
				setCurveProperty((CurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDER:
				setCylinder((CylinderType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS:
				setCylindricalCS((CylindricalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS1:
				setCylindricalCS1((CylindricalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS2:
				setCylindricalCS2((CylindricalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS3:
				setCylindricalCS3((CylindricalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				setCylindricalCSRef((CylindricalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_BLOCK:
				setDataBlock((DataBlockType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE:
				setDataSource((StringOrRefType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE_REFERENCE:
				setDataSourceReference((ReferenceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DATUM_REF:
				setDatumRef((DatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DECIMAL_MINUTES:
				setDecimalMinutes(DECIMAL_MINUTES_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFAULT_CODE_SPACE:
				setDefaultCodeSpace(DEFAULT_CODE_SPACE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				setDefinedByConversion((GeneralConversionPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_COLLECTION:
				setDefinitionCollection((DictionaryType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_MEMBER:
				setDefinitionMember((DictionaryEntryType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY_ENTRY:
				setDictionaryEntry((DictionaryEntryType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_PROXY:
				setDefinitionProxy((DefinitionProxyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_REF:
				setDefinitionRef((ReferenceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DEGREES:
				setDegrees((DegreesType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				setDerivationUnitTerm((DerivationUnitTermType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS:
				setDerivedCRS((DerivedCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_REF:
				setDerivedCRSRef((DerivedCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				setDerivedCRSType((CodeWithAuthorityType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_UNIT:
				setDerivedUnit((DerivedUnitType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION:
				setDescription((StringOrRefType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION_REFERENCE:
				setDescriptionReference((ReferenceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY:
				setDictionary((DictionaryType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_EDGE:
				setDirectedEdge((DirectedEdgePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_FACE:
				setDirectedFace((DirectedFacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_NODE:
				setDirectedNode((DirectedNodePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				setDirectedObservation((DirectedObservationType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OBSERVATION:
				setObservation((ObservationType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				setDirectedObservationAtDistance((DirectedObservationAtDistanceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				setDirectedTopoSolid((DirectedTopoSolidPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTION:
				setDirection((DirectionPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE:
				setDmsAngle((DMSAngleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				setDmsAngleValue((DMSAngleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((DomainOfValidityType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_SET:
				setDomainSet((DomainSetType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DOUBLE_OR_NIL_REASON_TUPLE_LIST:
				setDoubleOrNilReasonTupleList(DOUBLE_OR_NIL_REASON_TUPLE_LIST_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE:
				setDynamicFeature((DynamicFeatureType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE_COLLECTION:
				setDynamicFeatureCollection((DynamicFeatureCollectionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_MEMBERS:
				setDynamicMembers((DynamicFeatureMemberType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE:
				setEdge((EdgeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE_OF:
				setEdgeOf((CurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID:
				setEllipsoid((EllipsoidPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID1:
				setEllipsoid1((EllipsoidPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID2:
				setEllipsoid2((EllipsoidType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID3:
				setEllipsoid3((EllipsoidType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				setEllipsoidalCS((EllipsoidalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS1:
				setEllipsoidalCS1((EllipsoidalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS2:
				setEllipsoidalCS2((EllipsoidalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS3:
				setEllipsoidalCS3((EllipsoidalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				setEllipsoidalCSRef((EllipsoidalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID_REF:
				setEllipsoidRef((EllipsoidPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS:
				setEngineeringCRS((EngineeringCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				setEngineeringCRSRef((EngineeringCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM:
				setEngineeringDatum((EngineeringDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM1:
				setEngineeringDatum1((EngineeringDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM2:
				setEngineeringDatum2((EngineeringDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM3:
				setEngineeringDatum3((EngineeringDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				setEngineeringDatumRef((EngineeringDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE:
				setEnvelope((EnvelopeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				setEnvelopeWithTimePeriod((EnvelopeWithTimePeriodType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__EXTENT_OF:
				setExtentOf((SurfacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__EXTERIOR:
				setExterior((AbstractRingPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FACE:
				setFace((FaceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_COLLECTION:
				setFeatureCollection((FeatureCollectionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBER:
				setFeatureMember((FeaturePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBERS:
				setFeatureMembers((FeatureArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_PROPERTY:
				setFeatureProperty((FeaturePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FILE:
				setFile((FileType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA:
				setFormula((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA_CITATION:
				setFormulaCitation((FormulaCitationType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				setGeneralConversionRef((GeneralConversionPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
				setGeneralOperationParameter((AbstractGeneralOperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER1:
				setGeneralOperationParameter1((AbstractGeneralOperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				setGeneralTransformationRef((GeneralTransformationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERIC_META_DATA:
				setGenericMetaData((GenericMetaDataType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS:
				setGeocentricCRS((GeocentricCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				setGeocentricCRSRef((GeocentricCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC:
				setGeodesic((GeodesicType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC_STRING:
				setGeodesicString((GeodesicStringType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_CRS:
				setGeodeticCRS((GeodeticCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM:
				setGeodeticDatum((GeodeticDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM1:
				setGeodeticDatum1((GeodeticDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM2:
				setGeodeticDatum2((GeodeticDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM3:
				setGeodeticDatum3((GeodeticDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				setGeodeticDatumRef((GeodeticDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				setGeographicCRS((GeographicCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				setGeographicCRSRef((GeographicCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				setGeometricComplex((GeometricComplexType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBER:
				setGeometryMember((GeometryPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				setGeometryMembers((GeometryArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GML_PROFILE_SCHEMA:
				setGmlProfileSchema(GML_PROFILE_SCHEMA_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				setGreenwichLongitude((AngleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID:
				setGrid((GridType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_COVERAGE:
				setGridCoverage((DiscreteCoverageType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_DOMAIN:
				setGridDomain((DomainSetType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_FUNCTION:
				setGridFunction((GridFunctionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__GROUP:
				setGroup((OperationParameterGroupPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__HISTORY:
				setHistory((HistoryPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((CodeWithAuthorityType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS:
				setImageCRS((ImageCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS_REF:
				setImageCRSRef((ImageCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM:
				setImageDatum((ImageDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM1:
				setImageDatum1((ImageDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM2:
				setImageDatum2((ImageDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM3:
				setImageDatum3((ImageDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM_REF:
				setImageDatumRef((ImageDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_PARAMETER:
				setIncludesParameter((AbstractGeneralOperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_SINGLE_CRS:
				setIncludesSingleCRS((SingleCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_VALUE:
				setIncludesValue((AbstractGeneralParameterValuePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE:
				setParameterValue((AbstractGeneralParameterValuePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INDIRECT_ENTRY:
				setIndirectEntry((IndirectEntryType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INTEGER_VALUE:
				setIntegerValue(INTEGER_VALUE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INTEGER_VALUE_LIST:
				setIntegerValueList(INTEGER_VALUE_LIST_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__INTERIOR:
				setInterior((AbstractRingPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS:
				setLinearCS((LinearCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS1:
				setLinearCS1((LinearCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS2:
				setLinearCS2((LinearCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS3:
				setLinearCS3((LinearCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS_REF:
				setLinearCSRef((LinearCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_RING:
				setLinearRing((LinearRingType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING:
				setLineString((LineStringType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				setLineStringSegment((LineStringSegmentType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION:
				setLocation((LocationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_KEY_WORD:
				setLocationKeyWord((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_NAME:
				setLocationName((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_REFERENCE:
				setLocationReference((ReferenceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_STRING:
				setLocationString((StringOrRefType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MAPPING_RULE:
				setMappingRule((StringOrRefType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				setMaximalComplex((TopoComplexPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMUM_OCCURS:
				setMaximumOccurs(MAXIMUM_OCCURS_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMUM_VALUE:
				setMaximumValue(MAXIMUM_VALUE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBER:
				setMember((AssociationRoleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBERS:
				setMembers((ArrayAssociationType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__META_DATA_PROPERTY:
				setMetaDataProperty((MetaDataPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD:
				setMethod((OperationMethodPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD_FORMULA:
				setMethodFormula((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MINIMUM_OCCURS:
				setMinimumOccurs(MINIMUM_OCCURS_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MINIMUM_VALUE:
				setMinimumValue(MINIMUM_VALUE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MINUTES:
				setMinutes(MINUTES_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MODIFIED_COORDINATE:
				setModifiedCoordinate(MODIFIED_COORDINATE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				setMovingObjectStatus((MovingObjectStatusType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				setMultiCenterLineOf((MultiCurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_OF:
				setMultiCenterOf((MultiPointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_COVERAGE:
				setMultiCoverage((MultiSurfacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE:
				setMultiCurve((MultiCurveType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				setMultiCurveCoverage((DiscreteCoverageType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				setMultiCurveDomain((DomainSetType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				setMultiCurveProperty((MultiCurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EDGE_OF:
				setMultiEdgeOf((MultiCurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EXTENT_OF:
				setMultiExtentOf((MultiSurfacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY:
				setMultiGeometry((MultiGeometryType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				setMultiGeometryProperty((MultiGeometryPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_LOCATION:
				setMultiLocation((MultiPointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT:
				setMultiPoint((MultiPointType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				setMultiPointCoverage((DiscreteCoverageType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				setMultiPointDomain((DomainSetType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				setMultiPointProperty((MultiPointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POSITION:
				setMultiPosition((MultiPointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID:
				setMultiSolid((MultiSolidType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				setMultiSolidCoverage((DiscreteCoverageType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				setMultiSolidDomain((DomainSetType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				setMultiSolidProperty((MultiSolidPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE:
				setMultiSurface((MultiSurfaceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				setMultiSurfaceCoverage((DiscreteCoverageType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				setMultiSurfaceDomain((DomainSetType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				setMultiSurfaceProperty((MultiSurfacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__NAME:
				setName((CodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__NODE:
				setNode((NodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__NULL:
				setNull(NULL_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				setObliqueCartesianCS((ObliqueCartesianCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				setObliqueCartesianCSRef((ObliqueCartesianCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OFFSET_CURVE:
				setOffsetCurve((OffsetCurveType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD:
				setOperationMethod((OperationMethodType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD_REF:
				setOperationMethodRef((OperationMethodPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER:
				setOperationParameter((OperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER1:
				setOperationParameter1((OperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER2:
				setOperationParameter2((OperationParameterType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER3:
				setOperationParameter3((OperationParameterType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				setOperationParameterGroup((OperationParameterGroupType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				setOperationParameterGroupRef((OperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				setOperationParameterRef((OperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_REF:
				setOperationRef((OperationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_VERSION:
				setOperationVersion(OPERATION_VERSION_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_CURVE:
				setOrientableCurve((OrientableCurveType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				setOrientableSurface((OrientableSurfaceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER:
				setParameter((AbstractGeneralOperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE1:
				setParameterValue1((AbstractGeneralParameterValuePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE2:
				setParameterValue2((ParameterValueType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE3:
				setParameterValue3((ParameterValueType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				setParameterValueGroup((ParameterValueGroupType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				setPassThroughOperation((PassThroughOperationType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				setPassThroughOperationRef((PassThroughOperationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PATCHES:
				setPatches((SurfacePatchArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PIXEL_IN_CELL:
				setPixelInCell((CodeWithAuthorityType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT:
				setPoint((PointType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				setPointArrayProperty((PointArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBER:
				setPointMember((PointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBERS:
				setPointMembers((PointArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_PROPERTY:
				setPointProperty((PointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_REP:
				setPointRep((PointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS:
				setPolarCS((PolarCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS1:
				setPolarCS1((PolarCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS2:
				setPolarCS2((PolarCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS3:
				setPolarCS3((PolarCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS_REF:
				setPolarCSRef((PolarCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCH:
				setPolygonPatch((PolygonPatchType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCHES:
				setPolygonPatches((SurfacePatchArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				setPolyhedralSurface((SurfaceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE:
				setSurface((SurfaceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POS:
				setPos((DirectPositionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POSITION:
				setPosition((PointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__POS_LIST:
				setPosList((DirectPositionListType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN:
				setPrimeMeridian((PrimeMeridianPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN1:
				setPrimeMeridian1((PrimeMeridianPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN2:
				setPrimeMeridian2((PrimeMeridianType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN3:
				setPrimeMeridian3((PrimeMeridianType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				setPrimeMeridianRef((PrimeMeridianPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIORITY_LOCATION:
				setPriorityLocation((PriorityLocationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS:
				setProjectedCRS((ProjectedCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS_REF:
				setProjectedCRSRef((ProjectedCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY:
				setQuantity((QuantityType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_EXTENT:
				setQuantityExtent((QuantityExtentType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_LIST:
				setQuantityList((MeasureOrNilReasonListType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE:
				setQuantityType((StringOrRefType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE_REFERENCE:
				setQuantityTypeReference((ReferenceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_MEANING:
				setRangeMeaning((CodeWithAuthorityType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_PARAMETERS:
				setRangeParameters((AssociationRoleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_SET:
				setRangeSet((RangeSetType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REALIZATION_EPOCH:
				setRealizationEpoch(REALIZATION_EPOCH_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTANGLE:
				setRectangle((RectangleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID:
				setRectifiedGrid((RectifiedGridType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				setRectifiedGridCoverage((DiscreteCoverageType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				setRectifiedGridDomain((DomainSetType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				setReferenceSystemRef((CRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RESULT_OF:
				setResultOf((ResultType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REVERSE_PROPERTY_NAME:
				setReversePropertyName(REVERSE_PROPERTY_NAME_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__RING:
				setRing((RingType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				setRoughConversionToPreferredUnit((ConversionToPreferredUnitType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				setSecondDefiningParameter((SecondDefiningParameterType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER1:
				setSecondDefiningParameter1((SecondDefiningParameterType1)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER2:
				setSecondDefiningParameter2((SecondDefiningParameterType2)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER3:
				setSecondDefiningParameter3((SecondDefiningParameterType3)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SECONDS:
				setSeconds(SECONDS_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SEGMENTS:
				setSegments((CurveSegmentArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				setSemiMajorAxis((MeasureType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SHELL:
				setShell((ShellType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_CRS_REF:
				setSingleCRSRef((SingleCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				setSingleOperationRef((SingleOperationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID:
				setSolid((SolidType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				setSolidArrayProperty((SolidArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBER:
				setSolidMember((SolidPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBERS:
				setSolidMembers((SolidArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_PROPERTY:
				setSolidProperty((SolidPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_CRS:
				setSourceCRS((CRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_DIMENSIONS:
				setSourceDimensions(SOURCE_DIMENSIONS_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERE:
				setSphere((SphereType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS:
				setSphericalCS((SphericalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS1:
				setSphericalCS1((SphericalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS2:
				setSphericalCS2((SphericalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS3:
				setSphericalCS3((SphericalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS_REF:
				setSphericalCSRef((SphericalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS:
				setStatus((StringOrRefType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS_REFERENCE:
				setStatusReference((ReferenceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SUB_COMPLEX:
				setSubComplex((TopoComplexPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SUBJECT:
				setSubject((TargetPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET:
				setTarget((TargetPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SUPER_COMPLEX:
				setSuperComplex((TopoComplexPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				setSurfaceArrayProperty((SurfaceArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBER:
				setSurfaceMember((SurfacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBERS:
				setSurfaceMembers((SurfaceArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_PROPERTY:
				setSurfaceProperty((SurfacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_CRS:
				setTargetCRS((CRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_DIMENSIONS:
				setTargetDimensions(TARGET_DIMENSIONS_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_ELEMENT:
				setTargetElement(TARGET_ELEMENT_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS:
				setTemporalCRS((TemporalCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				setTemporalCRSRef((TemporalCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS:
				setTemporalCS((TemporalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS_REF:
				setTemporalCSRef((TemporalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM:
				setTemporalDatum((TemporalDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM1:
				setTemporalDatum1((TemporalDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM2:
				setTemporalDatum2((TemporalDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM3:
				setTemporalDatum3((TemporalDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				setTemporalDatumRef((TemporalDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR:
				setTimeCalendar((TimeCalendarType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
				setTimeReferenceSystem((TimeReferenceSystemType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				setTimeCalendarEra((TimeCalendarEraType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CLOCK:
				setTimeClock((TimeClockType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				setTimeCoordinateSystem((TimeCoordinateSystemType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS:
				setTimeCS((TimeCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS1:
				setTimeCS1((TimeCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS2:
				setTimeCS2((TimeCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS3:
				setTimeCS3((TimeCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_EDGE:
				setTimeEdge((TimeEdgeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INSTANT:
				setTimeInstant((TimeInstantType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INTERVAL:
				setTimeInterval((TimeIntervalLengthType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_NODE:
				setTimeNode((TimeNodeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				setTimeOrdinalEra((TimeOrdinalEraType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				setTimeOrdinalReferenceSystem((TimeOrdinalReferenceSystemType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_PERIOD:
				setTimePeriod((TimePeriodType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_POSITION:
				setTimePosition((TimePositionType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				setTimeTopologyComplex((TimeTopologyComplexType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TIN:
				setTin((TinType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				setTriangulatedSurface((SurfaceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX:
				setTopoComplex((TopoComplexType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				setTopoComplexProperty((TopoComplexPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE:
				setTopoCurve((TopoCurveType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				setTopoCurveProperty((TopoCurvePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT:
				setTopoPoint((TopoPointType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				setTopoPointProperty((TopoPointPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				setTopoPrimitiveMember((TopoPrimitiveMemberType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				setTopoPrimitiveMembers((TopoPrimitiveArrayAssociationType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SOLID:
				setTopoSolid((TopoSolidType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE:
				setTopoSurface((TopoSurfaceType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				setTopoSurfaceProperty((TopoSurfacePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME:
				setTopoVolume((TopoVolumeType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				setTopoVolumeProperty((TopoVolumePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRACK:
				setTrack((HistoryPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION:
				setTransformation((TransformationType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION_REF:
				setTransformationRef((TransformationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE:
				setTriangle((TriangleType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE_PATCHES:
				setTrianglePatches((SurfacePatchArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__TUPLE_LIST:
				setTupleList((CoordinatesType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_OF_MEASURE:
				setUnitOfMeasure((UnitOfMeasureType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS:
				setUserDefinedCS((UserDefinedCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS1:
				setUserDefinedCS1((UserDefinedCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS2:
				setUserDefinedCS2((UserDefinedCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS3:
				setUserDefinedCS3((UserDefinedCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				setUserDefinedCSRef((UserDefinedCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AFFINE_CS:
				setUsesAffineCS((AffineCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AXIS:
				setUsesAxis((CoordinateSystemAxisPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CS:
				setUsesCS((CoordinateSystemPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOID:
				setUsesEllipsoid((EllipsoidPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				setUsesEllipsoidalCS((EllipsoidalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				setUsesEngineeringDatum((EngineeringDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				setUsesGeodeticDatum((GeodeticDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_IMAGE_DATUM:
				setUsesImageDatum((ImageDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_METHOD:
				setUsesMethod((OperationMethodPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				setUsesObliqueCartesianCS((ObliqueCartesianCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OPERATION:
				setUsesOperation((CoordinateOperationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PARAMETER:
				setUsesParameter((AbstractGeneralOperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				setUsesPrimeMeridian((PrimeMeridianPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				setUsesSingleOperation((CoordinateOperationPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SPHERICAL_CS:
				setUsesSphericalCS((SphericalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_CS:
				setUsesTemporalCS((TemporalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				setUsesTemporalDatum((TemporalDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TIME_CS:
				setUsesTimeCS((TimeCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VALUE:
				setUsesValue((AbstractGeneralParameterValuePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_CS:
				setUsesVerticalCS((VerticalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS:
				setVerticalCS((VerticalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				setUsesVerticalDatum((VerticalDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM:
				setVerticalDatum((VerticalDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__USING:
				setUsing((ProcedurePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE:
				setValue((MeasureType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_ARRAY:
				setValueArray((ValueArrayType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENT:
				setValueComponent((ValuePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENTS:
				setValueComponents((ValueArrayPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_FILE:
				setValueFile(VALUE_FILE_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_LIST:
				setValueList((MeasureListType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				setValueOfParameter((OperationParameterPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_PROPERTY:
				setValueProperty((ValuePropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUES_OF_GROUP:
				setValuesOfGroup((OperationParameterGroupPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VECTOR:
				setVector((VectorType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS:
				setVerticalCRS((VerticalCRSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS_REF:
				setVerticalCRSRef((VerticalCRSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS2:
				setVerticalCS2((VerticalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS3:
				setVerticalCS3((VerticalCSType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS_REF:
				setVerticalCSRef((VerticalCSPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM2:
				setVerticalDatum2((VerticalDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM3:
				setVerticalDatum3((VerticalDatumType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				setVerticalDatumRef((VerticalDatumPropertyType)null);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__REMOTE_SCHEMA:
				setRemoteSchema(REMOTE_SCHEMA_EDEFAULT);
				return;
			case GMLPackage.GML_DOCUMENT_ROOT__UOM:
				setUom(UOM_EDEFAULT);
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
			case GMLPackage.GML_DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GMLPackage.GML_DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case GMLPackage.GML_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_ASSOCIATION_ROLE:
				return getAbstractAssociationRole() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CONTINUOUS_COVERAGE:
				return getAbstractContinuousCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_FEATURE:
				return getAbstractFeature() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GML:
				return getAbstractGML() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_OBJECT:
				return getAbstractObject() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COORDINATE_OPERATION:
				return getAbstractCoordinateOperation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION:
				return getDefinition() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COORDINATE_SYSTEM:
				return getAbstractCoordinateSystem() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_COVERAGE:
				return getAbstractCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CRS:
				return getAbstractCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CURVE:
				return getAbstractCurve() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRIC_PRIMITIVE:
				return getAbstractGeometricPrimitive() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRY:
				return getAbstractGeometry() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_CURVE_SEGMENT:
				return getAbstractCurveSegment() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_DATUM:
				return getAbstractDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_DISCRETE_COVERAGE:
				return getAbstractDiscreteCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_FEATURE_COLLECTION:
				return getAbstractFeatureCollection() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_CONVERSION:
				return getAbstractGeneralConversion() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_OPERATION:
				return getAbstractOperation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SINGLE_OPERATION:
				return getAbstractSingleOperation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_DERIVED_CRS:
				return getAbstractGeneralDerivedCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SINGLE_CRS:
				return getAbstractSingleCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER:
				return getAbstractGeneralOperationParameter() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				return getAbstractGeneralOperationParameterRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_PARAMETER_VALUE:
				return getAbstractGeneralParameterValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GENERAL_TRANSFORMATION:
				return getAbstractGeneralTransformation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GEOMETRIC_AGGREGATE:
				return getAbstractGeometricAggregate() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_GRIDDED_SURFACE:
				return getAbstractGriddedSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_PARAMETRIC_CURVE_SURFACE:
				return getAbstractParametricCurveSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SURFACE_PATCH:
				return getAbstractSurfacePatch() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_IMPLICIT_GEOMETRY:
				return getAbstractImplicitGeometry() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_INLINE_PROPERTY:
				return getAbstractInlineProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_META_DATA:
				return getAbstractMetaData() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_REFERENCE:
				return getAbstractReference() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_RING:
				return getAbstractRing() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SCALAR_VALUE:
				return getAbstractScalarValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_VALUE:
				return getAbstractValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SCALAR_VALUE_LIST:
				return getAbstractScalarValueList() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SOLID:
				return getAbstractSolid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_STRICT_ASSOCIATION_ROLE:
				return getAbstractStrictAssociationRole() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_SURFACE:
				return getAbstractSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_COMPLEX:
				return getAbstractTimeComplex() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_OBJECT:
				return getAbstractTimeObject() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_GEOMETRIC_PRIMITIVE:
				return getAbstractTimeGeometricPrimitive() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE:
				return getAbstractTimePrimitive() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_SLICE:
				return getAbstractTimeSlice() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TIME_TOPOLOGY_PRIMITIVE:
				return getAbstractTimeTopologyPrimitive() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TOPOLOGY:
				return getAbstractTopology() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ABSTRACT_TOPO_PRIMITIVE:
				return getAbstractTopoPrimitive() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS:
				return getAffineCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS1:
				return getAffineCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS2:
				return getAffineCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_CS3:
				return getAffineCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__AFFINE_PLACEMENT:
				return getAffinePlacement() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_DEFINITION:
				return getAnchorDefinition() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ANCHOR_POINT:
				return getAnchorPoint() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ANGLE:
				return getAngle() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC:
				return getArc() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING:
				return getArcString() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_BULGE:
				return getArcByBulge() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				return getArcStringByBulge() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				return getArcByCenterPoint() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ARRAY:
				return getArray() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ASSOCIATION_NAME:
				return ASSOCIATION_NAME_EDEFAULT == null ? getAssociationName() != null : !ASSOCIATION_NAME_EDEFAULT.equals(getAssociationName());
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS:
				return getAxis() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_ABBREV:
				return getAxisAbbrev() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__AXIS_DIRECTION:
				return getAxisDirection() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BAG:
				return getBag() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CRS:
				return getBaseCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_CURVE:
				return getBaseCurve() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEODETIC_CRS:
				return getBaseGeodeticCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_GEOGRAPHIC_CRS:
				return getBaseGeographicCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_SURFACE:
				return getBaseSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BASE_UNIT:
				return getBaseUnit() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_DEFINITION:
				return getUnitDefinition() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BEZIER:
				return getBezier() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BSPLINE:
				return getBSpline() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN:
				return getBoolean() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN_LIST:
				return BOOLEAN_LIST_EDEFAULT == null ? getBooleanList() != null : !BOOLEAN_LIST_EDEFAULT.equals(getBooleanList());
			case GMLPackage.GML_DOCUMENT_ROOT__BOOLEAN_VALUE:
				return isBooleanValue() != BOOLEAN_VALUE_EDEFAULT;
			case GMLPackage.GML_DOCUMENT_ROOT__BOUNDED_BY:
				return getBoundedBy() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS:
				return getCartesianCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS1:
				return getCartesianCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS2:
				return getCartesianCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS3:
				return getCartesianCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CARTESIAN_CS_REF:
				return getCartesianCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CATALOG_SYMBOL:
				return getCatalogSymbol() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY:
				return getCategory() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_EXTENT:
				return getCategoryExtent() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CATEGORY_LIST:
				return getCategoryList() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_LINE_OF:
				return getCenterLineOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CENTER_OF:
				return getCenterOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE:
				return getCircle() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				return getCircleByCenterPoint() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CLOTHOID:
				return getClothoid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPONENT_REFERENCE_SYSTEM:
				return getComponentReferenceSystem() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_CURVE:
				return getCompositeCurve() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SOLID:
				return getCompositeSolid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_SURFACE:
				return getCompositeSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOSITE_VALUE:
				return getCompositeValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS:
				return getCompoundCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COMPOUND_CRS_REF:
				return getCompoundCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION:
				return getConcatenatedOperation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				return getConcatenatedOperationRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONE:
				return getCone() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				return getConventionalUnit() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION:
				return getConversion() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION1:
				return getConversion1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION2:
				return getConversion2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION3:
				return getConversion3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_REF:
				return getConversionRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				return getConversionToPreferredUnit() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_ACCURACY:
				return getCoordinateOperationAccuracy() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				return getCoordinateOperationRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATES:
				return getCoordinates() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM:
				return getCoordinateSystem() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				return getCoordinateSystemAxis() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				return getCoordinateSystemAxisRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				return getCoordinateSystemRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COORD_OPERATION:
				return getCoordOperation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT:
				return getCount() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT_EXTENT:
				return COUNT_EXTENT_EDEFAULT == null ? getCountExtent() != null : !COUNT_EXTENT_EDEFAULT.equals(getCountExtent());
			case GMLPackage.GML_DOCUMENT_ROOT__COUNT_LIST:
				return COUNT_LIST_EDEFAULT == null ? getCountList() != null : !COUNT_LIST_EDEFAULT.equals(getCountList());
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_FUNCTION:
				return getCoverageFunction() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__COVERAGE_MAPPING_RULE:
				return getCoverageMappingRule() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CRS_REF:
				return getCrsRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CUBIC_SPLINE:
				return getCubicSpline() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE:
				return getCurve() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				return getCurveArrayProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBER:
				return getCurveMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_MEMBERS:
				return getCurveMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CURVE_PROPERTY:
				return getCurveProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDER:
				return getCylinder() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS:
				return getCylindricalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS1:
				return getCylindricalCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS2:
				return getCylindricalCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS3:
				return getCylindricalCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				return getCylindricalCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_BLOCK:
				return getDataBlock() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE:
				return getDataSource() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DATA_SOURCE_REFERENCE:
				return getDataSourceReference() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DATUM_REF:
				return getDatumRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DECIMAL_MINUTES:
				return DECIMAL_MINUTES_EDEFAULT == null ? getDecimalMinutes() != null : !DECIMAL_MINUTES_EDEFAULT.equals(getDecimalMinutes());
			case GMLPackage.GML_DOCUMENT_ROOT__DEFAULT_CODE_SPACE:
				return DEFAULT_CODE_SPACE_EDEFAULT == null ? getDefaultCodeSpace() != null : !DEFAULT_CODE_SPACE_EDEFAULT.equals(getDefaultCodeSpace());
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				return getDefinedByConversion() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_COLLECTION:
				return getDefinitionCollection() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_MEMBER:
				return getDefinitionMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY_ENTRY:
				return getDictionaryEntry() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_PROXY:
				return getDefinitionProxy() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DEFINITION_REF:
				return getDefinitionRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DEGREES:
				return getDegrees() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				return getDerivationUnitTerm() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS:
				return getDerivedCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_REF:
				return getDerivedCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				return getDerivedCRSType() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DERIVED_UNIT:
				return getDerivedUnit() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DESCRIPTION_REFERENCE:
				return getDescriptionReference() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DICTIONARY:
				return getDictionary() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_EDGE:
				return getDirectedEdge() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_FACE:
				return getDirectedFace() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_NODE:
				return getDirectedNode() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				return getDirectedObservation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OBSERVATION:
				return getObservation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				return getDirectedObservationAtDistance() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				return getDirectedTopoSolid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DIRECTION:
				return getDirection() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE:
				return getDmsAngle() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				return getDmsAngleValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DOMAIN_SET:
				return getDomainSet() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DOUBLE_OR_NIL_REASON_TUPLE_LIST:
				return DOUBLE_OR_NIL_REASON_TUPLE_LIST_EDEFAULT == null ? getDoubleOrNilReasonTupleList() != null : !DOUBLE_OR_NIL_REASON_TUPLE_LIST_EDEFAULT.equals(getDoubleOrNilReasonTupleList());
			case GMLPackage.GML_DOCUMENT_ROOT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE:
				return getDynamicFeature() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_FEATURE_COLLECTION:
				return getDynamicFeatureCollection() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__DYNAMIC_MEMBERS:
				return getDynamicMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE:
				return getEdge() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__EDGE_OF:
				return getEdgeOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID:
				return getEllipsoid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID1:
				return getEllipsoid1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID2:
				return getEllipsoid2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID3:
				return getEllipsoid3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				return getEllipsoidalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS1:
				return getEllipsoidalCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS2:
				return getEllipsoidalCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS3:
				return getEllipsoidalCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				return getEllipsoidalCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ELLIPSOID_REF:
				return getEllipsoidRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS:
				return getEngineeringCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				return getEngineeringCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM:
				return getEngineeringDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM1:
				return getEngineeringDatum1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM2:
				return getEngineeringDatum2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM3:
				return getEngineeringDatum3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				return getEngineeringDatumRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE:
				return getEnvelope() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				return getEnvelopeWithTimePeriod() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__EXTENT_OF:
				return getExtentOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__EXTERIOR:
				return getExterior() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__FACE:
				return getFace() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_COLLECTION:
				return getFeatureCollection() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBER:
				return getFeatureMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_MEMBERS:
				return getFeatureMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__FEATURE_PROPERTY:
				return getFeatureProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__FILE:
				return getFile() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA:
				return getFormula() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__FORMULA_CITATION:
				return getFormulaCitation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				return getGeneralConversionRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
				return getGeneralOperationParameter() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER1:
				return getGeneralOperationParameter1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				return getGeneralTransformationRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GENERIC_META_DATA:
				return getGenericMetaData() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS:
				return getGeocentricCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				return getGeocentricCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC:
				return getGeodesic() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODESIC_STRING:
				return getGeodesicString() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_CRS:
				return getGeodeticCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM:
				return getGeodeticDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM1:
				return getGeodeticDatum1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM2:
				return getGeodeticDatum2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM3:
				return getGeodeticDatum3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				return getGeodeticDatumRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				return getGeographicCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				return getGeographicCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				return getGeometricComplex() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBER:
				return getGeometryMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				return getGeometryMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GML_PROFILE_SCHEMA:
				return GML_PROFILE_SCHEMA_EDEFAULT == null ? getGmlProfileSchema() != null : !GML_PROFILE_SCHEMA_EDEFAULT.equals(getGmlProfileSchema());
			case GMLPackage.GML_DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				return getGreenwichLongitude() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID:
				return getGrid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_COVERAGE:
				return getGridCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_DOMAIN:
				return getGridDomain() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GRID_FUNCTION:
				return getGridFunction() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__GROUP:
				return getGroup() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__HISTORY:
				return getHistory() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS:
				return getImageCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_CRS_REF:
				return getImageCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM:
				return getImageDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM1:
				return getImageDatum1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM2:
				return getImageDatum2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM3:
				return getImageDatum3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__IMAGE_DATUM_REF:
				return getImageDatumRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_PARAMETER:
				return getIncludesParameter() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_SINGLE_CRS:
				return getIncludesSingleCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__INCLUDES_VALUE:
				return getIncludesValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE:
				return getParameterValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__INDIRECT_ENTRY:
				return getIndirectEntry() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__INTEGER_VALUE:
				return INTEGER_VALUE_EDEFAULT == null ? getIntegerValue() != null : !INTEGER_VALUE_EDEFAULT.equals(getIntegerValue());
			case GMLPackage.GML_DOCUMENT_ROOT__INTEGER_VALUE_LIST:
				return INTEGER_VALUE_LIST_EDEFAULT == null ? getIntegerValueList() != null : !INTEGER_VALUE_LIST_EDEFAULT.equals(getIntegerValueList());
			case GMLPackage.GML_DOCUMENT_ROOT__INTERIOR:
				return getInterior() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS:
				return getLinearCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS1:
				return getLinearCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS2:
				return getLinearCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS3:
				return getLinearCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_CS_REF:
				return getLinearCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LINEAR_RING:
				return getLinearRing() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING:
				return getLineString() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				return getLineStringSegment() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_KEY_WORD:
				return getLocationKeyWord() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_NAME:
				return getLocationName() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_REFERENCE:
				return getLocationReference() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__LOCATION_STRING:
				return getLocationString() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MAPPING_RULE:
				return getMappingRule() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				return getMaximalComplex() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMUM_OCCURS:
				return MAXIMUM_OCCURS_EDEFAULT == null ? getMaximumOccurs() != null : !MAXIMUM_OCCURS_EDEFAULT.equals(getMaximumOccurs());
			case GMLPackage.GML_DOCUMENT_ROOT__MAXIMUM_VALUE:
				return getMaximumValue() != MAXIMUM_VALUE_EDEFAULT;
			case GMLPackage.GML_DOCUMENT_ROOT__MEASURE:
				return getMeasure() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBER:
				return getMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MEMBERS:
				return getMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__META_DATA_PROPERTY:
				return getMetaDataProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD:
				return getMethod() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__METHOD_FORMULA:
				return getMethodFormula() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MINIMUM_OCCURS:
				return MINIMUM_OCCURS_EDEFAULT == null ? getMinimumOccurs() != null : !MINIMUM_OCCURS_EDEFAULT.equals(getMinimumOccurs());
			case GMLPackage.GML_DOCUMENT_ROOT__MINIMUM_VALUE:
				return getMinimumValue() != MINIMUM_VALUE_EDEFAULT;
			case GMLPackage.GML_DOCUMENT_ROOT__MINUTES:
				return MINUTES_EDEFAULT == null ? getMinutes() != null : !MINUTES_EDEFAULT.equals(getMinutes());
			case GMLPackage.GML_DOCUMENT_ROOT__MODIFIED_COORDINATE:
				return MODIFIED_COORDINATE_EDEFAULT == null ? getModifiedCoordinate() != null : !MODIFIED_COORDINATE_EDEFAULT.equals(getModifiedCoordinate());
			case GMLPackage.GML_DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				return getMovingObjectStatus() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				return getMultiCenterLineOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CENTER_OF:
				return getMultiCenterOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_COVERAGE:
				return getMultiCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE:
				return getMultiCurve() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				return getMultiCurveCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				return getMultiCurveDomain() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				return getMultiCurveProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EDGE_OF:
				return getMultiEdgeOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_EXTENT_OF:
				return getMultiExtentOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY:
				return getMultiGeometry() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				return getMultiGeometryProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_LOCATION:
				return getMultiLocation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT:
				return getMultiPoint() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				return getMultiPointCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				return getMultiPointDomain() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				return getMultiPointProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_POSITION:
				return getMultiPosition() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID:
				return getMultiSolid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				return getMultiSolidCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				return getMultiSolidDomain() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				return getMultiSolidProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE:
				return getMultiSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				return getMultiSurfaceCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				return getMultiSurfaceDomain() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				return getMultiSurfaceProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__NAME:
				return getName() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__NODE:
				return getNode() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__NULL:
				return NULL_EDEFAULT == null ? getNull() != null : !NULL_EDEFAULT.equals(getNull());
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				return getObliqueCartesianCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				return getObliqueCartesianCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OFFSET_CURVE:
				return getOffsetCurve() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD:
				return getOperationMethod() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_METHOD_REF:
				return getOperationMethodRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER:
				return getOperationParameter() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER1:
				return getOperationParameter1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER2:
				return getOperationParameter2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER3:
				return getOperationParameter3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				return getOperationParameterGroup() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				return getOperationParameterGroupRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				return getOperationParameterRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_REF:
				return getOperationRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__OPERATION_VERSION:
				return OPERATION_VERSION_EDEFAULT == null ? getOperationVersion() != null : !OPERATION_VERSION_EDEFAULT.equals(getOperationVersion());
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_CURVE:
				return getOrientableCurve() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				return getOrientableSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ORIGIN:
				return ORIGIN_EDEFAULT == null ? getOrigin() != null : !ORIGIN_EDEFAULT.equals(getOrigin());
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER:
				return getParameter() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE1:
				return getParameterValue1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE2:
				return getParameterValue2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE3:
				return getParameterValue3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				return getParameterValueGroup() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				return getPassThroughOperation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				return getPassThroughOperationRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PATCHES:
				return getPatches() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PIXEL_IN_CELL:
				return getPixelInCell() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT:
				return getPoint() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				return getPointArrayProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBER:
				return getPointMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_MEMBERS:
				return getPointMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_PROPERTY:
				return getPointProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POINT_REP:
				return getPointRep() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS:
				return getPolarCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS1:
				return getPolarCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS2:
				return getPolarCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS3:
				return getPolarCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLAR_CS_REF:
				return getPolarCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON:
				return getPolygon() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCH:
				return getPolygonPatch() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYGON_PATCHES:
				return getPolygonPatches() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				return getPolyhedralSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE:
				return getSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POS:
				return getPos() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POSITION:
				return getPosition() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__POS_LIST:
				return getPosList() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN:
				return getPrimeMeridian() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN1:
				return getPrimeMeridian1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN2:
				return getPrimeMeridian2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN3:
				return getPrimeMeridian3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				return getPrimeMeridianRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PRIORITY_LOCATION:
				return getPriorityLocation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS:
				return getProjectedCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__PROJECTED_CRS_REF:
				return getProjectedCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY:
				return getQuantity() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_EXTENT:
				return getQuantityExtent() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_LIST:
				return getQuantityList() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE:
				return getQuantityType() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__QUANTITY_TYPE_REFERENCE:
				return getQuantityTypeReference() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_MEANING:
				return getRangeMeaning() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_PARAMETERS:
				return getRangeParameters() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__RANGE_SET:
				return getRangeSet() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__REALIZATION_EPOCH:
				return REALIZATION_EPOCH_EDEFAULT == null ? getRealizationEpoch() != null : !REALIZATION_EPOCH_EDEFAULT.equals(getRealizationEpoch());
			case GMLPackage.GML_DOCUMENT_ROOT__RECTANGLE:
				return getRectangle() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID:
				return getRectifiedGrid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				return getRectifiedGridCoverage() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				return getRectifiedGridDomain() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				return getReferenceSystemRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__REMARKS:
				return REMARKS_EDEFAULT == null ? getRemarks() != null : !REMARKS_EDEFAULT.equals(getRemarks());
			case GMLPackage.GML_DOCUMENT_ROOT__RESULT_OF:
				return getResultOf() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__REVERSE_PROPERTY_NAME:
				return REVERSE_PROPERTY_NAME_EDEFAULT == null ? getReversePropertyName() != null : !REVERSE_PROPERTY_NAME_EDEFAULT.equals(getReversePropertyName());
			case GMLPackage.GML_DOCUMENT_ROOT__RING:
				return getRing() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				return getRoughConversionToPreferredUnit() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SCOPE:
				return SCOPE_EDEFAULT == null ? getScope() != null : !SCOPE_EDEFAULT.equals(getScope());
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				return getSecondDefiningParameter() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER1:
				return getSecondDefiningParameter1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER2:
				return getSecondDefiningParameter2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER3:
				return getSecondDefiningParameter3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SECONDS:
				return SECONDS_EDEFAULT == null ? getSeconds() != null : !SECONDS_EDEFAULT.equals(getSeconds());
			case GMLPackage.GML_DOCUMENT_ROOT__SEGMENTS:
				return getSegments() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				return getSemiMajorAxis() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SHELL:
				return getShell() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_CRS_REF:
				return getSingleCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				return getSingleOperationRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID:
				return getSolid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				return getSolidArrayProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBER:
				return getSolidMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_MEMBERS:
				return getSolidMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SOLID_PROPERTY:
				return getSolidProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_CRS:
				return getSourceCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SOURCE_DIMENSIONS:
				return SOURCE_DIMENSIONS_EDEFAULT == null ? getSourceDimensions() != null : !SOURCE_DIMENSIONS_EDEFAULT.equals(getSourceDimensions());
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERE:
				return getSphere() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS:
				return getSphericalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS1:
				return getSphericalCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS2:
				return getSphericalCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS3:
				return getSphericalCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SPHERICAL_CS_REF:
				return getSphericalCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS:
				return getStatus() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__STATUS_REFERENCE:
				return getStatusReference() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? getStringValue() != null : !STRING_VALUE_EDEFAULT.equals(getStringValue());
			case GMLPackage.GML_DOCUMENT_ROOT__SUB_COMPLEX:
				return getSubComplex() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SUBJECT:
				return getSubject() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET:
				return getTarget() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SUPER_COMPLEX:
				return getSuperComplex() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				return getSurfaceArrayProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBER:
				return getSurfaceMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_MEMBERS:
				return getSurfaceMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__SURFACE_PROPERTY:
				return getSurfaceProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_CRS:
				return getTargetCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_DIMENSIONS:
				return TARGET_DIMENSIONS_EDEFAULT == null ? getTargetDimensions() != null : !TARGET_DIMENSIONS_EDEFAULT.equals(getTargetDimensions());
			case GMLPackage.GML_DOCUMENT_ROOT__TARGET_ELEMENT:
				return TARGET_ELEMENT_EDEFAULT == null ? getTargetElement() != null : !TARGET_ELEMENT_EDEFAULT.equals(getTargetElement());
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS:
				return getTemporalCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				return getTemporalCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS:
				return getTemporalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_CS_REF:
				return getTemporalCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM:
				return getTemporalDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM1:
				return getTemporalDatum1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM2:
				return getTemporalDatum2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM3:
				return getTemporalDatum3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				return getTemporalDatumRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR:
				return getTimeCalendar() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
				return getTimeReferenceSystem() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				return getTimeCalendarEra() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CLOCK:
				return getTimeClock() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				return getTimeCoordinateSystem() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS:
				return getTimeCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS1:
				return getTimeCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS2:
				return getTimeCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_CS3:
				return getTimeCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_EDGE:
				return getTimeEdge() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INSTANT:
				return getTimeInstant() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_INTERVAL:
				return getTimeInterval() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_NODE:
				return getTimeNode() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				return getTimeOrdinalEra() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				return getTimeOrdinalReferenceSystem() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_PERIOD:
				return getTimePeriod() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_POSITION:
				return getTimePosition() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				return getTimeTopologyComplex() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TIN:
				return getTin() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				return getTriangulatedSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX:
				return getTopoComplex() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				return getTopoComplexProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE:
				return getTopoCurve() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				return getTopoCurveProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT:
				return getTopoPoint() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				return getTopoPointProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				return getTopoPrimitiveMember() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				return getTopoPrimitiveMembers() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SOLID:
				return getTopoSolid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE:
				return getTopoSurface() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				return getTopoSurfaceProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME:
				return getTopoVolume() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				return getTopoVolumeProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TRACK:
				return getTrack() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION:
				return getTransformation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TRANSFORMATION_REF:
				return getTransformationRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE:
				return getTriangle() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TRIANGLE_PATCHES:
				return getTrianglePatches() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__TUPLE_LIST:
				return getTupleList() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return getUnitOfMeasure() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS:
				return getUserDefinedCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS1:
				return getUserDefinedCS1() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS2:
				return getUserDefinedCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS3:
				return getUserDefinedCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				return getUserDefinedCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AFFINE_CS:
				return getUsesAffineCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_AXIS:
				return getUsesAxis() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CARTESIAN_CS:
				return getUsesCartesianCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_CS:
				return getUsesCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOID:
				return getUsesEllipsoid() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				return getUsesEllipsoidalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				return getUsesEngineeringDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				return getUsesGeodeticDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_IMAGE_DATUM:
				return getUsesImageDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_METHOD:
				return getUsesMethod() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				return getUsesObliqueCartesianCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_OPERATION:
				return getUsesOperation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PARAMETER:
				return getUsesParameter() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				return getUsesPrimeMeridian() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				return getUsesSingleOperation() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_SPHERICAL_CS:
				return getUsesSphericalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_CS:
				return getUsesTemporalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				return getUsesTemporalDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_TIME_CS:
				return getUsesTimeCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VALUE:
				return getUsesValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_CS:
				return getUsesVerticalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS:
				return getVerticalCS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				return getUsesVerticalDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM:
				return getVerticalDatum() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__USING:
				return getUsing() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALID_TIME:
				return getValidTime() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE:
				return getValue() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_ARRAY:
				return getValueArray() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENT:
				return getValueComponent() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_COMPONENTS:
				return getValueComponents() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_FILE:
				return VALUE_FILE_EDEFAULT == null ? getValueFile() != null : !VALUE_FILE_EDEFAULT.equals(getValueFile());
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_LIST:
				return getValueList() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				return getValueOfParameter() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUE_PROPERTY:
				return getValueProperty() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VALUES_OF_GROUP:
				return getValuesOfGroup() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VECTOR:
				return getVector() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS:
				return getVerticalCRS() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CRS_REF:
				return getVerticalCRSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS2:
				return getVerticalCS2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS3:
				return getVerticalCS3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_CS_REF:
				return getVerticalCSRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM2:
				return getVerticalDatum2() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM3:
				return getVerticalDatum3() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				return getVerticalDatumRef() != null;
			case GMLPackage.GML_DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GMLPackage.GML_DOCUMENT_ROOT__REMOTE_SCHEMA:
				return REMOTE_SCHEMA_EDEFAULT == null ? remoteSchema != null : !REMOTE_SCHEMA_EDEFAULT.equals(remoteSchema);
			case GMLPackage.GML_DOCUMENT_ROOT__UOM:
				return UOM_EDEFAULT == null ? uom != null : !UOM_EDEFAULT.equals(uom);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", id: ");
		result.append(id);
		result.append(", remoteSchema: ");
		result.append(remoteSchema);
		result.append(", uom: ");
		result.append(uom);
		result.append(')');
		return result.toString();
	}

} //GMLDocumentRootImpl
