package commonspace.loader.osm

import commonspace.loader.{GraphFileSet,ParseResult}

import commonspace.{NamedLocations,NamedLocation,NamedWays}

case class OsmFileSet(name:String,path:String)
extends GraphFileSet {
  if(!new java.io.File(path).exists) { 
    sys.error(s"OSM file $path does not exist.")
  }

  def parse():ParseResult = OsmParser.parse(path)
}
