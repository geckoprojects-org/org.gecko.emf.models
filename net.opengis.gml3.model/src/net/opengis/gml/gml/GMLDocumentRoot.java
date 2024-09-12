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
package net.opengis.gml.gml;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractAssociationRole <em>Abstract Association Role</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractContinuousCoverage <em>Abstract Continuous Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractFeature <em>Abstract Feature</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGML <em>Abstract GML</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractObject <em>Abstract Object</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractCoordinateOperation <em>Abstract Coordinate Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinition <em>Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractCoordinateSystem <em>Abstract Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractCoverage <em>Abstract Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractCRS <em>Abstract CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractCurve <em>Abstract Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeometricPrimitive <em>Abstract Geometric Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeometry <em>Abstract Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractCurveSegment <em>Abstract Curve Segment</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractDatum <em>Abstract Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractDiscreteCoverage <em>Abstract Discrete Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractFeatureCollection <em>Abstract Feature Collection</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeneralConversion <em>Abstract General Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractOperation <em>Abstract Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractSingleOperation <em>Abstract Single Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeneralDerivedCRS <em>Abstract General Derived CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractSingleCRS <em>Abstract Single CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeneralOperationParameter <em>Abstract General Operation Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeneralOperationParameterRef <em>Abstract General Operation Parameter Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeneralParameterValue <em>Abstract General Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeneralTransformation <em>Abstract General Transformation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeometricAggregate <em>Abstract Geometric Aggregate</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGriddedSurface <em>Abstract Gridded Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractParametricCurveSurface <em>Abstract Parametric Curve Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractSurfacePatch <em>Abstract Surface Patch</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractImplicitGeometry <em>Abstract Implicit Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractInlineProperty <em>Abstract Inline Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractMetaData <em>Abstract Meta Data</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractReference <em>Abstract Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractRing <em>Abstract Ring</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractScalarValue <em>Abstract Scalar Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractValue <em>Abstract Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractScalarValueList <em>Abstract Scalar Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractSolid <em>Abstract Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractStrictAssociationRole <em>Abstract Strict Association Role</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractSurface <em>Abstract Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractTimeComplex <em>Abstract Time Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractTimeObject <em>Abstract Time Object</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractTimeGeometricPrimitive <em>Abstract Time Geometric Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractTimePrimitive <em>Abstract Time Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractTimeSlice <em>Abstract Time Slice</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractTimeTopologyPrimitive <em>Abstract Time Topology Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractTopology <em>Abstract Topology</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractTopoPrimitive <em>Abstract Topo Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAffineCS <em>Affine CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAffineCS1 <em>Affine CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAffineCS2 <em>Affine CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAffineCS3 <em>Affine CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAffinePlacement <em>Affine Placement</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAnchorDefinition <em>Anchor Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAnchorPoint <em>Anchor Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getArc <em>Arc</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getArcString <em>Arc String</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getArcByBulge <em>Arc By Bulge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getArcStringByBulge <em>Arc String By Bulge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getArcByCenterPoint <em>Arc By Center Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getArray <em>Array</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAssociationName <em>Association Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAxis <em>Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAxisAbbrev <em>Axis Abbrev</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getAxisDirection <em>Axis Direction</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBag <em>Bag</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseCRS <em>Base CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseCurve <em>Base Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseGeodeticCRS <em>Base Geodetic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseGeographicCRS <em>Base Geographic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUnitDefinition <em>Unit Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBezier <em>Bezier</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBSpline <em>BSpline</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBooleanList <em>Boolean List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getBoundedBy <em>Bounded By</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCS1 <em>Cartesian CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCS2 <em>Cartesian CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCS3 <em>Cartesian CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCSRef <em>Cartesian CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCatalogSymbol <em>Catalog Symbol</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCategory <em>Category</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCategoryExtent <em>Category Extent</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCategoryList <em>Category List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCenterLineOf <em>Center Line Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCenterOf <em>Center Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCircle <em>Circle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCircleByCenterPoint <em>Circle By Center Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getClothoid <em>Clothoid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getComponentReferenceSystem <em>Component Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCompositeCurve <em>Composite Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCompositeSolid <em>Composite Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCompositeSurface <em>Composite Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCompoundCRS <em>Compound CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCompoundCRSRef <em>Compound CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConcatenatedOperation <em>Concatenated Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConcatenatedOperationRef <em>Concatenated Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCone <em>Cone</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConventionalUnit <em>Conventional Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConversion <em>Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConversion1 <em>Conversion1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConversion2 <em>Conversion2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConversion3 <em>Conversion3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConversionRef <em>Conversion Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getConversionToPreferredUnit <em>Conversion To Preferred Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateOperationAccuracy <em>Coordinate Operation Accuracy</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateOperationRef <em>Coordinate Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateSystemAxis <em>Coordinate System Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateSystemAxisRef <em>Coordinate System Axis Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateSystemRef <em>Coordinate System Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordOperation <em>Coord Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCount <em>Count</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCountExtent <em>Count Extent</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCountList <em>Count List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoverageFunction <em>Coverage Function</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCoverageMappingRule <em>Coverage Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCrsRef <em>Crs Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCubicSpline <em>Cubic Spline</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCurve <em>Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCurveArrayProperty <em>Curve Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCurveMember <em>Curve Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCurveMembers <em>Curve Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCurveProperty <em>Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCS <em>Cylindrical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCS1 <em>Cylindrical CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCS2 <em>Cylindrical CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCS3 <em>Cylindrical CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCSRef <em>Cylindrical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDataBlock <em>Data Block</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDataSourceReference <em>Data Source Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDatumRef <em>Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDecimalMinutes <em>Decimal Minutes</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDefaultCodeSpace <em>Default Code Space</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinedByConversion <em>Defined By Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinitionCollection <em>Definition Collection</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinitionMember <em>Definition Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDictionaryEntry <em>Dictionary Entry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinitionProxy <em>Definition Proxy</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivationUnitTerm <em>Derivation Unit Term</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivedCRS <em>Derived CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivedCRSRef <em>Derived CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivedCRSType <em>Derived CRS Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivedUnit <em>Derived Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDescriptionReference <em>Description Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedFace <em>Directed Face</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedNode <em>Directed Node</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedObservation <em>Directed Observation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getObservation <em>Observation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedObservationAtDistance <em>Directed Observation At Distance</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedTopoSolid <em>Directed Topo Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDirection <em>Direction</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDmsAngle <em>Dms Angle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDmsAngleValue <em>Dms Angle Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDomainSet <em>Domain Set</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDoubleOrNilReasonTupleList <em>Double Or Nil Reason Tuple List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDynamicFeature <em>Dynamic Feature</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDynamicFeatureCollection <em>Dynamic Feature Collection</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getDynamicMembers <em>Dynamic Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEdge <em>Edge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEdgeOf <em>Edge Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoid <em>Ellipsoid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoid1 <em>Ellipsoid1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoid2 <em>Ellipsoid2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoid3 <em>Ellipsoid3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCS <em>Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCS1 <em>Ellipsoidal CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCS2 <em>Ellipsoidal CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCS3 <em>Ellipsoidal CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCSRef <em>Ellipsoidal CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidRef <em>Ellipsoid Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringCRS <em>Engineering CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringCRSRef <em>Engineering CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatum <em>Engineering Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatum1 <em>Engineering Datum1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatum2 <em>Engineering Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatum3 <em>Engineering Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatumRef <em>Engineering Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getEnvelopeWithTimePeriod <em>Envelope With Time Period</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getExtentOf <em>Extent Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getFace <em>Face</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getFeatureCollection <em>Feature Collection</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getFeatureMember <em>Feature Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getFeatureMembers <em>Feature Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getFeatureProperty <em>Feature Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getFile <em>File</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getFormula <em>Formula</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getFormulaCitation <em>Formula Citation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeneralConversionRef <em>General Conversion Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeneralOperationParameter <em>General Operation Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeneralOperationParameter1 <em>General Operation Parameter1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeneralTransformationRef <em>General Transformation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGenericMetaData <em>Generic Meta Data</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeocentricCRS <em>Geocentric CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeocentricCRSRef <em>Geocentric CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodesic <em>Geodesic</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodesicString <em>Geodesic String</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticCRS <em>Geodetic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatum <em>Geodetic Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatum1 <em>Geodetic Datum1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatum2 <em>Geodetic Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatum3 <em>Geodetic Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatumRef <em>Geodetic Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeographicCRS <em>Geographic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeographicCRSRef <em>Geographic CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeometricComplex <em>Geometric Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeometryMember <em>Geometry Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGeometryMembers <em>Geometry Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGmlProfileSchema <em>Gml Profile Schema</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGreenwichLongitude <em>Greenwich Longitude</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGrid <em>Grid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGridCoverage <em>Grid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGridDomain <em>Grid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGridFunction <em>Grid Function</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getHistory <em>History</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getImageCRS <em>Image CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getImageCRSRef <em>Image CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatum <em>Image Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatum1 <em>Image Datum1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatum2 <em>Image Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatum3 <em>Image Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatumRef <em>Image Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getIncludesParameter <em>Includes Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getIncludesSingleCRS <em>Includes Single CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getIncludesValue <em>Includes Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getIndirectEntry <em>Indirect Entry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getIntegerValueList <em>Integer Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getInterior <em>Interior</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCS <em>Linear CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCS1 <em>Linear CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCS2 <em>Linear CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCS3 <em>Linear CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCSRef <em>Linear CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLineString <em>Line String</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLineStringSegment <em>Line String Segment</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLocationKeyWord <em>Location Key Word</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getLocationString <em>Location String</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMappingRule <em>Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMaximalComplex <em>Maximal Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMaximumOccurs <em>Maximum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMembers <em>Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMetaDataProperty <em>Meta Data Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMethod <em>Method</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMethodFormula <em>Method Formula</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMinimumOccurs <em>Minimum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getModifiedCoordinate <em>Modified Coordinate</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMovingObjectStatus <em>Moving Object Status</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCenterLineOf <em>Multi Center Line Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCenterOf <em>Multi Center Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCoverage <em>Multi Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCurve <em>Multi Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCurveCoverage <em>Multi Curve Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCurveDomain <em>Multi Curve Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCurveProperty <em>Multi Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiEdgeOf <em>Multi Edge Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiExtentOf <em>Multi Extent Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiGeometry <em>Multi Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiGeometryProperty <em>Multi Geometry Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiLocation <em>Multi Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPoint <em>Multi Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPointCoverage <em>Multi Point Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPointDomain <em>Multi Point Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPointProperty <em>Multi Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPosition <em>Multi Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSolid <em>Multi Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSolidCoverage <em>Multi Solid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSolidDomain <em>Multi Solid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSolidProperty <em>Multi Solid Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSurface <em>Multi Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSurfaceCoverage <em>Multi Surface Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSurfaceDomain <em>Multi Surface Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSurfaceProperty <em>Multi Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getNode <em>Node</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getNull <em>Null</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getObliqueCartesianCS <em>Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getObliqueCartesianCSRef <em>Oblique Cartesian CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOffsetCurve <em>Offset Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationMethod <em>Operation Method</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationMethodRef <em>Operation Method Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameter1 <em>Operation Parameter1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameter2 <em>Operation Parameter2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameter3 <em>Operation Parameter3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameterGroup <em>Operation Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameterGroupRef <em>Operation Parameter Group Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameterRef <em>Operation Parameter Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationVersion <em>Operation Version</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOrientableCurve <em>Orientable Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOrientableSurface <em>Orientable Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getOrigin <em>Origin</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValue1 <em>Parameter Value1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValue2 <em>Parameter Value2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValue3 <em>Parameter Value3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValueGroup <em>Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPassThroughOperation <em>Pass Through Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPassThroughOperationRef <em>Pass Through Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPatches <em>Patches</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPixelInCell <em>Pixel In Cell</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPoint <em>Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPointArrayProperty <em>Point Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPointMember <em>Point Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPointMembers <em>Point Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCS <em>Polar CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCS1 <em>Polar CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCS2 <em>Polar CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCS3 <em>Polar CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCSRef <em>Polar CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolygonPatch <em>Polygon Patch</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolygonPatches <em>Polygon Patches</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPolyhedralSurface <em>Polyhedral Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSurface <em>Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPosition <em>Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridian <em>Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridian1 <em>Prime Meridian1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridian2 <em>Prime Meridian2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridian3 <em>Prime Meridian3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridianRef <em>Prime Meridian Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getPriorityLocation <em>Priority Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getProjectedCRS <em>Projected CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getProjectedCRSRef <em>Projected CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantityExtent <em>Quantity Extent</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantityList <em>Quantity List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantityType <em>Quantity Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantityTypeReference <em>Quantity Type Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRangeMeaning <em>Range Meaning</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRangeParameters <em>Range Parameters</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRangeSet <em>Range Set</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRealizationEpoch <em>Realization Epoch</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRectifiedGrid <em>Rectified Grid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRectifiedGridCoverage <em>Rectified Grid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRectifiedGridDomain <em>Rectified Grid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getReferenceSystemRef <em>Reference System Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getReversePropertyName <em>Reverse Property Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRing <em>Ring</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRoughConversionToPreferredUnit <em>Rough Conversion To Preferred Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getScope <em>Scope</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSecondDefiningParameter <em>Second Defining Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSecondDefiningParameter1 <em>Second Defining Parameter1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSecondDefiningParameter2 <em>Second Defining Parameter2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSecondDefiningParameter3 <em>Second Defining Parameter3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSegments <em>Segments</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSemiMajorAxis <em>Semi Major Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getShell <em>Shell</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSingleCRSRef <em>Single CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSingleOperationRef <em>Single Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSolid <em>Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSolidArrayProperty <em>Solid Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSolidMember <em>Solid Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSolidMembers <em>Solid Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSolidProperty <em>Solid Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSourceCRS <em>Source CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSourceDimensions <em>Source Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSphere <em>Sphere</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCS <em>Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCS1 <em>Spherical CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCS2 <em>Spherical CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCS3 <em>Spherical CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCSRef <em>Spherical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getStatus <em>Status</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getStatusReference <em>Status Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getStringValue <em>String Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSubComplex <em>Sub Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSuperComplex <em>Super Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSurfaceArrayProperty <em>Surface Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSurfaceMember <em>Surface Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSurfaceMembers <em>Surface Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getSurfaceProperty <em>Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTargetCRS <em>Target CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTargetDimensions <em>Target Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalCRS <em>Temporal CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalCRSRef <em>Temporal CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalCS <em>Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalCSRef <em>Temporal CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatum <em>Temporal Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatum1 <em>Temporal Datum1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatum2 <em>Temporal Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatum3 <em>Temporal Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatumRef <em>Temporal Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCalendar <em>Time Calendar</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeReferenceSystem <em>Time Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCalendarEra <em>Time Calendar Era</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeClock <em>Time Clock</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCoordinateSystem <em>Time Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCS <em>Time CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCS1 <em>Time CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCS2 <em>Time CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCS3 <em>Time CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeEdge <em>Time Edge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeInstant <em>Time Instant</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeNode <em>Time Node</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeOrdinalEra <em>Time Ordinal Era</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeOrdinalReferenceSystem <em>Time Ordinal Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimePosition <em>Time Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeTopologyComplex <em>Time Topology Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTin <em>Tin</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTriangulatedSurface <em>Triangulated Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoComplex <em>Topo Complex</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoComplexProperty <em>Topo Complex Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoCurve <em>Topo Curve</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoCurveProperty <em>Topo Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoPoint <em>Topo Point</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoPointProperty <em>Topo Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoPrimitiveMember <em>Topo Primitive Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoPrimitiveMembers <em>Topo Primitive Members</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoSolid <em>Topo Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoSurface <em>Topo Surface</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoSurfaceProperty <em>Topo Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoVolume <em>Topo Volume</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoVolumeProperty <em>Topo Volume Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTrack <em>Track</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTransformationRef <em>Transformation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTriangle <em>Triangle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTrianglePatches <em>Triangle Patches</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getTupleList <em>Tuple List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCS <em>User Defined CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCS1 <em>User Defined CS1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCS2 <em>User Defined CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCS3 <em>User Defined CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCSRef <em>User Defined CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesAffineCS <em>Uses Affine CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesAxis <em>Uses Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesCS <em>Uses CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesEllipsoid <em>Uses Ellipsoid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesEngineeringDatum <em>Uses Engineering Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesImageDatum <em>Uses Image Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesMethod <em>Uses Method</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesObliqueCartesianCS <em>Uses Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesOperation <em>Uses Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesParameter <em>Uses Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesPrimeMeridian <em>Uses Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesSingleOperation <em>Uses Single Operation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesSphericalCS <em>Uses Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesTemporalCS <em>Uses Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesTemporalDatum <em>Uses Temporal Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesTimeCS <em>Uses Time CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesValue <em>Uses Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesVerticalCS <em>Uses Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCS <em>Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesVerticalDatum <em>Uses Vertical Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalDatum <em>Vertical Datum</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUsing <em>Using</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValueArray <em>Value Array</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValueComponents <em>Value Components</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValueFile <em>Value File</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValueOfParameter <em>Value Of Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValueProperty <em>Value Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getValuesOfGroup <em>Values Of Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVector <em>Vector</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCRS <em>Vertical CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCRSRef <em>Vertical CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCS2 <em>Vertical CS2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCS3 <em>Vertical CS3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCSRef <em>Vertical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalDatum2 <em>Vertical Datum2</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalDatum3 <em>Vertical Datum3</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalDatumRef <em>Vertical Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GMLDocumentRoot#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface GMLDocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Association Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applying this pattern shall restrict the multiplicity of objects in a property element using this content model to exactly one. An instance of this type shall contain an element representing an object, or serve as a pointer to a remote object.
	 * Applying the pattern to define an application schema specific property type allows to restrict
	 * -	the inline object to specified object types, 
	 * -	the encoding to "by-reference only" (see 7.2.3.7),
	 * -	the encoding to "inline only" (see 7.2.3.8).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Association Role</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractAssociationRole()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstractAssociationRole' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationRoleType getAbstractAssociationRole();

	/**
	 * Returns the value of the '<em><b>Abstract Continuous Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A continuous coverage as defined in ISO 19123 is a coverage that can return different values for the same feature attribute at different direct positions within a single spatiotemporal object in its spatiotemporal domain. The base type for continuous coverages is AbstractContinuousCoverageType.
	 * The coverageFunction element describes the mapping function. 
	 * The abstract element gml:AbstractContinuousCoverage serves as the head of a substitution group which may contain any continuous coverage whose type is derived from gml:AbstractContinuousCoverageType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Continuous Coverage</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractContinuousCoverage()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractContinuousCoverage' namespace='##targetNamespace' affiliation='AbstractFeature'"
	 * @generated
	 */
	AbstractContinuousCoverageType getAbstractContinuousCoverage();

	/**
	 * Returns the value of the '<em><b>Abstract Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This abstract element serves as the head of a substitution group which may contain any elements whose content model is derived from gml:AbstractFeatureType.  This may be used as a variable in the construction of content models.  
	 * gml:AbstractFeature may be thought of as "anything that is a GML feature" and may be used to define variables or templates in which the value of a GML property is "any feature". This occurs in particular in a GML feature collection where the feature member properties contain one or multiple copies of gml:AbstractFeature respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Feature</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractFeature()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeature' namespace='##targetNamespace' affiliation='AbstractGML'"
	 * @generated
	 */
	AbstractFeatureType getAbstractFeature();

	/**
	 * Returns the value of the '<em><b>Abstract GML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The abstract element gml:AbstractGML is "any GML object having identity".   It acts as the head of an XML Schema substitution group, which may include any element which is a GML feature, or other object, with identity.  This is used as a variable in content models in GML core and application schemas.  It is effectively an abstract superclass for all GML objects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract GML</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGML()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGML' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	AbstractGMLType getAbstractGML();

	/**
	 * Returns the value of the '<em><b>Abstract Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element has no type defined, and is therefore implicitly (according to the rules of W3C XML Schema) an XML Schema anyType. It is used as the head of an XML Schema substitution group which unifies complex content and certain simple content elements used for datatypes in GML, including the gml:AbstractGML substitution group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Object</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractObject' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAbstractObject();

	/**
	 * Returns the value of the '<em><b>Abstract Coordinate Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractCoordinateOperation is a mathematical operation on coordinates that transforms or converts coordinates to another coordinate reference system. Many but not all coordinate operations (from CRS A to CRS B) also uniquely define the inverse operation (from CRS B to CRS A). In some cases, the operation method algorithm for the inverse operation is the same as for the forward algorithm, but the signs of some operation parameter values shall be reversed. In other cases, different algorithms are required for the forward and inverse operations, but the same operation parameter values are used. If (some) entirely different parameter values are needed, a different coordinate operation shall be defined.
	 * The optional coordinateOperationAccuracy property elements provide estimates of the impact of this coordinate operation on point position accuracy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Coordinate Operation</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractCoordinateOperation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCoordinateOperation' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	AbstractCoordinateOperationType getAbstractCoordinateOperation();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The basic gml:Definition element specifies a definition, which can be included in or referenced by a dictionary. 
	 * The content model for a generic definition is a derivation from gml:AbstractGMLType.  
	 * The gml:description property element shall hold the definition if this can be captured in a simple text string, or the gml:descriptionReference property element may carry a link to a description elsewhere.
	 * The gml:identifier element shall provide one identifier identifying this definition. The identifier shall be unique within the dictionaries using this definition. 
	 * The gml:name elements shall provide zero or more terms and synonyms for which this is the definition.
	 * The gml:remarks element shall be used to hold additional textual information that is not conceptually part of the definition but is useful in understanding the definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(DefinitionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Definition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Definition' namespace='##targetNamespace' affiliation='AbstractGML'"
	 * @generated
	 */
	DefinitionType getDefinition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DefinitionType value);

	/**
	 * Returns the value of the '<em><b>Abstract Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractCoordinateSystem is a coordinate system (CS) is the non-repeating sequence of coordinate system axes that spans a given coordinate space. A CS is derived from a set of mathematical rules for specifying how coordinates in a given space are to be assigned to points. The coordinate values in a coordinate tuple shall be recorded in the order in which the coordinate system axes associations are recorded. This abstract complex type shall not be used, extended, or restricted, in an Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Coordinate System</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractCoordinateSystem()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCoordinateSystem' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	AbstractCoordinateSystemType getAbstractCoordinateSystem();

	/**
	 * Returns the value of the '<em><b>Abstract Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element serves as the head of a substitution group which may contain any coverage whose type is derived from gml:AbstractCoverageType.  It may act as a variable in the definition of content models where it is required to permit any coverage to be valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Coverage</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractCoverage()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCoverage' namespace='##targetNamespace' affiliation='AbstractFeature'"
	 * @generated
	 */
	AbstractCoverageType getAbstractCoverage();

	/**
	 * Returns the value of the '<em><b>Abstract CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractCRS specifies a coordinate reference system which is usually single but may be compound. This abstract complex type shall not be used, extended, or restricted, in a GML Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract CRS</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractCRS()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCRS' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	AbstractCRSType getAbstractCRS();

	/**
	 * Returns the value of the '<em><b>Abstract Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractCurve element is the abstract head of the substitution group for all (continuous) curve elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Curve</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractCurve()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCurve' namespace='##targetNamespace' affiliation='AbstractGeometricPrimitive'"
	 * @generated
	 */
	AbstractCurveType getAbstractCurve();

	/**
	 * Returns the value of the '<em><b>Abstract Geometric Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractGeometricPrimitive element is the abstract head of the substitution group for all (pre- and user-defined) geometric primitives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Geometric Primitive</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeometricPrimitive()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometricPrimitive' namespace='##targetNamespace' affiliation='AbstractGeometry'"
	 * @generated
	 */
	AbstractGeometricPrimitiveType getAbstractGeometricPrimitive();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractGeometry element is the abstract head of the substitution group for all geometry elements of GML. This includes pre-defined and user-defined geometry elements. Any geometry element shall be a direct or indirect extension/restriction of AbstractGeometryType and shall be directly or indirectly in the substitution group of AbstractGeometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Geometry</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeometry()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometry' namespace='##targetNamespace' affiliation='AbstractGML'"
	 * @generated
	 */
	AbstractGeometryType getAbstractGeometry();

	/**
	 * Returns the value of the '<em><b>Abstract Curve Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A curve segment defines a homogeneous segment of a curve.
	 * The attributes numDerivativesAtStart, numDerivativesAtEnd and numDerivativesInterior specify the type of continuity as specified in ISO 19107:2003, 6.4.9.3.
	 * The AbstractCurveSegment element is the abstract head of the substituition group for all curve segment elements, i.e. continuous segments of the same interpolation mechanism.
	 * All curve segments shall have an attribute interpolation with type gml:CurveInterpolationType specifying the curve interpolation mechanism used for this segment. This mechanism uses the control points and control parameters to determine the position of this curve segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Curve Segment</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractCurveSegment()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCurveSegment' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	AbstractCurveSegmentType getAbstractCurveSegment();

	/**
	 * Returns the value of the '<em><b>Abstract Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:AbstractDatum specifies the relationship of a coordinate system to the earth, thus creating a coordinate reference system. A datum uses a parameter or set of parameters that determine the location of the origin of the coordinate reference system. Each datum subtype may be associated with only specific types of coordinate systems. This abstract complex type shall not be used, extended, or restricted, in a GML Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Datum</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractDatum()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDatum' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	AbstractDatumType getAbstractDatum();

	/**
	 * Returns the value of the '<em><b>Abstract Discrete Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A discrete coverage consists of a domain set, range set and optionally a coverage function. The domain set consists of either spatial or temporal geometry objects, finite in number. The range set is comprised of a finite number of attribute values each of which is associated to every direct position within any single spatiotemporal object in the domain. In other words, the range values are constant on each spatiotemporal object in the domain. This coverage function maps each element from the coverage domain to an element in its range. The coverageFunction element describes the mapping function.
	 * This element serves as the head of a substitution group which may contain any discrete coverage whose type is derived from gml:DiscreteCoverageType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Discrete Coverage</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractDiscreteCoverage()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDiscreteCoverage' namespace='##targetNamespace' affiliation='AbstractCoverage'"
	 * @generated
	 */
	DiscreteCoverageType getAbstractDiscreteCoverage();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Collection</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractFeatureCollection()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureCollection' namespace='##targetNamespace' affiliation='AbstractFeature'"
	 * @generated
	 */
	AbstractFeatureCollectionType getAbstractFeatureCollection();

	/**
	 * Returns the value of the '<em><b>Abstract General Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gm:AbstractGeneralConversion is an abstract operation on coordinates that does not include any change of datum. The best-known example of a coordinate conversion is a map projection. The parameters describing coordinate conversions are defined rather than empirically derived. Note that some conversions have no parameters. The operationVersion, sourceCRS, and targetCRS elements are omitted in a coordinate conversion.
	 * This abstract complex type is expected to be extended for well-known operation methods with many Conversion instances, in GML Application Schemas that define operation-method-specialized element names and contents. This conversion uses an operation method, usually with associated parameter values. However, operation methods and parameter values are directly associated with concrete subtypes, not with this abstract type. All concrete types derived from this type shall extend this type to include a "usesMethod" element that references the "OperationMethod" element. Similarly, all concrete types derived from this type shall extend this type to include zero or more elements each named "uses...Value" that each use the type of an element substitutable for the "AbstractGeneralParameterValue" element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract General Conversion</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeneralConversion()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeneralConversion' namespace='##targetNamespace' affiliation='AbstractOperation'"
	 * @generated
	 */
	AbstractGeneralConversionType getAbstractGeneralConversion();

	/**
	 * Returns the value of the '<em><b>Abstract Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Operation</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractOperation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractOperation' namespace='##targetNamespace' affiliation='AbstractSingleOperation'"
	 * @generated
	 */
	AbstractCoordinateOperationType getAbstractOperation();

	/**
	 * Returns the value of the '<em><b>Abstract Single Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractSingleOperation is a single (not concatenated) coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Single Operation</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractSingleOperation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSingleOperation' namespace='##targetNamespace' affiliation='AbstractCoordinateOperation'"
	 * @generated
	 */
	AbstractCoordinateOperationType getAbstractSingleOperation();

	/**
	 * Returns the value of the '<em><b>Abstract General Derived CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractGeneralDerivedCRS is a coordinate reference system that is defined by its coordinate conversion from another coordinate reference system. This abstract complex type shall not be used, extended, or restricted, in a GML Application Schema, to define a concrete subtype with a meaning equivalent to a concrete subtype specified in this document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract General Derived CRS</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeneralDerivedCRS()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeneralDerivedCRS' namespace='##targetNamespace' affiliation='AbstractSingleCRS'"
	 * @generated
	 */
	AbstractGeneralDerivedCRSType getAbstractGeneralDerivedCRS();

	/**
	 * Returns the value of the '<em><b>Abstract Single CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractSingleCRS implements a coordinate reference system consisting of one coordinate system and one datum (as opposed to a Compound CRS).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Single CRS</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractSingleCRS()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSingleCRS' namespace='##targetNamespace' affiliation='AbstractCRS'"
	 * @generated
	 */
	AbstractCRSType getAbstractSingleCRS();

	/**
	 * Returns the value of the '<em><b>Abstract General Operation Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:GeneralOperationParameter is the abstract definition of a parameter or group of parameters used by an operation method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract General Operation Parameter</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeneralOperationParameter()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeneralOperationParameter' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	AbstractGeneralOperationParameterType getAbstractGeneralOperationParameter();

	/**
	 * Returns the value of the '<em><b>Abstract General Operation Parameter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract General Operation Parameter Ref</em>' containment reference.
	 * @see #setAbstractGeneralOperationParameterRef(AbstractGeneralOperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeneralOperationParameterRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstractGeneralOperationParameterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractGeneralOperationParameterPropertyType getAbstractGeneralOperationParameterRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAbstractGeneralOperationParameterRef <em>Abstract General Operation Parameter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract General Operation Parameter Ref</em>' containment reference.
	 * @see #getAbstractGeneralOperationParameterRef()
	 * @generated
	 */
	void setAbstractGeneralOperationParameterRef(AbstractGeneralOperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Abstract General Parameter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractGeneralParameterValue is an abstract parameter value or group of parameter values.
	 * This abstract complexType is expected to be extended and restricted for well-known operation methods with many instances, in Application Schemas that define operation-method-specialized element names and contents. Specific parameter value elements are directly contained in concrete subtypes, not in this abstract type. All concrete types derived from this type shall extend this type to include one "...Value" element with an appropriate type, which should be one of the element types allowed in the ParameterValueType. In addition, all derived concrete types shall extend this type to include a "operationParameter" property element that references one element substitutable for the "OperationParameter" object element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract General Parameter Value</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeneralParameterValue()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeneralParameterValue' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	AbstractGeneralParameterValueType getAbstractGeneralParameterValue();

	/**
	 * Returns the value of the '<em><b>Abstract General Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractGeneralTransformation is an abstract operation on coordinates that usually includes a change of Datum. The parameters of a coordinate transformation are empirically derived from data containing the coordinates of a series of points in both coordinate reference systems. This computational process is usually "over-determined", allowing derivation of error (or accuracy) estimates for the transformation. Also, the stochastic nature of the parameters may result in multiple (different) versions of the same coordinate transformation. The operationVersion, sourceCRS, and targetCRS proeprty elements are mandatory in a coordinate transformation.
	 * This abstract complex type is expected to be extended for well-known operation methods with many Transformation instances, in Application Schemas that define operation-method-specialized value element names and contents. This transformation uses an operation method with associated parameter values. However, operation methods and parameter values are directly associated with concrete subtypes, not with this abstract type. All concrete types derived from this type shall extend this type to include a "usesMethod" element that references one "OperationMethod" element. Similarly, all concrete types derived from this type shall extend this type to include one or more elements each named "uses...Value" that each use the type of an element substitutable for the "AbstractGeneralParameterValue" element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract General Transformation</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeneralTransformation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeneralTransformation' namespace='##targetNamespace' affiliation='AbstractOperation'"
	 * @generated
	 */
	AbstractGeneralTransformationType getAbstractGeneralTransformation();

	/**
	 * Returns the value of the '<em><b>Abstract Geometric Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractGeometricAggregate is the abstract head of the substitution group for all geometric aggregates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Geometric Aggregate</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGeometricAggregate()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometricAggregate' namespace='##targetNamespace' affiliation='AbstractGeometry'"
	 * @generated
	 */
	AbstractGeometricAggregateType getAbstractGeometricAggregate();

	/**
	 * Returns the value of the '<em><b>Abstract Gridded Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if provided, rows gives the number of rows, columns the number of columns in the parameter grid. The parameter grid is represented by an instance of the gml:PointGrid group.
	 * The element provides a substitution group head for the surface patches based on a grid. All derived subtypes shall conform to the constraints specified in ISO 19107:2003, 6.4.41.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Gridded Surface</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractGriddedSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGriddedSurface' namespace='##targetNamespace' affiliation='AbstractParametricCurveSurface'"
	 * @generated
	 */
	AbstractGriddedSurfaceType getAbstractGriddedSurface();

	/**
	 * Returns the value of the '<em><b>Abstract Parametric Curve Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element provides a substitution group head for the surface patches based on parametric curves. All properties are specified in the derived subtypes. All derived subtypes shall conform to the constraints specified in ISO 19107:2003, 6.4.40.
	 * If provided, the aggregationType attribute shall have the value "set".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Parametric Curve Surface</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractParametricCurveSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractParametricCurveSurface' namespace='##targetNamespace' affiliation='AbstractSurfacePatch'"
	 * @generated
	 */
	AbstractParametricCurveSurfaceType getAbstractParametricCurveSurface();

	/**
	 * Returns the value of the '<em><b>Abstract Surface Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A surface patch defines a homogenuous portion of a surface. 
	 * The AbstractSurfacePatch element is the abstract head of the substituition group for all surface patch elements describing a continuous portion of a surface.
	 * All surface patches shall have an attribute interpolation (declared in the types derived from gml:AbstractSurfacePatchType) specifying the interpolation mechanism used for the patch using gml:SurfaceInterpolationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Surface Patch</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractSurfacePatch()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSurfacePatch' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractSurfacePatchType getAbstractSurfacePatch();

	/**
	 * Returns the value of the '<em><b>Abstract Implicit Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Implicit Geometry</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractImplicitGeometry()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractImplicitGeometry' namespace='##targetNamespace' affiliation='AbstractGeometry'"
	 * @generated
	 */
	AbstractGeometryType getAbstractImplicitGeometry();

	/**
	 * Returns the value of the '<em><b>Abstract Inline Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:abstractInlineProperty may be used as the head of a subtitution group of more specific elements providing a value inline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Inline Property</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractInlineProperty()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstractInlineProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	InlinePropertyType getAbstractInlineProperty();

	/**
	 * Returns the value of the '<em><b>Abstract Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Meta Data</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractMetaData()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractMetaData' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	AbstractMetaDataType getAbstractMetaData();

	/**
	 * Returns the value of the '<em><b>Abstract Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:abstractReference may be used as the head of a subtitution group of more specific elements providing a value by-reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Reference</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractReference()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstractReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getAbstractReference();

	/**
	 * Returns the value of the '<em><b>Abstract Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An abstraction of a ring to support surface boundaries of different complexity.
	 * The AbstractRing element is the abstract head of the substituition group for all closed boundaries of a surface patch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Ring</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractRing()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractRing' namespace='##targetNamespace' affiliation='AbstractCurve'"
	 * @generated
	 */
	AbstractRingType getAbstractRing();

	/**
	 * Returns the value of the '<em><b>Abstract Scalar Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractScalarValue is an abstract element which acts as the head of a substitution group which contains gml:Boolean, gml:Category, gml:Count and gml:Quantity, and (transitively) the elements in their substitution groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Scalar Value</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractScalarValue()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractScalarValue' namespace='##targetNamespace' affiliation='AbstractValue'"
	 * @generated
	 */
	EObject getAbstractScalarValue();

	/**
	 * Returns the value of the '<em><b>Abstract Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractValue is an abstract element which acts as the head of a substitution group which contains gml:AbstractScalarValue, gml:AbstractScalarValueList, gml:CompositeValue and gml:ValueExtent, and (transitively) the elements in their substitution groups.
	 * These elements may be used in an application schema as variables, so that in an XML instance document any member of its substitution group may occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Value</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractValue()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractValue' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	EObject getAbstractValue();

	/**
	 * Returns the value of the '<em><b>Abstract Scalar Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractScalarValueList is an abstract element which acts as the head of a substitution group which contains gml:BooleanList, gml:CategoryList, gml:CountList and gml:QuantityList, and (transitively) the elements in their substitution groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Scalar Value List</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractScalarValueList()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractScalarValueList' namespace='##targetNamespace' affiliation='AbstractValue'"
	 * @generated
	 */
	EObject getAbstractScalarValueList();

	/**
	 * Returns the value of the '<em><b>Abstract Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractSolid element is the abstract head of the substituition group for all (continuous) solid elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Solid</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractSolid()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSolid' namespace='##targetNamespace' affiliation='AbstractGeometricPrimitive'"
	 * @generated
	 */
	AbstractSolidType getAbstractSolid();

	/**
	 * Returns the value of the '<em><b>Abstract Strict Association Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element shows how an element 
	 * 	declaration may include a Schematron constraint to limit the property to act 
	 * 	in either inline or by-reference mode, but not both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Strict Association Role</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractStrictAssociationRole()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstractStrictAssociationRole' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationRoleType getAbstractStrictAssociationRole();

	/**
	 * Returns the value of the '<em><b>Abstract Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractSurface element is the abstract head of the substitution group for all (continuous) surface elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Surface</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSurface' namespace='##targetNamespace' affiliation='AbstractGeometricPrimitive'"
	 * @generated
	 */
	AbstractSurfaceType getAbstractSurface();

	/**
	 * Returns the value of the '<em><b>Abstract Time Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractTimeComplex is an aggregation of temporal primitives and acts as the head of a substitution group for temporal complexes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Time Complex</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractTimeComplex()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimeComplex' namespace='##targetNamespace' affiliation='AbstractTimeObject'"
	 * @generated
	 */
	AbstractTimeComplexType getAbstractTimeComplex();

	/**
	 * Returns the value of the '<em><b>Abstract Time Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractTimeObject acts as the head of a substitution group for all temporal primitives and complexes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Time Object</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractTimeObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimeObject' namespace='##targetNamespace' affiliation='AbstractGML'"
	 * @generated
	 */
	AbstractTimeObjectType getAbstractTimeObject();

	/**
	 * Returns the value of the '<em><b>Abstract Time Geometric Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TimeGeometricPrimitive acts as the head of a substitution group for geometric temporal primitives.
	 * A temporal geometry shall be associated with a temporal reference system through the frame attribute that provides a URI reference that identifies a description of the reference system. Following ISO 19108, the Gregorian calendar with UTC is the default reference system, but others may also be used. The GPS calendar is an alternative reference systems in common use.
	 * The two geometric primitives in the temporal dimension are the instant and the period. GML components are defined to support these as follows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Time Geometric Primitive</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractTimeGeometricPrimitive()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimeGeometricPrimitive' namespace='##targetNamespace' affiliation='AbstractTimePrimitive'"
	 * @generated
	 */
	AbstractTimeGeometricPrimitiveType getAbstractTimeGeometricPrimitive();

	/**
	 * Returns the value of the '<em><b>Abstract Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractTimePrimitive acts as the head of a substitution group for geometric and topological temporal primitives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Time Primitive</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractTimePrimitive()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimePrimitive' namespace='##targetNamespace' affiliation='AbstractTimeObject'"
	 * @generated
	 */
	AbstractTimePrimitiveType getAbstractTimePrimitive();

	/**
	 * Returns the value of the '<em><b>Abstract Time Slice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To describe an event — an action that occurs at an instant or over an interval of time — GML provides the gml:AbtractTimeSlice element. A timeslice encapsulates the time-varying properties of a dynamic feature -- it shall be extended to represent a time stamped projection of a specific feature. The gml:dataSource property describes how the temporal data was acquired.
	 * A gml:AbstractTimeSlice instance is a GML object that encapsulates updates of the dynamic—or volatile—properties that reflect some change event; it thus includes only those feature properties that have actually changed due to some process.
	 * gml:AbstractTimeSlice basically provides a facility for attribute-level time stamping, in contrast to the object-level time stamping of dynamic feature instances. 
	 * The time slice can thus be viewed as event or process-oriented, whereas a snapshot is more state or structure-oriented. A timeslice has richer causality, whereas a snapshot merely portrays the status of the whole. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Time Slice</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractTimeSlice()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimeSlice' namespace='##targetNamespace' affiliation='AbstractGML'"
	 * @generated
	 */
	AbstractTimeSliceType getAbstractTimeSlice();

	/**
	 * Returns the value of the '<em><b>Abstract Time Topology Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TimeTopologyPrimitive acts as the head of a substitution group for topological temporal primitives.
	 * Temporal topology primitives shall imply the ordering information between features or feature properties. The temporal connection of features can be examined if they have temporal topology primitives as values of their properties. Usually, an instantaneous feature associates with a time node, and a static feature associates with a time edge.  A feature with both modes associates with the temporal topology primitive: a supertype of time nodes and time edges.
	 * A topological primitive is always connected to one or more other topological primitives, and is, therefore, always a member of a topological complex. In a GML instance, this will often be indicated by the primitives being described by elements that are descendents of an element describing a complex. However, in order to support the case where a temporal topological primitive is described in another context, the optional complex property is provided, which carries a reference to the parent temporal topological complex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Time Topology Primitive</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractTimeTopologyPrimitive()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimeTopologyPrimitive' namespace='##targetNamespace' affiliation='AbstractTimePrimitive'"
	 * @generated
	 */
	AbstractTimeTopologyPrimitiveType getAbstractTimeTopologyPrimitive();

	/**
	 * Returns the value of the '<em><b>Abstract Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Topology</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractTopology()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTopology' namespace='##targetNamespace' affiliation='AbstractGML'"
	 * @generated
	 */
	AbstractTopologyType getAbstractTopology();

	/**
	 * Returns the value of the '<em><b>Abstract Topo Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractTopoPrimitive acts as the base type for all topological primitives. Topology primitives are the atomic (smallest possible) units of a topology complex. 
	 * Each topology primitive may contain references to other topology primitives of codimension 2 or more (gml:isolated). Conversely, nodes may have faces as containers and nodes and edges may have solids as containers (gml:container).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Topo Primitive</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AbstractTopoPrimitive()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTopoPrimitive' namespace='##targetNamespace' affiliation='AbstractTopology'"
	 * @generated
	 */
	AbstractTopoPrimitiveType getAbstractTopoPrimitive();

	/**
	 * Returns the value of the '<em><b>Affine CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:affineCS is an association role to the affine coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine CS</em>' containment reference.
	 * @see #setAffineCS(AffineCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AffineCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='affineCS' namespace='##targetNamespace'"
	 * @generated
	 */
	AffineCSPropertyType getAffineCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAffineCS <em>Affine CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affine CS</em>' containment reference.
	 * @see #getAffineCS()
	 * @generated
	 */
	void setAffineCS(AffineCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Affine CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:affineCS is an association role to the affine coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine CS1</em>' containment reference.
	 * @see #setAffineCS1(AffineCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AffineCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='affineCS' namespace='##targetNamespace'"
	 * @generated
	 */
	AffineCSPropertyType getAffineCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAffineCS1 <em>Affine CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affine CS1</em>' containment reference.
	 * @see #getAffineCS1()
	 * @generated
	 */
	void setAffineCS1(AffineCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Affine CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AffineCS is a two- or three-dimensional coordinate system with straight axes that are not necessarily orthogonal. An AffineCS shall have two or three gml:axis property elements; the number of property elements shall equal the dimension of the CS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine CS2</em>' containment reference.
	 * @see #setAffineCS2(AffineCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AffineCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AffineCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	AffineCSType getAffineCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAffineCS2 <em>Affine CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affine CS2</em>' containment reference.
	 * @see #getAffineCS2()
	 * @generated
	 */
	void setAffineCS2(AffineCSType value);

	/**
	 * Returns the value of the '<em><b>Affine CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AffineCS is a two- or three-dimensional coordinate system with straight axes that are not necessarily orthogonal. An AffineCS shall have two or three gml:axis property elements; the number of property elements shall equal the dimension of the CS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine CS3</em>' containment reference.
	 * @see #setAffineCS3(AffineCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AffineCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AffineCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	AffineCSType getAffineCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAffineCS3 <em>Affine CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affine CS3</em>' containment reference.
	 * @see #getAffineCS3()
	 * @generated
	 */
	void setAffineCS3(AffineCSType value);

	/**
	 * Returns the value of the '<em><b>Affine Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * location, refDirection, inDimension and outDimension have the same meaning as specified in ISO 19107:2003, 6.4.21.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine Placement</em>' containment reference.
	 * @see #setAffinePlacement(AffinePlacementType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AffinePlacement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AffinePlacement' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	AffinePlacementType getAffinePlacement();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAffinePlacement <em>Affine Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affine Placement</em>' containment reference.
	 * @see #getAffinePlacement()
	 * @generated
	 */
	void setAffinePlacement(AffinePlacementType value);

	/**
	 * Returns the value of the '<em><b>Anchor Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:anchorDefinition is a description, possibly including coordinates, of the definition used to anchor the datum to the Earth. Also known as the "origin", especially for engineering and image datums. The codeSpace attribute may be used to reference a source of more detailed on this point or surface, or on a set of such descriptions.
	 * -	For a geodetic datum, this point is also known as the fundamental point, which is traditionally the point where the relationship between geoid and ellipsoid is defined. In some cases, the "fundamental point" may consist of a number of points. In those cases, the parameters defining the geoid/ellipsoid relationship have been averaged for these points, and the averages adopted as the datum definition.
	 * -	For an engineering datum, the anchor definition may be a physical point, or it may be a point with defined coordinates in another CRS.may
	 * -	For an image datum, the anchor definition is usually either the centre of the image or the corner of the image.
	 * -	For a temporal datum, this attribute is not defined. Instead of the anchor definition, a temporal datum carries a separate time origin of type DateTime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anchor Definition</em>' containment reference.
	 * @see #setAnchorDefinition(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AnchorDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchorDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getAnchorDefinition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAnchorDefinition <em>Anchor Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Definition</em>' containment reference.
	 * @see #getAnchorDefinition()
	 * @generated
	 */
	void setAnchorDefinition(CodeType value);

	/**
	 * Returns the value of the '<em><b>Anchor Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Point</em>' containment reference.
	 * @see #setAnchorPoint(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AnchorPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anchorPoint' namespace='##targetNamespace' affiliation='anchorDefinition'"
	 * @generated
	 */
	CodeType getAnchorPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAnchorPoint <em>Anchor Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Point</em>' containment reference.
	 * @see #getAnchorPoint()
	 * @generated
	 */
	void setAnchorPoint(CodeType value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:angle property element is used to record the value of an angle quantity as a single number, with its units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(AngleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Angle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='angle' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(AngleType value);

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Arc is an arc string with only one arc unit, i.e. three control points including the start and end point. As arc is an arc string consisting of a single arc, the attribute "numArc" is fixed to "1".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference.
	 * @see #setArc(ArcType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Arc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Arc' namespace='##targetNamespace' affiliation='ArcString'"
	 * @generated
	 */
	ArcType getArc();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getArc <em>Arc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc</em>' containment reference.
	 * @see #getArc()
	 * @generated
	 */
	void setArc(ArcType value);

	/**
	 * Returns the value of the '<em><b>Arc String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ArcString is a curve segment that uses three-point circular arc interpolation ("circularArc3Points"). The number of arcs in the arc string may be explicitly stated in the attribute numArc. The number of control points in the arc string shall be 2 * numArc + 1.
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arc String</em>' containment reference.
	 * @see #setArcString(ArcStringType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ArcString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArcString' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	ArcStringType getArcString();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getArcString <em>Arc String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc String</em>' containment reference.
	 * @see #getArcString()
	 * @generated
	 */
	void setArcString(ArcStringType value);

	/**
	 * Returns the value of the '<em><b>Arc By Bulge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ArcByBulge is an arc string with only one arc unit, i.e. two control points, one bulge and one normal vector.
	 * As arc is an arc string consisting of a single arc, the attribute "numArc" is fixed to "1".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arc By Bulge</em>' containment reference.
	 * @see #setArcByBulge(ArcByBulgeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ArcByBulge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArcByBulge' namespace='##targetNamespace' affiliation='ArcStringByBulge'"
	 * @generated
	 */
	ArcByBulgeType getArcByBulge();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getArcByBulge <em>Arc By Bulge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc By Bulge</em>' containment reference.
	 * @see #getArcByBulge()
	 * @generated
	 */
	void setArcByBulge(ArcByBulgeType value);

	/**
	 * Returns the value of the '<em><b>Arc String By Bulge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This variant of the arc computes the mid points of the arcs instead of storing the coordinates directly. The control point sequence consists of the start and end points of each arc plus the bulge (see ISO 19107:2003, 6.4.17.2). The normal is a vector normal (perpendicular) to the chord of the arc (see ISO 19107:2003, 6.4.17.4).
	 * The interpolation is fixed as "circularArc2PointWithBulge".
	 * The number of arcs in the arc string may be explicitly stated in the attribute numArc. The number of control points in the arc string shall be numArc + 1.
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arc String By Bulge</em>' containment reference.
	 * @see #setArcStringByBulge(ArcStringByBulgeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ArcStringByBulge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArcStringByBulge' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	ArcStringByBulgeType getArcStringByBulge();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getArcStringByBulge <em>Arc String By Bulge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc String By Bulge</em>' containment reference.
	 * @see #getArcStringByBulge()
	 * @generated
	 */
	void setArcStringByBulge(ArcStringByBulgeType value);

	/**
	 * Returns the value of the '<em><b>Arc By Center Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This variant of the arc requires that the points on the arc shall be computed instead of storing the coordinates directly. The single control point is the center point of the arc plus the radius and the bearing at start and end. This representation can be used only in 2D.
	 * The element radius specifies the radius of the arc.
	 * The element startAngle specifies the bearing of the arc at the start.
	 * The element endAngle specifies the bearing of the arc at the end.
	 * The interpolation is fixed as "circularArcCenterPointWithRadius".
	 * Since this type describes always a single arc, the attribute "numArc" is fixed to "1".
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arc By Center Point</em>' containment reference.
	 * @see #setArcByCenterPoint(ArcByCenterPointType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ArcByCenterPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArcByCenterPoint' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	ArcByCenterPointType getArcByCenterPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getArcByCenterPoint <em>Arc By Center Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc By Center Point</em>' containment reference.
	 * @see #getArcByCenterPoint()
	 * @generated
	 */
	void setArcByCenterPoint(ArcByCenterPointType value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(ArrayType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Array()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Array' namespace='##targetNamespace' affiliation='AbstractGML'"
	 * @generated
	 */
	ArrayType getArray();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(ArrayType value);

	/**
	 * Returns the value of the '<em><b>Association Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Name</em>' attribute.
	 * @see #setAssociationName(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AssociationName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='associationName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssociationName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAssociationName <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Name</em>' attribute.
	 * @see #getAssociationName()
	 * @generated
	 */
	void setAssociationName(String value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:axis property is an association role (ordered sequence) to the coordinate system axes included in this coordinate system. The coordinate values in a coordinate tuple shall be recorded in the order in which the coordinate system axes associations are recorded, whenever those coordinates use a coordinate reference system that uses this coordinate system. The gml:AggregationAttributeGroup should be used to specify that the axis objects are ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(CoordinateSystemAxisPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Axis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='axis' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateSystemAxisPropertyType getAxis();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(CoordinateSystemAxisPropertyType value);

	/**
	 * Returns the value of the '<em><b>Axis Abbrev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:axisAbbrev is the abbreviation used for this coordinate system axis; this abbreviation is also used to identify the coordinates in the coordinate tuple. The codeSpace attribute may reference a source of more information on a set of standardized abbreviations, or on this abbreviation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis Abbrev</em>' containment reference.
	 * @see #setAxisAbbrev(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AxisAbbrev()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='axisAbbrev' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getAxisAbbrev();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAxisAbbrev <em>Axis Abbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Abbrev</em>' containment reference.
	 * @see #getAxisAbbrev()
	 * @generated
	 */
	void setAxisAbbrev(CodeType value);

	/**
	 * Returns the value of the '<em><b>Axis Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:axisDirection is the direction of this coordinate system axis (or in the case of Cartesian projected coordinates, the direction of this coordinate system axis at the origin).
	 * Within any set of coordinate system axes, only one of each pair of terms may be used. For earth-fixed CRSs, this direction is often approximate and intended to provide a human interpretable meaning to the axis. When a geodetic datum is used, the precise directions of the axes may therefore vary slightly from this approximate direction.
	 * The codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis Direction</em>' containment reference.
	 * @see #setAxisDirection(CodeWithAuthorityType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_AxisDirection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='axisDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getAxisDirection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getAxisDirection <em>Axis Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Direction</em>' containment reference.
	 * @see #getAxisDirection()
	 * @generated
	 */
	void setAxisDirection(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Bag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag</em>' containment reference.
	 * @see #setBag(BagType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Bag()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bag' namespace='##targetNamespace' affiliation='AbstractGML'"
	 * @generated
	 */
	BagType getBag();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBag <em>Bag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bag</em>' containment reference.
	 * @see #getBag()
	 * @generated
	 */
	void setBag(BagType value);

	/**
	 * Returns the value of the '<em><b>Base CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:baseCRS is an association role to the coordinate reference system used by this derived CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base CRS</em>' containment reference.
	 * @see #setBaseCRS(SingleCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BaseCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='baseCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleCRSPropertyType getBaseCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseCRS <em>Base CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base CRS</em>' containment reference.
	 * @see #getBaseCRS()
	 * @generated
	 */
	void setBaseCRS(SingleCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Base Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property baseCurve references or contains the base curve, i.e. it either references the base curve via the XLink-attributes or contains the curve element. A curve element is any element which is substitutable for AbstractCurve. The base curve has positive orientation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Curve</em>' containment reference.
	 * @see #setBaseCurve(CurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BaseCurve()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='baseCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePropertyType getBaseCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseCurve <em>Base Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Curve</em>' containment reference.
	 * @see #getBaseCurve()
	 * @generated
	 */
	void setBaseCurve(CurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Base Geodetic CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:baseGeodeticCRS is an association role to the geodetic coordinate reference system used by this projected CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Geodetic CRS</em>' containment reference.
	 * @see #setBaseGeodeticCRS(GeodeticCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BaseGeodeticCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='baseGeodeticCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	GeodeticCRSPropertyType getBaseGeodeticCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseGeodeticCRS <em>Base Geodetic CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Geodetic CRS</em>' containment reference.
	 * @see #getBaseGeodeticCRS()
	 * @generated
	 */
	void setBaseGeodeticCRS(GeodeticCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Base Geographic CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Geographic CRS</em>' containment reference.
	 * @see #setBaseGeographicCRS(GeographicCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BaseGeographicCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='baseGeographicCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	GeographicCRSPropertyType getBaseGeographicCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseGeographicCRS <em>Base Geographic CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Geographic CRS</em>' containment reference.
	 * @see #getBaseGeographicCRS()
	 * @generated
	 */
	void setBaseGeographicCRS(GeographicCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Base Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property baseSurface references or contains the base surface. The property baseSurface either references the base surface via the XLink-attributes or contains the surface element. A surface element is any element which is substitutable for gml:AbstractSurface. The base surface has positive orientation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Surface</em>' containment reference.
	 * @see #setBaseSurface(SurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BaseSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='baseSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getBaseSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseSurface <em>Base Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Surface</em>' containment reference.
	 * @see #getBaseSurface()
	 * @generated
	 */
	void setBaseSurface(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A base unit is a unit of measure that cannot be derived by combination of other base units within a particular system of units.  For example, in the SI system of units, the base units are metre, kilogram, second, Ampere, Kelvin, mole, and candela, for the physical quantity types length, mass, time interval, electric current, thermodynamic temperature, amount of substance and luminous intensity, respectively.
	 * gml:BaseUnit extends generic gml:UnitDefinition with the property gml:unitsSystem, which carries a reference to the units system to which this base unit is asserted to belong.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Unit</em>' containment reference.
	 * @see #setBaseUnit(BaseUnitType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BaseUnit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BaseUnit' namespace='##targetNamespace' affiliation='UnitDefinition'"
	 * @generated
	 */
	BaseUnitType getBaseUnit();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBaseUnit <em>Base Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit</em>' containment reference.
	 * @see #getBaseUnit()
	 * @generated
	 */
	void setBaseUnit(BaseUnitType value);

	/**
	 * Returns the value of the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:UnitDefinition is a general definition of a unit of measure. This generic element is used only for units for which no relationship with other units or units systems is known.
	 * The content model of gml:UnitDefinition adds three additional properties to gml:Definition, gml:quantityType, gml:quantityTypeReference and gml:catalogSymbol.  
	 * The gml:catalogSymbol property optionally gives the short symbol used for this unit. This element is usually used when the relationship of this unit to other units or units systems is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Definition</em>' containment reference.
	 * @see #setUnitDefinition(UnitDefinitionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UnitDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnitDefinition' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	UnitDefinitionType getUnitDefinition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUnitDefinition <em>Unit Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Definition</em>' containment reference.
	 * @see #getUnitDefinition()
	 * @generated
	 */
	void setUnitDefinition(UnitDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Bezier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezier curves are polynomial splines that use Bezier or Bernstein polynomials for interpolation purposes. It is a special case of the B-Spline curve with two knots.
	 * degree shall be the degree of the polynomial used for interpolation in this spline.
	 * knot shall be the sequence of distinct knots used to define the spline basis functions.
	 * interpolation is fixed as "polynomialSpline".
	 * isPolynomial is fixed as "true".
	 * knotType is not relevant for Bezier curve segments.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezier</em>' containment reference.
	 * @see #setBezier(BezierType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Bezier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bezier' namespace='##targetNamespace' affiliation='BSpline'"
	 * @generated
	 */
	BezierType getBezier();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBezier <em>Bezier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezier</em>' containment reference.
	 * @see #getBezier()
	 * @generated
	 */
	void setBezier(BezierType value);

	/**
	 * Returns the value of the '<em><b>BSpline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A B-Spline is a piecewise parametric polynomial or rational curve described in terms of control points and basis functions as specified in ISO 19107:2003, 6.4.30. Therefore, interpolation may be either "polynomialSpline" or "rationalSpline" depending on the interpolation type; default is "polynomialSpline".
	 * degree shall be the degree of the polynomial used for interpolation in this spline.
	 * knot shall be the sequence of distinct knots used to define the spline basis functions (see ISO 19107:2003, 6.4.26.2).
	 * The attribute isPolynomial shall be set to "true" if this is a polynomial spline (see ISO 19107:2003, 6.4.30.5).
	 * The attribute knotType shall provide the type of knot distribution used in defining this spline (see ISO 19107:2003, 6.4.30.4).
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BSpline</em>' containment reference.
	 * @see #setBSpline(BSplineType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BSpline()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BSpline' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	BSplineType getBSpline();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBSpline <em>BSpline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSpline</em>' containment reference.
	 * @see #getBSpline()
	 * @generated
	 */
	void setBSpline(BSplineType value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' containment reference.
	 * @see #setBoolean(BooleanType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Boolean()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Boolean' namespace='##targetNamespace' affiliation='AbstractScalarValue'"
	 * @generated
	 */
	BooleanType getBoolean();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBoolean <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' containment reference.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(BooleanType value);

	/**
	 * Returns the value of the '<em><b>Boolean List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean List</em>' attribute.
	 * @see #setBooleanList(List)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BooleanList()
	 * @model unique="false" dataType="net.opengis.gml.gml.BooleanOrNilReasonList" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BooleanList' namespace='##targetNamespace' affiliation='AbstractScalarValueList'"
	 * @generated
	 */
	List<Object> getBooleanList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBooleanList <em>Boolean List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean List</em>' attribute.
	 * @see #getBooleanList()
	 * @generated
	 */
	void setBooleanList(List<Object> value);

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:booleanValue is a boolean value of an operation parameter. A Boolean value does not have an associated unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BooleanValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='booleanValue' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBooleanValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#isBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #isBooleanValue()
	 * @generated
	 */
	void setBooleanValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the minimum bounding box or rectangle that encloses the entire feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounded By</em>' containment reference.
	 * @see #setBoundedBy(BoundingShapeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_BoundedBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='boundedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundingShapeType getBoundedBy();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getBoundedBy <em>Bounded By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounded By</em>' containment reference.
	 * @see #getBoundedBy()
	 * @generated
	 */
	void setBoundedBy(BoundingShapeType value);

	/**
	 * Returns the value of the '<em><b>Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS</em>' containment reference.
	 * @see #setCartesianCS(CartesianCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CartesianCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cartesianCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CartesianCSPropertyType getCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCS <em>Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS</em>' containment reference.
	 * @see #getCartesianCS()
	 * @generated
	 */
	void setCartesianCS(CartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cartesian CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS1</em>' containment reference.
	 * @see #setCartesianCS1(CartesianCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CartesianCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cartesianCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CartesianCSPropertyType getCartesianCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCS1 <em>Cartesian CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS1</em>' containment reference.
	 * @see #getCartesianCS1()
	 * @generated
	 */
	void setCartesianCS1(CartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cartesian CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CartesianCS is a 1-, 2-, or 3-dimensional coordinate system. In the 1-dimensional case, it contains a single straight coordinate axis. In the 2- and 3-dimensional cases gives the position of points relative to orthogonal straight axes. In the multi-dimensional case, all axes shall have the same length unit of measure. A CartesianCS shall have one, two, or three gml:axis property elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS2</em>' containment reference.
	 * @see #setCartesianCS2(CartesianCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CartesianCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CartesianCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	CartesianCSType getCartesianCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCS2 <em>Cartesian CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS2</em>' containment reference.
	 * @see #getCartesianCS2()
	 * @generated
	 */
	void setCartesianCS2(CartesianCSType value);

	/**
	 * Returns the value of the '<em><b>Cartesian CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CartesianCS is a 1-, 2-, or 3-dimensional coordinate system. In the 1-dimensional case, it contains a single straight coordinate axis. In the 2- and 3-dimensional cases gives the position of points relative to orthogonal straight axes. In the multi-dimensional case, all axes shall have the same length unit of measure. A CartesianCS shall have one, two, or three gml:axis property elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS3</em>' containment reference.
	 * @see #setCartesianCS3(CartesianCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CartesianCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CartesianCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	CartesianCSType getCartesianCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCS3 <em>Cartesian CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS3</em>' containment reference.
	 * @see #getCartesianCS3()
	 * @generated
	 */
	void setCartesianCS3(CartesianCSType value);

	/**
	 * Returns the value of the '<em><b>Cartesian CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian CS Ref</em>' containment reference.
	 * @see #setCartesianCSRef(CartesianCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CartesianCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cartesianCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CartesianCSPropertyType getCartesianCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCartesianCSRef <em>Cartesian CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS Ref</em>' containment reference.
	 * @see #getCartesianCSRef()
	 * @generated
	 */
	void setCartesianCSRef(CartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Catalog Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The catalogSymbol is the preferred lexical symbol used for this unit of measure.
	 * The codeSpace attribute in gml:CodeType identifies a namespace for the catalog symbol value, and might reference the external catalog. The string value in gml:CodeType contains the value of a symbol that should be unique within this catalog namespace. This symbol often appears explicitly in the catalog, but it could be a combination of symbols using a specified algebra of units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog Symbol</em>' containment reference.
	 * @see #setCatalogSymbol(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CatalogSymbol()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='catalogSymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getCatalogSymbol();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCatalogSymbol <em>Catalog Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Symbol</em>' containment reference.
	 * @see #getCatalogSymbol()
	 * @generated
	 */
	void setCatalogSymbol(CodeType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:Category has an optional XML attribute codeSpace, whose value is a URI which identifies a dictionary, codelist or authority for the term.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CategoryType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Category()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Category' namespace='##targetNamespace' affiliation='AbstractScalarValue'"
	 * @generated
	 */
	CategoryType getCategory();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CategoryType value);

	/**
	 * Returns the value of the '<em><b>Category Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Extent</em>' containment reference.
	 * @see #setCategoryExtent(CategoryExtentType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CategoryExtent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CategoryExtent' namespace='##targetNamespace' affiliation='AbstractValue'"
	 * @generated
	 */
	CategoryExtentType getCategoryExtent();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCategoryExtent <em>Category Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Extent</em>' containment reference.
	 * @see #getCategoryExtent()
	 * @generated
	 */
	void setCategoryExtent(CategoryExtentType value);

	/**
	 * Returns the value of the '<em><b>Category List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category List</em>' containment reference.
	 * @see #setCategoryList(CodeOrNilReasonListType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CategoryList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CategoryList' namespace='##targetNamespace' affiliation='AbstractScalarValueList'"
	 * @generated
	 */
	CodeOrNilReasonListType getCategoryList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCategoryList <em>Category List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category List</em>' containment reference.
	 * @see #getCategoryList()
	 * @generated
	 */
	void setCategoryList(CodeOrNilReasonListType value);

	/**
	 * Returns the value of the '<em><b>Center Line Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Line Of</em>' containment reference.
	 * @see #setCenterLineOf(CurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CenterLineOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='centerLineOf' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePropertyType getCenterLineOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCenterLineOf <em>Center Line Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Line Of</em>' containment reference.
	 * @see #getCenterLineOf()
	 * @generated
	 */
	void setCenterLineOf(CurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Center Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Of</em>' containment reference.
	 * @see #setCenterOf(PointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CenterOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='centerOf' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getCenterOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCenterOf <em>Center Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Of</em>' containment reference.
	 * @see #getCenterOf()
	 * @generated
	 */
	void setCenterOf(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Circle is an arc whose ends coincide to form a simple closed loop. The three control points shall be distinct non-co-linear points for the circle to be unambiguously defined. The arc is simply extended past the third control point until the first control point is encountered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circle</em>' containment reference.
	 * @see #setCircle(CircleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Circle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Circle' namespace='##targetNamespace' affiliation='Arc'"
	 * @generated
	 */
	CircleType getCircle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCircle <em>Circle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circle</em>' containment reference.
	 * @see #getCircle()
	 * @generated
	 */
	void setCircle(CircleType value);

	/**
	 * Returns the value of the '<em><b>Circle By Center Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:CircleByCenterPoint is an gml:ArcByCenterPoint with identical start and end angle to form a full circle. Again, this representation can be used only in 2D.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circle By Center Point</em>' containment reference.
	 * @see #setCircleByCenterPoint(CircleByCenterPointType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CircleByCenterPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CircleByCenterPoint' namespace='##targetNamespace' affiliation='ArcByCenterPoint'"
	 * @generated
	 */
	CircleByCenterPointType getCircleByCenterPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCircleByCenterPoint <em>Circle By Center Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circle By Center Point</em>' containment reference.
	 * @see #getCircleByCenterPoint()
	 * @generated
	 */
	void setCircleByCenterPoint(CircleByCenterPointType value);

	/**
	 * Returns the value of the '<em><b>Clothoid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A clothoid, or Cornu's spiral, is plane curve whose curvature is a fixed function of its length.
	 * refLocation, startParameter, endParameter and scaleFactor have the same meaning as specified in ISO 19107:2003, 6.4.22.
	 * interpolation is fixed as "clothoid".
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clothoid</em>' containment reference.
	 * @see #setClothoid(ClothoidType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Clothoid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Clothoid' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	ClothoidType getClothoid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getClothoid <em>Clothoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clothoid</em>' containment reference.
	 * @see #getClothoid()
	 * @generated
	 */
	void setClothoid(ClothoidType value);

	/**
	 * Returns the value of the '<em><b>Component Reference System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:componentReferenceSystem elements are an ordered sequence of associations to all the component coordinate reference systems included in this compound coordinate reference system. The gml:AggregationAttributeGroup should be used to specify that the gml:componentReferenceSystem properties are ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Reference System</em>' containment reference.
	 * @see #setComponentReferenceSystem(SingleCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ComponentReferenceSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentReferenceSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleCRSPropertyType getComponentReferenceSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getComponentReferenceSystem <em>Component Reference System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Reference System</em>' containment reference.
	 * @see #getComponentReferenceSystem()
	 * @generated
	 */
	void setComponentReferenceSystem(SingleCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Composite Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:CompositeCurve is represented by a sequence of (orientable) curves such that each curve in the sequence terminates at the start point of the subsequent curve in the list. 
	 * curveMember references or contains inline one curve in the composite curve. 
	 * The curves are contiguous, the collection of curves is ordered. Therefore, if provided, the aggregationType attribute shall have the value "sequence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Curve</em>' containment reference.
	 * @see #setCompositeCurve(CompositeCurveType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CompositeCurve()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompositeCurve' namespace='##targetNamespace' affiliation='AbstractCurve'"
	 * @generated
	 */
	CompositeCurveType getCompositeCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCompositeCurve <em>Composite Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Curve</em>' containment reference.
	 * @see #getCompositeCurve()
	 * @generated
	 */
	void setCompositeCurve(CompositeCurveType value);

	/**
	 * Returns the value of the '<em><b>Composite Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CompositeSolid implements ISO 19107 GM_CompositeSolid (see ISO 19107:2003, 6.6.7) as specified in D.2.3.6. 
	 * A gml:CompositeSolid is represented by a set of orientable surfaces. It is a geometry type with all the geometric properties of a (primitive) solid. Essentially, a composite solid is a collection of solids that join in pairs on common boundary surfaces and which, when considered as a whole, form a single solid. 
	 * solidMember references or contains one solid in the composite solid. The solids are contiguous.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Solid</em>' containment reference.
	 * @see #setCompositeSolid(CompositeSolidType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CompositeSolid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompositeSolid' namespace='##targetNamespace' affiliation='AbstractSolid'"
	 * @generated
	 */
	CompositeSolidType getCompositeSolid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCompositeSolid <em>Composite Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Solid</em>' containment reference.
	 * @see #getCompositeSolid()
	 * @generated
	 */
	void setCompositeSolid(CompositeSolidType value);

	/**
	 * Returns the value of the '<em><b>Composite Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:CompositeSurface is represented by a set of orientable surfaces. It is geometry type with all the geometric properties of a (primitive) surface. Essentially, a composite surface is a collection of surfaces that join in pairs on common boundary curves and which, when considered as a whole, form a single surface.
	 * surfaceMember references or contains inline one surface in the composite surface. 
	 * The surfaces are contiguous.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Surface</em>' containment reference.
	 * @see #setCompositeSurface(CompositeSurfaceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CompositeSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompositeSurface' namespace='##targetNamespace' affiliation='AbstractSurface'"
	 * @generated
	 */
	CompositeSurfaceType getCompositeSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCompositeSurface <em>Composite Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Surface</em>' containment reference.
	 * @see #getCompositeSurface()
	 * @generated
	 */
	void setCompositeSurface(CompositeSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CompositeValue is an aggregate value built from other values . It contains zero or an arbitrary number of gml:valueComponent elements, and zero or one gml:valueComponents property elements.  It may be used for strongly coupled aggregates (vectors, tensors) or for arbitrary collections of values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Value</em>' containment reference.
	 * @see #setCompositeValue(CompositeValueType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CompositeValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompositeValue' namespace='##targetNamespace' affiliation='AbstractValue'"
	 * @generated
	 */
	CompositeValueType getCompositeValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCompositeValue <em>Composite Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Value</em>' containment reference.
	 * @see #getCompositeValue()
	 * @generated
	 */
	void setCompositeValue(CompositeValueType value);

	/**
	 * Returns the value of the '<em><b>Compound CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CompundCRS is a coordinate reference system describing the position of points through two or more independent coordinate reference systems. It is associated with a non-repeating sequence of two or more instances of SingleCRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound CRS</em>' containment reference.
	 * @see #setCompoundCRS(CompoundCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CompoundCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompoundCRS' namespace='##targetNamespace' affiliation='AbstractCRS'"
	 * @generated
	 */
	CompoundCRSType getCompoundCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCompoundCRS <em>Compound CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound CRS</em>' containment reference.
	 * @see #getCompoundCRS()
	 * @generated
	 */
	void setCompoundCRS(CompoundCRSType value);

	/**
	 * Returns the value of the '<em><b>Compound CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound CRS Ref</em>' containment reference.
	 * @see #setCompoundCRSRef(CompoundCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CompoundCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='compoundCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundCRSPropertyType getCompoundCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCompoundCRSRef <em>Compound CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound CRS Ref</em>' containment reference.
	 * @see #getCompoundCRSRef()
	 * @generated
	 */
	void setCompoundCRSRef(CompoundCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Concatenated Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concatenated Operation</em>' containment reference.
	 * @see #setConcatenatedOperation(ConcatenatedOperationType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ConcatenatedOperation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConcatenatedOperation' namespace='##targetNamespace' affiliation='AbstractCoordinateOperation'"
	 * @generated
	 */
	ConcatenatedOperationType getConcatenatedOperation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConcatenatedOperation <em>Concatenated Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concatenated Operation</em>' containment reference.
	 * @see #getConcatenatedOperation()
	 * @generated
	 */
	void setConcatenatedOperation(ConcatenatedOperationType value);

	/**
	 * Returns the value of the '<em><b>Concatenated Operation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concatenated Operation Ref</em>' containment reference.
	 * @see #setConcatenatedOperationRef(ConcatenatedOperationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ConcatenatedOperationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='concatenatedOperationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ConcatenatedOperationPropertyType getConcatenatedOperationRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConcatenatedOperationRef <em>Concatenated Operation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concatenated Operation Ref</em>' containment reference.
	 * @see #getConcatenatedOperationRef()
	 * @generated
	 */
	void setConcatenatedOperationRef(ConcatenatedOperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cone</em>' containment reference.
	 * @see #setCone(ConeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Cone()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Cone' namespace='##targetNamespace' affiliation='AbstractGriddedSurface'"
	 * @generated
	 */
	ConeType getCone();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCone <em>Cone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cone</em>' containment reference.
	 * @see #getCone()
	 * @generated
	 */
	void setCone(ConeType value);

	/**
	 * Returns the value of the '<em><b>Conventional Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conventional units that are neither base units nor defined by direct combination of base units are used in many application domains.  For example electronVolt for energy, feet and nautical miles for length.  In most cases there is a known, usually linear, conversion to a preferred unit which is either a base unit or derived by direct combination of base units.
	 * The gml:ConventionalUnit extends gml:UnitDefinition with a property that describes a conversion to a preferred unit for this physical quantity.  When the conversion is exact, the element gml:conversionToPreferredUnit should be used, or when the conversion is not exact the element gml:roughConversionToPreferredUnit is available. Both of these elements have the same content model.  The gml:derivationUnitTerm property defined above is included to allow a user to optionally record how this unit may be derived from other ("more primitive") units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conventional Unit</em>' containment reference.
	 * @see #setConventionalUnit(ConventionalUnitType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ConventionalUnit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConventionalUnit' namespace='##targetNamespace' affiliation='UnitDefinition'"
	 * @generated
	 */
	ConventionalUnitType getConventionalUnit();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConventionalUnit <em>Conventional Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conventional Unit</em>' containment reference.
	 * @see #getConventionalUnit()
	 * @generated
	 */
	void setConventionalUnit(ConventionalUnitType value);

	/**
	 * Returns the value of the '<em><b>Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:conversion is an association role to the coordinate conversion used to define the derived CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion</em>' containment reference.
	 * @see #setConversion(GeneralConversionPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Conversion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conversion' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralConversionPropertyType getConversion();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConversion <em>Conversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion</em>' containment reference.
	 * @see #getConversion()
	 * @generated
	 */
	void setConversion(GeneralConversionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Conversion1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:conversion is an association role to the coordinate conversion used to define the derived CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion1</em>' containment reference.
	 * @see #setConversion1(GeneralConversionPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Conversion1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conversion' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralConversionPropertyType getConversion1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConversion1 <em>Conversion1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion1</em>' containment reference.
	 * @see #getConversion1()
	 * @generated
	 */
	void setConversion1(GeneralConversionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Conversion2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:Conversion is a concrete operation on coordinates that does not include any change of Datum. The best-known example of a coordinate conversion is a map projection. The parameters describing coordinate conversions are defined rather than empirically derived. Note that some conversions have no parameters.
	 * This concrete complex type can be used without using a GML Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one Conversion instance.
	 * The usesValue property elements are an unordered list of composition associations to the set of parameter values used by this conversion operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion2</em>' containment reference.
	 * @see #setConversion2(ConversionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Conversion2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Conversion' namespace='##targetNamespace' affiliation='AbstractGeneralConversion'"
	 * @generated
	 */
	ConversionType getConversion2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConversion2 <em>Conversion2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion2</em>' containment reference.
	 * @see #getConversion2()
	 * @generated
	 */
	void setConversion2(ConversionType value);

	/**
	 * Returns the value of the '<em><b>Conversion3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:Conversion is a concrete operation on coordinates that does not include any change of Datum. The best-known example of a coordinate conversion is a map projection. The parameters describing coordinate conversions are defined rather than empirically derived. Note that some conversions have no parameters.
	 * This concrete complex type can be used without using a GML Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one Conversion instance.
	 * The usesValue property elements are an unordered list of composition associations to the set of parameter values used by this conversion operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion3</em>' containment reference.
	 * @see #setConversion3(ConversionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Conversion3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Conversion' namespace='##targetNamespace' affiliation='AbstractGeneralConversion'"
	 * @generated
	 */
	ConversionType getConversion3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConversion3 <em>Conversion3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion3</em>' containment reference.
	 * @see #getConversion3()
	 * @generated
	 */
	void setConversion3(ConversionType value);

	/**
	 * Returns the value of the '<em><b>Conversion Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Ref</em>' containment reference.
	 * @see #setConversionRef(ConversionPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ConversionRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conversionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ConversionPropertyType getConversionRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConversionRef <em>Conversion Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Ref</em>' containment reference.
	 * @see #getConversionRef()
	 * @generated
	 */
	void setConversionRef(ConversionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Conversion To Preferred Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements gml:conversionToPreferredUnit and gml:roughConversionToPreferredUnit represent parameters used to convert conventional units to preferred units for this physical quantity type.  A preferred unit is either a Base Unit or a Derived Unit that is selected for all values of one physical quantity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion To Preferred Unit</em>' containment reference.
	 * @see #setConversionToPreferredUnit(ConversionToPreferredUnitType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ConversionToPreferredUnit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conversionToPreferredUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ConversionToPreferredUnitType getConversionToPreferredUnit();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getConversionToPreferredUnit <em>Conversion To Preferred Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion To Preferred Unit</em>' containment reference.
	 * @see #getConversionToPreferredUnit()
	 * @generated
	 */
	void setConversionToPreferredUnit(ConversionToPreferredUnitType value);

	/**
	 * Returns the value of the '<em><b>Coordinate Operation Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:coordinateOperationAccuracy is an association role to a DQ_PositionalAccuracy object as encoded in ISO/TS 19139, either referencing or containing the definition of that positional accuracy. That object contains an estimate of the impact of this coordinate operation on point accuracy. That is, it gives position error estimates for the target coordinates of this coordinate operation, assuming no errors in the source coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate Operation Accuracy</em>' containment reference.
	 * @see #setCoordinateOperationAccuracy(CoordinateOperationAccuracyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoordinateOperationAccuracy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinateOperationAccuracy' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateOperationAccuracyType getCoordinateOperationAccuracy();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateOperationAccuracy <em>Coordinate Operation Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Operation Accuracy</em>' containment reference.
	 * @see #getCoordinateOperationAccuracy()
	 * @generated
	 */
	void setCoordinateOperationAccuracy(CoordinateOperationAccuracyType value);

	/**
	 * Returns the value of the '<em><b>Coordinate Operation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Operation Ref</em>' containment reference.
	 * @see #setCoordinateOperationRef(CoordinateOperationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoordinateOperationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinateOperationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateOperationPropertyType getCoordinateOperationRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateOperationRef <em>Coordinate Operation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Operation Ref</em>' containment reference.
	 * @see #getCoordinateOperationRef()
	 * @generated
	 */
	void setCoordinateOperationRef(CoordinateOperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(CoordinatesType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Coordinates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association role to the coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System</em>' containment reference.
	 * @see #setCoordinateSystem(CoordinateSystemPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoordinateSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinateSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateSystemPropertyType getCoordinateSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateSystem <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' containment reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(CoordinateSystemPropertyType value);

	/**
	 * Returns the value of the '<em><b>Coordinate System Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CoordinateSystemAxis is a definition of a coordinate system axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System Axis</em>' containment reference.
	 * @see #setCoordinateSystemAxis(CoordinateSystemAxisType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoordinateSystemAxis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CoordinateSystemAxis' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	CoordinateSystemAxisType getCoordinateSystemAxis();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateSystemAxis <em>Coordinate System Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System Axis</em>' containment reference.
	 * @see #getCoordinateSystemAxis()
	 * @generated
	 */
	void setCoordinateSystemAxis(CoordinateSystemAxisType value);

	/**
	 * Returns the value of the '<em><b>Coordinate System Axis Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate System Axis Ref</em>' containment reference.
	 * @see #setCoordinateSystemAxisRef(CoordinateSystemAxisPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoordinateSystemAxisRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinateSystemAxisRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateSystemAxisPropertyType getCoordinateSystemAxisRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateSystemAxisRef <em>Coordinate System Axis Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System Axis Ref</em>' containment reference.
	 * @see #getCoordinateSystemAxisRef()
	 * @generated
	 */
	void setCoordinateSystemAxisRef(CoordinateSystemAxisPropertyType value);

	/**
	 * Returns the value of the '<em><b>Coordinate System Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate System Ref</em>' containment reference.
	 * @see #setCoordinateSystemRef(CoordinateSystemPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoordinateSystemRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinateSystemRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateSystemPropertyType getCoordinateSystemRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordinateSystemRef <em>Coordinate System Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System Ref</em>' containment reference.
	 * @see #getCoordinateSystemRef()
	 * @generated
	 */
	void setCoordinateSystemRef(CoordinateSystemPropertyType value);

	/**
	 * Returns the value of the '<em><b>Coord Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:coordOperation is an association role to a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coord Operation</em>' containment reference.
	 * @see #setCoordOperation(CoordinateOperationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoordOperation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateOperationPropertyType getCoordOperation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoordOperation <em>Coord Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Operation</em>' containment reference.
	 * @see #getCoordOperation()
	 * @generated
	 */
	void setCoordOperation(CoordinateOperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(CountType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Count()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Count' namespace='##targetNamespace' affiliation='AbstractScalarValue'"
	 * @generated
	 */
	CountType getCount();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(CountType value);

	/**
	 * Returns the value of the '<em><b>Count Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Extent</em>' attribute.
	 * @see #setCountExtent(List)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CountExtent()
	 * @model unique="false" dataType="net.opengis.gml.gml.CountExtentType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CountExtent' namespace='##targetNamespace' affiliation='AbstractValue'"
	 * @generated
	 */
	List<Object> getCountExtent();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCountExtent <em>Count Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Extent</em>' attribute.
	 * @see #getCountExtent()
	 * @generated
	 */
	void setCountExtent(List<Object> value);

	/**
	 * Returns the value of the '<em><b>Count List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count List</em>' attribute.
	 * @see #setCountList(List)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CountList()
	 * @model unique="false" dataType="net.opengis.gml.gml.IntegerOrNilReasonList" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CountList' namespace='##targetNamespace' affiliation='AbstractScalarValueList'"
	 * @generated
	 */
	List<Object> getCountList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCountList <em>Count List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count List</em>' attribute.
	 * @see #getCountList()
	 * @generated
	 */
	void setCountList(List<Object> value);

	/**
	 * Returns the value of the '<em><b>Coverage Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:coverageFunction property describes the mapping function from the domain to the range of the coverage.
	 * The value of the CoverageFunction is one of gml:CoverageMappingRule and gml:GridFunction.
	 * If the gml:coverageFunction property is omitted for a gridded coverage (including rectified gridded coverages) the gml:startPoint is assumed to be the value of the gml:low property in the gml:Grid geometry, and the gml:sequenceRule is assumed to be linear and the gml:axisOrder property is assumed to be "+1 +2".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Function</em>' containment reference.
	 * @see #setCoverageFunction(CoverageFunctionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoverageFunction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coverageFunction' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	CoverageFunctionType getCoverageFunction();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoverageFunction <em>Coverage Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Function</em>' containment reference.
	 * @see #getCoverageFunction()
	 * @generated
	 */
	void setCoverageFunction(CoverageFunctionType value);

	/**
	 * Returns the value of the '<em><b>Coverage Mapping Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CoverageMappingRule provides a formal or informal description of the coverage function.
	 * The mapping rule may be defined as an in-line string (gml:ruleDefinition) or via a remote reference through xlink:href (gml:ruleReference).  
	 * If no rule name is specified, the default is 'Linear' with respect to members of the domain in document order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Mapping Rule</em>' containment reference.
	 * @see #setCoverageMappingRule(MappingRuleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CoverageMappingRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CoverageMappingRule' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	MappingRuleType getCoverageMappingRule();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCoverageMappingRule <em>Coverage Mapping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Mapping Rule</em>' containment reference.
	 * @see #getCoverageMappingRule()
	 * @generated
	 */
	void setCoverageMappingRule(MappingRuleType value);

	/**
	 * Returns the value of the '<em><b>Crs Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crs Ref</em>' containment reference.
	 * @see #setCrsRef(CRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CrsRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crsRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CRSPropertyType getCrsRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCrsRef <em>Crs Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crs Ref</em>' containment reference.
	 * @see #getCrsRef()
	 * @generated
	 */
	void setCrsRef(CRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cubic Spline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of control points shall be at least three.
	 * vectorAtStart is the unit tangent vector at the start point of the spline. vectorAtEnd is the unit tangent vector at the end point of the spline. Only the direction of the vectors shall be used to determine the shape of the cubic spline, not their length.
	 * interpolation is fixed as "cubicSpline".
	 * degree shall be the degree of the polynomial used for the interpolation in this spline. Therefore the degree for a cubic spline is fixed to "3".
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cubic Spline</em>' containment reference.
	 * @see #setCubicSpline(CubicSplineType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CubicSpline()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CubicSpline' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	CubicSplineType getCubicSpline();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCubicSpline <em>Cubic Spline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cubic Spline</em>' containment reference.
	 * @see #getCubicSpline()
	 * @generated
	 */
	void setCubicSpline(CubicSplineType value);

	/**
	 * Returns the value of the '<em><b>Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A curve is a 1-dimensional primitive. Curves are continuous, connected, and have a measurable length in terms of the coordinate system. 
	 * A curve is composed of one or more curve segments. Each curve segment within a curve may be defined using a different interpolation method. The curve segments are connected to one another, with the end point of each segment except the last being the start point of the next segment in the segment list.
	 * The orientation of the curve is positive.
	 * The element segments encapsulates the segments of the curve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve</em>' containment reference.
	 * @see #setCurve(CurveType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Curve()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Curve' namespace='##targetNamespace' affiliation='AbstractCurve'"
	 * @generated
	 */
	CurveType getCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCurve <em>Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' containment reference.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(CurveType value);

	/**
	 * Returns the value of the '<em><b>Curve Array Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Array Property</em>' containment reference.
	 * @see #setCurveArrayProperty(CurveArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CurveArrayProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='curveArrayProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveArrayPropertyType getCurveArrayProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCurveArrayProperty <em>Curve Array Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Array Property</em>' containment reference.
	 * @see #getCurveArrayProperty()
	 * @generated
	 */
	void setCurveArrayProperty(CurveArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Curve Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Member</em>' containment reference.
	 * @see #setCurveMember(CurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CurveMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='curveMember' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePropertyType getCurveMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCurveMember <em>Curve Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Member</em>' containment reference.
	 * @see #getCurveMember()
	 * @generated
	 */
	void setCurveMember(CurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Curve Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of curves. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Members</em>' containment reference.
	 * @see #setCurveMembers(CurveArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CurveMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='curveMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveArrayPropertyType getCurveMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCurveMembers <em>Curve Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Members</em>' containment reference.
	 * @see #getCurveMembers()
	 * @generated
	 */
	void setCurveMembers(CurveArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Curve Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a curve via the XLink-attributes or contains the curve element. curveProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractCurve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Property</em>' containment reference.
	 * @see #setCurveProperty(CurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CurveProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='curveProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePropertyType getCurveProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCurveProperty <em>Curve Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Property</em>' containment reference.
	 * @see #getCurveProperty()
	 * @generated
	 */
	void setCurveProperty(CurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinder</em>' containment reference.
	 * @see #setCylinder(CylinderType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Cylinder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Cylinder' namespace='##targetNamespace' affiliation='AbstractGriddedSurface'"
	 * @generated
	 */
	CylinderType getCylinder();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCylinder <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinder</em>' containment reference.
	 * @see #getCylinder()
	 * @generated
	 */
	void setCylinder(CylinderType value);

	/**
	 * Returns the value of the '<em><b>Cylindrical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cylindricalCS is an association role to the cylindrical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cylindrical CS</em>' containment reference.
	 * @see #setCylindricalCS(CylindricalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CylindricalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cylindricalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CylindricalCSPropertyType getCylindricalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCS <em>Cylindrical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylindrical CS</em>' containment reference.
	 * @see #getCylindricalCS()
	 * @generated
	 */
	void setCylindricalCS(CylindricalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cylindrical CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cylindricalCS is an association role to the cylindrical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cylindrical CS1</em>' containment reference.
	 * @see #setCylindricalCS1(CylindricalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CylindricalCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cylindricalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CylindricalCSPropertyType getCylindricalCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCS1 <em>Cylindrical CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylindrical CS1</em>' containment reference.
	 * @see #getCylindricalCS1()
	 * @generated
	 */
	void setCylindricalCS1(CylindricalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cylindrical CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CylindricalCS is a three-dimensional coordinate system consisting of a polar coordinate system extended by a straight coordinate axis perpendicular to the plane spanned by the polar coordinate system. A CylindricalCS shall have three gml:axis property elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cylindrical CS2</em>' containment reference.
	 * @see #setCylindricalCS2(CylindricalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CylindricalCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CylindricalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	CylindricalCSType getCylindricalCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCS2 <em>Cylindrical CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylindrical CS2</em>' containment reference.
	 * @see #getCylindricalCS2()
	 * @generated
	 */
	void setCylindricalCS2(CylindricalCSType value);

	/**
	 * Returns the value of the '<em><b>Cylindrical CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CylindricalCS is a three-dimensional coordinate system consisting of a polar coordinate system extended by a straight coordinate axis perpendicular to the plane spanned by the polar coordinate system. A CylindricalCS shall have three gml:axis property elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cylindrical CS3</em>' containment reference.
	 * @see #setCylindricalCS3(CylindricalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CylindricalCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CylindricalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	CylindricalCSType getCylindricalCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCS3 <em>Cylindrical CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylindrical CS3</em>' containment reference.
	 * @see #getCylindricalCS3()
	 * @generated
	 */
	void setCylindricalCS3(CylindricalCSType value);

	/**
	 * Returns the value of the '<em><b>Cylindrical CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylindrical CS Ref</em>' containment reference.
	 * @see #setCylindricalCSRef(CylindricalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_CylindricalCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cylindricalCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CylindricalCSPropertyType getCylindricalCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getCylindricalCSRef <em>Cylindrical CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylindrical CS Ref</em>' containment reference.
	 * @see #getCylindricalCSRef()
	 * @generated
	 */
	void setCylindricalCSRef(CylindricalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Data Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:DataBlock describes the Range as a block of text encoded values similar to a Common Separated Value (CSV) representation.
	 * The range set parameterization is described by the property gml:rangeParameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Block</em>' containment reference.
	 * @see #setDataBlock(DataBlockType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DataBlock()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataBlock' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	DataBlockType getDataBlock();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDataBlock <em>Data Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Block</em>' containment reference.
	 * @see #getDataBlock()
	 * @generated
	 */
	void setDataBlock(DataBlockType value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence is represented by a simple gml:dataSource or gml:dataSourceReference property that indicates the source of the temporal data. The remote link attributes of the gml:dataSource element have been deprecated along with its current type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DataSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataSource' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getDataSource();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Data Source Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence is represented by a simple gml:dataSource or gml:dataSourceReference property that indicates the source of the temporal data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Source Reference</em>' containment reference.
	 * @see #setDataSourceReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DataSourceReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataSourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDataSourceReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDataSourceReference <em>Data Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Reference</em>' containment reference.
	 * @see #getDataSourceReference()
	 * @generated
	 */
	void setDataSourceReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Datum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datum Ref</em>' containment reference.
	 * @see #setDatumRef(DatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DatumRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='datumRef' namespace='##targetNamespace'"
	 * @generated
	 */
	DatumPropertyType getDatumRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDatumRef <em>Datum Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Ref</em>' containment reference.
	 * @see #getDatumRef()
	 * @generated
	 */
	void setDatumRef(DatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Decimal Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Minutes</em>' attribute.
	 * @see #setDecimalMinutes(BigDecimal)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DecimalMinutes()
	 * @model unique="false" dataType="net.opengis.gml.gml.DecimalMinutesType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decimalMinutes' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDecimalMinutes();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDecimalMinutes <em>Decimal Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Minutes</em>' attribute.
	 * @see #getDecimalMinutes()
	 * @generated
	 */
	void setDecimalMinutes(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Default Code Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Code Space</em>' attribute.
	 * @see #setDefaultCodeSpace(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DefaultCodeSpace()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='defaultCodeSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultCodeSpace();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDefaultCodeSpace <em>Default Code Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Code Space</em>' attribute.
	 * @see #getDefaultCodeSpace()
	 * @generated
	 */
	void setDefaultCodeSpace(String value);

	/**
	 * Returns the value of the '<em><b>Defined By Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By Conversion</em>' containment reference.
	 * @see #setDefinedByConversion(GeneralConversionPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DefinedByConversion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='definedByConversion' namespace='##targetNamespace' affiliation='conversion'"
	 * @generated
	 */
	GeneralConversionPropertyType getDefinedByConversion();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinedByConversion <em>Defined By Conversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By Conversion</em>' containment reference.
	 * @see #getDefinedByConversion()
	 * @generated
	 */
	void setDefinedByConversion(GeneralConversionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Definition Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Collection</em>' containment reference.
	 * @see #setDefinitionCollection(DictionaryType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DefinitionCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DefinitionCollection' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	DictionaryType getDefinitionCollection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinitionCollection <em>Definition Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Collection</em>' containment reference.
	 * @see #getDefinitionCollection()
	 * @generated
	 */
	void setDefinitionCollection(DictionaryType value);

	/**
	 * Returns the value of the '<em><b>Definition Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Member</em>' containment reference.
	 * @see #setDefinitionMember(DictionaryEntryType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DefinitionMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='definitionMember' namespace='##targetNamespace' affiliation='dictionaryEntry'"
	 * @generated
	 */
	DictionaryEntryType getDefinitionMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinitionMember <em>Definition Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Member</em>' containment reference.
	 * @see #getDefinitionMember()
	 * @generated
	 */
	void setDefinitionMember(DictionaryEntryType value);

	/**
	 * Returns the value of the '<em><b>Dictionary Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains or refers to the definitions which are members of a dictionary. 
	 * The content model follows the standard GML property pattern, so a gml:dictionaryEntry may either contain or refer to a single gml:Definition. Since gml:Dictionary is substitutable for gml:Definition, the content of an entry may itself be a lower level dictionary. 
	 * Note that if the value is provided by reference, this definition does not carry a handle (gml:id) in this context, so does not allow external references to this specific definition in this context.  When used in this way the referenced definition will usually be in a dictionary in the same XML document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dictionary Entry</em>' containment reference.
	 * @see #setDictionaryEntry(DictionaryEntryType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DictionaryEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dictionaryEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	DictionaryEntryType getDictionaryEntry();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDictionaryEntry <em>Dictionary Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Entry</em>' containment reference.
	 * @see #getDictionaryEntry()
	 * @generated
	 */
	void setDictionaryEntry(DictionaryEntryType value);

	/**
	 * Returns the value of the '<em><b>Definition Proxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Proxy</em>' containment reference.
	 * @see #setDefinitionProxy(DefinitionProxyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DefinitionProxy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DefinitionProxy' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	DefinitionProxyType getDefinitionProxy();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinitionProxy <em>Definition Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Proxy</em>' containment reference.
	 * @see #getDefinitionProxy()
	 * @generated
	 */
	void setDefinitionProxy(DefinitionProxyType value);

	/**
	 * Returns the value of the '<em><b>Definition Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Ref</em>' containment reference.
	 * @see #setDefinitionRef(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DefinitionRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='definitionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDefinitionRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDefinitionRef <em>Definition Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Ref</em>' containment reference.
	 * @see #getDefinitionRef()
	 * @generated
	 */
	void setDefinitionRef(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference.
	 * @see #setDegrees(DegreesType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Degrees()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='degrees' namespace='##targetNamespace'"
	 * @generated
	 */
	DegreesType getDegrees();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDegrees <em>Degrees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' containment reference.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(DegreesType value);

	/**
	 * Returns the value of the '<em><b>Derivation Unit Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of gml:derivationUnitTerm elements describes a derived unit of measure.  Each element carries an integer exponent.  The terms are combined by raising each referenced unit to the power of its exponent and forming the product.
	 * This unit term references another unit of measure (uom) and provides an integer exponent applied to that unit in defining the compound unit. The exponent may be positive or negative, but not zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Unit Term</em>' containment reference.
	 * @see #setDerivationUnitTerm(DerivationUnitTermType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DerivationUnitTerm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='derivationUnitTerm' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivationUnitTermType getDerivationUnitTerm();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivationUnitTerm <em>Derivation Unit Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Unit Term</em>' containment reference.
	 * @see #getDerivationUnitTerm()
	 * @generated
	 */
	void setDerivationUnitTerm(DerivationUnitTermType value);

	/**
	 * Returns the value of the '<em><b>Derived CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:DerivedCRS is a single coordinate reference system that is defined by its coordinate conversion from another single coordinate reference system known as the base CRS. The base CRS can be a projected coordinate reference system, if this DerivedCRS is used for a georectified grid coverage as described in ISO 19123, Clause 8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived CRS</em>' containment reference.
	 * @see #setDerivedCRS(DerivedCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DerivedCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DerivedCRS' namespace='##targetNamespace' affiliation='AbstractGeneralDerivedCRS'"
	 * @generated
	 */
	DerivedCRSType getDerivedCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivedCRS <em>Derived CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived CRS</em>' containment reference.
	 * @see #getDerivedCRS()
	 * @generated
	 */
	void setDerivedCRS(DerivedCRSType value);

	/**
	 * Returns the value of the '<em><b>Derived CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived CRS Ref</em>' containment reference.
	 * @see #setDerivedCRSRef(DerivedCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DerivedCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='derivedCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivedCRSPropertyType getDerivedCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivedCRSRef <em>Derived CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived CRS Ref</em>' containment reference.
	 * @see #getDerivedCRSRef()
	 * @generated
	 */
	void setDerivedCRSRef(DerivedCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Derived CRS Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:derivedCRSType property describes the type of a derived coordinate reference system. The required codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived CRS Type</em>' containment reference.
	 * @see #setDerivedCRSType(CodeWithAuthorityType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DerivedCRSType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='derivedCRSType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getDerivedCRSType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivedCRSType <em>Derived CRS Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived CRS Type</em>' containment reference.
	 * @see #getDerivedCRSType()
	 * @generated
	 */
	void setDerivedCRSType(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Derived Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived units are defined by combination of other units.  Derived units are used for quantities other than those corresponding to the base units, such as hertz (s-1) for frequency, Newton (kg.m/s2) for force.  Derived units based directly on base units are usually preferred for quantities other than the fundamental quantities within a system. If a derived unit is not the preferred unit, the gml:ConventionalUnit element should be used instead.
	 * The gml:DerivedUnit extends gml:UnitDefinition with the property gml:derivationUnitTerms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Unit</em>' containment reference.
	 * @see #setDerivedUnit(DerivedUnitType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DerivedUnit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DerivedUnit' namespace='##targetNamespace' affiliation='UnitDefinition'"
	 * @generated
	 */
	DerivedUnitType getDerivedUnit();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDerivedUnit <em>Derived Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Unit</em>' containment reference.
	 * @see #getDerivedUnit()
	 * @generated
	 */
	void setDerivedUnit(DerivedUnitType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property is a text description of the object. gml:description uses gml:StringOrRefType as its content model, so it may contain a simple text string content, or carry a reference to an external description. The use of gml:description to reference an external description has been deprecated and replaced by the gml:descriptionReference property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Description Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property is a remote text description of the object. The xlink:href attribute of the gml:descriptionReference property references the external description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Reference</em>' containment reference.
	 * @see #setDescriptionReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DescriptionReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='descriptionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDescriptionReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDescriptionReference <em>Description Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Reference</em>' containment reference.
	 * @see #getDescriptionReference()
	 * @generated
	 */
	void setDescriptionReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets of definitions may be collected into dictionaries or collections.
	 * A gml:Dictionary is a non-abstract collection of definitions.
	 * The gml:Dictionary content model adds a list of gml:dictionaryEntry properties that contain or reference gml:Definition objects.  A database handle (gml:id attribute) is required, in order that this collection may be referred to. The standard gml:identifier, gml:description, gml:descriptionReference and gml:name properties are available to reference or contain more information about this dictionary. The gml:description and gml:descriptionReference property elements may be used for a description of this dictionary. The derived gml:name element may be used for the name(s) of this dictionary. for remote definiton references gml:dictionaryEntry shall be used. If a Definition object contained within a Dictionary uses the descriptionReference property to refer to a remote definition, then this enables the inclusion of a remote definition in a local dictionary, giving a handle and identifier in the context of the local dictionary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dictionary</em>' containment reference.
	 * @see #setDictionary(DictionaryType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Dictionary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Dictionary' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	DictionaryType getDictionary();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDictionary <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' containment reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(DictionaryType value);

	/**
	 * Returns the value of the '<em><b>Directed Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:directedEdge property element describes the boundary of topology faces, the coBoundary of topology nodes and is used in the support of topological line features via the gml:TopoCurve expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included edge is used, i.e. forward or reverse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Edge</em>' containment reference.
	 * @see #setDirectedEdge(DirectedEdgePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DirectedEdge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='directedEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectedEdgePropertyType getDirectedEdge();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedEdge <em>Directed Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Edge</em>' containment reference.
	 * @see #getDirectedEdge()
	 * @generated
	 */
	void setDirectedEdge(DirectedEdgePropertyType value);

	/**
	 * Returns the value of the '<em><b>Directed Face</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:directedFace property element describes the boundary of topology solids, in the coBoundary of topology edges and is used in the support of surface features via the gml:TopoSurface expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included face is used i.e. inward or outward with respect to the surface normal in any geometric realisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Face</em>' containment reference.
	 * @see #setDirectedFace(DirectedFacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DirectedFace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='directedFace' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectedFacePropertyType getDirectedFace();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedFace <em>Directed Face</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Face</em>' containment reference.
	 * @see #getDirectedFace()
	 * @generated
	 */
	void setDirectedFace(DirectedFacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Directed Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:directedNode property element describes the boundary of topology edges and is used in the support of topological point features via the gml:TopoPoint expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included node is used: start ("-") or end ("+") node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Node</em>' containment reference.
	 * @see #setDirectedNode(DirectedNodePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DirectedNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='directedNode' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectedNodePropertyType getDirectedNode();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedNode <em>Directed Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Node</em>' containment reference.
	 * @see #getDirectedNode()
	 * @generated
	 */
	void setDirectedNode(DirectedNodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Directed Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:DirectedObservation is the same as an observation except that it adds an additional gml:direction property. This is the direction in which the observation was acquired. Clearly this applies only to certain types of observations such as visual observations by people, or observations obtained from terrestrial cameras.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Observation</em>' containment reference.
	 * @see #setDirectedObservation(DirectedObservationType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DirectedObservation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DirectedObservation' namespace='##targetNamespace' affiliation='Observation'"
	 * @generated
	 */
	DirectedObservationType getDirectedObservation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedObservation <em>Directed Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Observation</em>' containment reference.
	 * @see #getDirectedObservation()
	 * @generated
	 */
	void setDirectedObservation(DirectedObservationType value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content model is a straightforward extension of gml:AbstractFeatureType; it automatically has the gml:identifier, gml:description, gml:descriptionReference, gml:name, and gml:boundedBy properties. 
	 * The gml:validTime element describes the time of the observation. Note that this may be a time instant or a time period.
	 * The gml:using property contains or references a description of a sensor, instrument or procedure used for the observation.
	 * The gml:target property contains or references the specimen, region or station which is the object of the observation. This property is particularly useful for remote observations, such as photographs, where a generic location property might apply to the location of the camera or the location of the field of view, and thus may be ambiguous.  
	 * The gml:subject element is provided as a convenient synonym for gml:target. This is the term commonly used in phtotography.  
	 * The gml:resultOf property indicates the result of the observation.  The value may be inline, or a reference to a value elsewhere.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(ObservationType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Observation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Observation' namespace='##targetNamespace' affiliation='AbstractFeature'"
	 * @generated
	 */
	ObservationType getObservation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(ObservationType value);

	/**
	 * Returns the value of the '<em><b>Directed Observation At Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:DirectedObservationAtDistance adds an additional distance property. This is the distance from the observer to the subject of the observation. Clearly this applies only to certain types of observations such as visual observations by people, or observations obtained from terrestrial cameras.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Observation At Distance</em>' containment reference.
	 * @see #setDirectedObservationAtDistance(DirectedObservationAtDistanceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DirectedObservationAtDistance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DirectedObservationAtDistance' namespace='##targetNamespace' affiliation='DirectedObservation'"
	 * @generated
	 */
	DirectedObservationAtDistanceType getDirectedObservationAtDistance();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedObservationAtDistance <em>Directed Observation At Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Observation At Distance</em>' containment reference.
	 * @see #getDirectedObservationAtDistance()
	 * @generated
	 */
	void setDirectedObservationAtDistance(DirectedObservationAtDistanceType value);

	/**
	 * Returns the value of the '<em><b>Directed Topo Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:directedSolid property element describes the coBoundary of topology faces and is used in the support of volume features via the gml:TopoVolume expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included solid appears in the face coboundary. In the context of a gml:TopoVolume the orientation attribute has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Topo Solid</em>' containment reference.
	 * @see #setDirectedTopoSolid(DirectedTopoSolidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DirectedTopoSolid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='directedTopoSolid' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectedTopoSolidPropertyType getDirectedTopoSolid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDirectedTopoSolid <em>Directed Topo Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Topo Solid</em>' containment reference.
	 * @see #getDirectedTopoSolid()
	 * @generated
	 */
	void setDirectedTopoSolid(DirectedTopoSolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property gml:direction is intended as a pre-defined property expressing a direction to be assigned to features defined in a GML application schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(DirectionPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Direction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionPropertyType getDirection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Dms Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dms Angle</em>' containment reference.
	 * @see #setDmsAngle(DMSAngleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DmsAngle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dmsAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DMSAngleType getDmsAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDmsAngle <em>Dms Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dms Angle</em>' containment reference.
	 * @see #getDmsAngle()
	 * @generated
	 */
	void setDmsAngle(DMSAngleType value);

	/**
	 * Returns the value of the '<em><b>Dms Angle Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dms Angle Value</em>' containment reference.
	 * @see #setDmsAngleValue(DMSAngleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DmsAngleValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dmsAngleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DMSAngleType getDmsAngleValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDmsAngleValue <em>Dms Angle Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dms Angle Value</em>' containment reference.
	 * @see #getDmsAngleValue()
	 * @generated
	 */
	void setDmsAngleValue(DMSAngleType value);

	/**
	 * Returns the value of the '<em><b>Domain Of Validity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:domainOfValidity property implements an association role to an EX_Extent object as encoded in ISO/TS 19139, either referencing or containing the definition of that extent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Of Validity</em>' containment reference.
	 * @see #setDomainOfValidity(DomainOfValidityType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DomainOfValidity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domainOfValidity' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainOfValidityType getDomainOfValidity();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDomainOfValidity <em>Domain Of Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Of Validity</em>' containment reference.
	 * @see #getDomainOfValidity()
	 * @generated
	 */
	void setDomainOfValidity(DomainOfValidityType value);

	/**
	 * Returns the value of the '<em><b>Domain Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:domainSet property element describes the spatio-temporal region of interest, within which the coverage is defined. Its content model is given by gml:DomainSetType.
	 * The value of the domain is thus a choice between a gml:AbstractGeometry and a gml:AbstractTimeObject.  In the instance these abstract elements will normally be substituted by a geometry complex or temporal complex, to represent spatial coverages and time-series, respectively.  
	 * The presence of the gml:AssociationAttributeGroup means that domainSet follows the usual GML property model and may use the xlink:href attribute to point to the domain, as an alternative to describing the domain inline. Ownership semantics may be provided using the gml:OwnershipAttributeGroup.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Set</em>' containment reference.
	 * @see #setDomainSet(DomainSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DomainSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domainSet' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainSetType getDomainSet();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDomainSet <em>Domain Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Set</em>' containment reference.
	 * @see #getDomainSet()
	 * @generated
	 */
	void setDomainSet(DomainSetType value);

	/**
	 * Returns the value of the '<em><b>Double Or Nil Reason Tuple List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:doubleOrNilReasonList consists of a list of gml:doubleOrNilReason values, each separated by a whitespace. The gml:doubleOrNilReason values are grouped into tuples where the dimension of each tuple in the list is equal to the number of range parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Double Or Nil Reason Tuple List</em>' attribute.
	 * @see #setDoubleOrNilReasonTupleList(List)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DoubleOrNilReasonTupleList()
	 * @model unique="false" dataType="net.opengis.gml.gml.DoubleOrNilReasonList" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doubleOrNilReasonTupleList' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Object> getDoubleOrNilReasonTupleList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDoubleOrNilReasonTupleList <em>Double Or Nil Reason Tuple List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Or Nil Reason Tuple List</em>' attribute.
	 * @see #getDoubleOrNilReasonTupleList()
	 * @generated
	 */
	void setDoubleOrNilReasonTupleList(List<Object> value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:duration conforms to the ISO 8601 syntax for temporal length as implemented by the XML Schema duration type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Duration()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Duration" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Dynamic Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * States are captured by time-stamped instances of a feature. The content model extends the standard gml:AbstractFeatureType with the gml:dynamicProperties model group.
	 * Each time-stamped instance represents a 'snapshot' of a feature. The dynamic feature classes will normally be extended to suit particular applications.  A dynamic feature bears either a time stamp or a history.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Feature</em>' containment reference.
	 * @see #setDynamicFeature(DynamicFeatureType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DynamicFeature()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DynamicFeature' namespace='##targetNamespace' affiliation='AbstractFeature'"
	 * @generated
	 */
	DynamicFeatureType getDynamicFeature();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDynamicFeature <em>Dynamic Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Feature</em>' containment reference.
	 * @see #getDynamicFeature()
	 * @generated
	 */
	void setDynamicFeature(DynamicFeatureType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:DynamicFeatureCollection is a feature collection that has a gml:validTime property (i.e. is a snapshot of the feature collection) or which has a gml:history property that contains one or more gml:AbstractTimeSlices each of which contain values of the time varying properties of the feature collection.  Note that the gml:DynamicFeatureCollection may be one of the following:
	 * 1.	A feature collection which consists of static feature members (members do not change in time) but which has properties of the collection object as a whole that do change in time .  
	 * 2.	A feature collection which consists of dynamic feature members (the members are gml:DynamicFeatures) but which also has properties of the collection as a whole that vary in time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Feature Collection</em>' containment reference.
	 * @see #setDynamicFeatureCollection(DynamicFeatureCollectionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DynamicFeatureCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DynamicFeatureCollection' namespace='##targetNamespace' affiliation='DynamicFeature'"
	 * @generated
	 */
	DynamicFeatureCollectionType getDynamicFeatureCollection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDynamicFeatureCollection <em>Dynamic Feature Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Feature Collection</em>' containment reference.
	 * @see #getDynamicFeatureCollection()
	 * @generated
	 */
	void setDynamicFeatureCollection(DynamicFeatureCollectionType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Members</em>' containment reference.
	 * @see #setDynamicMembers(DynamicFeatureMemberType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_DynamicMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamicMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicFeatureMemberType getDynamicMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getDynamicMembers <em>Dynamic Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Members</em>' containment reference.
	 * @see #getDynamicMembers()
	 * @generated
	 */
	void setDynamicMembers(DynamicFeatureMemberType value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:Edge represents the 1-dimensional primitive.
	 * The topological boundary of an Edge (gml:directedNode) consists of a negatively directed start Node and a positively directed end Node.   
	 * The optional coboundary of an edge (gml:directedFace) is a circular sequence of directed faces which are incident on this edge in document order. In the 2D case, the orientation of the face on the left of the edge is "+"; the orientation of the face on the right on its right is "-". 
	 * If provided, the aggregationType attribute shall have the value "sequence".
	 * An edge may optionally be realised by a 1-dimensional geometric primitive (gml:curveProperty).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference.
	 * @see #setEdge(EdgeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Edge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Edge' namespace='##targetNamespace' affiliation='AbstractTopoPrimitive'"
	 * @generated
	 */
	EdgeType getEdge();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEdge <em>Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' containment reference.
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(EdgeType value);

	/**
	 * Returns the value of the '<em><b>Edge Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Of</em>' containment reference.
	 * @see #setEdgeOf(CurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EdgeOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='edgeOf' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePropertyType getEdgeOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEdgeOf <em>Edge Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Of</em>' containment reference.
	 * @see #getEdgeOf()
	 * @generated
	 */
	void setEdgeOf(CurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoid is an association role to the ellipsoid used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid</em>' containment reference.
	 * @see #setEllipsoid(EllipsoidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Ellipsoid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipsoid' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidPropertyType getEllipsoid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoid <em>Ellipsoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid</em>' containment reference.
	 * @see #getEllipsoid()
	 * @generated
	 */
	void setEllipsoid(EllipsoidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoid1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoid is an association role to the ellipsoid used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid1</em>' containment reference.
	 * @see #setEllipsoid1(EllipsoidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Ellipsoid1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipsoid' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidPropertyType getEllipsoid1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoid1 <em>Ellipsoid1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid1</em>' containment reference.
	 * @see #getEllipsoid1()
	 * @generated
	 */
	void setEllipsoid1(EllipsoidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoid2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:Ellipsoid is a geometric figure that may be used to describe the approximate shape of the earth. In mathematical terms, it is a surface formed by the rotation of an ellipse about its minor axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid2</em>' containment reference.
	 * @see #setEllipsoid2(EllipsoidType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Ellipsoid2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ellipsoid' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	EllipsoidType getEllipsoid2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoid2 <em>Ellipsoid2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid2</em>' containment reference.
	 * @see #getEllipsoid2()
	 * @generated
	 */
	void setEllipsoid2(EllipsoidType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoid3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:Ellipsoid is a geometric figure that may be used to describe the approximate shape of the earth. In mathematical terms, it is a surface formed by the rotation of an ellipse about its minor axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid3</em>' containment reference.
	 * @see #setEllipsoid3(EllipsoidType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Ellipsoid3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ellipsoid' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	EllipsoidType getEllipsoid3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoid3 <em>Ellipsoid3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid3</em>' containment reference.
	 * @see #getEllipsoid3()
	 * @generated
	 */
	void setEllipsoid3(EllipsoidType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoidal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoidalCS is an association role to the ellipsoidal coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoidal CS</em>' containment reference.
	 * @see #setEllipsoidalCS(EllipsoidalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EllipsoidalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipsoidalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidalCSPropertyType getEllipsoidalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCS <em>Ellipsoidal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoidal CS</em>' containment reference.
	 * @see #getEllipsoidalCS()
	 * @generated
	 */
	void setEllipsoidalCS(EllipsoidalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoidal CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoidalCS is an association role to the ellipsoidal coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoidal CS1</em>' containment reference.
	 * @see #setEllipsoidalCS1(EllipsoidalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EllipsoidalCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipsoidalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidalCSPropertyType getEllipsoidalCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCS1 <em>Ellipsoidal CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoidal CS1</em>' containment reference.
	 * @see #getEllipsoidalCS1()
	 * @generated
	 */
	void setEllipsoidalCS1(EllipsoidalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoidal CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:EllipsoidalCS is a two- or three-dimensional coordinate system in which position is specified by geodetic latitude, geodetic longitude, and (in the three-dimensional case) ellipsoidal height. An EllipsoidalCS shall have two or three gml:axis property elements; the number of associations shall equal the dimension of the CS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoidal CS2</em>' containment reference.
	 * @see #setEllipsoidalCS2(EllipsoidalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EllipsoidalCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EllipsoidalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	EllipsoidalCSType getEllipsoidalCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCS2 <em>Ellipsoidal CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoidal CS2</em>' containment reference.
	 * @see #getEllipsoidalCS2()
	 * @generated
	 */
	void setEllipsoidalCS2(EllipsoidalCSType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoidal CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:EllipsoidalCS is a two- or three-dimensional coordinate system in which position is specified by geodetic latitude, geodetic longitude, and (in the three-dimensional case) ellipsoidal height. An EllipsoidalCS shall have two or three gml:axis property elements; the number of associations shall equal the dimension of the CS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoidal CS3</em>' containment reference.
	 * @see #setEllipsoidalCS3(EllipsoidalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EllipsoidalCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EllipsoidalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	EllipsoidalCSType getEllipsoidalCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCS3 <em>Ellipsoidal CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoidal CS3</em>' containment reference.
	 * @see #getEllipsoidalCS3()
	 * @generated
	 */
	void setEllipsoidalCS3(EllipsoidalCSType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoidal CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipsoidal CS Ref</em>' containment reference.
	 * @see #setEllipsoidalCSRef(EllipsoidalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EllipsoidalCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipsoidalCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidalCSPropertyType getEllipsoidalCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidalCSRef <em>Ellipsoidal CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoidal CS Ref</em>' containment reference.
	 * @see #getEllipsoidalCSRef()
	 * @generated
	 */
	void setEllipsoidalCSRef(EllipsoidalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoid Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipsoid Ref</em>' containment reference.
	 * @see #setEllipsoidRef(EllipsoidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EllipsoidRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipsoidRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidPropertyType getEllipsoidRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEllipsoidRef <em>Ellipsoid Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid Ref</em>' containment reference.
	 * @see #getEllipsoidRef()
	 * @generated
	 */
	void setEllipsoidRef(EllipsoidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Engineering CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:EngineeringCRS is a contextually local coordinate reference system which can be divided into two broad categories:
	 * -	earth-fixed systems applied to engineering activities on or near the surface of the earth;
	 * -	CRSs on moving platforms such as road vehicles, vessels, aircraft, or spacecraft, see ISO 19111 8.3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering CRS</em>' containment reference.
	 * @see #setEngineeringCRS(EngineeringCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EngineeringCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EngineeringCRS' namespace='##targetNamespace' affiliation='AbstractSingleCRS'"
	 * @generated
	 */
	EngineeringCRSType getEngineeringCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringCRS <em>Engineering CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering CRS</em>' containment reference.
	 * @see #getEngineeringCRS()
	 * @generated
	 */
	void setEngineeringCRS(EngineeringCRSType value);

	/**
	 * Returns the value of the '<em><b>Engineering CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engineering CRS Ref</em>' containment reference.
	 * @see #setEngineeringCRSRef(EngineeringCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EngineeringCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='engineeringCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineeringCRSPropertyType getEngineeringCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringCRSRef <em>Engineering CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering CRS Ref</em>' containment reference.
	 * @see #getEngineeringCRSRef()
	 * @generated
	 */
	void setEngineeringCRSRef(EngineeringCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Engineering Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:engineeringDatum is an association role to the engineering datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering Datum</em>' containment reference.
	 * @see #setEngineeringDatum(EngineeringDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EngineeringDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='engineeringDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineeringDatumPropertyType getEngineeringDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatum <em>Engineering Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Datum</em>' containment reference.
	 * @see #getEngineeringDatum()
	 * @generated
	 */
	void setEngineeringDatum(EngineeringDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Engineering Datum1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:engineeringDatum is an association role to the engineering datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering Datum1</em>' containment reference.
	 * @see #setEngineeringDatum1(EngineeringDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EngineeringDatum1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='engineeringDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineeringDatumPropertyType getEngineeringDatum1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatum1 <em>Engineering Datum1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Datum1</em>' containment reference.
	 * @see #getEngineeringDatum1()
	 * @generated
	 */
	void setEngineeringDatum1(EngineeringDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Engineering Datum2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:EngineeringDatum defines the origin of an engineering coordinate reference system, and is used in a region around that origin. This origin may be fixed with respect to the earth (such as a defined point at a construction site), or be a defined point on a moving vehicle (such as on a ship or satellite).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering Datum2</em>' containment reference.
	 * @see #setEngineeringDatum2(EngineeringDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EngineeringDatum2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EngineeringDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	EngineeringDatumType getEngineeringDatum2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatum2 <em>Engineering Datum2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Datum2</em>' containment reference.
	 * @see #getEngineeringDatum2()
	 * @generated
	 */
	void setEngineeringDatum2(EngineeringDatumType value);

	/**
	 * Returns the value of the '<em><b>Engineering Datum3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:EngineeringDatum defines the origin of an engineering coordinate reference system, and is used in a region around that origin. This origin may be fixed with respect to the earth (such as a defined point at a construction site), or be a defined point on a moving vehicle (such as on a ship or satellite).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering Datum3</em>' containment reference.
	 * @see #setEngineeringDatum3(EngineeringDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EngineeringDatum3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EngineeringDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	EngineeringDatumType getEngineeringDatum3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatum3 <em>Engineering Datum3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Datum3</em>' containment reference.
	 * @see #getEngineeringDatum3()
	 * @generated
	 */
	void setEngineeringDatum3(EngineeringDatumType value);

	/**
	 * Returns the value of the '<em><b>Engineering Datum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engineering Datum Ref</em>' containment reference.
	 * @see #setEngineeringDatumRef(EngineeringDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EngineeringDatumRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='engineeringDatumRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineeringDatumPropertyType getEngineeringDatumRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEngineeringDatumRef <em>Engineering Datum Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Datum Ref</em>' containment reference.
	 * @see #getEngineeringDatumRef()
	 * @generated
	 */
	void setEngineeringDatumRef(EngineeringDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Envelope defines an extent using a pair of positions defining opposite corners in arbitrary dimensions. The first direct position is the "lower corner" (a coordinate position consisting of all the minimal ordinates for each dimension for all points within the envelope), the second one the "upper corner" (a coordinate position consisting of all the maximal ordinates for each dimension for all points within the envelope).
	 * The use of the properties "coordinates" and "pos" has been deprecated. The explicitly named properties "lowerCorner" and "upperCorner" shall be used instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Envelope</em>' containment reference.
	 * @see #setEnvelope(EnvelopeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Envelope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Envelope' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	EnvelopeType getEnvelope();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEnvelope <em>Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envelope</em>' containment reference.
	 * @see #getEnvelope()
	 * @generated
	 */
	void setEnvelope(EnvelopeType value);

	/**
	 * Returns the value of the '<em><b>Envelope With Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:EnvelopeWithTimePeriod is provided for envelopes that include a temporal extent. It adds two time position properties, gml:beginPosition and gml:endPosition, which describe the extent of a time-envelope.  
	 * Since gml:EnvelopeWithTimePeriod is assigned to the substitution group headed by gml:Envelope, it may be used whenever gml:Envelope is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Envelope With Time Period</em>' containment reference.
	 * @see #setEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_EnvelopeWithTimePeriod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnvelopeWithTimePeriod' namespace='##targetNamespace' affiliation='Envelope'"
	 * @generated
	 */
	EnvelopeWithTimePeriodType getEnvelopeWithTimePeriod();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getEnvelopeWithTimePeriod <em>Envelope With Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envelope With Time Period</em>' containment reference.
	 * @see #getEnvelopeWithTimePeriod()
	 * @generated
	 */
	void setEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType value);

	/**
	 * Returns the value of the '<em><b>Extent Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent Of</em>' containment reference.
	 * @see #setExtentOf(SurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ExtentOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extentOf' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getExtentOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getExtentOf <em>Extent Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Of</em>' containment reference.
	 * @see #getExtentOf()
	 * @generated
	 */
	void setExtentOf(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Exterior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. In the normal 2D case, one of these rings is distinguished as being the exterior boundary. In a general manifold this is not always possible, in which case all boundaries shall be listed as interior boundaries, and the exterior will be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exterior</em>' containment reference.
	 * @see #setExterior(AbstractRingPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Exterior()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exterior' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractRingPropertyType getExterior();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getExterior <em>Exterior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior</em>' containment reference.
	 * @see #getExterior()
	 * @generated
	 */
	void setExterior(AbstractRingPropertyType value);

	/**
	 * Returns the value of the '<em><b>Face</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:Face represents the 2-dimensional topology primitive.
	 * The topological boundary of a face (gml:directedEdge) consists of a sequence of directed edges. If provided, the aggregationType attribute shall have the value "sequence".
	 * The optional coboundary of a face (gml:directedTopoSolid) is a pair of directed solids which are bounded by this face. A positively directed solid corresponds to a solid which lies in the direction of the negatively directed normal to the face in any geometric realisation. 
	 * A face may optionally be realised by a 2-dimensional geometric primitive (gml:surfaceProperty).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Face</em>' containment reference.
	 * @see #setFace(FaceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Face()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Face' namespace='##targetNamespace' affiliation='AbstractTopoPrimitive'"
	 * @generated
	 */
	FaceType getFace();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getFace <em>Face</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face</em>' containment reference.
	 * @see #getFace()
	 * @generated
	 */
	void setFace(FaceType value);

	/**
	 * Returns the value of the '<em><b>Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Collection</em>' containment reference.
	 * @see #setFeatureCollection(FeatureCollectionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_FeatureCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FeatureCollection' namespace='##targetNamespace' affiliation='AbstractFeature'"
	 * @generated
	 */
	FeatureCollectionType getFeatureCollection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getFeatureCollection <em>Feature Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Collection</em>' containment reference.
	 * @see #getFeatureCollection()
	 * @generated
	 */
	void setFeatureCollection(FeatureCollectionType value);

	/**
	 * Returns the value of the '<em><b>Feature Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Member</em>' containment reference.
	 * @see #setFeatureMember(FeaturePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_FeatureMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='featureMember' namespace='##targetNamespace'"
	 * @generated
	 */
	FeaturePropertyType getFeatureMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getFeatureMember <em>Feature Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Member</em>' containment reference.
	 * @see #getFeatureMember()
	 * @generated
	 */
	void setFeatureMember(FeaturePropertyType value);

	/**
	 * Returns the value of the '<em><b>Feature Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Members</em>' containment reference.
	 * @see #setFeatureMembers(FeatureArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_FeatureMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='featureMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureArrayPropertyType getFeatureMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getFeatureMembers <em>Feature Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Members</em>' containment reference.
	 * @see #getFeatureMembers()
	 * @generated
	 */
	void setFeatureMembers(FeatureArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Feature Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Property</em>' containment reference.
	 * @see #setFeatureProperty(FeaturePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_FeatureProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='featureProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	FeaturePropertyType getFeatureProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getFeatureProperty <em>Feature Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Property</em>' containment reference.
	 * @see #getFeatureProperty()
	 * @generated
	 */
	void setFeatureProperty(FeaturePropertyType value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * for efficiency reasons, GML also provides a means of encoding the range set in an arbitrary external encoding, such as a binary file.  This encoding may be "well-known" but this is not required. This mode uses the gml:File element.
	 * The values of the coverage (attribute values in the range set) are transmitted in a external file that is referenced from the XML structure described by gml:FileType.  The external file is referenced by the gml:fileReference property that is an anyURI (the gml:fileName property has been deprecated).  This means that the external file may be located remotely from the referencing GML instance. 
	 * The gml:compression property points to a definition of a compression algorithm through an anyURI.  This may be a retrievable, computable definition or simply a reference to an unambiguous name for the compression method.
	 * The gml:mimeType property points to a definition of the file mime type.
	 * The gml:fileStructure property is defined by a codelist. Note further that all values shall be enclosed in a single file. Multi-file structures for values are not supported in GML.
	 * The semantics of the range set is described as above using the gml:rangeParameters property.
	 * Note that if any compression algorithm is applied, the structure above applies only to the pre-compression or post-decompression structure of the file.
	 * Note that the fields within a record match the gml:valueComponents of the gml:CompositeValue in document order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(FileType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_File()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	FileType getFile();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(FileType value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:formula Formula(s) or procedure used by an operation method. The use of the codespace attribite has been deprecated. The property value shall be a character string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Formula()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formula' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getFormula();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(CodeType value);

	/**
	 * Returns the value of the '<em><b>Formula Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:formulaCitation provides a reference to a publication giving the formula(s) or procedure used by an coordinate operation method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formula Citation</em>' containment reference.
	 * @see #setFormulaCitation(FormulaCitationType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_FormulaCitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formulaCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormulaCitationType getFormulaCitation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getFormulaCitation <em>Formula Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula Citation</em>' containment reference.
	 * @see #getFormulaCitation()
	 * @generated
	 */
	void setFormulaCitation(FormulaCitationType value);

	/**
	 * Returns the value of the '<em><b>General Conversion Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Conversion Ref</em>' containment reference.
	 * @see #setGeneralConversionRef(GeneralConversionPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeneralConversionRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalConversionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralConversionPropertyType getGeneralConversionRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeneralConversionRef <em>General Conversion Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Conversion Ref</em>' containment reference.
	 * @see #getGeneralConversionRef()
	 * @generated
	 */
	void setGeneralConversionRef(GeneralConversionPropertyType value);

	/**
	 * Returns the value of the '<em><b>General Operation Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Operation Parameter</em>' containment reference.
	 * @see #setGeneralOperationParameter(AbstractGeneralOperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeneralOperationParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalOperationParameter' namespace='##targetNamespace' affiliation='parameter'"
	 * @generated
	 */
	AbstractGeneralOperationParameterPropertyType getGeneralOperationParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeneralOperationParameter <em>General Operation Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Operation Parameter</em>' containment reference.
	 * @see #getGeneralOperationParameter()
	 * @generated
	 */
	void setGeneralOperationParameter(AbstractGeneralOperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>General Operation Parameter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Operation Parameter1</em>' containment reference.
	 * @see #setGeneralOperationParameter1(AbstractGeneralOperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeneralOperationParameter1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalOperationParameter' namespace='##targetNamespace' affiliation='parameter'"
	 * @generated
	 */
	AbstractGeneralOperationParameterPropertyType getGeneralOperationParameter1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeneralOperationParameter1 <em>General Operation Parameter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Operation Parameter1</em>' containment reference.
	 * @see #getGeneralOperationParameter1()
	 * @generated
	 */
	void setGeneralOperationParameter1(AbstractGeneralOperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>General Transformation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Transformation Ref</em>' containment reference.
	 * @see #setGeneralTransformationRef(GeneralTransformationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeneralTransformationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalTransformationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralTransformationPropertyType getGeneralTransformationRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeneralTransformationRef <em>General Transformation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Transformation Ref</em>' containment reference.
	 * @see #getGeneralTransformationRef()
	 * @generated
	 */
	void setGeneralTransformationRef(GeneralTransformationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Meta Data</em>' containment reference.
	 * @see #setGenericMetaData(GenericMetaDataType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GenericMetaData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenericMetaData' namespace='##targetNamespace' affiliation='AbstractMetaData'"
	 * @generated
	 */
	GenericMetaDataType getGenericMetaData();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGenericMetaData <em>Generic Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Meta Data</em>' containment reference.
	 * @see #getGenericMetaData()
	 * @generated
	 */
	void setGenericMetaData(GenericMetaDataType value);

	/**
	 * Returns the value of the '<em><b>Geocentric CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocentric CRS</em>' containment reference.
	 * @see #setGeocentricCRS(GeocentricCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeocentricCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeocentricCRS' namespace='##targetNamespace' affiliation='AbstractSingleCRS'"
	 * @generated
	 */
	GeocentricCRSType getGeocentricCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeocentricCRS <em>Geocentric CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geocentric CRS</em>' containment reference.
	 * @see #getGeocentricCRS()
	 * @generated
	 */
	void setGeocentricCRS(GeocentricCRSType value);

	/**
	 * Returns the value of the '<em><b>Geocentric CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocentric CRS Ref</em>' containment reference.
	 * @see #setGeocentricCRSRef(GeocentricCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeocentricCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geocentricCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GeocentricCRSPropertyType getGeocentricCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeocentricCRSRef <em>Geocentric CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geocentric CRS Ref</em>' containment reference.
	 * @see #getGeocentricCRSRef()
	 * @generated
	 */
	void setGeocentricCRSRef(GeocentricCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Geodesic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geodesic</em>' containment reference.
	 * @see #setGeodesic(GeodesicType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Geodesic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Geodesic' namespace='##targetNamespace' affiliation='GeodesicString'"
	 * @generated
	 */
	GeodesicType getGeodesic();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodesic <em>Geodesic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodesic</em>' containment reference.
	 * @see #getGeodesic()
	 * @generated
	 */
	void setGeodesic(GeodesicType value);

	/**
	 * Returns the value of the '<em><b>Geodesic String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sequence of geodesic segments. 
	 * The number of control points shall be at least two.
	 * interpolation is fixed as "geodesic".
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geodesic String</em>' containment reference.
	 * @see #setGeodesicString(GeodesicStringType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeodesicString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeodesicString' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	GeodesicStringType getGeodesicString();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodesicString <em>Geodesic String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodesic String</em>' containment reference.
	 * @see #getGeodesicString()
	 * @generated
	 */
	void setGeodesicString(GeodesicStringType value);

	/**
	 * Returns the value of the '<em><b>Geodetic CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geodetic CRS</em>' containment reference.
	 * @see #setGeodeticCRS(GeodeticCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeodeticCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeodeticCRS' namespace='##targetNamespace' affiliation='AbstractSingleCRS'"
	 * @generated
	 */
	GeodeticCRSType getGeodeticCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticCRS <em>Geodetic CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodetic CRS</em>' containment reference.
	 * @see #getGeodeticCRS()
	 * @generated
	 */
	void setGeodeticCRS(GeodeticCRSType value);

	/**
	 * Returns the value of the '<em><b>Geodetic Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:geodeticDatum is an association role to the geodetic datum used by this CRS.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geodetic Datum</em>' containment reference.
	 * @see #setGeodeticDatum(GeodeticDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeodeticDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geodeticDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	GeodeticDatumPropertyType getGeodeticDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatum <em>Geodetic Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodetic Datum</em>' containment reference.
	 * @see #getGeodeticDatum()
	 * @generated
	 */
	void setGeodeticDatum(GeodeticDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Geodetic Datum1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:geodeticDatum is an association role to the geodetic datum used by this CRS.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geodetic Datum1</em>' containment reference.
	 * @see #setGeodeticDatum1(GeodeticDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeodeticDatum1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geodeticDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	GeodeticDatumPropertyType getGeodeticDatum1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatum1 <em>Geodetic Datum1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodetic Datum1</em>' containment reference.
	 * @see #getGeodeticDatum1()
	 * @generated
	 */
	void setGeodeticDatum1(GeodeticDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Geodetic Datum2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:GeodeticDatum is a geodetic datum defines the precise location and orientation in 3-dimensional space of a defined ellipsoid (or sphere), or of a Cartesian coordinate system centered in this ellipsoid (or sphere).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geodetic Datum2</em>' containment reference.
	 * @see #setGeodeticDatum2(GeodeticDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeodeticDatum2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeodeticDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	GeodeticDatumType getGeodeticDatum2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatum2 <em>Geodetic Datum2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodetic Datum2</em>' containment reference.
	 * @see #getGeodeticDatum2()
	 * @generated
	 */
	void setGeodeticDatum2(GeodeticDatumType value);

	/**
	 * Returns the value of the '<em><b>Geodetic Datum3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:GeodeticDatum is a geodetic datum defines the precise location and orientation in 3-dimensional space of a defined ellipsoid (or sphere), or of a Cartesian coordinate system centered in this ellipsoid (or sphere).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geodetic Datum3</em>' containment reference.
	 * @see #setGeodeticDatum3(GeodeticDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeodeticDatum3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeodeticDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	GeodeticDatumType getGeodeticDatum3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatum3 <em>Geodetic Datum3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodetic Datum3</em>' containment reference.
	 * @see #getGeodeticDatum3()
	 * @generated
	 */
	void setGeodeticDatum3(GeodeticDatumType value);

	/**
	 * Returns the value of the '<em><b>Geodetic Datum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geodetic Datum Ref</em>' containment reference.
	 * @see #setGeodeticDatumRef(GeodeticDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeodeticDatumRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geodeticDatumRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GeodeticDatumPropertyType getGeodeticDatumRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeodeticDatumRef <em>Geodetic Datum Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodetic Datum Ref</em>' containment reference.
	 * @see #getGeodeticDatumRef()
	 * @generated
	 */
	void setGeodeticDatumRef(GeodeticDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Geographic CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic CRS</em>' containment reference.
	 * @see #setGeographicCRS(GeographicCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeographicCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeographicCRS' namespace='##targetNamespace' affiliation='AbstractSingleCRS'"
	 * @generated
	 */
	GeographicCRSType getGeographicCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeographicCRS <em>Geographic CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic CRS</em>' containment reference.
	 * @see #getGeographicCRS()
	 * @generated
	 */
	void setGeographicCRS(GeographicCRSType value);

	/**
	 * Returns the value of the '<em><b>Geographic CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic CRS Ref</em>' containment reference.
	 * @see #setGeographicCRSRef(GeographicCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeographicCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geographicCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GeographicCRSPropertyType getGeographicCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeographicCRSRef <em>Geographic CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic CRS Ref</em>' containment reference.
	 * @see #getGeographicCRSRef()
	 * @generated
	 */
	void setGeographicCRSRef(GeographicCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Geometric Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Complex</em>' containment reference.
	 * @see #setGeometricComplex(GeometricComplexType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeometricComplex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeometricComplex' namespace='##targetNamespace' affiliation='AbstractGeometry'"
	 * @generated
	 */
	GeometricComplexType getGeometricComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeometricComplex <em>Geometric Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric Complex</em>' containment reference.
	 * @see #getGeometricComplex()
	 * @generated
	 */
	void setGeometricComplex(GeometricComplexType value);

	/**
	 * Returns the value of the '<em><b>Geometry Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a geometry element via the XLink-attributes or contains the geometry element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Member</em>' containment reference.
	 * @see #setGeometryMember(GeometryPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeometryMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geometryMember' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getGeometryMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeometryMember <em>Geometry Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Member</em>' containment reference.
	 * @see #getGeometryMember()
	 * @generated
	 */
	void setGeometryMember(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Geometry Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of geometry elements. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Members</em>' containment reference.
	 * @see #setGeometryMembers(GeometryArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GeometryMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geometryMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryArrayPropertyType getGeometryMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGeometryMembers <em>Geometry Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Members</em>' containment reference.
	 * @see #getGeometryMembers()
	 * @generated
	 */
	void setGeometryMembers(GeometryArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Gml Profile Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Profile Schema</em>' attribute.
	 * @see #setGmlProfileSchema(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GmlProfileSchema()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gmlProfileSchema' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGmlProfileSchema();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGmlProfileSchema <em>Gml Profile Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Profile Schema</em>' attribute.
	 * @see #getGmlProfileSchema()
	 * @generated
	 */
	void setGmlProfileSchema(String value);

	/**
	 * Returns the value of the '<em><b>Greenwich Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:greenwichLongitude is the longitude of the prime meridian measured from the Greenwich meridian, positive eastward. If the value of the prime meridian "name" is "Greenwich" then the value of greenwichLongitude shall be 0 degrees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Greenwich Longitude</em>' containment reference.
	 * @see #setGreenwichLongitude(AngleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GreenwichLongitude()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='greenwichLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getGreenwichLongitude();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGreenwichLongitude <em>Greenwich Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greenwich Longitude</em>' containment reference.
	 * @see #getGreenwichLongitude()
	 * @generated
	 */
	void setGreenwichLongitude(AngleType value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:Grid implicitly defines an unrectified grid, which is a network composed of two or more sets of curves in which the members of each set intersect the members of the other sets in an algorithmic way.  The region of interest within the grid is given in terms of its gml:limits, being the grid coordinates of  diagonally opposed corners of a rectangular region.  gml:axisLabels is provided with a list of labels of the axes of the grid (gml:axisName has been deprecated). gml:dimension specifies the dimension of the grid.  
	 * The gml:limits element contains a single gml:GridEnvelope. The gml:low and gml:high property elements of the envelope are each integerLists, which are coordinate tuples, the coordinates being measured as offsets from the origin of the grid along each axis, of the diagonally opposing corners of a "rectangular" region of interest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(GridType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Grid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Grid' namespace='##targetNamespace' affiliation='AbstractImplicitGeometry'"
	 * @generated
	 */
	GridType getGrid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(GridType value);

	/**
	 * Returns the value of the '<em><b>Grid Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:GriddedCoverage is a discrete point coverage in which the domain set is a geometric grid of points.
	 * Note that this is the same as the gml:MultiPointCoverage except that we have a gml:Grid to describe the domain.
	 * The simple gridded coverage is not geometrically referenced and hence no geometric positions are assignable to the points in the grid. Such geometric positioning is introduced in the gml:RectifiedGridCoverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grid Coverage</em>' containment reference.
	 * @see #setGridCoverage(DiscreteCoverageType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GridCoverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GridCoverage' namespace='##targetNamespace' affiliation='AbstractDiscreteCoverage'"
	 * @generated
	 */
	DiscreteCoverageType getGridCoverage();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGridCoverage <em>Grid Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Coverage</em>' containment reference.
	 * @see #getGridCoverage()
	 * @generated
	 */
	void setGridCoverage(DiscreteCoverageType value);

	/**
	 * Returns the value of the '<em><b>Grid Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Domain</em>' containment reference.
	 * @see #setGridDomain(DomainSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GridDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gridDomain' namespace='##targetNamespace' affiliation='domainSet'"
	 * @generated
	 */
	DomainSetType getGridDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGridDomain <em>Grid Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Domain</em>' containment reference.
	 * @see #getGridDomain()
	 * @generated
	 */
	void setGridDomain(DomainSetType value);

	/**
	 * Returns the value of the '<em><b>Grid Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:GridFunction provides an explicit mapping rule for grid geometries, i.e. the domain shall be a geometry of type grid.  It describes the mapping of grid posts (discrete point grid coverage) or grid cells (discrete surface coverage) to the values in the range set.
	 * The gml:startPoint is the index position of a point in the grid that is mapped to the first point in the range set (this is also the index position of the first grid post).  If the gml:startPoint property is omitted the gml:startPoint is assumed to be equal to the value of gml:low in the gml:Grid geometry. Subsequent points in the mapping are determined by the value of the gml:sequenceRule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grid Function</em>' containment reference.
	 * @see #setGridFunction(GridFunctionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_GridFunction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GridFunction' namespace='##targetNamespace' affiliation='AbstractObject'"
	 * @generated
	 */
	GridFunctionType getGridFunction();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGridFunction <em>Grid Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Function</em>' containment reference.
	 * @see #getGridFunction()
	 * @generated
	 */
	void setGridFunction(GridFunctionType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:group is an association role to the operation parameter group for which this element provides parameter values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(OperationParameterGroupPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Group()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationParameterGroupPropertyType getGroup();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(OperationParameterGroupPropertyType value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A generic sequence of events constitute a gml:history of an object.
	 * The gml:history element contains a set of elements in the substitution group headed by the abstract element gml:AbstractTimeSlice, representing the time-varying properties of interest. The history property of a dynamic feature associates a feature instance with a sequence of time slices (i.e. change events) that encapsulate the evolution of the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History</em>' containment reference.
	 * @see #setHistory(HistoryPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_History()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='history' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryPropertyType getHistory();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getHistory <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' containment reference.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(HistoryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Often, a special identifier is assigned to an object by the maintaining authority with the intention that it is used in references to the object For such cases, the codeSpace shall be provided. That identifier is usually unique either globally or within an application domain. gml:identifier is a pre-defined property for such identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(CodeWithAuthorityType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getIdentifier();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Image CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ImageCRS is an engineering coordinate reference system applied to locations in images. Image coordinate reference systems are treated as a separate sub-type because the definition of the associated image datum contains two attributes not relevant to other engineering datums.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image CRS</em>' containment reference.
	 * @see #setImageCRS(ImageCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ImageCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageCRS' namespace='##targetNamespace' affiliation='AbstractSingleCRS'"
	 * @generated
	 */
	ImageCRSType getImageCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getImageCRS <em>Image CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image CRS</em>' containment reference.
	 * @see #getImageCRS()
	 * @generated
	 */
	void setImageCRS(ImageCRSType value);

	/**
	 * Returns the value of the '<em><b>Image CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image CRS Ref</em>' containment reference.
	 * @see #setImageCRSRef(ImageCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ImageCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imageCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageCRSPropertyType getImageCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getImageCRSRef <em>Image CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image CRS Ref</em>' containment reference.
	 * @see #getImageCRSRef()
	 * @generated
	 */
	void setImageCRSRef(ImageCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Image Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:imageDatum is an association role to the image datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Datum</em>' containment reference.
	 * @see #setImageDatum(ImageDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ImageDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imageDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageDatumPropertyType getImageDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatum <em>Image Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Datum</em>' containment reference.
	 * @see #getImageDatum()
	 * @generated
	 */
	void setImageDatum(ImageDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Image Datum1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:imageDatum is an association role to the image datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Datum1</em>' containment reference.
	 * @see #setImageDatum1(ImageDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ImageDatum1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imageDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageDatumPropertyType getImageDatum1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatum1 <em>Image Datum1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Datum1</em>' containment reference.
	 * @see #getImageDatum1()
	 * @generated
	 */
	void setImageDatum1(ImageDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Image Datum2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ImageDatum defines the origin of an image coordinate reference system, and is used in a local context only. For an image datum, the anchor definition is usually either the centre of the image or the corner of the image. For more information, see ISO 19111 B.3.5.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Datum2</em>' containment reference.
	 * @see #setImageDatum2(ImageDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ImageDatum2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	ImageDatumType getImageDatum2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatum2 <em>Image Datum2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Datum2</em>' containment reference.
	 * @see #getImageDatum2()
	 * @generated
	 */
	void setImageDatum2(ImageDatumType value);

	/**
	 * Returns the value of the '<em><b>Image Datum3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ImageDatum defines the origin of an image coordinate reference system, and is used in a local context only. For an image datum, the anchor definition is usually either the centre of the image or the corner of the image. For more information, see ISO 19111 B.3.5.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Datum3</em>' containment reference.
	 * @see #setImageDatum3(ImageDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ImageDatum3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	ImageDatumType getImageDatum3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatum3 <em>Image Datum3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Datum3</em>' containment reference.
	 * @see #getImageDatum3()
	 * @generated
	 */
	void setImageDatum3(ImageDatumType value);

	/**
	 * Returns the value of the '<em><b>Image Datum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Datum Ref</em>' containment reference.
	 * @see #setImageDatumRef(ImageDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ImageDatumRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imageDatumRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageDatumPropertyType getImageDatumRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getImageDatumRef <em>Image Datum Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Datum Ref</em>' containment reference.
	 * @see #getImageDatumRef()
	 * @generated
	 */
	void setImageDatumRef(ImageDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Includes Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Parameter</em>' containment reference.
	 * @see #setIncludesParameter(AbstractGeneralOperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_IncludesParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='includesParameter' namespace='##targetNamespace' affiliation='parameter'"
	 * @generated
	 */
	AbstractGeneralOperationParameterPropertyType getIncludesParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getIncludesParameter <em>Includes Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes Parameter</em>' containment reference.
	 * @see #getIncludesParameter()
	 * @generated
	 */
	void setIncludesParameter(AbstractGeneralOperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Includes Single CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Single CRS</em>' containment reference.
	 * @see #setIncludesSingleCRS(SingleCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_IncludesSingleCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='includesSingleCRS' namespace='##targetNamespace' affiliation='componentReferenceSystem'"
	 * @generated
	 */
	SingleCRSPropertyType getIncludesSingleCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getIncludesSingleCRS <em>Includes Single CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes Single CRS</em>' containment reference.
	 * @see #getIncludesSingleCRS()
	 * @generated
	 */
	void setIncludesSingleCRS(SingleCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Includes Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Value</em>' containment reference.
	 * @see #setIncludesValue(AbstractGeneralParameterValuePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_IncludesValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='includesValue' namespace='##targetNamespace' affiliation='parameterValue'"
	 * @generated
	 */
	AbstractGeneralParameterValuePropertyType getIncludesValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getIncludesValue <em>Includes Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes Value</em>' containment reference.
	 * @see #getIncludesValue()
	 * @generated
	 */
	void setIncludesValue(AbstractGeneralParameterValuePropertyType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameterValue is a composition association to a parameter value or group of parameter values used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference.
	 * @see #setParameterValue(AbstractGeneralParameterValuePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ParameterValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractGeneralParameterValuePropertyType getParameterValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValue <em>Parameter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value</em>' containment reference.
	 * @see #getParameterValue()
	 * @generated
	 */
	void setParameterValue(AbstractGeneralParameterValuePropertyType value);

	/**
	 * Returns the value of the '<em><b>Indirect Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirect Entry</em>' containment reference.
	 * @see #setIndirectEntry(IndirectEntryType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_IndirectEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indirectEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	IndirectEntryType getIndirectEntry();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getIndirectEntry <em>Indirect Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indirect Entry</em>' containment reference.
	 * @see #getIndirectEntry()
	 * @generated
	 */
	void setIndirectEntry(IndirectEntryType value);

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:integerValue is a positive integer value of an operation parameter, usually used for a count. An integer value does not have an associated unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_IntegerValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='integerValue' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIntegerValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Integer Value List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:integerValueList is an ordered sequence of two or more integer values of an operation parameter list, usually used for counts. These integer values do not have an associated unit of measure. An element of this type contains a space-separated sequence of integer values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integer Value List</em>' attribute.
	 * @see #setIntegerValueList(List)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_IntegerValueList()
	 * @model unique="false" dataType="net.opengis.gml.gml.IntegerList" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='integerValueList' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getIntegerValueList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getIntegerValueList <em>Integer Value List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value List</em>' attribute.
	 * @see #getIntegerValueList()
	 * @generated
	 */
	void setIntegerValueList(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>Interior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. The "interior" rings separate the surface / surface patch from the area enclosed by the rings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interior</em>' containment reference.
	 * @see #setInterior(AbstractRingPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Interior()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interior' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractRingPropertyType getInterior();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getInterior <em>Interior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior</em>' containment reference.
	 * @see #getInterior()
	 * @generated
	 */
	void setInterior(AbstractRingPropertyType value);

	/**
	 * Returns the value of the '<em><b>Linear CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:linearCS is an association role to the linear coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear CS</em>' containment reference.
	 * @see #setLinearCS(LinearCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LinearCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linearCS' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearCSPropertyType getLinearCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCS <em>Linear CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear CS</em>' containment reference.
	 * @see #getLinearCS()
	 * @generated
	 */
	void setLinearCS(LinearCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Linear CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:linearCS is an association role to the linear coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear CS1</em>' containment reference.
	 * @see #setLinearCS1(LinearCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LinearCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linearCS' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearCSPropertyType getLinearCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCS1 <em>Linear CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear CS1</em>' containment reference.
	 * @see #getLinearCS1()
	 * @generated
	 */
	void setLinearCS1(LinearCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Linear CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:LinearCS is a one-dimensional coordinate system that consists of the points that lie on the single axis described. The associated coordinate is the distance – with or without offset – from the specified datum to the point along the axis. A LinearCS shall have one gml:axis property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear CS2</em>' containment reference.
	 * @see #setLinearCS2(LinearCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LinearCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinearCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	LinearCSType getLinearCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCS2 <em>Linear CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear CS2</em>' containment reference.
	 * @see #getLinearCS2()
	 * @generated
	 */
	void setLinearCS2(LinearCSType value);

	/**
	 * Returns the value of the '<em><b>Linear CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:LinearCS is a one-dimensional coordinate system that consists of the points that lie on the single axis described. The associated coordinate is the distance – with or without offset – from the specified datum to the point along the axis. A LinearCS shall have one gml:axis property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear CS3</em>' containment reference.
	 * @see #setLinearCS3(LinearCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LinearCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinearCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	LinearCSType getLinearCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCS3 <em>Linear CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear CS3</em>' containment reference.
	 * @see #getLinearCS3()
	 * @generated
	 */
	void setLinearCS3(LinearCSType value);

	/**
	 * Returns the value of the '<em><b>Linear CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear CS Ref</em>' containment reference.
	 * @see #setLinearCSRef(LinearCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LinearCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linearCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearCSPropertyType getLinearCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearCSRef <em>Linear CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear CS Ref</em>' containment reference.
	 * @see #getLinearCSRef()
	 * @generated
	 */
	void setLinearCSRef(LinearCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LinearRing is defined by four or more coordinate tuples, with linear interpolation between them; the first and last coordinates shall be coincident. The number of direct positions in the list shall be at least four.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Ring</em>' containment reference.
	 * @see #setLinearRing(LinearRingType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LinearRing()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinearRing' namespace='##targetNamespace' affiliation='AbstractRing'"
	 * @generated
	 */
	LinearRingType getLinearRing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLinearRing <em>Linear Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Ring</em>' containment reference.
	 * @see #getLinearRing()
	 * @generated
	 */
	void setLinearRing(LinearRingType value);

	/**
	 * Returns the value of the '<em><b>Line String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LineString is a special curve that consists of a single segment with linear interpolation. It is defined by two or more coordinate tuples, with linear interpolation between them. The number of direct positions in the list shall be at least two.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line String</em>' containment reference.
	 * @see #setLineString(LineStringType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LineString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineString' namespace='##targetNamespace' affiliation='AbstractCurve'"
	 * @generated
	 */
	LineStringType getLineString();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLineString <em>Line String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line String</em>' containment reference.
	 * @see #getLineString()
	 * @generated
	 */
	void setLineString(LineStringType value);

	/**
	 * Returns the value of the '<em><b>Line String Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LineStringSegment is a curve segment that is defined by two or more control points including the start and end point, with linear interpolation between them.
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line String Segment</em>' containment reference.
	 * @see #setLineStringSegment(LineStringSegmentType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LineStringSegment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStringSegment' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	LineStringSegmentType getLineStringSegment();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLineStringSegment <em>Line String Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line String Segment</em>' containment reference.
	 * @see #getLineStringSegment()
	 * @generated
	 */
	void setLineStringSegment(LineStringSegmentType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationPropertyType getLocation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Location Key Word</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Key Word</em>' containment reference.
	 * @see #setLocationKeyWord(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LocationKeyWord()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationKeyWord' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getLocationKeyWord();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLocationKeyWord <em>Location Key Word</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Key Word</em>' containment reference.
	 * @see #getLocationKeyWord()
	 * @generated
	 */
	void setLocationKeyWord(CodeType value);

	/**
	 * Returns the value of the '<em><b>Location Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:locationName property element is a convenience property where the text value describes the location of the feature. If the location names are selected from a controlled list, then the list shall be identified in the codeSpace attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Name</em>' containment reference.
	 * @see #setLocationName(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LocationName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locationName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getLocationName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLocationName <em>Location Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Name</em>' containment reference.
	 * @see #getLocationName()
	 * @generated
	 */
	void setLocationName(CodeType value);

	/**
	 * Returns the value of the '<em><b>Location Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:locationReference property element is a convenience property where the text value referenced by the xlink:href attribute describes the location of the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Reference</em>' containment reference.
	 * @see #setLocationReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LocationReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getLocationReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLocationReference <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Reference</em>' containment reference.
	 * @see #getLocationReference()
	 * @generated
	 */
	void setLocationReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Location String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location String</em>' containment reference.
	 * @see #setLocationString(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_LocationString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationString' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getLocationString();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getLocationString <em>Location String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location String</em>' containment reference.
	 * @see #getLocationString()
	 * @generated
	 */
	void setLocationString(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Mapping Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rule</em>' containment reference.
	 * @see #setMappingRule(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MappingRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MappingRule' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getMappingRule();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMappingRule <em>Mapping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Rule</em>' containment reference.
	 * @see #getMappingRule()
	 * @generated
	 */
	void setMappingRule(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Maximal Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximal Complex</em>' containment reference.
	 * @see #setMaximalComplex(TopoComplexPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MaximalComplex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maximalComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoComplexPropertyType getMaximalComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMaximalComplex <em>Maximal Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximal Complex</em>' containment reference.
	 * @see #getMaximalComplex()
	 * @generated
	 */
	void setMaximalComplex(TopoComplexPropertyType value);

	/**
	 * Returns the value of the '<em><b>Maximum Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:maximumOccurs is the maximum number of times that values for this parameter group may be included. If this attribute is omitted, the maximum number shall be one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Occurs</em>' attribute.
	 * @see #setMaximumOccurs(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MaximumOccurs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maximumOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaximumOccurs();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMaximumOccurs <em>Maximum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Occurs</em>' attribute.
	 * @see #getMaximumOccurs()
	 * @generated
	 */
	void setMaximumOccurs(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:minimumValue and gml:maximumValue properties allow the specification of minimum and maximum value normally allowed for this axis, in the unit of measure for the axis. For a continuous angular axis such as longitude, the values wrap-around at this value. Also, values beyond this minimum/maximum can be used for specified purposes, such as in a bounding box. A value of minus infinity shall be allowed for the gml:minimumValue element, a value of plus infiniy for the gml:maximumValue element. If these elements are omitted, the value is unspecified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Value</em>' attribute.
	 * @see #setMaximumValue(double)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MaximumValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maximumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaximumValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' attribute.
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(double value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of a physical quantity, together with its unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Measure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getMeasure();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(AssociationRoleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Member()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationRoleType getMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(AssociationRoleType value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference.
	 * @see #setMembers(ArrayAssociationType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Members()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='members' namespace='##targetNamespace'"
	 * @generated
	 */
	ArrayAssociationType getMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMembers <em>Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Members</em>' containment reference.
	 * @see #getMembers()
	 * @generated
	 */
	void setMembers(ArrayAssociationType value);

	/**
	 * Returns the value of the '<em><b>Meta Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Property</em>' containment reference.
	 * @see #setMetaDataProperty(MetaDataPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MetaDataProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='metaDataProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaDataPropertyType getMetaDataProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMetaDataProperty <em>Meta Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Property</em>' containment reference.
	 * @see #getMetaDataProperty()
	 * @generated
	 */
	void setMetaDataProperty(MetaDataPropertyType value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:method is an association role to the operation method used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(OperationMethodPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Method()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationMethodPropertyType getMethod();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(OperationMethodPropertyType value);

	/**
	 * Returns the value of the '<em><b>Method Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Formula</em>' containment reference.
	 * @see #setMethodFormula(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MethodFormula()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='methodFormula' namespace='##targetNamespace' affiliation='formula'"
	 * @generated
	 */
	CodeType getMethodFormula();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMethodFormula <em>Method Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Formula</em>' containment reference.
	 * @see #getMethodFormula()
	 * @generated
	 */
	void setMethodFormula(CodeType value);

	/**
	 * Returns the value of the '<em><b>Minimum Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:minimumOccurs is the minimum number of times that values for this parameter group or parameter are required. If this attribute is omitted, the minimum number shall be one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Occurs</em>' attribute.
	 * @see #setMinimumOccurs(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MinimumOccurs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minimumOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinimumOccurs();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMinimumOccurs <em>Minimum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Occurs</em>' attribute.
	 * @see #getMinimumOccurs()
	 * @generated
	 */
	void setMinimumOccurs(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:minimumValue and gml:maximumValue properties allow the specification of minimum and maximum value normally allowed for this axis, in the unit of measure for the axis. For a continuous angular axis such as longitude, the values wrap-around at this value. Also, values beyond this minimum/maximum can be used for specified purposes, such as in a bounding box. A value of minus infinity shall be allowed for the gml:minimumValue element, a value of plus infiniy for the gml:maximumValue element. If these elements are omitted, the value is unspecified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Value</em>' attribute.
	 * @see #setMinimumValue(double)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MinimumValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minimumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinimumValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' attribute.
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(double value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Minutes()
	 * @model unique="false" dataType="net.opengis.gml.gml.ArcMinutesType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minutes' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinutes();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Modified Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:modifiedCoordinate is a positive integer defining a position in a coordinate tuple.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified Coordinate</em>' attribute.
	 * @see #setModifiedCoordinate(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ModifiedCoordinate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modifiedCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getModifiedCoordinate();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getModifiedCoordinate <em>Modified Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Coordinate</em>' attribute.
	 * @see #getModifiedCoordinate()
	 * @generated
	 */
	void setModifiedCoordinate(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Moving Object Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moving Object Status</em>' containment reference.
	 * @see #setMovingObjectStatus(MovingObjectStatusType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MovingObjectStatus()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovingObjectStatus' namespace='##targetNamespace' affiliation='AbstractTimeSlice'"
	 * @generated
	 */
	MovingObjectStatusType getMovingObjectStatus();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMovingObjectStatus <em>Moving Object Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moving Object Status</em>' containment reference.
	 * @see #getMovingObjectStatus()
	 * @generated
	 */
	void setMovingObjectStatus(MovingObjectStatusType value);

	/**
	 * Returns the value of the '<em><b>Multi Center Line Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Center Line Of</em>' containment reference.
	 * @see #setMultiCenterLineOf(MultiCurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiCenterLineOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiCenterLineOf' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getMultiCenterLineOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCenterLineOf <em>Multi Center Line Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Center Line Of</em>' containment reference.
	 * @see #getMultiCenterLineOf()
	 * @generated
	 */
	void setMultiCenterLineOf(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Center Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Center Of</em>' containment reference.
	 * @see #setMultiCenterOf(MultiPointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiCenterOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiCenterOf' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiPointPropertyType getMultiCenterOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCenterOf <em>Multi Center Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Center Of</em>' containment reference.
	 * @see #getMultiCenterOf()
	 * @generated
	 */
	void setMultiCenterOf(MultiPointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Coverage</em>' containment reference.
	 * @see #setMultiCoverage(MultiSurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiCoverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiCoverage' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getMultiCoverage();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCoverage <em>Multi Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Coverage</em>' containment reference.
	 * @see #getMultiCoverage()
	 * @generated
	 */
	void setMultiCoverage(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:MultiCurve is defined by one or more gml:AbstractCurves.
	 * The members of the geometric aggregate may be specified either using the "standard" property (gml:curveMember) or the array property (gml:curveMembers). It is also valid to use both the "standard" and the array properties in the same collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Curve</em>' containment reference.
	 * @see #setMultiCurve(MultiCurveType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiCurve()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiCurve' namespace='##targetNamespace' affiliation='AbstractGeometricAggregate'"
	 * @generated
	 */
	MultiCurveType getMultiCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCurve <em>Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Curve</em>' containment reference.
	 * @see #getMultiCurve()
	 * @generated
	 */
	void setMultiCurve(MultiCurveType value);

	/**
	 * Returns the value of the '<em><b>Multi Curve Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a gml:MultiCurveCoverage the domain is partioned into a collection of curves comprising a gml:MultiCurve.  The coverage function then maps each curve in the collection to a value in the range set.
	 * The content model is identical with gml:DiscreteCoverageType, but that gml:domainSet shall have values gml:MultiCurve.
	 * In a gml:MultiCurveCoverage the mapping from the domain to the range is straightforward.
	 * -	For gml:DataBlock encodings the curves of the gml:MultiCurve are mapped in document order to the tuples of the data block.
	 * -	For gml:CompositeValue encodings the curves of the gml:MultiCurve are mapped to the members of the composite value in document order.
	 * -	For gml:File encodings the curves of the gml:MultiCurve are mapped to the records of the file in sequential order.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Curve Coverage</em>' containment reference.
	 * @see #setMultiCurveCoverage(DiscreteCoverageType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiCurveCoverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiCurveCoverage' namespace='##targetNamespace' affiliation='AbstractDiscreteCoverage'"
	 * @generated
	 */
	DiscreteCoverageType getMultiCurveCoverage();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCurveCoverage <em>Multi Curve Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Curve Coverage</em>' containment reference.
	 * @see #getMultiCurveCoverage()
	 * @generated
	 */
	void setMultiCurveCoverage(DiscreteCoverageType value);

	/**
	 * Returns the value of the '<em><b>Multi Curve Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Curve Domain</em>' containment reference.
	 * @see #setMultiCurveDomain(DomainSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiCurveDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiCurveDomain' namespace='##targetNamespace' affiliation='domainSet'"
	 * @generated
	 */
	DomainSetType getMultiCurveDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCurveDomain <em>Multi Curve Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Curve Domain</em>' containment reference.
	 * @see #getMultiCurveDomain()
	 * @generated
	 */
	void setMultiCurveDomain(DomainSetType value);

	/**
	 * Returns the value of the '<em><b>Multi Curve Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Curve Property</em>' containment reference.
	 * @see #setMultiCurveProperty(MultiCurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiCurveProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiCurveProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getMultiCurveProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiCurveProperty <em>Multi Curve Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Curve Property</em>' containment reference.
	 * @see #getMultiCurveProperty()
	 * @generated
	 */
	void setMultiCurveProperty(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Edge Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Edge Of</em>' containment reference.
	 * @see #setMultiEdgeOf(MultiCurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiEdgeOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiEdgeOf' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getMultiEdgeOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiEdgeOf <em>Multi Edge Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Edge Of</em>' containment reference.
	 * @see #getMultiEdgeOf()
	 * @generated
	 */
	void setMultiEdgeOf(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Extent Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Extent Of</em>' containment reference.
	 * @see #setMultiExtentOf(MultiSurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiExtentOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiExtentOf' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getMultiExtentOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiExtentOf <em>Multi Extent Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Extent Of</em>' containment reference.
	 * @see #getMultiExtentOf()
	 * @generated
	 */
	void setMultiExtentOf(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:MultiGeometry is a collection of one or more GML geometry objects of arbitrary type. 
	 * The members of the geometric aggregate may be specified either using the "standard" property (gml:geometryMember) or the array property (gml:geometryMembers). It is also valid to use both the "standard" and the array properties in the same collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Geometry</em>' containment reference.
	 * @see #setMultiGeometry(MultiGeometryType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiGeometry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiGeometry' namespace='##targetNamespace' affiliation='AbstractGeometricAggregate'"
	 * @generated
	 */
	MultiGeometryType getMultiGeometry();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiGeometry <em>Multi Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Geometry</em>' containment reference.
	 * @see #getMultiGeometry()
	 * @generated
	 */
	void setMultiGeometry(MultiGeometryType value);

	/**
	 * Returns the value of the '<em><b>Multi Geometry Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry Property</em>' containment reference.
	 * @see #setMultiGeometryProperty(MultiGeometryPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiGeometryProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiGeometryProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiGeometryPropertyType getMultiGeometryProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiGeometryProperty <em>Multi Geometry Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Geometry Property</em>' containment reference.
	 * @see #getMultiGeometryProperty()
	 * @generated
	 */
	void setMultiGeometryProperty(MultiGeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Location</em>' containment reference.
	 * @see #setMultiLocation(MultiPointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiLocation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiPointPropertyType getMultiLocation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiLocation <em>Multi Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Location</em>' containment reference.
	 * @see #getMultiLocation()
	 * @generated
	 */
	void setMultiLocation(MultiPointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:MultiPoint consists of one or more gml:Points.
	 * The members of the geometric aggregate may be specified either using the "standard" property (gml:pointMember) or the array property (gml:pointMembers). It is also valid to use both the "standard" and the array properties in the same collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Point</em>' containment reference.
	 * @see #setMultiPoint(MultiPointType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiPoint' namespace='##targetNamespace' affiliation='AbstractGeometricAggregate'"
	 * @generated
	 */
	MultiPointType getMultiPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPoint <em>Multi Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Point</em>' containment reference.
	 * @see #getMultiPoint()
	 * @generated
	 */
	void setMultiPoint(MultiPointType value);

	/**
	 * Returns the value of the '<em><b>Multi Point Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a gml:MultiPointCoverage the domain set is a gml:MultiPoint, that is a collection of arbitrarily distributed geometric points.
	 * The content model is identical with gml:DiscreteCoverageType, but that gml:domainSet shall have values gml:MultiPoint.
	 * In a gml:MultiPointCoverage the mapping from the domain to the range is straightforward.
	 * -	For gml:DataBlock encodings the points of the gml:MultiPoint are mapped in document order to the tuples of the data block.
	 * -	For gml:CompositeValue encodings the points of the gml:MultiPoint are mapped to the members of the composite value in document order.
	 * -	For gml:File encodings the points of the gml:MultiPoint are mapped to the records of the file in sequential order.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Point Coverage</em>' containment reference.
	 * @see #setMultiPointCoverage(DiscreteCoverageType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiPointCoverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiPointCoverage' namespace='##targetNamespace' affiliation='AbstractDiscreteCoverage'"
	 * @generated
	 */
	DiscreteCoverageType getMultiPointCoverage();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPointCoverage <em>Multi Point Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Point Coverage</em>' containment reference.
	 * @see #getMultiPointCoverage()
	 * @generated
	 */
	void setMultiPointCoverage(DiscreteCoverageType value);

	/**
	 * Returns the value of the '<em><b>Multi Point Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Point Domain</em>' containment reference.
	 * @see #setMultiPointDomain(DomainSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiPointDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiPointDomain' namespace='##targetNamespace' affiliation='domainSet'"
	 * @generated
	 */
	DomainSetType getMultiPointDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPointDomain <em>Multi Point Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Point Domain</em>' containment reference.
	 * @see #getMultiPointDomain()
	 * @generated
	 */
	void setMultiPointDomain(DomainSetType value);

	/**
	 * Returns the value of the '<em><b>Multi Point Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Point Property</em>' containment reference.
	 * @see #setMultiPointProperty(MultiPointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiPointProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiPointProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiPointPropertyType getMultiPointProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPointProperty <em>Multi Point Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Point Property</em>' containment reference.
	 * @see #getMultiPointProperty()
	 * @generated
	 */
	void setMultiPointProperty(MultiPointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Position</em>' containment reference.
	 * @see #setMultiPosition(MultiPointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiPosition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiPointPropertyType getMultiPosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiPosition <em>Multi Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Position</em>' containment reference.
	 * @see #getMultiPosition()
	 * @generated
	 */
	void setMultiPosition(MultiPointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:MultiSolid is defined by one or more gml:AbstractSolids.
	 * The members of the geometric aggregate may be specified either using the "standard" property (gml:solidMember) or the array property (gml:solidMembers). It is also valid to use both the "standard" and the array properties in the same collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Solid</em>' containment reference.
	 * @see #setMultiSolid(MultiSolidType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiSolid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiSolid' namespace='##targetNamespace' affiliation='AbstractGeometricAggregate'"
	 * @generated
	 */
	MultiSolidType getMultiSolid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSolid <em>Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Solid</em>' containment reference.
	 * @see #getMultiSolid()
	 * @generated
	 */
	void setMultiSolid(MultiSolidType value);

	/**
	 * Returns the value of the '<em><b>Multi Solid Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a gml:MultiSolidCoverage the domain is partioned into a collection of solids comprising a gml:MultiSolid.  The coverage function than maps each solid in the collection to a value in the range set.
	 * The content model is identical with gml:DiscreteCoverageType, but that gml:domainSet shall have values gml:MultiSolid.
	 * In a gml:MultiSolidCoverage the mapping from the domain to the range is straightforward.
	 * -	For gml:DataBlock encodings the solids of the gml:MultiSolid are mapped in document order to the tuples of the data block.
	 * -	For gml:CompositeValue encodings the solids of the gml:MultiSolid are mapped to the members of the composite value in document order.
	 * -	For gml:File encodings the solids of the gml:MultiSolid are mapped to the records of the file in sequential order.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Solid Coverage</em>' containment reference.
	 * @see #setMultiSolidCoverage(DiscreteCoverageType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiSolidCoverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiSolidCoverage' namespace='##targetNamespace' affiliation='AbstractDiscreteCoverage'"
	 * @generated
	 */
	DiscreteCoverageType getMultiSolidCoverage();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSolidCoverage <em>Multi Solid Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Solid Coverage</em>' containment reference.
	 * @see #getMultiSolidCoverage()
	 * @generated
	 */
	void setMultiSolidCoverage(DiscreteCoverageType value);

	/**
	 * Returns the value of the '<em><b>Multi Solid Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Solid Domain</em>' containment reference.
	 * @see #setMultiSolidDomain(DomainSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiSolidDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiSolidDomain' namespace='##targetNamespace' affiliation='domainSet'"
	 * @generated
	 */
	DomainSetType getMultiSolidDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSolidDomain <em>Multi Solid Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Solid Domain</em>' containment reference.
	 * @see #getMultiSolidDomain()
	 * @generated
	 */
	void setMultiSolidDomain(DomainSetType value);

	/**
	 * Returns the value of the '<em><b>Multi Solid Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Solid Property</em>' containment reference.
	 * @see #setMultiSolidProperty(MultiSolidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiSolidProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiSolidProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSolidPropertyType getMultiSolidProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSolidProperty <em>Multi Solid Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Solid Property</em>' containment reference.
	 * @see #getMultiSolidProperty()
	 * @generated
	 */
	void setMultiSolidProperty(MultiSolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:MultiSurface is defined by one or more gml:AbstractSurfaces.
	 * The members of the geometric aggregate may be specified either using the "standard" property (gml:surfaceMember) or the array property (gml:surfaceMembers). It is also valid to use both the "standard" and the array properties in the same collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Surface</em>' containment reference.
	 * @see #setMultiSurface(MultiSurfaceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiSurface' namespace='##targetNamespace' affiliation='AbstractGeometricAggregate'"
	 * @generated
	 */
	MultiSurfaceType getMultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSurface <em>Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Surface</em>' containment reference.
	 * @see #getMultiSurface()
	 * @generated
	 */
	void setMultiSurface(MultiSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Multi Surface Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a gml:MultiSurfaceCoverage the domain is partioned into a collection of surfaces comprising a gml:MultiSurface.  The coverage function than maps each surface in the collection to a value in the range set.
	 * The content model is identical with gml:DiscreteCoverageType, but that gml:domainSet shall have values gml:MultiSurface.
	 * In a gml:MultiSurfaceCoverage the mapping from the domain to the range is straightforward.
	 * -	For gml:DataBlock encodings the surfaces of the gml:MultiSurface are mapped in document order to the tuples of the data block.
	 * -	For gml:CompositeValue encodings the surfaces of the gml:MultiSurface are mapped to the members of the composite value in document order.
	 * -	For gml:File encodings the surfaces of the gml:MultiSurface are mapped to the records of the file in sequential order.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Surface Coverage</em>' containment reference.
	 * @see #setMultiSurfaceCoverage(DiscreteCoverageType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiSurfaceCoverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiSurfaceCoverage' namespace='##targetNamespace' affiliation='AbstractDiscreteCoverage'"
	 * @generated
	 */
	DiscreteCoverageType getMultiSurfaceCoverage();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSurfaceCoverage <em>Multi Surface Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Surface Coverage</em>' containment reference.
	 * @see #getMultiSurfaceCoverage()
	 * @generated
	 */
	void setMultiSurfaceCoverage(DiscreteCoverageType value);

	/**
	 * Returns the value of the '<em><b>Multi Surface Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Surface Domain</em>' containment reference.
	 * @see #setMultiSurfaceDomain(DomainSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiSurfaceDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiSurfaceDomain' namespace='##targetNamespace' affiliation='domainSet'"
	 * @generated
	 */
	DomainSetType getMultiSurfaceDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSurfaceDomain <em>Multi Surface Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Surface Domain</em>' containment reference.
	 * @see #getMultiSurfaceDomain()
	 * @generated
	 */
	void setMultiSurfaceDomain(DomainSetType value);

	/**
	 * Returns the value of the '<em><b>Multi Surface Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Surface Property</em>' containment reference.
	 * @see #setMultiSurfaceProperty(MultiSurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_MultiSurfaceProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiSurfaceProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getMultiSurfaceProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getMultiSurfaceProperty <em>Multi Surface Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Surface Property</em>' containment reference.
	 * @see #getMultiSurfaceProperty()
	 * @generated
	 */
	void setMultiSurfaceProperty(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:name property provides a label or identifier for the object, commonly a descriptive name. An object may have several names, typically assigned by different authorities. gml:name uses the gml:CodeType content model.  The authority for a name is indicated by the value of its (optional) codeSpace attribute.  The name may or may not be unique, as determined by the rules of the organization responsible for the codeSpace.  In common usage there will be one name per authority, so a processing application may select the name from its preferred codeSpace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Name()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CodeType value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:Node represents the 0-dimensional primitive.
	 * The optional coboundary of a node (gml:directedEdge) is a sequence of directed edges which are incident on this node. Edges emanating from this node appear in the node coboundary with a negative orientation. 
	 * If provided, the aggregationType attribute shall have the value "sequence".
	 * A node may optionally be realised by a 0-dimensional geometric primitive (gml:pointProperty).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(NodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Node()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Node' namespace='##targetNamespace' affiliation='AbstractTopoPrimitive'"
	 * @generated
	 */
	NodeType getNode();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(NodeType value);

	/**
	 * Returns the value of the '<em><b>Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' attribute.
	 * @see #setNull(Object)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Null()
	 * @model unique="false" dataType="net.opengis.gml.gml.NilReasonType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNull();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getNull <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null</em>' attribute.
	 * @see #getNull()
	 * @generated
	 */
	void setNull(Object value);

	/**
	 * Returns the value of the '<em><b>Oblique Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oblique Cartesian CS</em>' containment reference.
	 * @see #setObliqueCartesianCS(ObliqueCartesianCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ObliqueCartesianCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObliqueCartesianCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	ObliqueCartesianCSType getObliqueCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getObliqueCartesianCS <em>Oblique Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oblique Cartesian CS</em>' containment reference.
	 * @see #getObliqueCartesianCS()
	 * @generated
	 */
	void setObliqueCartesianCS(ObliqueCartesianCSType value);

	/**
	 * Returns the value of the '<em><b>Oblique Cartesian CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oblique Cartesian CS Ref</em>' containment reference.
	 * @see #setObliqueCartesianCSRef(ObliqueCartesianCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ObliqueCartesianCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='obliqueCartesianCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ObliqueCartesianCSPropertyType getObliqueCartesianCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getObliqueCartesianCSRef <em>Oblique Cartesian CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oblique Cartesian CS Ref</em>' containment reference.
	 * @see #getObliqueCartesianCSRef()
	 * @generated
	 */
	void setObliqueCartesianCSRef(ObliqueCartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Offset Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An offset curve is a curve at a constant distance from the basis curve. offsetBase is the base curve from which this curve is defined as an offset. distance and refDirection have the same meaning as specified in ISO 19107:2003, 6.4.23.
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset Curve</em>' containment reference.
	 * @see #setOffsetCurve(OffsetCurveType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OffsetCurve()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OffsetCurve' namespace='##targetNamespace' affiliation='AbstractCurveSegment'"
	 * @generated
	 */
	OffsetCurveType getOffsetCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOffsetCurve <em>Offset Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Curve</em>' containment reference.
	 * @see #getOffsetCurve()
	 * @generated
	 */
	void setOffsetCurve(OffsetCurveType value);

	/**
	 * Returns the value of the '<em><b>Operation Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:OperationMethod is a method (algorithm or procedure) used to perform a coordinate operation. Most operation methods use a number of operation parameters, although some coordinate conversions use none. Each coordinate operation using the method assigns values to these parameters.
	 * The parameter elements are an unordered list of associations to the set of operation parameters and parameter groups used by this operation method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Method</em>' containment reference.
	 * @see #setOperationMethod(OperationMethodType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationMethod' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	OperationMethodType getOperationMethod();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationMethod <em>Operation Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Method</em>' containment reference.
	 * @see #getOperationMethod()
	 * @generated
	 */
	void setOperationMethod(OperationMethodType value);

	/**
	 * Returns the value of the '<em><b>Operation Method Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Method Ref</em>' containment reference.
	 * @see #setOperationMethodRef(OperationMethodPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationMethodRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationMethodRef' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationMethodPropertyType getOperationMethodRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationMethodRef <em>Operation Method Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Method Ref</em>' containment reference.
	 * @see #getOperationMethodRef()
	 * @generated
	 */
	void setOperationMethodRef(OperationMethodPropertyType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:operationParameter is an association role to the operation parameter of which this is a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Parameter</em>' containment reference.
	 * @see #setOperationParameter(OperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationParameterPropertyType getOperationParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameter <em>Operation Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter</em>' containment reference.
	 * @see #getOperationParameter()
	 * @generated
	 */
	void setOperationParameter(OperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:operationParameter is an association role to the operation parameter of which this is a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Parameter1</em>' containment reference.
	 * @see #setOperationParameter1(OperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationParameter1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationParameterPropertyType getOperationParameter1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameter1 <em>Operation Parameter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter1</em>' containment reference.
	 * @see #getOperationParameter1()
	 * @generated
	 */
	void setOperationParameter1(OperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:OperationParameter is the definition of a parameter used by an operation method. Most parameter values are numeric, but other types of parameter values are possible. This complex type is expected to be used or extended for all operation methods, without defining operation-method-specialized element names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Parameter2</em>' containment reference.
	 * @see #setOperationParameter2(OperationParameterType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationParameter2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationParameter' namespace='##targetNamespace' affiliation='AbstractGeneralOperationParameter'"
	 * @generated
	 */
	OperationParameterType getOperationParameter2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameter2 <em>Operation Parameter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter2</em>' containment reference.
	 * @see #getOperationParameter2()
	 * @generated
	 */
	void setOperationParameter2(OperationParameterType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:OperationParameter is the definition of a parameter used by an operation method. Most parameter values are numeric, but other types of parameter values are possible. This complex type is expected to be used or extended for all operation methods, without defining operation-method-specialized element names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Parameter3</em>' containment reference.
	 * @see #setOperationParameter3(OperationParameterType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationParameter3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationParameter' namespace='##targetNamespace' affiliation='AbstractGeneralOperationParameter'"
	 * @generated
	 */
	OperationParameterType getOperationParameter3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameter3 <em>Operation Parameter3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter3</em>' containment reference.
	 * @see #getOperationParameter3()
	 * @generated
	 */
	void setOperationParameter3(OperationParameterType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:OperationParameterGroup is the definition of a group of parameters used by an operation method. This complex type is expected to be used or extended for all applicable operation methods, without defining operation-method-specialized element names.
	 * The generalOperationParameter elements are an unordered list of associations to the set of operation parameters that are members of this group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Parameter Group</em>' containment reference.
	 * @see #setOperationParameterGroup(OperationParameterGroupType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationParameterGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationParameterGroup' namespace='##targetNamespace' affiliation='AbstractGeneralOperationParameter'"
	 * @generated
	 */
	OperationParameterGroupType getOperationParameterGroup();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameterGroup <em>Operation Parameter Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter Group</em>' containment reference.
	 * @see #getOperationParameterGroup()
	 * @generated
	 */
	void setOperationParameterGroup(OperationParameterGroupType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter Group Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Parameter Group Ref</em>' containment reference.
	 * @see #setOperationParameterGroupRef(OperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationParameterGroupRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationParameterGroupRef' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationParameterPropertyType getOperationParameterGroupRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameterGroupRef <em>Operation Parameter Group Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter Group Ref</em>' containment reference.
	 * @see #getOperationParameterGroupRef()
	 * @generated
	 */
	void setOperationParameterGroupRef(OperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Parameter Ref</em>' containment reference.
	 * @see #setOperationParameterRef(OperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationParameterRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationParameterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationParameterPropertyType getOperationParameterRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationParameterRef <em>Operation Parameter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter Ref</em>' containment reference.
	 * @see #getOperationParameterRef()
	 * @generated
	 */
	void setOperationParameterRef(OperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Operation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Ref</em>' containment reference.
	 * @see #setOperationRef(OperationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationPropertyType getOperationRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationRef <em>Operation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Ref</em>' containment reference.
	 * @see #getOperationRef()
	 * @generated
	 */
	void setOperationRef(OperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Operation Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:operationVersion is the version of the coordinate transformation (i.e., instantiation due to the stochastic nature of the parameters). Mandatory when describing a transformation, and should not be supplied for a conversion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Version</em>' attribute.
	 * @see #setOperationVersion(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OperationVersion()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOperationVersion();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOperationVersion <em>Operation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Version</em>' attribute.
	 * @see #getOperationVersion()
	 * @generated
	 */
	void setOperationVersion(String value);

	/**
	 * Returns the value of the '<em><b>Orientable Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrientableCurve consists of a curve and an orientation. If the orientation is "+", then the OrientableCurve is identical to the baseCurve. If the orientation is "-", then the OrientableCurve is related to another AbstractCurve with a parameterization that reverses the sense of the curve traversal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientable Curve</em>' containment reference.
	 * @see #setOrientableCurve(OrientableCurveType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OrientableCurve()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrientableCurve' namespace='##targetNamespace' affiliation='AbstractCurve'"
	 * @generated
	 */
	OrientableCurveType getOrientableCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOrientableCurve <em>Orientable Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientable Curve</em>' containment reference.
	 * @see #getOrientableCurve()
	 * @generated
	 */
	void setOrientableCurve(OrientableCurveType value);

	/**
	 * Returns the value of the '<em><b>Orientable Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrientableSurface consists of a surface and an orientation. If the orientation is "+", then the OrientableSurface is identical to the baseSurface. If the orientation is "-", then the OrientableSurface is a reference to a gml:AbstractSurface with an up-normal that reverses the direction for this OrientableSurface, the sense of "the top of the surface".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientable Surface</em>' containment reference.
	 * @see #setOrientableSurface(OrientableSurfaceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_OrientableSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrientableSurface' namespace='##targetNamespace' affiliation='AbstractSurface'"
	 * @generated
	 */
	OrientableSurfaceType getOrientableSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOrientableSurface <em>Orientable Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientable Surface</em>' containment reference.
	 * @see #getOrientableSurface()
	 * @generated
	 */
	void setOrientableSurface(OrientableSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:origin is the date and time origin of this temporal datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(XMLGregorianCalendar)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Origin()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOrigin();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameter is an association to an operation parameter or parameter group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(AbstractGeneralOperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Parameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractGeneralOperationParameterPropertyType getParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(AbstractGeneralOperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameterValue is a composition association to a parameter value or group of parameter values used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value1</em>' containment reference.
	 * @see #setParameterValue1(AbstractGeneralParameterValuePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ParameterValue1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractGeneralParameterValuePropertyType getParameterValue1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValue1 <em>Parameter Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value1</em>' containment reference.
	 * @see #getParameterValue1()
	 * @generated
	 */
	void setParameterValue1(AbstractGeneralParameterValuePropertyType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ParameterValue is a parameter value, an ordered sequence of values, or a reference to a file of parameter values. This concrete complex type may be used for operation methods without using an Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one instance. This complex type may be used, extended, or restricted for well-known operation methods, especially for methods with many instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value2</em>' containment reference.
	 * @see #setParameterValue2(ParameterValueType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ParameterValue2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterValue' namespace='##targetNamespace' affiliation='AbstractGeneralParameterValue'"
	 * @generated
	 */
	ParameterValueType getParameterValue2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValue2 <em>Parameter Value2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value2</em>' containment reference.
	 * @see #getParameterValue2()
	 * @generated
	 */
	void setParameterValue2(ParameterValueType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ParameterValue is a parameter value, an ordered sequence of values, or a reference to a file of parameter values. This concrete complex type may be used for operation methods without using an Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one instance. This complex type may be used, extended, or restricted for well-known operation methods, especially for methods with many instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value3</em>' containment reference.
	 * @see #setParameterValue3(ParameterValueType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ParameterValue3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterValue' namespace='##targetNamespace' affiliation='AbstractGeneralParameterValue'"
	 * @generated
	 */
	ParameterValueType getParameterValue3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValue3 <em>Parameter Value3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value3</em>' containment reference.
	 * @see #getParameterValue3()
	 * @generated
	 */
	void setParameterValue3(ParameterValueType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ParameterValueGroup is a group of related parameter values. The same group can be repeated more than once in a Conversion, Transformation, or higher level ParameterValueGroup, if those instances contain different values of one or more parameterValues which suitably distinquish among those groups. This concrete complex type can be used for operation methods without using an Application Schema that defines operation-method-specialized element names and contents. This complex type may be used, extended, or restricted for well-known operation methods, especially for methods with only one instance.
	 * The parameterValue elements are an unordered set of composition association roles to the parameter values and groups of values included in this group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value Group</em>' containment reference.
	 * @see #setParameterValueGroup(ParameterValueGroupType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ParameterValueGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterValueGroup' namespace='##targetNamespace' affiliation='AbstractGeneralParameterValue'"
	 * @generated
	 */
	ParameterValueGroupType getParameterValueGroup();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getParameterValueGroup <em>Parameter Value Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value Group</em>' containment reference.
	 * @see #getParameterValueGroup()
	 * @generated
	 */
	void setParameterValueGroup(ParameterValueGroupType value);

	/**
	 * Returns the value of the '<em><b>Pass Through Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:PassThroughOperation is a pass-through operation specifies that a subset of a coordinate tuple is subject to a specific coordinate operation.
	 * The modifiedCoordinate property elements are an ordered sequence of positive integers defining the positions in a coordinate tuple of the coordinates affected by this pass-through operation. The AggregationAttributeGroup should be used to specify that the modifiedCoordinate elements are ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pass Through Operation</em>' containment reference.
	 * @see #setPassThroughOperation(PassThroughOperationType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PassThroughOperation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PassThroughOperation' namespace='##targetNamespace' affiliation='AbstractSingleOperation'"
	 * @generated
	 */
	PassThroughOperationType getPassThroughOperation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPassThroughOperation <em>Pass Through Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Through Operation</em>' containment reference.
	 * @see #getPassThroughOperation()
	 * @generated
	 */
	void setPassThroughOperation(PassThroughOperationType value);

	/**
	 * Returns the value of the '<em><b>Pass Through Operation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass Through Operation Ref</em>' containment reference.
	 * @see #setPassThroughOperationRef(PassThroughOperationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PassThroughOperationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='passThroughOperationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	PassThroughOperationPropertyType getPassThroughOperationRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPassThroughOperationRef <em>Pass Through Operation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Through Operation Ref</em>' containment reference.
	 * @see #getPassThroughOperationRef()
	 * @generated
	 */
	void setPassThroughOperationRef(PassThroughOperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Patches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patches property element contains the sequence of surface patches. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patches</em>' containment reference.
	 * @see #setPatches(SurfacePatchArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Patches()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='patches' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePatchArrayPropertyType getPatches();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPatches <em>Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patches</em>' containment reference.
	 * @see #getPatches()
	 * @generated
	 */
	void setPatches(SurfacePatchArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Pixel In Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:pixelInCell is a specification of the way an image grid is associated with the image data attributes. The required codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pixel In Cell</em>' containment reference.
	 * @see #setPixelInCell(CodeWithAuthorityType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PixelInCell()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pixelInCell' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getPixelInCell();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPixelInCell <em>Pixel In Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixel In Cell</em>' containment reference.
	 * @see #getPixelInCell()
	 * @generated
	 */
	void setPixelInCell(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Point is defined by a single coordinate tuple. The direct position of a point is specified by the pos element which is of type DirectPositionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(PointType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Point()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace' affiliation='AbstractGeometricPrimitive'"
	 * @generated
	 */
	PointType getPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(PointType value);

	/**
	 * Returns the value of the '<em><b>Point Array Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Array Property</em>' containment reference.
	 * @see #setPointArrayProperty(PointArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PointArrayProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointArrayProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PointArrayPropertyType getPointArrayProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPointArrayProperty <em>Point Array Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Array Property</em>' containment reference.
	 * @see #getPointArrayProperty()
	 * @generated
	 */
	void setPointArrayProperty(PointArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Point Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a Point via the XLink-attributes or contains the Point element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Member</em>' containment reference.
	 * @see #setPointMember(PointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PointMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointMember' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getPointMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPointMember <em>Point Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Member</em>' containment reference.
	 * @see #getPointMember()
	 * @generated
	 */
	void setPointMember(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Point Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of points. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Members</em>' containment reference.
	 * @see #setPointMembers(PointArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PointMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	PointArrayPropertyType getPointMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPointMembers <em>Point Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Members</em>' containment reference.
	 * @see #getPointMembers()
	 * @generated
	 */
	void setPointMembers(PointArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Point Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Property</em>' containment reference.
	 * @see #setPointProperty(PointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PointProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getPointProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPointProperty <em>Point Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Property</em>' containment reference.
	 * @see #getPointProperty()
	 * @generated
	 */
	void setPointProperty(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Point Rep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Rep</em>' containment reference.
	 * @see #setPointRep(PointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PointRep()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointRep' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getPointRep();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPointRep <em>Point Rep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Rep</em>' containment reference.
	 * @see #getPointRep()
	 * @generated
	 */
	void setPointRep(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Polar CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:polarCS is an association role to the polar coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polar CS</em>' containment reference.
	 * @see #setPolarCS(PolarCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PolarCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polarCS' namespace='##targetNamespace'"
	 * @generated
	 */
	PolarCSPropertyType getPolarCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCS <em>Polar CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polar CS</em>' containment reference.
	 * @see #getPolarCS()
	 * @generated
	 */
	void setPolarCS(PolarCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Polar CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:polarCS is an association role to the polar coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polar CS1</em>' containment reference.
	 * @see #setPolarCS1(PolarCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PolarCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polarCS' namespace='##targetNamespace'"
	 * @generated
	 */
	PolarCSPropertyType getPolarCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCS1 <em>Polar CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polar CS1</em>' containment reference.
	 * @see #getPolarCS1()
	 * @generated
	 */
	void setPolarCS1(PolarCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Polar CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:PolarCS ia s two-dimensional coordinate system in which position is specified by the distance from the origin and the angle between the line from the origin to a point and a reference direction. A PolarCS shall have two gml:axis property elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polar CS2</em>' containment reference.
	 * @see #setPolarCS2(PolarCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PolarCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolarCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	PolarCSType getPolarCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCS2 <em>Polar CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polar CS2</em>' containment reference.
	 * @see #getPolarCS2()
	 * @generated
	 */
	void setPolarCS2(PolarCSType value);

	/**
	 * Returns the value of the '<em><b>Polar CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:PolarCS ia s two-dimensional coordinate system in which position is specified by the distance from the origin and the angle between the line from the origin to a point and a reference direction. A PolarCS shall have two gml:axis property elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polar CS3</em>' containment reference.
	 * @see #setPolarCS3(PolarCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PolarCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolarCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	PolarCSType getPolarCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCS3 <em>Polar CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polar CS3</em>' containment reference.
	 * @see #getPolarCS3()
	 * @generated
	 */
	void setPolarCS3(PolarCSType value);

	/**
	 * Returns the value of the '<em><b>Polar CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polar CS Ref</em>' containment reference.
	 * @see #setPolarCSRef(PolarCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PolarCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polarCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	PolarCSPropertyType getPolarCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolarCSRef <em>Polar CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polar CS Ref</em>' containment reference.
	 * @see #getPolarCSRef()
	 * @generated
	 */
	void setPolarCSRef(PolarCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Polygon is a special surface that is defined by a single surface patch (see D.3.6). The boundary of this patch is coplanar and the polygon uses planar interpolation in its interior. 
	 * The elements exterior and interior describe the surface boundary of the polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference.
	 * @see #setPolygon(PolygonType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Polygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Polygon' namespace='##targetNamespace' affiliation='AbstractSurface'"
	 * @generated
	 */
	PolygonType getPolygon();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolygon <em>Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon</em>' containment reference.
	 * @see #getPolygon()
	 * @generated
	 */
	void setPolygon(PolygonType value);

	/**
	 * Returns the value of the '<em><b>Polygon Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:PolygonPatch is a surface patch that is defined by a set of boundary curves and an underlying surface to which these curves adhere. The curves shall be coplanar and the polygon uses planar interpolation in its interior. 
	 * interpolation is fixed to "planar", i.e. an interpolation shall return points on a single plane. The boundary of the patch shall be contained within that plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygon Patch</em>' containment reference.
	 * @see #setPolygonPatch(PolygonPatchType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PolygonPatch()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolygonPatch' namespace='##targetNamespace' affiliation='AbstractSurfacePatch'"
	 * @generated
	 */
	PolygonPatchType getPolygonPatch();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolygonPatch <em>Polygon Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon Patch</em>' containment reference.
	 * @see #getPolygonPatch()
	 * @generated
	 */
	void setPolygonPatch(PolygonPatchType value);

	/**
	 * Returns the value of the '<em><b>Polygon Patches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Patches</em>' containment reference.
	 * @see #setPolygonPatches(SurfacePatchArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PolygonPatches()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polygonPatches' namespace='##targetNamespace' affiliation='patches'"
	 * @generated
	 */
	SurfacePatchArrayPropertyType getPolygonPatches();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolygonPatches <em>Polygon Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon Patches</em>' containment reference.
	 * @see #getPolygonPatches()
	 * @generated
	 */
	void setPolygonPatches(SurfacePatchArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Polyhedral Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A polyhedral surface is a surface composed of polygon patches connected along their common boundary curves. This differs from the surface type only in the restriction on the types of surface patches acceptable.
	 * polygonPatches encapsulates the polygon patches of the polyhedral surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polyhedral Surface</em>' containment reference.
	 * @see #setPolyhedralSurface(SurfaceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PolyhedralSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolyhedralSurface' namespace='##targetNamespace' affiliation='Surface'"
	 * @generated
	 */
	SurfaceType getPolyhedralSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPolyhedralSurface <em>Polyhedral Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polyhedral Surface</em>' containment reference.
	 * @see #getPolyhedralSurface()
	 * @generated
	 */
	void setPolyhedralSurface(SurfaceType value);

	/**
	 * Returns the value of the '<em><b>Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Surface is a 2-dimensional primitive and is composed of one or more surface patches as specified in ISO 19107:2003, 6.3.17.1. The surface patches are connected to one another.
	 * patches encapsulates the patches of the surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface</em>' containment reference.
	 * @see #setSurface(SurfaceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Surface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Surface' namespace='##targetNamespace' affiliation='AbstractSurface'"
	 * @generated
	 */
	SurfaceType getSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSurface <em>Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface</em>' containment reference.
	 * @see #getSurface()
	 * @generated
	 */
	void setSurface(SurfaceType value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(DirectPositionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Pos()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getPos();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Position()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getPosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Pos List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos List</em>' containment reference.
	 * @see #setPosList(DirectPositionListType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PosList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='posList' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionListType getPosList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPosList <em>Pos List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos List</em>' containment reference.
	 * @see #getPosList()
	 * @generated
	 */
	void setPosList(DirectPositionListType value);

	/**
	 * Returns the value of the '<em><b>Prime Meridian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:primeMeridian is an association role to the prime meridian used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prime Meridian</em>' containment reference.
	 * @see #setPrimeMeridian(PrimeMeridianPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PrimeMeridian()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primeMeridian' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimeMeridianPropertyType getPrimeMeridian();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridian <em>Prime Meridian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Meridian</em>' containment reference.
	 * @see #getPrimeMeridian()
	 * @generated
	 */
	void setPrimeMeridian(PrimeMeridianPropertyType value);

	/**
	 * Returns the value of the '<em><b>Prime Meridian1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:primeMeridian is an association role to the prime meridian used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prime Meridian1</em>' containment reference.
	 * @see #setPrimeMeridian1(PrimeMeridianPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PrimeMeridian1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primeMeridian' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimeMeridianPropertyType getPrimeMeridian1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridian1 <em>Prime Meridian1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Meridian1</em>' containment reference.
	 * @see #getPrimeMeridian1()
	 * @generated
	 */
	void setPrimeMeridian1(PrimeMeridianPropertyType value);

	/**
	 * Returns the value of the '<em><b>Prime Meridian2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:PrimeMeridian defines the origin from which longitude values are determined. The default value for the prime meridian gml:identifier value is "Greenwich".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prime Meridian2</em>' containment reference.
	 * @see #setPrimeMeridian2(PrimeMeridianType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PrimeMeridian2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PrimeMeridian' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	PrimeMeridianType getPrimeMeridian2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridian2 <em>Prime Meridian2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Meridian2</em>' containment reference.
	 * @see #getPrimeMeridian2()
	 * @generated
	 */
	void setPrimeMeridian2(PrimeMeridianType value);

	/**
	 * Returns the value of the '<em><b>Prime Meridian3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:PrimeMeridian defines the origin from which longitude values are determined. The default value for the prime meridian gml:identifier value is "Greenwich".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prime Meridian3</em>' containment reference.
	 * @see #setPrimeMeridian3(PrimeMeridianType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PrimeMeridian3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PrimeMeridian' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	PrimeMeridianType getPrimeMeridian3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridian3 <em>Prime Meridian3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Meridian3</em>' containment reference.
	 * @see #getPrimeMeridian3()
	 * @generated
	 */
	void setPrimeMeridian3(PrimeMeridianType value);

	/**
	 * Returns the value of the '<em><b>Prime Meridian Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prime Meridian Ref</em>' containment reference.
	 * @see #setPrimeMeridianRef(PrimeMeridianPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PrimeMeridianRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primeMeridianRef' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimeMeridianPropertyType getPrimeMeridianRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPrimeMeridianRef <em>Prime Meridian Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Meridian Ref</em>' containment reference.
	 * @see #getPrimeMeridianRef()
	 * @generated
	 */
	void setPrimeMeridianRef(PrimeMeridianPropertyType value);

	/**
	 * Returns the value of the '<em><b>Priority Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Location</em>' containment reference.
	 * @see #setPriorityLocation(PriorityLocationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_PriorityLocation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='priorityLocation' namespace='##targetNamespace' affiliation='location'"
	 * @generated
	 */
	PriorityLocationPropertyType getPriorityLocation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getPriorityLocation <em>Priority Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Location</em>' containment reference.
	 * @see #getPriorityLocation()
	 * @generated
	 */
	void setPriorityLocation(PriorityLocationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Projected CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ProjectedCRS is a 2D coordinate reference system used to approximate the shape of the earth on a planar surface, but in such a way that the distortion that is inherent to the approximation is carefully controlled and known. Distortion correction is commonly applied to calculated bearings and distances to produce values that are a close match to actual field values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Projected CRS</em>' containment reference.
	 * @see #setProjectedCRS(ProjectedCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ProjectedCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProjectedCRS' namespace='##targetNamespace' affiliation='AbstractGeneralDerivedCRS'"
	 * @generated
	 */
	ProjectedCRSType getProjectedCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getProjectedCRS <em>Projected CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected CRS</em>' containment reference.
	 * @see #getProjectedCRS()
	 * @generated
	 */
	void setProjectedCRS(ProjectedCRSType value);

	/**
	 * Returns the value of the '<em><b>Projected CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projected CRS Ref</em>' containment reference.
	 * @see #setProjectedCRSRef(ProjectedCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ProjectedCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='projectedCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ProjectedCRSPropertyType getProjectedCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getProjectedCRSRef <em>Projected CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected CRS Ref</em>' containment reference.
	 * @see #getProjectedCRSRef()
	 * @generated
	 */
	void setProjectedCRSRef(ProjectedCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An XML attribute uom ("unit of measure") is required, whose value is a URI which identifies the definition of a ratio scale or units by which the numeric value shall be multiplied, or an interval or position scale on which the value occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(QuantityType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Quantity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Quantity' namespace='##targetNamespace' affiliation='AbstractScalarValue'"
	 * @generated
	 */
	QuantityType getQuantity();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(QuantityType value);

	/**
	 * Returns the value of the '<em><b>Quantity Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Extent</em>' containment reference.
	 * @see #setQuantityExtent(QuantityExtentType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_QuantityExtent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QuantityExtent' namespace='##targetNamespace' affiliation='AbstractValue'"
	 * @generated
	 */
	QuantityExtentType getQuantityExtent();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantityExtent <em>Quantity Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Extent</em>' containment reference.
	 * @see #getQuantityExtent()
	 * @generated
	 */
	void setQuantityExtent(QuantityExtentType value);

	/**
	 * Returns the value of the '<em><b>Quantity List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity List</em>' containment reference.
	 * @see #setQuantityList(MeasureOrNilReasonListType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_QuantityList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QuantityList' namespace='##targetNamespace' affiliation='AbstractScalarValueList'"
	 * @generated
	 */
	MeasureOrNilReasonListType getQuantityList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantityList <em>Quantity List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity List</em>' containment reference.
	 * @see #getQuantityList()
	 * @generated
	 */
	void setQuantityList(MeasureOrNilReasonListType value);

	/**
	 * Returns the value of the '<em><b>Quantity Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:quantityType property indicates the phenomenon to which the units apply. This element contains an informal description of the phenomenon or type of physical quantity that is measured or observed. When the physical quantity is the result of an observation or measurement, this term is known as observable type or measurand.
	 * The use of gml:quantityType for references to remote values is deprecated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Type</em>' containment reference.
	 * @see #setQuantityType(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_QuantityType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantityType' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getQuantityType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantityType <em>Quantity Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Type</em>' containment reference.
	 * @see #getQuantityType()
	 * @generated
	 */
	void setQuantityType(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Quantity Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:quantityTypeReference property indicates the phenomenon to which the units apply. The content is a reference to a remote value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Type Reference</em>' containment reference.
	 * @see #setQuantityTypeReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_QuantityTypeReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantityTypeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getQuantityTypeReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getQuantityTypeReference <em>Quantity Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Type Reference</em>' containment reference.
	 * @see #getQuantityTypeReference()
	 * @generated
	 */
	void setQuantityTypeReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Range Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:rangeMeaning describes the meaning of axis value range specified by gml:minimumValue and gml:maximumValue. This element shall be omitted when both gml:minimumValue and gml:maximumValue are omitted. This element should be included when gml:minimumValue and/or gml:maximumValue are included. If this element is omitted when the gml:minimumValue and/or gml:maximumValue are included, the meaning is unspecified. The codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Meaning</em>' containment reference.
	 * @see #setRangeMeaning(CodeWithAuthorityType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RangeMeaning()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rangeMeaning' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getRangeMeaning();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRangeMeaning <em>Range Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Meaning</em>' containment reference.
	 * @see #getRangeMeaning()
	 * @generated
	 */
	void setRangeMeaning(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Range Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Parameters</em>' containment reference.
	 * @see #setRangeParameters(AssociationRoleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RangeParameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rangeParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationRoleType getRangeParameters();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRangeParameters <em>Range Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Parameters</em>' containment reference.
	 * @see #getRangeParameters()
	 * @generated
	 */
	void setRangeParameters(AssociationRoleType value);

	/**
	 * Returns the value of the '<em><b>Range Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:rangeSet property element contains the values of the coverage (sometimes called the attribute values).  Its content model is given by gml:RangeSetType.
	 * This content model supports a structural description of the range.  The semantic information describing the range set is embedded using a uniform method, as part of the explicit values, or as a template value accompanying the representation using gml:DataBlock and gml:File.
	 * The values from each component (or "band") in the range may be encoded within a gml:ValueArray element or a concrete member of the gml:AbstractScalarValueList substitution group . Use of these elements satisfies the value-type homogeneity requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Set</em>' containment reference.
	 * @see #setRangeSet(RangeSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RangeSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rangeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeSetType getRangeSet();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRangeSet <em>Range Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Set</em>' containment reference.
	 * @see #getRangeSet()
	 * @generated
	 */
	void setRangeSet(RangeSetType value);

	/**
	 * Returns the value of the '<em><b>Realization Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:realizationEpoch is the time after which this datum definition is valid. See ISO 19111 Table 32 for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization Epoch</em>' attribute.
	 * @see #setRealizationEpoch(XMLGregorianCalendar)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RealizationEpoch()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='realizationEpoch' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRealizationEpoch();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRealizationEpoch <em>Realization Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realization Epoch</em>' attribute.
	 * @see #getRealizationEpoch()
	 * @generated
	 */
	void setRealizationEpoch(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:Rectangle represents a rectangle as a surface patch with an outer boundary consisting of a linear ring. Note that this is a polygon (subtype) with no inner boundaries. The number of points in the linear ring shall be five.
	 * The ring (element exterior) shall be a gml:LinearRing and shall form a rectangle; the first and the last position shall be coincident.
	 * interpolation is fixed to "planar", i.e. an interpolation shall return points on a single plane. The boundary of the patch shall be contained within that plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rectangle</em>' containment reference.
	 * @see #setRectangle(RectangleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Rectangle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Rectangle' namespace='##targetNamespace' affiliation='AbstractSurfacePatch'"
	 * @generated
	 */
	RectangleType getRectangle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRectangle <em>Rectangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangle</em>' containment reference.
	 * @see #getRectangle()
	 * @generated
	 */
	void setRectangle(RectangleType value);

	/**
	 * Returns the value of the '<em><b>Rectified Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A rectified grid is a grid for which there is an affine transformation between the grid coordinates and the coordinates of an external coordinate reference system. It is defined by specifying the position (in some geometric space) of the grid "origin" and of the vectors that specify the post locations.
	 * Note that the grid limits (post indexes) and axis name properties are inherited from gml:GridType and that gml:RectifiedGrid adds a gml:origin property (contains or references a gml:Point) and a set of gml:offsetVector properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rectified Grid</em>' containment reference.
	 * @see #setRectifiedGrid(RectifiedGridType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RectifiedGrid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RectifiedGrid' namespace='##targetNamespace' affiliation='Grid'"
	 * @generated
	 */
	RectifiedGridType getRectifiedGrid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRectifiedGrid <em>Rectified Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectified Grid</em>' containment reference.
	 * @see #getRectifiedGrid()
	 * @generated
	 */
	void setRectifiedGrid(RectifiedGridType value);

	/**
	 * Returns the value of the '<em><b>Rectified Grid Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:RectifiedGridCoverage is a discrete point coverage based on a rectified grid. It is similar to the grid coverage except that the points of the grid are geometrically referenced. The rectified grid coverage has a domain that is a gml:RectifiedGrid geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rectified Grid Coverage</em>' containment reference.
	 * @see #setRectifiedGridCoverage(DiscreteCoverageType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RectifiedGridCoverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RectifiedGridCoverage' namespace='##targetNamespace' affiliation='AbstractDiscreteCoverage'"
	 * @generated
	 */
	DiscreteCoverageType getRectifiedGridCoverage();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRectifiedGridCoverage <em>Rectified Grid Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectified Grid Coverage</em>' containment reference.
	 * @see #getRectifiedGridCoverage()
	 * @generated
	 */
	void setRectifiedGridCoverage(DiscreteCoverageType value);

	/**
	 * Returns the value of the '<em><b>Rectified Grid Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectified Grid Domain</em>' containment reference.
	 * @see #setRectifiedGridDomain(DomainSetType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RectifiedGridDomain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rectifiedGridDomain' namespace='##targetNamespace' affiliation='domainSet'"
	 * @generated
	 */
	DomainSetType getRectifiedGridDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRectifiedGridDomain <em>Rectified Grid Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectified Grid Domain</em>' containment reference.
	 * @see #getRectifiedGridDomain()
	 * @generated
	 */
	void setRectifiedGridDomain(DomainSetType value);

	/**
	 * Returns the value of the '<em><b>Reference System Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference System Ref</em>' containment reference.
	 * @see #setReferenceSystemRef(CRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ReferenceSystemRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='referenceSystemRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CRSPropertyType getReferenceSystemRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getReferenceSystemRef <em>Reference System Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference System Ref</em>' containment reference.
	 * @see #getReferenceSystemRef()
	 * @generated
	 */
	void setReferenceSystemRef(CRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Remarks()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Result Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Of</em>' containment reference.
	 * @see #setResultOf(ResultType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ResultOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resultOf' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultType getResultOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getResultOf <em>Result Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of</em>' containment reference.
	 * @see #getResultOf()
	 * @generated
	 */
	void setResultOf(ResultType value);

	/**
	 * Returns the value of the '<em><b>Reverse Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the value of an object property is another object and that object contains also a property for the association between the two objects, then this name of the reverse property may be encoded in a gml:reversePropertyName element in an appinfo annotation of the property element to document the constraint between the two properties. The value of the element shall contain the qualified name of the property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reverse Property Name</em>' attribute.
	 * @see #setReversePropertyName(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ReversePropertyName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reversePropertyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReversePropertyName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getReversePropertyName <em>Reverse Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Property Name</em>' attribute.
	 * @see #getReversePropertyName()
	 * @generated
	 */
	void setReversePropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ring is used to represent a single connected component of a surface boundary as specified in ISO 19107:2003, 6.3.6.
	 * Every gml:curveMember references or contains one curve, i.e. any element which is substitutable for gml:AbstractCurve. In the context of a ring, the curves describe the boundary of the surface. The sequence of curves shall be contiguous and connected in a cycle.
	 * If provided, the aggregationType attribute shall have the value "sequence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring</em>' containment reference.
	 * @see #setRing(RingType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Ring()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ring' namespace='##targetNamespace' affiliation='AbstractRing'"
	 * @generated
	 */
	RingType getRing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRing <em>Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring</em>' containment reference.
	 * @see #getRing()
	 * @generated
	 */
	void setRing(RingType value);

	/**
	 * Returns the value of the '<em><b>Rough Conversion To Preferred Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements gml:conversionToPreferredUnit and gml:roughConversionToPreferredUnit represent parameters used to convert conventional units to preferred units for this physical quantity type.  A preferred unit is either a Base Unit or a Derived Unit that is selected for all values of one physical quantity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rough Conversion To Preferred Unit</em>' containment reference.
	 * @see #setRoughConversionToPreferredUnit(ConversionToPreferredUnitType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RoughConversionToPreferredUnit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='roughConversionToPreferredUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ConversionToPreferredUnitType getRoughConversionToPreferredUnit();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRoughConversionToPreferredUnit <em>Rough Conversion To Preferred Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rough Conversion To Preferred Unit</em>' containment reference.
	 * @see #getRoughConversionToPreferredUnit()
	 * @generated
	 */
	void setRoughConversionToPreferredUnit(ConversionToPreferredUnitType value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:scope property provides a description of the usage, or limitations of usage, for which this CRS-related object is valid. If unknown, enter "not known".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Scope()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Second Defining Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:secondDefiningParameter is a property containing the definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
	 * The inverseFlattening element contains the inverse flattening value of the ellipsoid. This value is a scale factor (or ratio). It uses gml:LengthType with the restriction that the unit of measure referenced by the uom attribute must be suitable for a scale factor, such as percent, permil, or parts-per-million.
	 * The semiMinorAxis element contains the length of the semi-minor axis of the ellipsoid. When the isSphere element is included, the ellipsoid is degenerate and is actually a sphere. The sphere is completely defined by the semi-major axis, which is the radius of the sphere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Defining Parameter</em>' containment reference.
	 * @see #setSecondDefiningParameter(SecondDefiningParameterType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SecondDefiningParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='secondDefiningParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondDefiningParameterType getSecondDefiningParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSecondDefiningParameter <em>Second Defining Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Defining Parameter</em>' containment reference.
	 * @see #getSecondDefiningParameter()
	 * @generated
	 */
	void setSecondDefiningParameter(SecondDefiningParameterType value);

	/**
	 * Returns the value of the '<em><b>Second Defining Parameter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:secondDefiningParameter is a property containing the definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
	 * The inverseFlattening element contains the inverse flattening value of the ellipsoid. This value is a scale factor (or ratio). It uses gml:LengthType with the restriction that the unit of measure referenced by the uom attribute must be suitable for a scale factor, such as percent, permil, or parts-per-million.
	 * The semiMinorAxis element contains the length of the semi-minor axis of the ellipsoid. When the isSphere element is included, the ellipsoid is degenerate and is actually a sphere. The sphere is completely defined by the semi-major axis, which is the radius of the sphere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Defining Parameter1</em>' containment reference.
	 * @see #setSecondDefiningParameter1(SecondDefiningParameterType1)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SecondDefiningParameter1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='secondDefiningParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondDefiningParameterType1 getSecondDefiningParameter1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSecondDefiningParameter1 <em>Second Defining Parameter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Defining Parameter1</em>' containment reference.
	 * @see #getSecondDefiningParameter1()
	 * @generated
	 */
	void setSecondDefiningParameter1(SecondDefiningParameterType1 value);

	/**
	 * Returns the value of the '<em><b>Second Defining Parameter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Defining Parameter2</em>' containment reference.
	 * @see #setSecondDefiningParameter2(SecondDefiningParameterType2)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SecondDefiningParameter2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecondDefiningParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondDefiningParameterType2 getSecondDefiningParameter2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSecondDefiningParameter2 <em>Second Defining Parameter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Defining Parameter2</em>' containment reference.
	 * @see #getSecondDefiningParameter2()
	 * @generated
	 */
	void setSecondDefiningParameter2(SecondDefiningParameterType2 value);

	/**
	 * Returns the value of the '<em><b>Second Defining Parameter3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Defining Parameter3</em>' containment reference.
	 * @see #setSecondDefiningParameter3(SecondDefiningParameterType3)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SecondDefiningParameter3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecondDefiningParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondDefiningParameterType3 getSecondDefiningParameter3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSecondDefiningParameter3 <em>Second Defining Parameter3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Defining Parameter3</em>' containment reference.
	 * @see #getSecondDefiningParameter3()
	 * @generated
	 */
	void setSecondDefiningParameter3(SecondDefiningParameterType3 value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(BigDecimal)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Seconds()
	 * @model unique="false" dataType="net.opengis.gml.gml.ArcSecondsType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seconds' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSeconds();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of curve segments. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(CurveSegmentArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Segments()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveSegmentArrayPropertyType getSegments();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(CurveSegmentArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Semi Major Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:semiMajorAxis specifies the length of the semi-major axis of the ellipsoid, with its units. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a length, such as metres or feet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semi Major Axis</em>' containment reference.
	 * @see #setSemiMajorAxis(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SemiMajorAxis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='semiMajorAxis' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getSemiMajorAxis();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSemiMajorAxis <em>Semi Major Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Major Axis</em>' containment reference.
	 * @see #getSemiMajorAxis()
	 * @generated
	 */
	void setSemiMajorAxis(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A shell is used to represent a single connected component of a solid boundary as specified in ISO 19107:2003, 6.3.8.
	 * Every gml:surfaceMember references or contains one surface, i.e. any element which is substitutable for gml:AbstractSurface. In the context of a shell, the surfaces describe the boundary of the solid. 
	 * If provided, the aggregationType attribute shall have the value "set".
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference.
	 * @see #setShell(ShellType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Shell()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Shell' namespace='##targetNamespace' affiliation='AbstractSurface'"
	 * @generated
	 */
	ShellType getShell();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getShell <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' containment reference.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(ShellType value);

	/**
	 * Returns the value of the '<em><b>Single CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single CRS Ref</em>' containment reference.
	 * @see #setSingleCRSRef(SingleCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SingleCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='singleCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleCRSPropertyType getSingleCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSingleCRSRef <em>Single CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single CRS Ref</em>' containment reference.
	 * @see #getSingleCRSRef()
	 * @generated
	 */
	void setSingleCRSRef(SingleCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Single Operation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Operation Ref</em>' containment reference.
	 * @see #setSingleOperationRef(SingleOperationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SingleOperationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='singleOperationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleOperationPropertyType getSingleOperationRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSingleOperationRef <em>Single Operation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Operation Ref</em>' containment reference.
	 * @see #getSingleOperationRef()
	 * @generated
	 */
	void setSingleOperationRef(SingleOperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A solid is the basis for 3-dimensional geometry. The extent of a solid is defined by the boundary surfaces as specified in ISO 19107:2003, 6.3.18. exterior specifies the outer boundary, interior the inner boundary of the solid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid</em>' containment reference.
	 * @see #setSolid(SolidType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Solid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Solid' namespace='##targetNamespace' affiliation='AbstractSolid'"
	 * @generated
	 */
	SolidType getSolid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSolid <em>Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid</em>' containment reference.
	 * @see #getSolid()
	 * @generated
	 */
	void setSolid(SolidType value);

	/**
	 * Returns the value of the '<em><b>Solid Array Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solid Array Property</em>' containment reference.
	 * @see #setSolidArrayProperty(SolidArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SolidArrayProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='solidArrayProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidArrayPropertyType getSolidArrayProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSolidArrayProperty <em>Solid Array Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Array Property</em>' containment reference.
	 * @see #getSolidArrayProperty()
	 * @generated
	 */
	void setSolidArrayProperty(SolidArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Solid Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a solid via the XLink-attributes or contains the solid element. A solid element is any element, which is substitutable for gml:AbstractSolid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Member</em>' containment reference.
	 * @see #setSolidMember(SolidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SolidMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='solidMember' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getSolidMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSolidMember <em>Solid Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Member</em>' containment reference.
	 * @see #getSolidMember()
	 * @generated
	 */
	void setSolidMember(SolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Solid Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of solids. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Members</em>' containment reference.
	 * @see #setSolidMembers(SolidArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SolidMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='solidMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidArrayPropertyType getSolidMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSolidMembers <em>Solid Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Members</em>' containment reference.
	 * @see #getSolidMembers()
	 * @generated
	 */
	void setSolidMembers(SolidArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Solid Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a solid via the XLink-attributes or contains the solid element. solidProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractSolid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Property</em>' containment reference.
	 * @see #setSolidProperty(SolidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SolidProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='solidProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getSolidProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSolidProperty <em>Solid Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Property</em>' containment reference.
	 * @see #getSolidProperty()
	 * @generated
	 */
	void setSolidProperty(SolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Source CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sourceCRS is an association role to the source CRS (coordinate reference system) of this coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source CRS</em>' containment reference.
	 * @see #setSourceCRS(CRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SourceCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sourceCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	CRSPropertyType getSourceCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSourceCRS <em>Source CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source CRS</em>' containment reference.
	 * @see #getSourceCRS()
	 * @generated
	 */
	void setSourceCRS(CRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Source Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sourceDimensions is the number of dimensions in the source CRS of this operation method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Dimensions</em>' attribute.
	 * @see #setSourceDimensions(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SourceDimensions()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sourceDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSourceDimensions();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSourceDimensions <em>Source Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dimensions</em>' attribute.
	 * @see #getSourceDimensions()
	 * @generated
	 */
	void setSourceDimensions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sphere</em>' containment reference.
	 * @see #setSphere(SphereType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Sphere()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sphere' namespace='##targetNamespace' affiliation='AbstractGriddedSurface'"
	 * @generated
	 */
	SphereType getSphere();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSphere <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' containment reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(SphereType value);

	/**
	 * Returns the value of the '<em><b>Spherical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sphericalCS is an association role to the spherical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spherical CS</em>' containment reference.
	 * @see #setSphericalCS(SphericalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SphericalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sphericalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	SphericalCSPropertyType getSphericalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCS <em>Spherical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spherical CS</em>' containment reference.
	 * @see #getSphericalCS()
	 * @generated
	 */
	void setSphericalCS(SphericalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Spherical CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sphericalCS is an association role to the spherical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spherical CS1</em>' containment reference.
	 * @see #setSphericalCS1(SphericalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SphericalCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sphericalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	SphericalCSPropertyType getSphericalCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCS1 <em>Spherical CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spherical CS1</em>' containment reference.
	 * @see #getSphericalCS1()
	 * @generated
	 */
	void setSphericalCS1(SphericalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Spherical CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:SphericalCS is a three-dimensional coordinate system with one distance measured from the origin and two angular coordinates. A SphericalCS shall have three gml:axis property elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spherical CS2</em>' containment reference.
	 * @see #setSphericalCS2(SphericalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SphericalCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SphericalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	SphericalCSType getSphericalCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCS2 <em>Spherical CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spherical CS2</em>' containment reference.
	 * @see #getSphericalCS2()
	 * @generated
	 */
	void setSphericalCS2(SphericalCSType value);

	/**
	 * Returns the value of the '<em><b>Spherical CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:SphericalCS is a three-dimensional coordinate system with one distance measured from the origin and two angular coordinates. A SphericalCS shall have three gml:axis property elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spherical CS3</em>' containment reference.
	 * @see #setSphericalCS3(SphericalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SphericalCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SphericalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	SphericalCSType getSphericalCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCS3 <em>Spherical CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spherical CS3</em>' containment reference.
	 * @see #getSphericalCS3()
	 * @generated
	 */
	void setSphericalCS3(SphericalCSType value);

	/**
	 * Returns the value of the '<em><b>Spherical CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spherical CS Ref</em>' containment reference.
	 * @see #setSphericalCSRef(SphericalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SphericalCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sphericalCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	SphericalCSPropertyType getSphericalCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSphericalCSRef <em>Spherical CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spherical CS Ref</em>' containment reference.
	 * @see #getSphericalCSRef()
	 * @generated
	 */
	void setSphericalCSRef(SphericalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Status()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getStatus();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Status Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reference</em>' containment reference.
	 * @see #setStatusReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_StatusReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='statusReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getStatusReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getStatusReference <em>Status Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reference</em>' containment reference.
	 * @see #getStatusReference()
	 * @generated
	 */
	void setStatusReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:stringValue is a character string value of an operation parameter. A string value does not have an associated unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_StringValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stringValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

	/**
	 * Returns the value of the '<em><b>Sub Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Complex</em>' containment reference.
	 * @see #setSubComplex(TopoComplexPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SubComplex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoComplexPropertyType getSubComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSubComplex <em>Sub Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Complex</em>' containment reference.
	 * @see #getSubComplex()
	 * @generated
	 */
	void setSubComplex(TopoComplexPropertyType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(TargetPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Subject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace' affiliation='target'"
	 * @generated
	 */
	TargetPropertyType getSubject();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(TargetPropertyType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Target()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetPropertyType getTarget();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetPropertyType value);

	/**
	 * Returns the value of the '<em><b>Super Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property elements gml:subComplex, gml:superComplex and gml:maximalComplex provide an encoding for relationships between topology complexes as described for gml:TopoComplex above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Complex</em>' containment reference.
	 * @see #setSuperComplex(TopoComplexPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SuperComplex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='superComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoComplexPropertyType getSuperComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSuperComplex <em>Super Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Complex</em>' containment reference.
	 * @see #getSuperComplex()
	 * @generated
	 */
	void setSuperComplex(TopoComplexPropertyType value);

	/**
	 * Returns the value of the '<em><b>Surface Array Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Array Property</em>' containment reference.
	 * @see #setSurfaceArrayProperty(SurfaceArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SurfaceArrayProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surfaceArrayProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfaceArrayPropertyType getSurfaceArrayProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSurfaceArrayProperty <em>Surface Array Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Array Property</em>' containment reference.
	 * @see #getSurfaceArrayProperty()
	 * @generated
	 */
	void setSurfaceArrayProperty(SurfaceArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Surface Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a surface via the XLink-attributes or contains the surface element. A surface element is any element, which is substitutable for gml:AbstractSurface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Member</em>' containment reference.
	 * @see #setSurfaceMember(SurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SurfaceMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surfaceMember' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getSurfaceMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSurfaceMember <em>Surface Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Member</em>' containment reference.
	 * @see #getSurfaceMember()
	 * @generated
	 */
	void setSurfaceMember(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Surface Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of surfaces. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Members</em>' containment reference.
	 * @see #setSurfaceMembers(SurfaceArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SurfaceMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surfaceMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfaceArrayPropertyType getSurfaceMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSurfaceMembers <em>Surface Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Members</em>' containment reference.
	 * @see #getSurfaceMembers()
	 * @generated
	 */
	void setSurfaceMembers(SurfaceArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Surface Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a surface via the XLink-attributes or contains the surface element. surfaceProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractSurface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Property</em>' containment reference.
	 * @see #setSurfaceProperty(SurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_SurfaceProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surfaceProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getSurfaceProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getSurfaceProperty <em>Surface Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Property</em>' containment reference.
	 * @see #getSurfaceProperty()
	 * @generated
	 */
	void setSurfaceProperty(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Target CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:targetCRS is an association role to the target CRS (coordinate reference system) of this coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target CRS</em>' containment reference.
	 * @see #setTargetCRS(CRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TargetCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='targetCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	CRSPropertyType getTargetCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTargetCRS <em>Target CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target CRS</em>' containment reference.
	 * @see #getTargetCRS()
	 * @generated
	 */
	void setTargetCRS(CRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Target Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:targetDimensions is the number of dimensions in the target CRS of this operation method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Dimensions</em>' attribute.
	 * @see #setTargetDimensions(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TargetDimensions()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='targetDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTargetDimensions();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTargetDimensions <em>Target Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Dimensions</em>' attribute.
	 * @see #getTargetDimensions()
	 * @generated
	 */
	void setTargetDimensions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' attribute.
	 * @see #setTargetElement(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TargetElement()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='targetElement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetElement();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTargetElement <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' attribute.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(String value);

	/**
	 * Returns the value of the '<em><b>Temporal CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TemporalCRS is a 1D coordinate reference system used for the recording of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal CRS</em>' containment reference.
	 * @see #setTemporalCRS(TemporalCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TemporalCRS' namespace='##targetNamespace' affiliation='AbstractSingleCRS'"
	 * @generated
	 */
	TemporalCRSType getTemporalCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalCRS <em>Temporal CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal CRS</em>' containment reference.
	 * @see #getTemporalCRS()
	 * @generated
	 */
	void setTemporalCRS(TemporalCRSType value);

	/**
	 * Returns the value of the '<em><b>Temporal CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal CRS Ref</em>' containment reference.
	 * @see #setTemporalCRSRef(TemporalCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporalCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalCRSPropertyType getTemporalCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalCRSRef <em>Temporal CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal CRS Ref</em>' containment reference.
	 * @see #getTemporalCRSRef()
	 * @generated
	 */
	void setTemporalCRSRef(TemporalCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Temporal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal CS</em>' containment reference.
	 * @see #setTemporalCS(TemporalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TemporalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	TemporalCSType getTemporalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalCS <em>Temporal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal CS</em>' containment reference.
	 * @see #getTemporalCS()
	 * @generated
	 */
	void setTemporalCS(TemporalCSType value);

	/**
	 * Returns the value of the '<em><b>Temporal CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal CS Ref</em>' containment reference.
	 * @see #setTemporalCSRef(TemporalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporalCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalCSPropertyType getTemporalCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalCSRef <em>Temporal CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal CS Ref</em>' containment reference.
	 * @see #getTemporalCSRef()
	 * @generated
	 */
	void setTemporalCSRef(TemporalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Temporal Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:temporalDatum is an association role to the temporal datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal Datum</em>' containment reference.
	 * @see #setTemporalDatum(TemporalDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporalDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalDatumPropertyType getTemporalDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatum <em>Temporal Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Datum</em>' containment reference.
	 * @see #getTemporalDatum()
	 * @generated
	 */
	void setTemporalDatum(TemporalDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Temporal Datum1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:temporalDatum is an association role to the temporal datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal Datum1</em>' containment reference.
	 * @see #setTemporalDatum1(TemporalDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalDatum1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporalDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalDatumPropertyType getTemporalDatum1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatum1 <em>Temporal Datum1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Datum1</em>' containment reference.
	 * @see #getTemporalDatum1()
	 * @generated
	 */
	void setTemporalDatum1(TemporalDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Temporal Datum2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:TemporalDatum defines the origin of a Temporal Reference System. This type omits the "anchorDefinition" and "realizationEpoch" elements and adds the "origin" element with the dateTime type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal Datum2</em>' containment reference.
	 * @see #setTemporalDatum2(TemporalDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalDatum2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TemporalDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	TemporalDatumType getTemporalDatum2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatum2 <em>Temporal Datum2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Datum2</em>' containment reference.
	 * @see #getTemporalDatum2()
	 * @generated
	 */
	void setTemporalDatum2(TemporalDatumType value);

	/**
	 * Returns the value of the '<em><b>Temporal Datum3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:TemporalDatum defines the origin of a Temporal Reference System. This type omits the "anchorDefinition" and "realizationEpoch" elements and adds the "origin" element with the dateTime type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal Datum3</em>' containment reference.
	 * @see #setTemporalDatum3(TemporalDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalDatum3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TemporalDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	TemporalDatumType getTemporalDatum3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatum3 <em>Temporal Datum3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Datum3</em>' containment reference.
	 * @see #getTemporalDatum3()
	 * @generated
	 */
	void setTemporalDatum3(TemporalDatumType value);

	/**
	 * Returns the value of the '<em><b>Temporal Datum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Datum Ref</em>' containment reference.
	 * @see #setTemporalDatumRef(TemporalDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TemporalDatumRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporalDatumRef' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalDatumPropertyType getTemporalDatumRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTemporalDatumRef <em>Temporal Datum Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Datum Ref</em>' containment reference.
	 * @see #getTemporalDatumRef()
	 * @generated
	 */
	void setTemporalDatumRef(TemporalDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Time Calendar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A calendar is a discrete temporal reference system that provides a basis for defining temporal position to a resolution of one day.
	 * gml:TimeCalendar adds one property to those inherited from gml:TimeReferenceSystem. A gml:referenceFrame provides a link to a gml:TimeCalendarEra that it uses. A  gml:TimeCalendar may reference more than one calendar era. 
	 * The referenceFrame element follows the standard GML property model, allowing the association to be instantiated either using an inline description using the gml:TimeCalendarEra element, or a link to a gml:TimeCalendarEra which is explicit elsewhere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Calendar</em>' containment reference.
	 * @see #setTimeCalendar(TimeCalendarType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeCalendar()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeCalendar' namespace='##targetNamespace' affiliation='TimeReferenceSystem'"
	 * @generated
	 */
	TimeCalendarType getTimeCalendar();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCalendar <em>Time Calendar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Calendar</em>' containment reference.
	 * @see #getTimeCalendar()
	 * @generated
	 */
	void setTimeCalendar(TimeCalendarType value);

	/**
	 * Returns the value of the '<em><b>Time Reference System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference system is characterized in terms of its domain of validity: the spatial and temporal extent over which it is applicable. The basic GML element for temporal reference systems is gml:TimeReferenceSystem.  Its content model extends gml:DefinitionType with one additional property, gml:domainOfValidity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Reference System</em>' containment reference.
	 * @see #setTimeReferenceSystem(TimeReferenceSystemType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeReferenceSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeReferenceSystem' namespace='##targetNamespace' affiliation='Definition'"
	 * @generated
	 */
	TimeReferenceSystemType getTimeReferenceSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeReferenceSystem <em>Time Reference System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Reference System</em>' containment reference.
	 * @see #getTimeReferenceSystem()
	 * @generated
	 */
	void setTimeReferenceSystem(TimeReferenceSystemType value);

	/**
	 * Returns the value of the '<em><b>Time Calendar Era</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TimeCalendarEra inherits basic properties from gml:DefinitionType and has the following additional properties:
	 * -	gml:referenceEvent is the name or description of a mythical or historic event which fixes the position of the base scale of the calendar era.  This is given as text or using a link to description held elsewhere.
	 * -	gml:referenceDate specifies the date of the referenceEvent expressed as a date in the given calendar.  In most calendars, this date is the origin (i.e., the first day) of the scale, but this is not always true.
	 * -	gml:julianReference specifies the Julian date that corresponds to the reference date.  The Julian day number is an integer value; the Julian date is a decimal value that allows greater resolution.  Transforming calendar dates to and from Julian dates provides a relatively simple basis for transforming dates from one calendar to another.
	 * -	gml:epochOfUse is the period for which the calendar era was used as a basis for dating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Calendar Era</em>' containment reference.
	 * @see #setTimeCalendarEra(TimeCalendarEraType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeCalendarEra()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeCalendarEra' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeCalendarEraType getTimeCalendarEra();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCalendarEra <em>Time Calendar Era</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Calendar Era</em>' containment reference.
	 * @see #getTimeCalendarEra()
	 * @generated
	 */
	void setTimeCalendarEra(TimeCalendarEraType value);

	/**
	 * Returns the value of the '<em><b>Time Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A clock provides a basis for defining temporal position within a day. A clock shall be used with a calendar in order to provide a complete description of a temporal position within a specific day.
	 * gml:TimeClock adds the following properties to those inherited from gml:TimeReferenceSystemType:
	 * -	gml:referenceEvent is the name or description of an event, such as solar noon or sunrise, which fixes the position of the base scale of the clock.
	 * -	gml:referenceTime specifies the time of day associated with the reference event expressed as a time of day in the given clock. The reference time is usually the origin of the clock scale. 
	 * -	gml:utcReference specifies the 24 hour local or UTC time that corresponds to the reference time.
	 * -	gml:dateBasis contains or references the calendars that use this clock.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Clock</em>' containment reference.
	 * @see #setTimeClock(TimeClockType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeClock()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeClock' namespace='##targetNamespace' affiliation='TimeReferenceSystem'"
	 * @generated
	 */
	TimeClockType getTimeClock();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeClock <em>Time Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Clock</em>' containment reference.
	 * @see #getTimeClock()
	 * @generated
	 */
	void setTimeClock(TimeClockType value);

	/**
	 * Returns the value of the '<em><b>Time Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A temporal coordinate system shall be based on a continuous interval scale defined in terms of a single time interval.
	 * The differences to ISO 19108 TM_CoordinateSystem are:
	 * -	the origin is specified either using the property gml:originPosition whose value is a direct time position, or using the property gml:origin whose model is gml:TimeInstantPropertyType; this permits more flexibility in representation and also supports referring to a value fixed elsewhere;
	 * -	the interval uses gml:TimeIntervalLengthType.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Coordinate System</em>' containment reference.
	 * @see #setTimeCoordinateSystem(TimeCoordinateSystemType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeCoordinateSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeCoordinateSystem' namespace='##targetNamespace' affiliation='TimeReferenceSystem'"
	 * @generated
	 */
	TimeCoordinateSystemType getTimeCoordinateSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCoordinateSystem <em>Time Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Coordinate System</em>' containment reference.
	 * @see #getTimeCoordinateSystem()
	 * @generated
	 */
	void setTimeCoordinateSystem(TimeCoordinateSystemType value);

	/**
	 * Returns the value of the '<em><b>Time CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:timeCS is an association role to the time coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time CS</em>' containment reference.
	 * @see #setTimeCS(TimeCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timeCS' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeCSPropertyType getTimeCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCS <em>Time CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time CS</em>' containment reference.
	 * @see #getTimeCS()
	 * @generated
	 */
	void setTimeCS(TimeCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Time CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:timeCS is an association role to the time coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time CS1</em>' containment reference.
	 * @see #setTimeCS1(TimeCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timeCS' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeCSPropertyType getTimeCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCS1 <em>Time CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time CS1</em>' containment reference.
	 * @see #getTimeCS1()
	 * @generated
	 */
	void setTimeCS1(TimeCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Time CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TimeCS is a one-dimensional coordinate system containing a time axis, used to describe the temporal position of a point in the specified time units from a specified time origin. A TimeCS shall have one gml:axis property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time CS2</em>' containment reference.
	 * @see #setTimeCS2(TimeCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	TimeCSType getTimeCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCS2 <em>Time CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time CS2</em>' containment reference.
	 * @see #getTimeCS2()
	 * @generated
	 */
	void setTimeCS2(TimeCSType value);

	/**
	 * Returns the value of the '<em><b>Time CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TimeCS is a one-dimensional coordinate system containing a time axis, used to describe the temporal position of a point in the specified time units from a specified time origin. A TimeCS shall have one gml:axis property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time CS3</em>' containment reference.
	 * @see #setTimeCS3(TimeCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	TimeCSType getTimeCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeCS3 <em>Time CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time CS3</em>' containment reference.
	 * @see #getTimeCS3()
	 * @generated
	 */
	void setTimeCS3(TimeCSType value);

	/**
	 * Returns the value of the '<em><b>Time Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time edge is a one-dimensional topological primitive. It is an open interval that starts and ends at a node. The edge may be realised as a geometry whose value is a time period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Edge</em>' containment reference.
	 * @see #setTimeEdge(TimeEdgeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeEdge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeEdge' namespace='##targetNamespace' affiliation='AbstractTimeTopologyPrimitive'"
	 * @generated
	 */
	TimeEdgeType getTimeEdge();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeEdge <em>Time Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Edge</em>' containment reference.
	 * @see #getTimeEdge()
	 * @generated
	 */
	void setTimeEdge(TimeEdgeType value);

	/**
	 * Returns the value of the '<em><b>Time Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TimeInstant acts as a zero-dimensional geometric primitive that represents an identifiable position in time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Instant</em>' containment reference.
	 * @see #setTimeInstant(TimeInstantType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeInstant()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeInstant' namespace='##targetNamespace' affiliation='AbstractTimeGeometricPrimitive'"
	 * @generated
	 */
	TimeInstantType getTimeInstant();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeInstant <em>Time Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Instant</em>' containment reference.
	 * @see #getTimeInstant()
	 * @generated
	 */
	void setTimeInstant(TimeInstantType value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  gml:timeInterval conforms to ISO 11404 which is based on floating point values for temporal length.
	 * ISO 11404 syntax specifies the use of a positiveInteger together with appropriate values for radix and factor. The resolution of the time interval is to one radix ^(-factor) of the specified time unit.
	 * The value of the unit is either selected from the units for time intervals from ISO 31-1:1992, or is another suitable unit.  The encoding is defined for GML in gml:TimeUnitType. The second component of this union type provides a method for indicating time units other than the six standard units given in the enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Interval</em>' containment reference.
	 * @see #setTimeInterval(TimeIntervalLengthType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeInterval()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timeInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeIntervalLengthType getTimeInterval();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeInterval <em>Time Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' containment reference.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(TimeIntervalLengthType value);

	/**
	 * Returns the value of the '<em><b>Time Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time node is a zero-dimensional topological primitive that represents an identifiable node in time (it is equivalent to a point in space). A node may act as the termination or initiation of any number of time edges. A time node may be realised as a geometry, its position, whose value is a time instant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Node</em>' containment reference.
	 * @see #setTimeNode(TimeNodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeNode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeNode' namespace='##targetNamespace' affiliation='AbstractTimeTopologyPrimitive'"
	 * @generated
	 */
	TimeNodeType getTimeNode();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeNode <em>Time Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Node</em>' containment reference.
	 * @see #getTimeNode()
	 * @generated
	 */
	void setTimeNode(TimeNodeType value);

	/**
	 * Returns the value of the '<em><b>Time Ordinal Era</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Its content model follows the pattern of gml:TimeEdge, inheriting standard properties from gml:DefinitionType, and adding gml:start, gml:end and gml:extent properties, a set of gml:member properties which indicate ordered gml:TimeOrdinalEra elements, and a gml:group property which points to the parent era.
	 * The recursive inclusion of gml:TimeOrdinalEra elements allow the construction of an arbitrary depth hierarchical ordinal reference schema, such that an ordinal era at a given level of the hierarchy includes a sequence of shorter, coterminous ordinal eras.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Ordinal Era</em>' containment reference.
	 * @see #setTimeOrdinalEra(TimeOrdinalEraType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeOrdinalEra()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeOrdinalEra' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeOrdinalEraType getTimeOrdinalEra();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeOrdinalEra <em>Time Ordinal Era</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Ordinal Era</em>' containment reference.
	 * @see #getTimeOrdinalEra()
	 * @generated
	 */
	void setTimeOrdinalEra(TimeOrdinalEraType value);

	/**
	 * Returns the value of the '<em><b>Time Ordinal Reference System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In some applications of geographic information — such as geology and archaeology — relative position in time is known more precisely than absolute time or duration. The order of events in time can be well established, but the magnitude of the intervals between them cannot be accurately determined; in such cases, the use of an ordinal temporal reference system is appropriate. An ordinal temporal reference system is composed of a sequence of named coterminous eras, which may in turn be composed of sequences of member eras at a finer scale, giving the whole a hierarchical structure of eras of verying resolution. 
	 * An ordinal temporal reference system whose component eras are not further subdivided is effectively a temporal topological complex constrained to be a linear graph. An ordinal temporal reference system some or all of whose component eras are subdivided is effectively a temporal topological complex with the constraint that parallel branches may only be constructed in pairs where one is a single temporal ordinal era and the other is a sequence of temporal ordinal eras that are called "members" of the "group". This constraint means that within a single temporal ordinal reference system, the relative position of all temporal ordinal eras is unambiguous.  
	 * The positions of the beginning and end of a given era may calibrate the relative time scale.
	 * gml:TimeOrdinalReferenceSystem adds one or more gml:component properties to the generic temporal reference system model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Ordinal Reference System</em>' containment reference.
	 * @see #setTimeOrdinalReferenceSystem(TimeOrdinalReferenceSystemType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeOrdinalReferenceSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeOrdinalReferenceSystem' namespace='##targetNamespace' affiliation='TimeReferenceSystem'"
	 * @generated
	 */
	TimeOrdinalReferenceSystemType getTimeOrdinalReferenceSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeOrdinalReferenceSystem <em>Time Ordinal Reference System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Ordinal Reference System</em>' containment reference.
	 * @see #getTimeOrdinalReferenceSystem()
	 * @generated
	 */
	void setTimeOrdinalReferenceSystem(TimeOrdinalReferenceSystemType value);

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TimePeriod acts as a one-dimensional geometric primitive that represents an identifiable extent in time.
	 * The location in of a gml:TimePeriod is described by the temporal positions of the instants at which it begins and ends. The length of the period is equal to the temporal distance between the two bounding temporal positions. 
	 * Both beginning and end may be described in terms of their direct position using gml:TimePositionType which is an XML Schema simple content type, or by reference to an indentifiable time instant using gml:TimeInstantPropertyType.
	 * Alternatively a limit of a gml:TimePeriod may use the conventional GML property model to make a reference to a time instant described elsewhere, or a limit may be indicated as a direct position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference.
	 * @see #setTimePeriod(TimePeriodType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimePeriod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimePeriod' namespace='##targetNamespace' affiliation='AbstractTimeGeometricPrimitive'"
	 * @generated
	 */
	TimePeriodType getTimePeriod();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimePeriod <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' containment reference.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(TimePeriodType value);

	/**
	 * Returns the value of the '<em><b>Time Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is used directly as a property of gml:TimeInstant (see 15.2.2.3), and may also be used in application schemas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Position</em>' containment reference.
	 * @see #setTimePosition(TimePositionType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimePosition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timePosition' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePositionType getTimePosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimePosition <em>Time Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Position</em>' containment reference.
	 * @see #getTimePosition()
	 * @generated
	 */
	void setTimePosition(TimePositionType value);

	/**
	 * Returns the value of the '<em><b>Time Topology Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A temporal topology complex shall be the connected acyclic directed graph composed of temporal topological primitives, i.e. time nodes and time edges. Because a time edge may not exist without two time nodes on its boundaries, static features have time edges from a temporal topology complex as the values of their temporal properties, regardless of explicit declarations.
	 * A temporal topology complex expresses a linear or a non-linear graph. A temporal linear graph, composed of a sequence of time edges, provides a lineage described only by "substitution" of feature instances or feature element values. A time node as the start or the end of the graph connects with at least one time edge. A time node other than the start and the end shall connect to at least two time edges: one of starting from the node, and another ending at the node.
	 * A temporal topological complex is a set of connected temporal topological primitives. The member primtives are indicated, either by reference or by value, using the primitive property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Topology Complex</em>' containment reference.
	 * @see #setTimeTopologyComplex(TimeTopologyComplexType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TimeTopologyComplex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeTopologyComplex' namespace='##targetNamespace' affiliation='AbstractTimeComplex'"
	 * @generated
	 */
	TimeTopologyComplexType getTimeTopologyComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTimeTopologyComplex <em>Time Topology Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Topology Complex</em>' containment reference.
	 * @see #getTimeTopologyComplex()
	 * @generated
	 */
	void setTimeTopologyComplex(TimeTopologyComplexType value);

	/**
	 * Returns the value of the '<em><b>Tin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A tin is a triangulated surface that uses the Delauny algorithm or a similar algorithm complemented with consideration of stoplines (stopLines), breaklines (breakLines), and maximum length of triangle sides (maxLength). controlPoint shall contain a set of the positions (three or more) used as posts for this TIN (corners of the triangles in the TIN). See ISO 19107:2003, 6.4.39 for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tin</em>' containment reference.
	 * @see #setTin(TinType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Tin()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Tin' namespace='##targetNamespace' affiliation='TriangulatedSurface'"
	 * @generated
	 */
	TinType getTin();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTin <em>Tin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tin</em>' containment reference.
	 * @see #getTin()
	 * @generated
	 */
	void setTin(TinType value);

	/**
	 * Returns the value of the '<em><b>Triangulated Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A triangulated surface is a polyhedral surface that is composed only of triangles. There is no restriction on how the triangulation is derived.
	 * trianglePatches encapsulates the triangles of the triangulated surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triangulated Surface</em>' containment reference.
	 * @see #setTriangulatedSurface(SurfaceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TriangulatedSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TriangulatedSurface' namespace='##targetNamespace' affiliation='Surface'"
	 * @generated
	 */
	SurfaceType getTriangulatedSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTriangulatedSurface <em>Triangulated Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triangulated Surface</em>' containment reference.
	 * @see #getTriangulatedSurface()
	 * @generated
	 */
	void setTriangulatedSurface(SurfaceType value);

	/**
	 * Returns the value of the '<em><b>Topo Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TopoComplex is a collection of topological primitives.
	 * Each complex holds a reference to its maximal complex (gml:maximalComplex) and optionally to sub- or super-complexes (gml:subComplex, gml:superComplex). 
	 * A topology complex contains its primitive and sub-complex members.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Complex</em>' containment reference.
	 * @see #setTopoComplex(TopoComplexType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoComplex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TopoComplex' namespace='##targetNamespace' affiliation='AbstractTopology'"
	 * @generated
	 */
	TopoComplexType getTopoComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoComplex <em>Topo Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Complex</em>' containment reference.
	 * @see #getTopoComplex()
	 * @generated
	 */
	void setTopoComplex(TopoComplexType value);

	/**
	 * Returns the value of the '<em><b>Topo Complex Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topo Complex Property</em>' containment reference.
	 * @see #setTopoComplexProperty(TopoComplexPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoComplexProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topoComplexProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoComplexPropertyType getTopoComplexProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoComplexProperty <em>Topo Complex Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Complex Property</em>' containment reference.
	 * @see #getTopoComplexProperty()
	 * @generated
	 */
	void setTopoComplexProperty(TopoComplexPropertyType value);

	/**
	 * Returns the value of the '<em><b>Topo Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TopoCurve represents a homogeneous topological expression, a sequence of directed edges, which if realised are isomorphic to a geometric curve primitive. The intended use of gml:TopoCurve is to appear within a line feature to express the structural and geometric relationships of this feature to other features via the shared edge definitions.
	 * If provided, the aggregationType attribute shall have the value "sequence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Curve</em>' containment reference.
	 * @see #setTopoCurve(TopoCurveType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoCurve()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TopoCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoCurveType getTopoCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoCurve <em>Topo Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Curve</em>' containment reference.
	 * @see #getTopoCurve()
	 * @generated
	 */
	void setTopoCurve(TopoCurveType value);

	/**
	 * Returns the value of the '<em><b>Topo Curve Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:topoCurveProperty property element may be used in features to express their relationship to the referenced topology edges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Curve Property</em>' containment reference.
	 * @see #setTopoCurveProperty(TopoCurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoCurveProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topoCurveProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoCurvePropertyType getTopoCurveProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoCurveProperty <em>Topo Curve Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Curve Property</em>' containment reference.
	 * @see #getTopoCurveProperty()
	 * @generated
	 */
	void setTopoCurveProperty(TopoCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Topo Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended use of gml:TopoPoint is to appear within a point feature to express the structural and possibly geometric relationships of this feature to other features via shared node definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Point</em>' containment reference.
	 * @see #setTopoPoint(TopoPointType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TopoPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoPointType getTopoPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoPoint <em>Topo Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Point</em>' containment reference.
	 * @see #getTopoPoint()
	 * @generated
	 */
	void setTopoPoint(TopoPointType value);

	/**
	 * Returns the value of the '<em><b>Topo Point Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:topoPointProperty property element may be used in features to express their relationship to the referenced topology node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Point Property</em>' containment reference.
	 * @see #setTopoPointProperty(TopoPointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoPointProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topoPointProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoPointPropertyType getTopoPointProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoPointProperty <em>Topo Point Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Point Property</em>' containment reference.
	 * @see #getTopoPointProperty()
	 * @generated
	 */
	void setTopoPointProperty(TopoPointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Topo Primitive Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:topoPrimitiveMember property element encodes for the relationship between a topology complex and a single topology primitive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Primitive Member</em>' containment reference.
	 * @see #setTopoPrimitiveMember(TopoPrimitiveMemberType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoPrimitiveMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topoPrimitiveMember' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoPrimitiveMemberType getTopoPrimitiveMember();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoPrimitiveMember <em>Topo Primitive Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Primitive Member</em>' containment reference.
	 * @see #getTopoPrimitiveMember()
	 * @generated
	 */
	void setTopoPrimitiveMember(TopoPrimitiveMemberType value);

	/**
	 * Returns the value of the '<em><b>Topo Primitive Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:topoPrimitiveMembers property element encodes the relationship between a topology complex and an arbitrary number of topology primitives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Primitive Members</em>' containment reference.
	 * @see #setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoPrimitiveMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topoPrimitiveMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoPrimitiveMembers <em>Topo Primitive Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Primitive Members</em>' containment reference.
	 * @see #getTopoPrimitiveMembers()
	 * @generated
	 */
	void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType value);

	/**
	 * Returns the value of the '<em><b>Topo Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TopoSolid represents the 3-dimensional topology primitive. 
	 * The topological boundary of a solid (gml:directedFace) consists of a set of directed faces.
	 * A solid may optionally be realised by a 3-dimensional geometric primitive (gml:solidProperty).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Solid</em>' containment reference.
	 * @see #setTopoSolid(TopoSolidType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoSolid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TopoSolid' namespace='##targetNamespace' affiliation='AbstractTopoPrimitive'"
	 * @generated
	 */
	TopoSolidType getTopoSolid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoSolid <em>Topo Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Solid</em>' containment reference.
	 * @see #getTopoSolid()
	 * @generated
	 */
	void setTopoSolid(TopoSolidType value);

	/**
	 * Returns the value of the '<em><b>Topo Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TopoSurface represents a homogeneous topological expression, a set of directed faces, which if realised are isomorphic to a geometric surface primitive. The intended use of gml:TopoSurface is to appear within a surface feature to express the structural and possibly geometric relationships of this surface feature to other features via the shared face definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Surface</em>' containment reference.
	 * @see #setTopoSurface(TopoSurfaceType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TopoSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoSurfaceType getTopoSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoSurface <em>Topo Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Surface</em>' containment reference.
	 * @see #getTopoSurface()
	 * @generated
	 */
	void setTopoSurface(TopoSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Topo Surface Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:topoSurfaceProperty property element may be used in features to express their relationship to the referenced topology faces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Surface Property</em>' containment reference.
	 * @see #setTopoSurfaceProperty(TopoSurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoSurfaceProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topoSurfaceProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoSurfacePropertyType getTopoSurfaceProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoSurfaceProperty <em>Topo Surface Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Surface Property</em>' containment reference.
	 * @see #getTopoSurfaceProperty()
	 * @generated
	 */
	void setTopoSurfaceProperty(TopoSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Topo Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TopoVolume represents a homogeneous topological expression, a set of directed topologic solids, which if realised are isomorphic to a geometric solid primitive. The intended use of gml:TopoVolume is to appear within a solid feature to express the structural and geometric relationships of this solid feature to other features via the shared solid definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Volume</em>' containment reference.
	 * @see #setTopoVolume(TopoVolumeType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoVolume()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TopoVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoVolumeType getTopoVolume();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoVolume <em>Topo Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Volume</em>' containment reference.
	 * @see #getTopoVolume()
	 * @generated
	 */
	void setTopoVolume(TopoVolumeType value);

	/**
	 * Returns the value of the '<em><b>Topo Volume Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:topoVolumeProperty element may be used in features to express their relationship to the referenced topology volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Volume Property</em>' containment reference.
	 * @see #setTopoVolumeProperty(TopoVolumePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TopoVolumeProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topoVolumeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoVolumePropertyType getTopoVolumeProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTopoVolumeProperty <em>Topo Volume Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Volume Property</em>' containment reference.
	 * @see #getTopoVolumeProperty()
	 * @generated
	 */
	void setTopoVolumeProperty(TopoVolumePropertyType value);

	/**
	 * Returns the value of the '<em><b>Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' containment reference.
	 * @see #setTrack(HistoryPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Track()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='track' namespace='##targetNamespace' affiliation='history'"
	 * @generated
	 */
	HistoryPropertyType getTrack();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTrack <em>Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track</em>' containment reference.
	 * @see #getTrack()
	 * @generated
	 */
	void setTrack(HistoryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:Transformation is a concrete object element derived from gml:GeneralTransformation (13.6.2.13).
	 * This concrete object can be used for all operation methods, without using a GML Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one Transformation instance.
	 * The parameterValue elements are an unordered list of composition associations to the set of parameter values used by this conversion operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Transformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transformation' namespace='##targetNamespace' affiliation='AbstractGeneralTransformation'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

	/**
	 * Returns the value of the '<em><b>Transformation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Ref</em>' containment reference.
	 * @see #setTransformationRef(TransformationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TransformationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationPropertyType getTransformationRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTransformationRef <em>Transformation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Ref</em>' containment reference.
	 * @see #getTransformationRef()
	 * @generated
	 */
	void setTransformationRef(TransformationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Triangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:Triangle represents a triangle as a surface patch with an outer boundary consisting of a linear ring. Note that this is a polygon (subtype) with no inner boundaries. The number of points in the linear ring shall be four.
	 * The ring (element exterior) shall be a gml:LinearRing and shall form a triangle, the first and the last position shall be coincident.
	 * interpolation is fixed to "planar", i.e. an interpolation shall return points on a single plane. The boundary of the patch shall be contained within that plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triangle</em>' containment reference.
	 * @see #setTriangle(TriangleType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Triangle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Triangle' namespace='##targetNamespace' affiliation='AbstractSurfacePatch'"
	 * @generated
	 */
	TriangleType getTriangle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTriangle <em>Triangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triangle</em>' containment reference.
	 * @see #getTriangle()
	 * @generated
	 */
	void setTriangle(TriangleType value);

	/**
	 * Returns the value of the '<em><b>Triangle Patches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triangle Patches</em>' containment reference.
	 * @see #setTrianglePatches(SurfacePatchArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TrianglePatches()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trianglePatches' namespace='##targetNamespace' affiliation='patches'"
	 * @generated
	 */
	SurfacePatchArrayPropertyType getTrianglePatches();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTrianglePatches <em>Triangle Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triangle Patches</em>' containment reference.
	 * @see #getTrianglePatches()
	 * @generated
	 */
	void setTrianglePatches(SurfacePatchArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Tuple List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CoordinatesType consists of a list of coordinate tuples, with each coordinate tuple separated by the ts or tuple separator (whitespace), and each coordinate in the tuple by the cs or coordinate separator (comma).
	 * The gml:tupleList encoding is effectively "band-interleaved".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple List</em>' containment reference.
	 * @see #setTupleList(CoordinatesType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_TupleList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tupleList' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getTupleList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getTupleList <em>Tuple List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple List</em>' containment reference.
	 * @see #getTupleList()
	 * @generated
	 */
	void setTupleList(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element gml:unitOfMeasure is a property element to refer to a unit of measure. This is an empty element which carries a reference to a unit of measure definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #setUnitOfMeasure(UnitOfMeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UnitOfMeasure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitOfMeasureType getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(UnitOfMeasureType value);

	/**
	 * Returns the value of the '<em><b>User Defined CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:userDefinedCS is an association role to the user defined coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined CS</em>' containment reference.
	 * @see #setUserDefinedCS(UserDefinedCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UserDefinedCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='userDefinedCS' namespace='##targetNamespace'"
	 * @generated
	 */
	UserDefinedCSPropertyType getUserDefinedCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCS <em>User Defined CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined CS</em>' containment reference.
	 * @see #getUserDefinedCS()
	 * @generated
	 */
	void setUserDefinedCS(UserDefinedCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>User Defined CS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:userDefinedCS is an association role to the user defined coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined CS1</em>' containment reference.
	 * @see #setUserDefinedCS1(UserDefinedCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UserDefinedCS1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='userDefinedCS' namespace='##targetNamespace'"
	 * @generated
	 */
	UserDefinedCSPropertyType getUserDefinedCS1();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCS1 <em>User Defined CS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined CS1</em>' containment reference.
	 * @see #getUserDefinedCS1()
	 * @generated
	 */
	void setUserDefinedCS1(UserDefinedCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>User Defined CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:UserDefinedCS is a two- or three-dimensional coordinate system that consists of any combination of coordinate axes not covered by any other coordinate system type. A UserDefinedCS shall have two or three gml:axis property elements; the number of property elements shall equal the dimension of the CS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined CS2</em>' containment reference.
	 * @see #setUserDefinedCS2(UserDefinedCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UserDefinedCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserDefinedCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	UserDefinedCSType getUserDefinedCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCS2 <em>User Defined CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined CS2</em>' containment reference.
	 * @see #getUserDefinedCS2()
	 * @generated
	 */
	void setUserDefinedCS2(UserDefinedCSType value);

	/**
	 * Returns the value of the '<em><b>User Defined CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:UserDefinedCS is a two- or three-dimensional coordinate system that consists of any combination of coordinate axes not covered by any other coordinate system type. A UserDefinedCS shall have two or three gml:axis property elements; the number of property elements shall equal the dimension of the CS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined CS3</em>' containment reference.
	 * @see #setUserDefinedCS3(UserDefinedCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UserDefinedCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserDefinedCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	UserDefinedCSType getUserDefinedCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCS3 <em>User Defined CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined CS3</em>' containment reference.
	 * @see #getUserDefinedCS3()
	 * @generated
	 */
	void setUserDefinedCS3(UserDefinedCSType value);

	/**
	 * Returns the value of the '<em><b>User Defined CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined CS Ref</em>' containment reference.
	 * @see #setUserDefinedCSRef(UserDefinedCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UserDefinedCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='userDefinedCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	UserDefinedCSPropertyType getUserDefinedCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUserDefinedCSRef <em>User Defined CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined CS Ref</em>' containment reference.
	 * @see #getUserDefinedCSRef()
	 * @generated
	 */
	void setUserDefinedCSRef(UserDefinedCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Affine CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Affine CS</em>' containment reference.
	 * @see #setUsesAffineCS(AffineCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesAffineCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesAffineCS' namespace='##targetNamespace' affiliation='affineCS'"
	 * @generated
	 */
	AffineCSPropertyType getUsesAffineCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesAffineCS <em>Uses Affine CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Affine CS</em>' containment reference.
	 * @see #getUsesAffineCS()
	 * @generated
	 */
	void setUsesAffineCS(AffineCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Axis</em>' containment reference.
	 * @see #setUsesAxis(CoordinateSystemAxisPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesAxis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesAxis' namespace='##targetNamespace' affiliation='axis'"
	 * @generated
	 */
	CoordinateSystemAxisPropertyType getUsesAxis();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesAxis <em>Uses Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Axis</em>' containment reference.
	 * @see #getUsesAxis()
	 * @generated
	 */
	void setUsesAxis(CoordinateSystemAxisPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Cartesian CS</em>' containment reference.
	 * @see #setUsesCartesianCS(CartesianCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesCartesianCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesCartesianCS' namespace='##targetNamespace' affiliation='cartesianCS'"
	 * @generated
	 */
	CartesianCSPropertyType getUsesCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesCartesianCS <em>Uses Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Cartesian CS</em>' containment reference.
	 * @see #getUsesCartesianCS()
	 * @generated
	 */
	void setUsesCartesianCS(CartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses CS</em>' containment reference.
	 * @see #setUsesCS(CoordinateSystemPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesCS' namespace='##targetNamespace' affiliation='coordinateSystem'"
	 * @generated
	 */
	CoordinateSystemPropertyType getUsesCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesCS <em>Uses CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses CS</em>' containment reference.
	 * @see #getUsesCS()
	 * @generated
	 */
	void setUsesCS(CoordinateSystemPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Ellipsoid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Ellipsoid</em>' containment reference.
	 * @see #setUsesEllipsoid(EllipsoidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesEllipsoid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesEllipsoid' namespace='##targetNamespace' affiliation='ellipsoid'"
	 * @generated
	 */
	EllipsoidPropertyType getUsesEllipsoid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesEllipsoid <em>Uses Ellipsoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Ellipsoid</em>' containment reference.
	 * @see #getUsesEllipsoid()
	 * @generated
	 */
	void setUsesEllipsoid(EllipsoidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Ellipsoidal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Ellipsoidal CS</em>' containment reference.
	 * @see #setUsesEllipsoidalCS(EllipsoidalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesEllipsoidalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesEllipsoidalCS' namespace='##targetNamespace' affiliation='ellipsoidalCS'"
	 * @generated
	 */
	EllipsoidalCSPropertyType getUsesEllipsoidalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Ellipsoidal CS</em>' containment reference.
	 * @see #getUsesEllipsoidalCS()
	 * @generated
	 */
	void setUsesEllipsoidalCS(EllipsoidalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Engineering Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Engineering Datum</em>' containment reference.
	 * @see #setUsesEngineeringDatum(EngineeringDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesEngineeringDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesEngineeringDatum' namespace='##targetNamespace' affiliation='engineeringDatum'"
	 * @generated
	 */
	EngineeringDatumPropertyType getUsesEngineeringDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesEngineeringDatum <em>Uses Engineering Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Engineering Datum</em>' containment reference.
	 * @see #getUsesEngineeringDatum()
	 * @generated
	 */
	void setUsesEngineeringDatum(EngineeringDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Geodetic Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Geodetic Datum</em>' containment reference.
	 * @see #setUsesGeodeticDatum(GeodeticDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesGeodeticDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesGeodeticDatum' namespace='##targetNamespace' affiliation='geodeticDatum'"
	 * @generated
	 */
	GeodeticDatumPropertyType getUsesGeodeticDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Geodetic Datum</em>' containment reference.
	 * @see #getUsesGeodeticDatum()
	 * @generated
	 */
	void setUsesGeodeticDatum(GeodeticDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Image Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Image Datum</em>' containment reference.
	 * @see #setUsesImageDatum(ImageDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesImageDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesImageDatum' namespace='##targetNamespace' affiliation='imageDatum'"
	 * @generated
	 */
	ImageDatumPropertyType getUsesImageDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesImageDatum <em>Uses Image Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Image Datum</em>' containment reference.
	 * @see #getUsesImageDatum()
	 * @generated
	 */
	void setUsesImageDatum(ImageDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Method</em>' containment reference.
	 * @see #setUsesMethod(OperationMethodPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesMethod' namespace='##targetNamespace' affiliation='method'"
	 * @generated
	 */
	OperationMethodPropertyType getUsesMethod();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesMethod <em>Uses Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Method</em>' containment reference.
	 * @see #getUsesMethod()
	 * @generated
	 */
	void setUsesMethod(OperationMethodPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Oblique Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Oblique Cartesian CS</em>' containment reference.
	 * @see #setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesObliqueCartesianCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesObliqueCartesianCS' namespace='##targetNamespace'"
	 * @generated
	 */
	ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesObliqueCartesianCS <em>Uses Oblique Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Oblique Cartesian CS</em>' containment reference.
	 * @see #getUsesObliqueCartesianCS()
	 * @generated
	 */
	void setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Operation</em>' containment reference.
	 * @see #setUsesOperation(CoordinateOperationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesOperation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesOperation' namespace='##targetNamespace' affiliation='coordOperation'"
	 * @generated
	 */
	CoordinateOperationPropertyType getUsesOperation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesOperation <em>Uses Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Operation</em>' containment reference.
	 * @see #getUsesOperation()
	 * @generated
	 */
	void setUsesOperation(CoordinateOperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Parameter</em>' containment reference.
	 * @see #setUsesParameter(AbstractGeneralOperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesParameter' namespace='##targetNamespace' affiliation='generalOperationParameter'"
	 * @generated
	 */
	AbstractGeneralOperationParameterPropertyType getUsesParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesParameter <em>Uses Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Parameter</em>' containment reference.
	 * @see #getUsesParameter()
	 * @generated
	 */
	void setUsesParameter(AbstractGeneralOperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Prime Meridian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Prime Meridian</em>' containment reference.
	 * @see #setUsesPrimeMeridian(PrimeMeridianPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesPrimeMeridian()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesPrimeMeridian' namespace='##targetNamespace' affiliation='primeMeridian'"
	 * @generated
	 */
	PrimeMeridianPropertyType getUsesPrimeMeridian();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesPrimeMeridian <em>Uses Prime Meridian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Prime Meridian</em>' containment reference.
	 * @see #getUsesPrimeMeridian()
	 * @generated
	 */
	void setUsesPrimeMeridian(PrimeMeridianPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Single Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Single Operation</em>' containment reference.
	 * @see #setUsesSingleOperation(CoordinateOperationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesSingleOperation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesSingleOperation' namespace='##targetNamespace' affiliation='coordOperation'"
	 * @generated
	 */
	CoordinateOperationPropertyType getUsesSingleOperation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesSingleOperation <em>Uses Single Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Single Operation</em>' containment reference.
	 * @see #getUsesSingleOperation()
	 * @generated
	 */
	void setUsesSingleOperation(CoordinateOperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Spherical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Spherical CS</em>' containment reference.
	 * @see #setUsesSphericalCS(SphericalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesSphericalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesSphericalCS' namespace='##targetNamespace' affiliation='sphericalCS'"
	 * @generated
	 */
	SphericalCSPropertyType getUsesSphericalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesSphericalCS <em>Uses Spherical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Spherical CS</em>' containment reference.
	 * @see #getUsesSphericalCS()
	 * @generated
	 */
	void setUsesSphericalCS(SphericalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Temporal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Temporal CS</em>' containment reference.
	 * @see #setUsesTemporalCS(TemporalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesTemporalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesTemporalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalCSPropertyType getUsesTemporalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesTemporalCS <em>Uses Temporal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Temporal CS</em>' containment reference.
	 * @see #getUsesTemporalCS()
	 * @generated
	 */
	void setUsesTemporalCS(TemporalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Temporal Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Temporal Datum</em>' containment reference.
	 * @see #setUsesTemporalDatum(TemporalDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesTemporalDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesTemporalDatum' namespace='##targetNamespace' affiliation='temporalDatum'"
	 * @generated
	 */
	TemporalDatumPropertyType getUsesTemporalDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesTemporalDatum <em>Uses Temporal Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Temporal Datum</em>' containment reference.
	 * @see #getUsesTemporalDatum()
	 * @generated
	 */
	void setUsesTemporalDatum(TemporalDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Time CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Time CS</em>' containment reference.
	 * @see #setUsesTimeCS(TimeCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesTimeCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesTimeCS' namespace='##targetNamespace' affiliation='timeCS'"
	 * @generated
	 */
	TimeCSPropertyType getUsesTimeCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesTimeCS <em>Uses Time CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Time CS</em>' containment reference.
	 * @see #getUsesTimeCS()
	 * @generated
	 */
	void setUsesTimeCS(TimeCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Value</em>' containment reference.
	 * @see #setUsesValue(AbstractGeneralParameterValuePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesValue' namespace='##targetNamespace' affiliation='parameterValue'"
	 * @generated
	 */
	AbstractGeneralParameterValuePropertyType getUsesValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesValue <em>Uses Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Value</em>' containment reference.
	 * @see #getUsesValue()
	 * @generated
	 */
	void setUsesValue(AbstractGeneralParameterValuePropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Vertical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Vertical CS</em>' containment reference.
	 * @see #setUsesVerticalCS(VerticalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesVerticalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesVerticalCS' namespace='##targetNamespace' affiliation='verticalCS'"
	 * @generated
	 */
	VerticalCSPropertyType getUsesVerticalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesVerticalCS <em>Uses Vertical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Vertical CS</em>' containment reference.
	 * @see #getUsesVerticalCS()
	 * @generated
	 */
	void setUsesVerticalCS(VerticalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Vertical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:verticalCS is an association role to the vertical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical CS</em>' containment reference.
	 * @see #setVerticalCS(VerticalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalCS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verticalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalCSPropertyType getVerticalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCS <em>Vertical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical CS</em>' containment reference.
	 * @see #getVerticalCS()
	 * @generated
	 */
	void setVerticalCS(VerticalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Vertical Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Vertical Datum</em>' containment reference.
	 * @see #setUsesVerticalDatum(VerticalDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_UsesVerticalDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='usesVerticalDatum' namespace='##targetNamespace' affiliation='verticalDatum'"
	 * @generated
	 */
	VerticalDatumPropertyType getUsesVerticalDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsesVerticalDatum <em>Uses Vertical Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Vertical Datum</em>' containment reference.
	 * @see #getUsesVerticalDatum()
	 * @generated
	 */
	void setUsesVerticalDatum(VerticalDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Vertical Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:verticalDatum is an association role to the vertical datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Datum</em>' containment reference.
	 * @see #setVerticalDatum(VerticalDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalDatum()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verticalDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalDatumPropertyType getVerticalDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalDatum <em>Vertical Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Datum</em>' containment reference.
	 * @see #getVerticalDatum()
	 * @generated
	 */
	void setVerticalDatum(VerticalDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Using</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' containment reference.
	 * @see #setUsing(ProcedurePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Using()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='using' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedurePropertyType getUsing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUsing <em>Using</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using</em>' containment reference.
	 * @see #getUsing()
	 * @generated
	 */
	void setUsing(ProcedurePropertyType value);

	/**
	 * Returns the value of the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:validTime is a convenience property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Time</em>' containment reference.
	 * @see #setValidTime(TimePrimitivePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValidTime()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePrimitivePropertyType getValidTime();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValidTime <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Time</em>' containment reference.
	 * @see #getValidTime()
	 * @generated
	 */
	void setValidTime(TimePrimitivePropertyType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:value is a numeric value of an operation parameter, with its associated unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Value()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Value Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Value Array is used for homogeneous arrays of primitive and aggregate values.  
	 * The member values may be scalars, composites, arrays or lists.
	 * ValueArray has the same content model as CompositeValue, but the member values shall be homogeneous.  The element declaration contains a Schematron constraint which expresses this restriction precisely.  Since the members are homogeneous, the gml:referenceSystem (uom, codeSpace) may be specified on the gml:ValueArray itself and inherited by all the members if desired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Array</em>' containment reference.
	 * @see #setValueArray(ValueArrayType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValueArray()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueArray' namespace='##targetNamespace' affiliation='CompositeValue'"
	 * @generated
	 */
	ValueArrayType getValueArray();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValueArray <em>Value Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Array</em>' containment reference.
	 * @see #getValueArray()
	 * @generated
	 */
	void setValueArray(ValueArrayType value);

	/**
	 * Returns the value of the '<em><b>Value Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property that refers to, or contains, a Value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Component</em>' containment reference.
	 * @see #setValueComponent(ValuePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValueComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valueComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	ValuePropertyType getValueComponent();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValueComponent <em>Value Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Component</em>' containment reference.
	 * @see #getValueComponent()
	 * @generated
	 */
	void setValueComponent(ValuePropertyType value);

	/**
	 * Returns the value of the '<em><b>Value Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property that contains Values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Components</em>' containment reference.
	 * @see #setValueComponents(ValueArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValueComponents()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valueComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueArrayPropertyType getValueComponents();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValueComponents <em>Value Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Components</em>' containment reference.
	 * @see #getValueComponents()
	 * @generated
	 */
	void setValueComponents(ValueArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Value File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:valueFile is a reference to a file or a part of a file containing one or more parameter values, each numeric value with its associated unit of measure. When referencing a part of a file, that file shall contain multiple identified parts, such as an XML encoded document. Furthermore, the referenced file or part of a file may reference another part of the same or different files, as allowed in XML documents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value File</em>' attribute.
	 * @see #setValueFile(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValueFile()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valueFile' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValueFile();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValueFile <em>Value File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value File</em>' attribute.
	 * @see #getValueFile()
	 * @generated
	 */
	void setValueFile(String value);

	/**
	 * Returns the value of the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:valueList is an ordered sequence of two or more numeric values of an operation parameter list, where each value has the same associated unit of measure. An element of this type contains a space-separated sequence of double values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value List</em>' containment reference.
	 * @see #setValueList(MeasureListType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValueList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valueList' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureListType getValueList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValueList <em>Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value List</em>' containment reference.
	 * @see #getValueList()
	 * @generated
	 */
	void setValueList(MeasureListType value);

	/**
	 * Returns the value of the '<em><b>Value Of Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Of Parameter</em>' containment reference.
	 * @see #setValueOfParameter(OperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValueOfParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valueOfParameter' namespace='##targetNamespace' affiliation='operationParameter'"
	 * @generated
	 */
	OperationParameterPropertyType getValueOfParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValueOfParameter <em>Value Of Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Of Parameter</em>' containment reference.
	 * @see #getValueOfParameter()
	 * @generated
	 */
	void setValueOfParameter(OperationParameterPropertyType value);

	/**
	 * Returns the value of the '<em><b>Value Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property that refers to, or contains, a Value. Convenience element for general use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Property</em>' containment reference.
	 * @see #setValueProperty(ValuePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValueProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valueProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	ValuePropertyType getValueProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValueProperty <em>Value Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Property</em>' containment reference.
	 * @see #getValueProperty()
	 * @generated
	 */
	void setValueProperty(ValuePropertyType value);

	/**
	 * Returns the value of the '<em><b>Values Of Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Of Group</em>' containment reference.
	 * @see #setValuesOfGroup(OperationParameterGroupPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_ValuesOfGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valuesOfGroup' namespace='##targetNamespace' affiliation='group'"
	 * @generated
	 */
	OperationParameterGroupPropertyType getValuesOfGroup();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getValuesOfGroup <em>Values Of Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Of Group</em>' containment reference.
	 * @see #getValuesOfGroup()
	 * @generated
	 */
	void setValuesOfGroup(OperationParameterGroupPropertyType value);

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(VectorType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Vector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='vector' namespace='##targetNamespace'"
	 * @generated
	 */
	VectorType getVector();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(VectorType value);

	/**
	 * Returns the value of the '<em><b>Vertical CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:VerticalCRS is a 1D coordinate reference system used for recording heights or depths. Vertical CRSs make use of the direction of gravity to define the concept of height or depth, but the relationship with gravity may not be straightforward. By implication, ellipsoidal heights (h) cannot be captured in a vertical coordinate reference system. Ellipsoidal heights cannot exist independently, but only as an inseparable part of a 3D coordinate tuple defined in a geographic 3D coordinate reference system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical CRS</em>' containment reference.
	 * @see #setVerticalCRS(VerticalCRSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalCRS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VerticalCRS' namespace='##targetNamespace' affiliation='AbstractSingleCRS'"
	 * @generated
	 */
	VerticalCRSType getVerticalCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCRS <em>Vertical CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical CRS</em>' containment reference.
	 * @see #getVerticalCRS()
	 * @generated
	 */
	void setVerticalCRS(VerticalCRSType value);

	/**
	 * Returns the value of the '<em><b>Vertical CRS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical CRS Ref</em>' containment reference.
	 * @see #setVerticalCRSRef(VerticalCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalCRSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verticalCRSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalCRSPropertyType getVerticalCRSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCRSRef <em>Vertical CRS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical CRS Ref</em>' containment reference.
	 * @see #getVerticalCRSRef()
	 * @generated
	 */
	void setVerticalCRSRef(VerticalCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Vertical CS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:VerticalCS is a one-dimensional coordinate system used to record the heights or depths of points. Such a coordinate system is usually dependent on the Earth's gravity field, perhaps loosely as when atmospheric pressure is the basis for the vertical coordinate system axis. A VerticalCS shall have one gml:axis property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical CS2</em>' containment reference.
	 * @see #setVerticalCS2(VerticalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalCS2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VerticalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	VerticalCSType getVerticalCS2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCS2 <em>Vertical CS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical CS2</em>' containment reference.
	 * @see #getVerticalCS2()
	 * @generated
	 */
	void setVerticalCS2(VerticalCSType value);

	/**
	 * Returns the value of the '<em><b>Vertical CS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:VerticalCS is a one-dimensional coordinate system used to record the heights or depths of points. Such a coordinate system is usually dependent on the Earth's gravity field, perhaps loosely as when atmospheric pressure is the basis for the vertical coordinate system axis. A VerticalCS shall have one gml:axis property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical CS3</em>' containment reference.
	 * @see #setVerticalCS3(VerticalCSType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalCS3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VerticalCS' namespace='##targetNamespace' affiliation='AbstractCoordinateSystem'"
	 * @generated
	 */
	VerticalCSType getVerticalCS3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCS3 <em>Vertical CS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical CS3</em>' containment reference.
	 * @see #getVerticalCS3()
	 * @generated
	 */
	void setVerticalCS3(VerticalCSType value);

	/**
	 * Returns the value of the '<em><b>Vertical CS Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical CS Ref</em>' containment reference.
	 * @see #setVerticalCSRef(VerticalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalCSRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verticalCSRef' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalCSPropertyType getVerticalCSRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalCSRef <em>Vertical CS Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical CS Ref</em>' containment reference.
	 * @see #getVerticalCSRef()
	 * @generated
	 */
	void setVerticalCSRef(VerticalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Vertical Datum2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:VerticalDatum is a textual description and/or a set of parameters identifying a particular reference level surface used as a zero-height surface, including its position with respect to the Earth for any of the height types recognized by this International Standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Datum2</em>' containment reference.
	 * @see #setVerticalDatum2(VerticalDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalDatum2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VerticalDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	VerticalDatumType getVerticalDatum2();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalDatum2 <em>Vertical Datum2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Datum2</em>' containment reference.
	 * @see #getVerticalDatum2()
	 * @generated
	 */
	void setVerticalDatum2(VerticalDatumType value);

	/**
	 * Returns the value of the '<em><b>Vertical Datum3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:VerticalDatum is a textual description and/or a set of parameters identifying a particular reference level surface used as a zero-height surface, including its position with respect to the Earth for any of the height types recognized by this International Standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Datum3</em>' containment reference.
	 * @see #setVerticalDatum3(VerticalDatumType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalDatum3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VerticalDatum' namespace='##targetNamespace' affiliation='AbstractDatum'"
	 * @generated
	 */
	VerticalDatumType getVerticalDatum3();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalDatum3 <em>Vertical Datum3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Datum3</em>' containment reference.
	 * @see #getVerticalDatum3()
	 * @generated
	 */
	void setVerticalDatum3(VerticalDatumType value);

	/**
	 * Returns the value of the '<em><b>Vertical Datum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Datum Ref</em>' containment reference.
	 * @see #setVerticalDatumRef(VerticalDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_VerticalDatumRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verticalDatumRef' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalDatumPropertyType getVerticalDatumRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getVerticalDatumRef <em>Vertical Datum Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Datum Ref</em>' containment reference.
	 * @see #getVerticalDatumRef()
	 * @generated
	 */
	void setVerticalDatumRef(VerticalDatumPropertyType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute gml:id supports provision of a handle for the XML element representing a GML Object. Its use is mandatory for all GML objects. It is of XML type ID, so is constrained to be unique in the XML document within which it occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Schema</em>' attribute.
	 * @see #setRemoteSchema(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_RemoteSchema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='remoteSchema' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemoteSchema();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getRemoteSchema <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Schema</em>' attribute.
	 * @see #getRemoteSchema()
	 * @generated
	 */
	void setRemoteSchema(String value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' attribute.
	 * @see #setUom(String)
	 * @see net.opengis.gml.gml.GMLPackage#getGMLDocumentRoot_Uom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='uom' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUom();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GMLDocumentRoot#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(String value);

} // GMLDocumentRoot
